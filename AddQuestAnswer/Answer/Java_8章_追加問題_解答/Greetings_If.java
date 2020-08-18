/*
 * 以下のプログラムを完成させて下さい。
 *
 * int型の引数を受け取り、1のときは"おはよう"、2のときは"こんにちは"、3のときは"こんばんは"、
 * というString型の戻り値を返すメソッドを宣言し、メインメソッドから呼び出してください。
 * なお、メソッドの命名は自由とします
 */

import java.io.*;

public class Greetings_If {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1～3の数字を入力して下さい");
		
		try {
			String line = reader.readLine();
			int i = Integer.parseInt(line);
			
			// ▽記述欄① ここから
			// showMessageメソッドの呼び出し
			String reply = showMessage(i);
			System.out.println(reply);
			// △記述欄① ここまで

		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で答えて下さい。");
		}// try～catch

	}// main

	// String型で戻り値を返すshowMessageメソッド
	// ▽記述欄② ここから
	public static String showMessage(int num) {

		if (num == 1) {
			return "おはよう";
		} else if (num == 2) {
			return "こんにちは";
		} else if (num == 3) {
			return "こんばんは";
		} else {
			return "1～3を入力して下さい。";
		}// if

	}// showMessage
	// △記述欄② ここまで

}// class