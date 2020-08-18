// breakの使用例サンプル3

public class BreakTest3{
	public static void main(String[] args) {
		int count = 1;

		try {
			// ラベルを設定
			outer:
				// 条件式がtrueなので無限ループ
				while (true) {
					Thread.sleep(1000);	// 1秒待機
					System.out.println("ラベル有りwhileループ" + count + "回目");

					while (true) {
						Thread.sleep(1000);	// 1秒待機
						System.out.println("ラベル無しwhileループ" + count + "回目");
						count++;
						// countが5になったらbreakでラベルのwhileループまで抜ける
						if (count == 5) {
							Thread.sleep(1000);	// 1秒待機
							System.out.println("if文の中に来ました");
							break outer;
						}// if
					}// while2(ラベル無し)
					/* ここには絶対に来ないので注釈を外すとコンパイルエラー
					 * Thread.sleep(1000);
					 * System.out.println("ラベル無しwhileループの外に出ました");
					*/
				}// while1(ラベル有り)
				Thread.sleep(1000);	// 1秒待機
				System.out.println("ラベル有りwhileループの外に出ました");
		} catch (InterruptedException e) {
			System.out.println(e);
		}// try～catch

	}//main
}//class