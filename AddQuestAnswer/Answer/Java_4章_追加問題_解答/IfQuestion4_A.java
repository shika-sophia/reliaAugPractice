/*
 *【問題】
 *コマンドプロンプトから整数値を入力して、
 *その絶対値を表示するプログラムを作成してください。
 *※絶対値とは「０からの距離」すなわち、その数から負の符号を取り除いたものになります。
 *
 *【実行結果】
 *>java IfQuestion4
 *整数を入力してください。
 *>10
 *絶対値は10です。
 *
 *>java IfQuestion4
 *整数を入力してください。
 *>-11
 *絶対値は11です。
 */

import java.io.*;

public class IfQuestion4_A {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("整数を入力してください。");
			// 入力待ち
			String line = reader.readLine();
			// 入力文字列を整数値に変換
			int num = Integer.parseInt(line);

			// numがマイナスの時だけ処理を行う
			if (num < 0) {
				// 絶対値は必ず正の値となるので、0より小さければマイナスを掛けて反転する。
				num = -(num);
			}

			System.out.println("絶対値は" + num + "です");

		} catch (IOException e) {
			System.out.println(e);
		} catch(NumberFormatException e) {
			System.out.println("入力が正しくありません。");
		}
	}
}