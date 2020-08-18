/*
 * 以下のプログラムを実行すると何が表示されるか予想して下さい。
 */

public class Greetings2 {

	public static void main(String[] args) {

		int replyNum = Integer.parseInt(showMessage(4));

		String reply = showMessage(replyNum);

		System.out.println(reply);

	}// main

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