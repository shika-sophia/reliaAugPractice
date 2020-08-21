/*
 *【上巻確認問題4】 
 * 3マスの中から動物が潜んでいる穴の場所を当てるゲームです。
 *
 *  ＜イメージ図＞(表示させる必要はありませんができる方はチャレンジしてください)
 *     1    2    3
 *  |----+----+----|
 *  |    |    | ○ |
 *  |----+----+----|
 *
 * この場合「3」に潜んでいることになります。
 * ゲームを開始すると、動物はマスのいずれかに逃げこみます。
 * 動物が潜んでいる場所を予想して場所を入力すると、
 * 動物がいた場合、「発見！」
 * いなかった場合、「いませんでした。」
 * と表示するようなプログラムを作成してください。
 *
 *【実行結果】
 * ゲームを開始します。
 *
 * ・・・・・動物がどこかに逃げ込みました。
 *
 * 動物がいる場所を入力してください。
 * ※1～3のいずれかを入力してください。
 *
 * 4
 *
 * 入力内容に誤りがあります。
 * 1～3のいずれかを入力してください。
 *
 * 2
 *
 * いませんでした。
 * 動物がいる場所を入力してください。
 *
 * 1
 *
 * いませんでした。
 * 動物がいる場所を入力してください。
 *
 * 3
 *
 * 発見！
 * おめでとうございます。
 *
 * ゲームを終了します。
 *
 *
 * 以下の解答欄①～⑦にソースコードを記述して、上記の要件を満たしてください。
 */


import java.io.*;

public class Kadai4_A {
	public static void main(String[] args) {
		String line = "";
		int check = 0;
		int location = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("ゲームを開始します。\n");
		System.out.println("・・・・・動物がどこかに逃げ込みました。\n");
		System.out.println("動物がいる場所を入力してください。");
		System.out.println("※1～3のいずれかを入力してください。\n");

		// 1～3のいずれかをランダムで取得
		location = (int)(Math.random() * 3) + 1;// 解答欄①

		try {

			while((line = reader.readLine()) != null) {

				// 入力内容が正しいかチェックをする(入力文字を引数に判定メソッド呼び出し)
				if(checkInput(line)) {// 解答欄②
					check = Integer.parseInt(line);

					// 動物の場所と入力場所が等しいかチェック
					if(location == check) {// 見つけた 解答欄③
						System.out.println("\n発見！");
						System.out.println("おめでとうございます。\n");
						break;
					} else {// 見つからなかった
						System.out.println("\nそこにはいませんでした。");
						System.out.println("動物がいる場所を入力してください。\n");
					}// if(内側)

				} else {// 入力ミス
					System.out.println("\n入力内容に誤りがあります。");
					System.out.println("1～3のいずれかを入力してください。\n");
				}// if(外側)

			}// while

		} catch (IOException e) {
			System.out.println(e);
		}// try～catch

		System.out.println("ゲームを終了します。");
	}// main

	// 入力内容をチェックするメソッド
	public static boolean checkInput(String line) {
		boolean check = true;

		// 入力が1文字の場合
		if(line.length() == 1) {// 解答欄④
			// 数字以外が入力されている場合⇒文字列から文字を取得しています。
			char c = line.charAt(0);// 解答欄⑤

			if(c < 49 || c > 51) {// 文字コードで判定している(49は1、51は3) 解答欄⑥
				check = false;
			}// if(内側)

		} else {
			check = false;
		}// if(外側)

		return check;// 解答欄⑦

	}// checkInput

}// class