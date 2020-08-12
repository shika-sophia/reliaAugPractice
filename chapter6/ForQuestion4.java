/**
 * @title chapter6 / Additional Quest / ForQuestion1
 * @author Oshika
 * @date 2020-08-11 / 15:30-17:00
 */

/*
 * 問題(難)：以下の実行結果になるようにfor文を使ってプログラムを作成してください。
 *
 *	条件：for文の条件式の中に、変数ｘを必ず使用すること。
 *			また、概存のソースを削除しないこと。
 *
 * ヒント：「掛け算」と「割り算」を条件式でうまく使ってください。
 *			あと、条件式に定数(具体的な数字)を入れなくても答えを導けます。
 *
【実行結果】

***********           ***********
*********         *********
*******       *******
*****     *****
****    ****
***   ***
**  **
* *
* *
* *
* *
* *
* *
* *
**  **
***   ***
****    ****
*****     *****
*******       *******
*********         *********
***********           ***********

*/
package chapter6;

public class ForQuestion4 {
  public static void main(String[] args) {
      int x = 10;

      for (int i = 1 + x; i >= 2; i--) {
          //---- judge to draw ----
          boolean judgeDraw = judgeDraw(i);

          //---- drawGraph ----
          if(judgeDraw) {
              boolean drawGraph = drawGraph(i);
          }

      }//for 上段

      for (int i = 1; i <= 7; i++) {
          boolean drawGraph = drawGraph (1);
      }//for 中段

      for (int i = 1; i <= 1 + x; i++) {
        //---- judge to draw ----
          boolean judgeDraw = judgeDraw(i);

          //---- drawGraph ----
          if(judgeDraw) {
              boolean drawGraph = drawGraph(i);
          }
      }//for 下段

  }//main()


  //====== judgeDraw() ======
  private static boolean judgeDraw(int i) {
    int[] draw = new int[] {11, 9, 7, 5, 4, 3, 2};

    for (int drawBit : draw) {
        if (i == drawBit) {
            return true;
        } else {
            ;//falseの場合は他の条件も探すので文末に
        }
    }//for drawBit

    return false;
  }//judgeDraw()


  //====== drawGraph() ======
  private static boolean drawGraph(int i) {
      for (int j = 0; j < i; j++) {
          System.out.print("*");
      }//for 左

      for (int j = 0; j < i; j++) {
          System.out.print(" ");
      }//for 中央空欄

      for (int j = 0; j < i; j++) {
          System.out.print("*");
      }//for 右
      System.out.println();
    return true;
  }//drawGraph
}//class

/*
//====== Result ======
***********           ***********
*********         *********
*******       *******
*****     *****
****    ****
***   ***
**  **
* *
* *
* *
* *
* *
* *
* *
**  **
***   ***
****    ****
*****     *****
*******       *******
*********         *********
***********           ***********

//【考察】2020-08-11-17:00
なんだか私のはインチキぽいけど、一応できた！

これを1つのfor文と条件式でと言われると、ちと難しい。
条件式や配列に定数を入れまくっとるし・・
ヒントの掛け算・割り算を使ってないから、もう一度、考えてみるか

//【考察２】2020-08-12-10:00
曲線の形状から２次関数を考えてみたのだけど、
一般式 y = ax^2 + bx + c と置いて、この場合 xはi, yは[11,9,7,5,4,3,2]を
入れてもa, b, cの連立は解けない。

i は 21個あるから、真ん中を0とすると、-10～0～10で21個。
与式の x = 10 (ここのxとは別物)はそういう数字だろうか。

２次関数とするとaが可変で原点から離れるほど逓増する。
もちろんこれは２次関数ではなくて「いくつかの式が複合した曲線」ということになる。

規則性のない[11,9,7,5,4,3,2]を何倍かしたらいけるのかも
でも、不規則なものを配列に定数で入れて描き出すという私の方法は意外に良い方法かも。
もう少しスッキリした式で書いてみたかったが・・同じ曲線を再現できたから佳しとしよう。
 *
 */
