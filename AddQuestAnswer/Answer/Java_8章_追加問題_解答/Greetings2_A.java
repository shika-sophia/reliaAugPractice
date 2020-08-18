/*
 * 以下のプログラムを実行すると何が表示されるか予想して下さい
 * 「おはよう」が表示されます。
 */

public class Greetings2_A {

	public static void main(String[] args) {

		/* 4を引数としてshowMessageを呼び出し、
		   戻り値の"１"を整数変換してreplyNumに代入。*/
		int replyNum = Integer.parseInt(showMessage(4));

		/* 1が代入されたreplyNumを引数としてshowMessageを呼び出し、
		   戻り値の"おはよう"をreplyに代入。*/
		String reply = showMessage(replyNum);

		// replyを参照する。
		System.out.println(reply);

	}// main

	// 挨拶を選択するshowMessageメソッド
	public static String showMessage(int num) {
		String message = "";

		switch (num) {
		case 1:
			message = "おはよう";
			break;

		case 2:
			message = "こんにちは";
			break;

		case 3:
			message = "こんばんは";
			break;

		case 4:
			message = "1";
			break;
		}// switch

		return message;
	}// showMessage

}// class