/*
 *【問題】
 *コマンドプロンプトから３つの整数値を入力して、
 *その最小値を表示するプログラムを作成してください。
 *
 *【実行結果】
 *>java IfQuestion5
 *第１数値を入力してください。
 *>10
 *第２数値を入力してください。
 *>5
 *第３数値を入力してください。
 *>-15
 *第１数値：10
 *第２数値：5
 *第３数値：-15
 *最小値は-15です。
 */

import java.io.*;

public class IfQuestion5_A {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			String line;
			// １つ目の数値の入力
			System.out.println("第１数値を入力してください。");
			line = reader.readLine();
			int num1 = Integer.parseInt(line);
			// ２つ目の数値の入力
			System.out.println("第２数値を入力してください。");
			line = reader.readLine();
			int num2 = Integer.parseInt(line);
			// ３つ目の数値の入力
			System.out.println("第３数値を入力してください。");
			line = reader.readLine();
			int num3 = Integer.parseInt(line);

			// 最小値を保存する変数を宣言。
			int min;

			// 最初に第１数値と第２数値を比較する。
			if (num1 < num2) {
				min = num1;
			} else {
				min = num2;
			}

			// 比較した結果と第３数値を比較する。
			if (min > num3) {
				min = num3;
			}

			System.out.println("第１数値：" + num1);
			System.out.println("第２数値：" + num2);
			System.out.println("第３数値：" + num3);
			System.out.println("最小値は" + min + "です");

		} catch (IOException e) {
			System.out.println(e);
		} catch(NumberFormatException e) {
			System.out.println("入力が正しくありません。");
		}
	}
}