/**
 * @title chapter4 / additional quest / Q4_2
 * @author Oshika
 * @date 2020-08-07 / 9:00-10:30
 */

/* RDD:
    キーボードから入力されたサイズを分岐させて、

    19以下 ワカナ
    20以上～40未満 ツバス
    39より大きい～59以下 ハマチ
    60～79 メジロ
    80以上 ブリ

    という条件で、出世魚の名前を出力するプログラムを作成してください。

    [解答例]
    魚のサイズを入力してください
    ↓
    79
    ↓
    メジロ
*/
package chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4_2 {
  public static void main(String args[]) {
      //---- user input fish size ----
      Scanner scn = new Scanner(System.in);
      System.out.print("魚のサイズを入力してください (cm)。");
      double size = scn.nextDouble();

      //---- parameter definition ----
      List<String> fishName = new ArrayList<>();
          fishName.add(0, "未確認生物");
          fishName.add(1, "ワカナ");
          fishName.add(2, "ツバス");
          fishName.add(3, "ハマチ");
          fishName.add(4, "メジロ");
          fishName.add(5, "ブリ");

      int fishNum = 0;

      //---- judge size ----
      if (size > 0 && size <= 19) {
          fishNum = 1;
      } else if (size >= 20 && size < 40) {
          fishNum = 2;
      } else if (size >= 40 && size < 60) {
          fishNum = 3;
      } else if (size >= 60 && size < 80) {
          fishNum = 4;
      } else if (size >= 80) {
          fishNum = 5;
      } else {
          fishNum = 0;
      }

      //---- console out 'size' & 'fishName'----
      System.out.printf("size: %.2f cm \n", size);
      System.out.printf("その魚は、%sです。\n", fishName.get(fishNum));

      scn.close();
  }//main()
}//class

/*
//====== Result ======
【考察】
題意は「より大きい」「以上」「以下」「未満」の区別を等号の有無で反映させるための問題
でも「40以下」と「39より大きい」だと39.5のときはどうなるのかと疑問を持ち入力してみた。
整数入力なら問題ないが、釣り客は0.1cm単位で細かく申告してきそうだ。
ってことでnextDouble()を試す。比較条件は小数仕様で きっちり区切ることに
そうしないと、両方の条件に合致して先に合致したところに決まってしまう。

●nextInt()なら、こうなるよね。
    魚のサイズを入力してください (cm)。39.5
    Exception in thread "main" java.util.InputMismatchException
      at java.base/java.util.Scanner.throwFor(Scanner.java:939)
      at java.base/java.util.Scanner.next(Scanner.java:1594)
      at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
      at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
      at chapter4.Q4_2.main(Q4_2.java:36)
    ↓
〇nextDouble()を使ってみる。
〇printfの中も修正「%.2f」は小数点以下２桁の10進数少数の意。
    魚のサイズを入力してください (cm)。39.5
    size: 39.50 cm
    その魚は、ツバスです。

●うそをついちゃ、あかん
魚のサイズを入力してください (cm)。-1
size: -1.00 cm
その魚は、ワカナです。
  ↓
〇修正後
魚のサイズを入力してください (cm)。-1
size: -1.00 cm
その魚は、未確認生物です。

*/
