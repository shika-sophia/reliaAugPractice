/**
 * @title book1General / 上巻総合問題 / Kadai3
 * @contents Random
 * @author Oshika
 * @date 2020-08-19 / 11:00
 */
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
package book1General;

public class Kadai3 {
    public static void main(String[] args) {
        // ▽解答欄① ここから(解答欄は1行という意味ではないことに注意)
        //---- judge args ----
        if (args.length != 3) {
            System.out.println("入力エラー：以下の形式で入力して下さい。(演算子は半角でも可)\n" +
                "【実行例】C:\\work>java Kadai3 3 4 ÷");
            System.exit(0);
        }

        try {
            int param1 = Integer.parseInt(args[0]);
            int param2 = Integer.parseInt(args[1]);
            String operator = args[2];

            int result = calc(param1 , param2 , operator);

            System.out.println("計算結果: " + result);

        } catch (NumberFormatException e) {
            System.out.println("入力エラー：以下の形式で入力して下さい。(演算子は半角でも可)\r\n" +
                " * 【実行例】C:\\work>java Kadai3 3 4 ÷");
        }

        // △解答欄① ここまで

    }// main

    /*四則演算を行うメソッド
        (String operatorには "＋"、"－"、"×"、"÷" のいずれか(半角も可)が入ります。)*/
    public static int calc(int param1 ,int param2 ,String operator) {

        // ▽解答欄② ここから(解答欄は1行という意味ではないことに注意)
        int result = 0;

        switch (operator) {
          case "＋":
          case "+":
            result = param1 + param2;
            break;

          case "ー":
          case "-":
            result = param1 - param2;
            break;

          case "×":
          case "*":
            result = param1 * param2;
            break;

          case "÷":
          case "/":
            result = (int) param1 / param2;
            break;

          default:
            System.out.println("入力エラー：以下の形式で入力して下さい。(演算子は半角でも可)\r\n" +
                  "【実行例】C:\\work>java Kadai3 3 4 ÷");
        }//switch

        return result;
        // △解答欄② ここまで

    }// calc
}// class

/*
//====== Command Prompt ======
C:\Users\sophia\Desktop>javac Kadai3.java -encoding UTF-8

C:\Users\sophia\Desktop>java Kadai3 10 7 +
計算結果: 17

C:\Users\sophia\Desktop>java Kadai3 10 7 ー
計算結果: 3

C:\Users\sophia\Desktop>java Kadai3
入力エラー：以下の形式で入力して下さい。(演算子 は半角でも可)
 * 【実行例】C:\work>java Kadai3 3 4 ÷

C:\Users\sophia\Desktop>java Kadai3 ７ ９ /
計算結果: 0

C:\Users\sophia\Desktop>java Kadai3 ７ ９ *
入力エラー：以下の形式で入力して下さい。(演算子 は半角でも可)
 * 【実行例】C:\work>java Kadai3 3 4 ÷

C:\Users\sophia\Desktop>java Kadai3 3 4 ÷
計算結果: 0

 */
