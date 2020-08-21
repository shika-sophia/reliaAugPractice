/*
 *【上巻確認問題3】
 * 以下の条件を満たすプログラムを完成させてください。
 *
 *【条件】
 * ・四則演算を行う計算機を作成してください。
 * ・実行時に『java Kadai3 数値1 数値2 演算子』という形式で実行時引数を
 *   使用して実行すると、、記号にあった計算結果が表示されるようにします。
 *
 * ※・割り算結果はint型にキャスト(変換)してください。
 *   ・入力ミス時にはエラーメッセージと実行例を表示して終了します。
 *
 *<例>
 * C:\work>java Kadai3 5 10 ＋
 * C:\work>java Kadai3 4 2 －
 * C:\work>java Kadai3 6 9 ×
 * C:\work>java Kadai3 8 2 ÷
 *
 *【出力結果】
 * C:\work>java Kadai3 3 4 ＋
 * 計算結果は
 * 7
 *
 * C:\work>java Kadai3 5 2 －
 * 計算結果は
 * 3
 *
 * C:\work>java Kadai3
 * 入力エラー：以下の形式で入力して下さい。(演算子は半角でも可)
 * 【実行例】C:\work>java Kadai3 3 4 ÷
 */

public class Kadai3_A {
	public static void main(String[] args) {

		int param1;// args[0]を格納する変数
		int param2;// args[1]を格納する変数
		int result;// 計算結果を格納する変数

		// 要件にはないが実行時引数の入力確認
		if (args.length != 3) {
			System.out.println("入力エラー：以下のように半角数字と全角記号で入力して下さい。");
			System.out.println("【実行例】C:\\work>java Kadai3 3 4 ÷");
			System.exit(0);
		}

		try {
			// 実行時入力引数を代入
			param1 = Integer.parseInt(args[0]);// args[0]を変換
			param2 = Integer.parseInt(args[1]);// args[1]を変換

			// メソッドの呼び出し
			result = calc(param1,param2,args[2]);

			// 結果表示
			System.out.println("計算結果" + result);
		} catch (NumberFormatException e) {
			System.out.println("数値の入力が間違っています。");
		}
	}// main
	
	/*四則演算を行うメソッド
		(String operatorには "＋"、"－"、"×"、"÷" のいずれかが入ります。)*/
	public static int calc(int param1 ,int param2 ,String operator) {
		int r = 0;

		// 入力された符号での分岐
		if(operator.equals("＋") || operator.equals("+")) {
			r = param1 + param2;
		} else if(operator.equals("－") || operator.equals("-")) {
			r = param1 - param2;
		} else if(operator.equals("×") || operator.equals("*")) {
			r = param1 * param2;
		} else if(operator.equals("÷") || operator.equals("/")) {
			r = param1 / param2;
		} else {// 入力ミス時の処理
			System.out.println("入力エラー：以下の形式で入力して下さい。(演算子は半角でも可)");
			System.out.println("【実行例】C:\\work>java Kadai3 3 4 ÷");
			System.exit(0);// 使用例を表示して終了させる
		}// if
		return r;

	}// calc
}// class