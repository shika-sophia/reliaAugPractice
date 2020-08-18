/**
 * @title chapter8 / Additional Quest / Greetings
 * @class Method
 * @author Oshika
 * @date 2020-08-17 / 16:30-17:30
 */
/*
 * 以下のプログラムを完成させて下さい。
 *
 * int型の引数を受け取り、1のときは"おはよう"、2のときは"こんにちは"、3のときは"こんばんは"、
 * というString型の戻り値を返すメソッドを宣言し、メインメソッドから呼び出してください。
 * なお、メソッドの命名は自由とします
 */
package chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greetings {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1～3の数字を入力して下さい");

        try {
            String line = reader.readLine();
            int i = Integer.parseInt(line);

            // ▽記述欄① ここから

                  String message = message(i);
                  System.out.println(message);

            // △記述欄① ここまで

        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字で答えて下さい。");
        }// try～catch

    }// main

    // String型で戻り値を返すメソッド
    // ▽記述欄② ここから
    private static String message(int i) {
        String message = "";
        switch ( i ) {
          case 1 :
              message = "おはよう";
              break;

          case 2 :
              message = "こんにちは";
              break;

          case 3 :
              message = "こんばんは";
              break;

          default :
              message = "1～3の数字を入力してください。";
        }//switch
        return message;

    }//message()
    // △記述欄② ここまで

}// class

/*
//====== Result ======
1～3の数字を入力して下さい
1
おはよう

1～3の数字を入力して下さい
2
こんにちは

1～3の数字を入力して下さい
5
1～3の数字を入力してください。
 * */
