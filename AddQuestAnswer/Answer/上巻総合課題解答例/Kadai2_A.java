/*
 *【上巻確認問題2】
 * 以下の条件を満たすプログラムを完成させてください。
 *
 * 【条件】
 * ・プログラムに書かれている変数は必ず使用する
 * ・for文を二回使用する
 *
 *【出力結果】
 * 各学年の合計人数は、
 * 1年：78人
 * 2年：76人
 * 3年：93人
 * です。
 */

public class Kadai2_A {
	public static void main(String[] args) {
		int sum = 0;

		// クラス別の点数を管理する配列
		int[][] intArray = {
			{ 30, 24, 24 },	//1年：1組,2組,3組
			{ 29, 21, 26 },	//2年：1組,2組,3組
			{ 31, 31, 31 },	//3年：1組,2組,3組
		};

		// 学年名を管理する配列
		String[] strArray = { "1年", "2年", "3年" };
		
		System.out.println("各学年の合計人数は、");

		// 学年を管理するforループ
		for(int i = 0; i < intArray.length; i++) {
			sum = 0;

			// 生徒数を合計するforループ
			for(int j = 0; j < intArray[i].length ;j++) {
				sum = sum + intArray[i][j];
			}// for()内側

			// 結果の表示
			System.out.println(strArray[i] + "：" + sum + "人");
		}// for(外側)

		System.out.println("です。");
	}// main
}// class