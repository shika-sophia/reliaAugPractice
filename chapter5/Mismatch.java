/**
 * @title chapter5 / Practice 5-8 Advanced [研究問題] / Mismatch
 * @RDD input時の空白enterで
 *     「java.lang.StringIndexOfBoundException」が出る問題を解消せよ
 * @see サンプルに Practice 5-7(DayOfWeek)を使用
 * @author Oshika
 * @date 2020-08-08 / 15:00-17:00
 */

package chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Optional;

//####### Practice 5-7 primitive with input "" + enter only ######
public class Mismatch {

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
数値を入力してください。
java.lang.NumberFormatException: For input string: ""
0～6を入力してください
数値を入力してください。
at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
    at java.base/java.lang.Integer.parseInt(Integer.java:662)
    at java.base/java.lang.Integer.parseInt(Integer.java:770)
    at chapter5.Mismatch.main(Mismatch.java:35)
数値を入力してください。2
火曜日

【考察】Exception出ても動き続ける不屈のサンプル。
１つ目の「java.lang.NumberFormatException: For input string: ""」は
初期値設定 line = ""; によるものか。変数 lineは tryブロック内だけしか使ってないので
tryブロックに入れてもいいのだが、

題意のinput時の空白enterで「java.lang.StringIndexOfBoundException」が出る問題は
Null Pointerと同様の「値がない」ことによる例外と思われるので、そのままで良いかも。

２つ目で指摘されているように「java.base/java.lang.Integer.parseInt」は
「String ""じゃ数値にできないよ」という例外

初期値を数値にすればいけるか、やってみる。
*/
/*
//###### [String line = "9";] Version ######
public class Mismatch {

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
              String line ="9";

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
*/
/*
//====== Result =======
数値を入力してください。
java.lang.NumberFormatException: For input string: ""
0～6を入力してください
数値を入力してください。	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
    at java.base/java.lang.Integer.parseInt(Integer.java:662)
    at java.base/java.lang.Integer.parseInt(Integer.java:770)
    at chapter5.Mismatch.main(Mismatch.java:117)
4
木曜日

【考察】結果は同じ・・
てか初期値は全く関係ない。もともと非初期化エラーを防ぐためのダミーで
後に inputしたもので塗り替えるための初期値だから。

ここの「java.lang.NumberFormatException: For input string: ""」は
「inputに何も入ってないよ」っていう例外で、新たに catch()ブロックを設定するしかなさそう。

んー、ネットで調べても「NumberFormatException」のtry-catchしか出てこんな。
ちなみに Scannerも「NumberFormatException」でいけるらしい。
あとは OptionalクラスのNullable試してみるか
*/

/*
//###### Optional.Nullable Version ######
//参考文献: 山田祥寛『独習Java 新版』翔泳社,2019 / p.320 Optionalクラス

String line = "";
Optional lineOption = Optional.ofNullable(line);

  try {
      lineOption = (Optional) reader.readLine();
  } catch ～

こんなんを作ってみたが「Stringから Optionalへのキャストはできません」と。

String line = reader.readLine();の下に Optionalを持って行っても
「For input String ""」の例外は解消されないだろうから、これでお手上げ。

降参です。(答え合わせ)
解答は charAt() の文字数による例外とのこと
「Exception: in thread "main" java.lang.StringIndexOfBoundException:
  string index out of range: 0
    at java.lang.String.charAt(String.java:657)
    at java.lang.Drink2.main(Drink2.java: 13)」

私のは charAt()を使って組んでないから、そもそも Exceptionメッセージが違う。

仮に charAt()を私のコードに加えて解答にある処理をしても、
line = reader.readLine();の時点で、ぬるぽが返されるので、解答を見ても私の問題は解決できない。

今後の研究課題としておきます。try-catch 奥が深そう・・

*/

