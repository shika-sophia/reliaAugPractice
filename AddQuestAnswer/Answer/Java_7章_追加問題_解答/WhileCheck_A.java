/*
 * FizzBuzz問題 ※while文を使用してください
 *
 * 1から100までコマンドプロンプト上に表示します。
 * ただし3で割り切れる場合は、「Fizz」
 * 5で割り切れる場合は、「Buzz」
 * 3でも5でも割り切れる場合は、「FizzBuzz」
 * と表示するようにしてください。
 *
 *【出力結果】
 * 1
 * 2
 * Fizz
 * 4
 * Buzz
 * Fizz
 * 7
 * 8
 * Fizz
 * Buzz
 * 11
 * Fizz
 * 13
 * 14
 * Fizz Buzz
 * 16
 * 17
 * Fizz
 * 19
 * Buzz
 */

class WhileCheck_A {

	public static void main(String[] args) {
		int i = 1;

		// 1～100まで繰り返すwhileループ
		while(i <= 100) {
			// 3でも5でも割り切れる数字の判定
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			// 3でのみ割り切れる数字の判定
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			// 5でのみ割り切れる数字の判定
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			// 上記以外の数字の処理
			} else {
				System.out.println(i);
			}// if			
			i++;
		}// while

	}// main

}// class