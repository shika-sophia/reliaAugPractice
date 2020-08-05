/**
 * @title chapter3 / List 3-7
 * @class provide ten multiplication questions,
 *        and console-out the number & rate of goodAnswer.
 * @author Oshika
 * @copyRight Hiroshi Yuki
 * @date 2020-08-05
 */

package chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Multiplication {
  //---- field ----
  public static final int MAX_QUESTION = 10;

  //==== main() ====
  //RDD: 九九の問題を MAX_QUESTION回 繰り返して表示
  //     最後に正答数・正答率を表示
  public static void main(String[] args) {
      int goodAnswer = 0;
      System.out.printf("これから九九の問題を %d問 出します。\n", MAX_QUESTION);

      //---- for -> MAX_QUESTION ----
      for (int i = 0; i < MAX_QUESTION; i++) {
          //---- callmethod ----
          boolean ok = showQuestion(i + 1);

          //---- count goodAnswer ----
          if (ok) {
              goodAnswer++;
          }//if
      }//for

      //---- call method ----
      String result = buildResult(goodAnswer);

      //---- console-out result ----
      System.out.println(result);
  }//main()


  //====== showQuestion() ======
  //RDD: 九九の問題を１問出して、userの返答を待つ
  //     正答・誤答を表示
  //     正答の場合は trueを return
  private static boolean showQuestion(int questNum) {
      //【考察】
      //テキストのMath.random()はdouble値を返す。
      //java.util.RandomならnextInt()で最初からint値。
      //下記「+1」は、これがないと0～8の乱数になるため「+1」して1～9に
      Random random = new Random();
      int x = random.nextInt(9) + 1 ;
      int y = random.nextInt(9) + 1;

      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      try {
          System.out.println();
          System.out.print("[第" + questNum + "問] " + x + "×" + y + "＝ ");
          String line = reader.readLine();
          int answer = Integer.parseInt(line);

          if (x * y == answer) {
              System.out.println("はい、正しいです。");
              return true;
          } else {
              System.out.println("残念、間違いです。正しくは" + (x * y) + "でした。");
              return false;
          }//if else

      } catch (IOException e) {
          System.out.println(e);
      } catch (NumberFormatException e) {
          System.out.println("入力が正しくありません。");
      }

      return false;
  }//showQuestion()


  //====== buildResult() ======
  private static String buildResult(int goodAnswer) {
    //---- calc rate----
    double rate = goodAnswer * 100.0 / MAX_QUESTION ;

    //---- make resultBuilder ----
    StringBuilder resultBuilder = new StringBuilder();
      resultBuilder.append("\n");
      resultBuilder.append("問題は ").append(MAX_QUESTION).append(" 問ありました。\n");
      resultBuilder.append("正しく答えられたのは ").append(goodAnswer).append(" 問です。\n");
      resultBuilder.append("間違ってしまったのは ").append(MAX_QUESTION - goodAnswer).append(" 問です。\n");
      resultBuilder.append("正答率は ").append(rate).append(" ％です。\n");;
      resultBuilder.append("\n");
      resultBuilder.append("おつかれさまでした。\n");
      resultBuilder.append("\n");

    String result = resultBuilder.toString();
    return result;
  }//buildResult()

}//class

/*
//====== Result ======
これから九九の問題を 10問 出します。

[第1問] 6×3＝ 15
残念、間違いです。正しくは18でした。

[第2問] 3×8＝ 24
はい、正しいです。

[第3問] 6×3＝ 15
残念、間違いです。正しくは18でした。

[第4問] 3×5＝ 15
はい、正しいです。

[第5問] 9×8＝ 72
はい、正しいです。

[第6問] 1×9＝ 9
はい、正しいです。

[第7問] 4×1＝ 4
はい、正しいです。

[第8問] 7×2＝ 14
はい、正しいです。

[第9問] 2×9＝ 18
はい、正しいです。

[第10問] 3×7＝ 21
はい、正しいです。

問題は 10 問ありました。
正しく答えられたのは 8 問です。
間違ってしまったのは 2 問です。
正答率は 80.0 ％です。

おつかれさまでした。
*/


