 /*
 * 以下のプログラムを完成させて下さい。
 *
 * int型の引数を受け取り、1のときは"おはよう"、2のときは"こんにちは"、3のときは"こんばんは"、
 * というString型の戻り値を返すメソッドを宣言し、メインメソッドから呼び出してください。
 * なお、メソッドの命名は自由とします
 */

import java.io.*;

public class Greetings {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1～3の数字を入力して下さい");

		try {
			String line = reader.readLine();
			int i = Integer.parseInt(line);
			
			// ▽記述欄① ここから

			// △記述欄① ここまで

		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で答えて下さい。");
		}// try～catch

	}// main

	// String型で戻り値を返すメソッド
	// ▽記述欄② ここから

	// △記述欄② ここまで

}// class