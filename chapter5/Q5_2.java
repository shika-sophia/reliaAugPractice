/**
 * @title chapter5 / Additional Quest / Q5_2
 * @author Oshika
 * @date 2020-08-11 / 13:00-
 */

/*
    入力された数値が7か8だった場合、「夏休みです」と表示するプログラムを作ってください。

    条件：System.out.println("夏休みです");は、【一回】しか使わないようにしてください。

    [実行例]
    (7 or 8)
    夏休みです

    (それ意外)
    夏休みではありません

    (整数値以外)
    数字を入力してください。

*/

package chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5_2 {
  public static void main (String[] args) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      try {
          System.out.println("何月ですか？");
          String line = reader.readLine();
          int month = Integer.parseInt(line);

          switch (month) {
          case 7:
          case 8:
              System.out.println("夏休みです。");
              break;
          default:
              System.out.println("夏休みではありません。");
              break;

          }
      } catch (IOException e) {
          e.printStackTrace();
      } catch (NumberFormatException e) {
          e.printStackTrace();
          System.out.println("数字を入力して下さい。");
      }
  }//main()
}//class

/*
//====== Result ======
何月ですか？
7
夏休みです。

数字を入力して下さい。
    at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
    at java.base/java.lang.Integer.parseInt(Integer.java:652)
    at java.base/java.lang.Integer.parseInt(Integer.java:770)
    at chapter5.Q5_2.main(Q5_2.java:37)

*/
