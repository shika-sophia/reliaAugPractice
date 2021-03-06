/*
 * 問題：以下の結果が表示されるようなプログラムを記述してください。
 * ★条件
 * ・switch文を使用してください
 * ・以下のプログラムに記述されている変数は全て使用してください
 *
 *【出力結果】
 * どこに行く？
 * 1:カラオケ  2:買い物  3:家に帰る
 * 2
 * 買い物
 */

import java.io.*;

public class SwitchQuestion1_A {

	public static void main(String[] args) {
		String line = "";		// コマンドプロンプトから入力された内容を保持
		String result = "";		// コマンドプロンプト上に表示する文字列を保持
		int x = 0;				// switch文の式として使う変数
		
		System.out.println("どこに行く？");
		System.out.println("1:カラオケ  2:買い物  3:家に帰る");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			// ▽解答スペース ここから

			// lineもxもすでに宣言された変数なので、初期化ではなく代入のみで良い。
			line = reader.readLine();
			x = Integer.parseInt(line);

			switch(x) {
			case 1:// 処理はString型で宣言されているresultに代入のみ。
				result = "カラオケ";
				break;

			case 2:
				result = "買い物";
				break;

			default:
				result = "家に帰る";
				break;
			}
			// case内に書いても良いが、変数を使用しているので一度の記述で対応できる。
			System.out.println(result);

			// △解答スペース ここまで
		} catch(IOException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println("数字を入力してください");
		}
	}// main

}// class