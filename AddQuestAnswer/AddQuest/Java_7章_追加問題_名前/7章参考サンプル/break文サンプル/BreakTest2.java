// breakの使用例サンプル2

public class BreakTest2 {
	public static void main(String[] args) {

		try {
			// iが1～100まで回るforループ
			for (int i = 1; i <= 100; i++) {
				Thread.sleep(1000);	// 1秒待機
				System.out.println("forループ" + i + "回目");
				// iが5になったらbreakでforループを抜ける
				if (i == 5) {
					Thread.sleep(1000);
					System.out.println("if文の中に来ました");
					break;
				}// if
			}// for
			Thread.sleep(1000);	// 1秒待機
			System.out.println("forループの外に出ました");
		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}// main
}// class