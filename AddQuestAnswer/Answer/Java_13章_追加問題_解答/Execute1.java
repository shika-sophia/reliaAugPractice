/**
 *	以下のプログラムを読んで出力結果を予想してください。
 */


class ExceptionCheck1 {

	public void check() {

		System.out.println("checkメソッドが呼び出されました。");
		String strParam = "abc";
		int intParam = 0;

		try {
			intParam = Integer.parseInt(strParam);
			System.out.println("文字列から数値への変換を行いました。");
		} catch(NumberFormatException e) {
			System.out.println("catch節の処理を実行しました。");
		} finally {
			System.out.println("finally節の処理を実行しました。");
		}// try～catch～finally

	}// check

}// ExceptionCheck1クラス


// 実行クラス
class Execute1 {

	public static void main(String[] args) {
		System.out.println("処理を開始します。");
		ExceptionCheck1 exp = new ExceptionCheck1();
		exp.check();
		System.out.println("処理を終了します。");
	}// main

}// Execute1クラス
