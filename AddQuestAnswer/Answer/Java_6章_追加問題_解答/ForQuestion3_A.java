/*
 *【問題】
 *コンピュータが選択した数（0～99）を当てるゲームを作成してください。
 *間違えた場合、プレイヤーが解答した値が、選択した値に比べて「大きい」か「小さい」を表示し、
 *残りの解答回数も表示してください。
 *
 *なお、プレイヤーが解答できる回数は7回までに制限します。
 *（文字など数字以外を入力してしまった場合は含みません。）
 *
 *正解した場合は、「正解です」と表示して、そのままプログラムを終了してください。
 *制限回数内に当てられなかった場合は、正解を表示してプログラムを終了してください。
 *
 *プログラムの途中で終了するには
 *System.exit(0);
 *メソッドを使用します。
 *
 *【実行結果：正解時】
 *>java KazuateGame_A
 *コンピュータが0～99までの数字の中から１つ選択しました。
 *選択した数字を当ててください。
 *（1回目）
 *>50
 *残念、違います。
 *選択した値は解答した値よりも「大きい」です。
 *残り6回解答できます。
 *（2回目）
 *>75
 *残念、違います。
 *選択した値は解答した値よりも「小さい」です。
 *残り5回解答できます。
 *（3回目）
 *>60
 *おめでとうございます。正解です。
 *
 *【実行結果：GameOver時】
 *>java KazuateGame_A
 *コンピュータが0～99までの数字の中から１つ選択しました。
 *選択した数字を当ててください。
 *（1回目）
 *>5
 *残念、違います。
 *選択した値は解答した値よりも「大きい」です。
 *残り6回解答できます。
 *
 *～省略
 *
 *（7回目）
 *>35
 *残念、違います。
 *選択した値は解答した値よりも「大きい」です。
 *解答の制限回数に達しました。
 *正解は51でした。
 */

import java.io.*;

public class ForQuestion3_A {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int maxCount = 7;// ゲーム回数
		int selectedNumber = (int)(Math.random() * 100);// comに選択された数値

		System.out.println("コンピュータが0～99までの数字の中から１つ選択しました。");
		System.out.println("選択した数字を当ててください。");

		// 1～maxCount(ここでは7)の間繰り返す(7回)
		for (int i = 1; i <= maxCount; i++) {

			try {
				System.out.println("（" + i + "回目）");
				String s = reader.readLine();
				int n = Integer.parseInt(s);

				// 成否の判定のif文
				// 正解の場合
				if (n == selectedNumber) {
					System.out.println("おめでとうございます。正解です。");
					// 正解したのでプログラムを終了する。
					System.exit(0);
				// 不正解の場合
				} else {
					System.out.println("残念、違います。");

					if (n < selectedNumber) {// 選んだ番号より小さい場合
						System.out.println("選択した値は解答した値よりも「大きい」です。");
					} else {// 選んだ番号より大きい場合
						System.out.println("選択した値は解答した値よりも「小さい」です。");
					}// 内側のif

				}// 外側のif

				// 残り回答数の分岐
				if (i < maxCount) {// 残り回数がある場合
					System.out.println("残り" + (maxCount - i) + "回解答できます。");
				} else {// 残り0回の場合
					System.out.println("解答の制限回数に達しました。");
					System.out.println("正解は" + selectedNumber + "でした。");
				}// if

			} catch(IOException e) {
				System.out.println(e);
				System.exit(0);// プログラム終了

			} catch(NumberFormatException e) {
				System.out.println("入力した書式が正しくありません。再度数字を入力してください。");
				// エラー処理(再入力の為、入力回数のカウントを１つ引く)
				i--;
			}// try～catch
			// try～catchがfor文の中にあるため、エラーが発生しても繰り返し処理が実行される

		}// for

	}// main
}// class
