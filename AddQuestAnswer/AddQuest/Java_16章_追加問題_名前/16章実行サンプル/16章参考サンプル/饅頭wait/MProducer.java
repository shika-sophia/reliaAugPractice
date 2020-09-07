// 生産者クラス
class MProducer extends Thread {
	static final int END = -1;
	MMyQueue queue = null;
	MProducer(MMyQueue queue) {
		this.queue = queue;
	}
	public void run() {
		try {
			//100回製造
			for (int i = 0; i < 100; i++) {
				//製造して
				int n = produce(i);
				//配置
				queue.put(n);
			}
			queue.put(MProducer.END);
		} catch (InterruptedException e) {
		}
	}
	
	//製造するメソッド
	int produce(int n) {
		sleepRandomly();
		return n;
	}
	
	//適当に休むメソッド
	void sleepRandomly() {
		try {
			int n = (int)(Math.random() * 1000);
			Thread.sleep(n);
		} catch (InterruptedException e) {
		}
	}
}
