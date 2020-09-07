class MMyQueue {

	int[] intbuf;
	int start;
	int count;
	String vision;
	//顔出しがいるかどうか(任意)
	boolean isFace = true;
	
	public MMyQueue(int size) {
		intbuf = new int[size];
		start = 0;//次に取られる饅頭の場所
		count = 0;//詰められている個数
	}
	
	//(生産者が)置こうとする
	public synchronized void put(int n) throws InterruptedException {
		//置き場所がなければ…
		while (count >= intbuf.length) {
			System.out.println(Thread.currentThread().getName() + " wait : お皿が空くのを待つ\n");
			wait();
		}
		int end = (start + count) % intbuf.length;
		intbuf[end] = n;
		count++;
		System.out.println("和菓子屋は " 
			+ (n + 1) + " 個目を生産完了　" + faceUp(1) + draw() + "\n");
		notifyAll();
	}
	
	//(消費者が)手に取ろうとする
	public synchronized int take() throws InterruptedException {
		//取るものが無ければ…
		while (count == 0) {
			System.out.println(Thread.currentThread().getName() + " wait : まんじゅう追加待ち\n");
			wait();
		}
		int n = intbuf[start];
		start = (start + 1) % intbuf.length;
		count--;
		System.out.println("消費者は "
			+ (n + 1) + " 個目を食べている　　　　　　　　" + draw() + faceUp(0) + "\n");
		notifyAll();
		return n;
	}

// -------------------------------------------------------------------------------------------------------
// ここからは描画関連のため関係なし
	//饅頭の描画
	public synchronized String draw() {
		String t = "[○]";
		String f = "[　]";
		String mantoo = new String("");
		int end = (start + count - 1) % intbuf.length;
		for(int i = 0; i < intbuf.length; i++) {
			//個数0(以下のif文は一行処理なので注意)
			if(count == 0) mantoo += f;
			//配列順
			else if(start <= end && start <= i && i<= end) mantoo += t;
			//配列ループ
			else if(start > end && (i <= end || start <= i)) mantoo += t;
			//空白
			else mantoo += f;
		}
		return mantoo/* + start + " " + count*/;
	}
	
	//どうでもいい演出
	String faceUp(int n) {
		if(isFace) {
			if(n == 1) {
				return "ｱｲﾖ(´･ω･)つ ";
			} else {
				return "((´～｀))ﾓｸﾞﾓｸﾞ";
			}
		}
		return "\t";
	}
}