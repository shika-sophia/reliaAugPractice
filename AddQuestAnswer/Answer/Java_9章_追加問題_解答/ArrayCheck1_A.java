/*
 * 以下のプログラムを完成させてください。
 *
 * 【出力結果】
 * A
 * B
 * C
 * D
 * E
 */

class ArrayCheck1_A {
	public static void main(String[] args) {

		// ５個分の配列の要素の確保
		String[] strArray = new String[5];

		// 各要素に文字列を代入
		strArray[0] = "A";
		strArray[1] = "B";
		strArray[2] = "C";
		strArray[3] = "D";
		strArray[4] = "E";

		/* 上の代わりにまとめて初期化でも良い
		 * 	String[] strArray = { "A", "B", "C", "D", "E" };
		 */

		// 配列の長さ-1まで回るforループ		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}// for

	}// main
}// class