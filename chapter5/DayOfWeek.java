/**
 * @title chapter5 / Practice 5-7
 * @class select drink by switch()
 * @author Oshika
 * @date 2020-08-07 / 14:30-16:00
 */
package chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
import java.util.Scanner;

public class DayOfWeek {

  public static void main(String[] args) {
      //---- parameter definition ----
      String[] week = new String[]{
          "日曜日","月曜日","火曜日","水曜日","木曜日","金曜日","土曜日"};
      int weekNum = -1;

      //---- user input 'weekNum' in loop----
      Scanner scn = new Scanner(System.in);

      loop:
      for( ; ; ) {
          System.out.print("数値を入力してください。");
          weekNum = scn.nextInt();

          //---- judge input adjustment / 適合判定 ----
          switch (weekNum) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                break loop;

            default:
                if (weekNum < 0 || weekNum > 6) {
                    System.out.println("0～6を入力してください");
                } else {
                    System.out.println("数値を入力してください");
                }//if else

          }//switch
      }//for loop

      //---- console out 'week[weekNum]' ----
      System.out.println(week[weekNum]);

      scn.close();
  }//main()

}//class
*/
/*
//====== Result ======
数字を入力してください。2
火曜日

数字を入力してください。２
火曜日

●適合判定が nextInt()の後ろにあったら、こうなるね。
でも適合判定に nextInt()で入れた weekNumを使うから、どうしたらいいんや。
try-catchで例外投げて終了しかないか、そうするとfor-loopの意味ない。

【対応策１】BufferdReaderのtry-catchに for-loopを付ける
【対応策２】ScannerのExcptionを調べてtry-catch & for-loop

どっちもやってみるか

//====== Result ======
数字を入力してください。火曜日
Exception in thread "main" java.util.InputMismatchException
    at java.base/java.util.Scanner.throwFor(Scanner.java:939)
    at java.base/java.util.Scanner.next(Scanner.java:1594)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
    at chapter5.DayOfWeek.main(DayOfWeek.java:25)

*/

//###### BufferedReader for-loop Version ######
public class DayOfWeek {

      public static void main(String[] args) {
          //---- parameter definition ----
          String[] week = new String[]{
              "日曜日","月曜日","火曜日","水曜日","木曜日","金曜日","土曜日"};
          int weekNum = -1;

          //---- user input 'weekNum' in loop----
          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

          loop:
          for( ; ; ) {
              System.out.print("数値を入力してください。");
              String line = "";

            try {
                line = reader.readLine();
                weekNum = Integer.parseInt(line);

            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

              //---- judge input adjustment / 適合判定 ----
              switch (weekNum) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    break loop;

                default:
                    if (weekNum < 0 || weekNum > 6) {
                        System.out.println("0～6を入力してください");
                    }//if else

              }//switch
          }//for loop

          //---- console out 'week[weekNum]' ----
          System.out.println(week[weekNum]);

      }//main()

    }//class

/*
//====== Result ======
数値を入力してください。火曜日
Exception in thread "main" java.lang.NumberFormatException: For input string: "火曜日"
    at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
    at java.base/java.lang.Integer.parseInt(Integer.java:652)
    at java.base/java.lang.Integer.parseInt(Integer.java:770)
    at chapter5.DayOfWeek.main(DayOfWeek.java:115)

●結果は同じか。try-catch機能してない
115行目 weekNum = Integer.parseInt(line);
Integer.parseInt()に入れるところでエラーになっとる。
   ↓
〇weekNum = Integer.parseInt(line);をtryの中に入れたら、うまくいった！
//====== Result ======
数値を入力してください。火曜日

0～6を入力してください
数値を入力してください。４
木曜日


Scannerの例外処理と Practice 5-8の enter例外処理(こっちのがさらに難しそう)
似た話なので次クラスでやろう。てかあと１時間で終わらん。

きっちり金曜で５章完了したかったところだけど、早く進むことが大事ではない。
自分に適した問題点を見つけて、調べて、理解を深めることが大事。

ってことで、週末はtry-catchざんまいで Exceptionのお友達になろう。

 * */
