// continueの使用例サンプル2

public class ContinueTest2 {
	public static void main(String[] args) {
		try {
			// iが1～10の間繰り返すforループ
			for(int i = 1; i <= 10; i++) {
				// iが偶数の時はcontinue発動
				if(i%2 == 0) {
					Thread.sleep(1000);
					System.out.println("偶数は無視します");
					continue;
				}// if
				Thread.sleep(1000); // 1sec待機
				System.out.println("forループ" + i + "回目");
			}// for
		} catch(InterruptedException e) {
			e.printStackTrace();
		}// try～catch
	}// main
}// class