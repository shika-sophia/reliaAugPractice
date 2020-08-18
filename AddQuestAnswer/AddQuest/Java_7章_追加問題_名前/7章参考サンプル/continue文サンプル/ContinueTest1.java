// continueの使用例サンプル1

public class ContinueTest1 {
	public static void main(String[] args) {
		int count = 0;

		try {
			while(count <= 9) {
				count++;
				// countが偶数の時はcontinue発動
				if(count%2 == 0) {
					Thread.sleep(1000); // 1sec待機
					System.out.println("偶数は無視します");
					continue;
				}// if
				Thread.sleep(1000); // 1sec待機
				System.out.println("whileループ" + count + "回目");
			}// while
		} catch(InterruptedException e) {
			e.printStackTrace();
		}// try～catch

	}// main
}// class