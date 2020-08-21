/*
 *【上巻確認問題1】
 * 以下の条件を満たすプログラムを完成させてください。
 *
 *【条件】
 * ・乱数を取得し、1の場合は「いち」、2の場合は「に」、3の場合は「さん」
 *   と表示されるようにする
 * ・switch文を使用する
 *
 *【出力結果】
 * いち
 */

public class Kadai1_A {
	public static void main(String[] args) {
		int count = 0;
		String result = "";

		// ランダムに数字を選ぶ
		count = (int)(Math.random() * 3) + 1;

		switch (count) {
		case 1:
			result = "いち";
			break;

		case 2:
			result = "に";
			break;

		case 3:
			result = "さん";
			break;
		}// switch

		// 結果の出力
		System.out.println(result);

	}// main
}// class