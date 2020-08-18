/*
 * 以下のプログラムを完成させてください。
 * 戻り値①②と処理①②を記述してください
 *
 *【出力結果】
 * 1人目の名前を入力してください
 * test1
 * test1さん、こんばんは
 * 2人目の名前を入力してください
 * test2
 * Hello test2
 *
 */

import java.io.*;

class MethodCheck3 {
	public static void main(String[] argas) {

		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("1人目の名前を入力してください");
			String input = reader.readLine();
			System.out.println(aisatu1(input));

			System.out.println("2人目の名前を入力してください");
			input = reader.readLine();
			System.out.println(aisatu2(input));

		} catch (IOException e) {
			System.out.println(e);
		}// try～catch

	}// main

	//一人目用のメソッド
	public static /* 戻り値①記述欄 */ aisatu1(String name) {
		//問題①記述欄
	}// aisatu1

	//二人目用のメソッド
	public static /* 戻り値②記述欄 */ aisatu2(String name) {
		//問題②記述欄
	}// aisatu2

}// class