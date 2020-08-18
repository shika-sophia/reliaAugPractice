// breakの使用例サンプル1

public class BreakTest1 {
	public static void main(String[] args) {
		int count = 1;

		try {
			// 条件式がtrueなので無限ループ
			while (true) {	
				Thread.sleep(1000);	// 1秒待機
				System.out.println("whileループ" + count + "回目");
				count++;
				// countが5になったらbreakで無限ループを抜ける
				if (count == 5) {
					Thread.sleep(1000);	// 1秒待機
					System.out.println("if文の中に来ました");
					break;
				}// if
			}//while
			Thread.sleep(1000);	// 1秒待機
			System.out.println("whileループの外に出ました");
		} catch (InterruptedException e) {
			System.out.println(e);
		}// try～catch

	}// main
}// class