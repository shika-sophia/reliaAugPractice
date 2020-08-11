/**
 * @title chapter6 / Additional Quest / ForQuestion1
 * @author Oshika
 * @date 2020-08-11 / 14:00-
 */

/*【問題】
 * コンピュータが選択した数（0～99）を当てるゲームを作成してください。
 * 間違えた場合、プレイヤーが解答した値が、選択した値に比べて「大きい」か「小さい」を表示し、
 * 残りの解答回数も表示してください。
 *
 * なお、プレイヤーが解答できる回数は7回までに制限します。
 *（文字など数字以外を入力してしまった場合は含みません。）
 *
 * 正解した場合は、「正解です」と表示して、そのままプログラムを終了してください。
 * 制限回数内に当てられなかった場合は、正解を表示してプログラムを終了してください。
 *
 * プログラムの途中で終了するには
 * System.exit(0);
 * メソッドを使用します。
 *
 *【実行結果：正解時】
 * >java KazuateGame
 * コンピュータが0～99までの数字の中から１つ選択しました。
 * 選択した数字を当ててください。
 *（1回目）
 * >50
 * 残念、違います。
 * 選択した値は解答した値よりも「大きい」です。
 * 残り6回解答できます。
 *（2回目）
 * >75
 * 残念、違います。
 * 選択した値は解答した値よりも「小さい」です。
 * 残り5回解答できます。
 *（3回目）
 * >60
 * おめでとうございます。正解です。
 *
 *【実行結果：GameOver時】
 * >java KazuateGame
 * コンピュータが0～99までの数字の中から１つ選択しました。
 * 選択した数字を当ててください。
 *（1回目）
 * >5
 * 残念、違います。
 * 選択した値は解答した値よりも「大きい」です。
 * 残り6回解答できます。
 *
 * ～省略
 *
 *（7回目）
 * >35
 * 残念、違います。
 * 選択した値は解答した値よりも「大きい」です。
 * 解答の制限回数に達しました。
 * 正解は51でした。
 */
package chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//import java.util.Scanner;

public class ForQuestion3 {
  public static void main(String[] args) {

      Random random = new Random();
      int comSelect = random.nextInt(100);
      List<Integer> userSelectList = new ArrayList<>();
      List<String> largeList = new ArrayList<>();

      //Scanner scn = new Scanner(System.in);
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("コンピュータが0～99までの数字の中から１つ選択しました。");

      for (int i = 1; i <= 7 ; i++ ) {
        try {
          //---- user input 'userSelect' ----
          System.out.printf("選択した数字を当ててください。[%d回目] ", i);
          //int userSelect = scn.nextInt();
          String line = reader.readLine();
          int userSelect = Integer.parseInt(line);

          //---- judge good answer ----
          if (userSelect == comSelect) {
              System.out.println("おめでとうございます。正解です。");
              break;

          } else {
              System.out.println("残念、違います。");
          }


          //---- judge larger than comSelect ----
          String largeness = "";
          if (userSelect > comSelect) {
              largeness = "大きい";
          } else if (userSelect < comSelect) {
              largeness = "小さい";
          }

          System.out.printf("あなたの値[%d]は、コンピュータの値より「%s」です。\n",
                  userSelect, largeness);

          //---- set largeness to lageList ----
          //---- set userSelsct to userSelectList ----
          largeList.add(largeness);
          userSelectList.add(userSelect);

          //---- judge rest or finish ----
          if (i == 7) {
              System.out.println("解答の制限回数に達しました。");
              System.out.printf("正解は[%s]でした。\n", comSelect);
              System.out.println("あなたの解答: " + userSelectList);
              System.out.println("大小関係: " + largeList);
          } else {
              System.out.printf("残り%d回 解答できます。\n", 7 - i);
              System.out.println();
          }

        } catch (IOException e) {
            e.printStackTrace();

        } catch (NumberFormatException e) {
            System.out.println("数字を入力してください。");
            i--;
        }
      }//for

      //scn.close();
  }//main()

}//class

/*
//====== Result ======
//---- success case ----
コンピュータが0～99までの数字の中から１つ選択しました。
選択した数字を当ててください。[1回目] 50
残念、違います。
あなたの値[50]は、コンピュータの値より「大きい」です。
残り6回 解答できます。

選択した数字を当ててください。[2回目] 25
残念、違います。
あなたの値[25]は、コンピュータの値より「大きい」です。
残り5回 解答できます。

選択した数字を当ててください。[3回目] 12
残念、違います。
あなたの値[12]は、コンピュータの値より「大きい」です。
残り4回 解答できます。

選択した数字を当ててください。[4回目] 6
おめでとうございます。正解です。

//---- fault case ----
コンピュータが0～99までの数字の中から１つ選択しました。
選択した数字を当ててください。[1回目] 60
残念、違います。
あなたの値[60]は、コンピュータの値より「大きい」です。
残り6回 解答できます。

選択した数字を当ててください。[2回目] 30
残念、違います。
あなたの値[30]は、コンピュータの値より「小さい」です。
残り5回 解答できます。

選択した数字を当ててください。[3回目] 25
残念、違います。
あなたの値[25]は、コンピュータの値より「小さい」です。
残り4回 解答できます。

選択した数字を当ててください。[4回目] 22
残念、違います。
あなたの値[22]は、コンピュータの値より「小さい」です。
残り3回 解答できます。

選択した数字を当ててください。[5回目] 11
残念、違います。
あなたの値[11]は、コンピュータの値より「小さい」です。
残り2回 解答できます。

選択した数字を当ててください。[6回目] 73
残念、違います。
あなたの値[73]は、コンピュータの値より「大きい」です。
残り1回 解答できます。

選択した数字を当ててください。[7回目] 31
残念、違います。
あなたの値[31]は、コンピュータの値より「小さい」です。
解答の制限回数に達しました。
正解は[34]でした。
あなたの解答: [60, 30, 25, 22, 11, 73, 31]
大小関係: [大きい, 小さい, 小さい, 小さい, 小さい, 大きい, 小さい]


//---- Test of not Number case ----
●Scannerだと、やっぱだめだった。
選択した数字を当ててください。[6回目] 九
Exception in thread "main" java.util.InputMismatchException
    at java.base/java.util.Scanner.throwFor(Scanner.java:939)
    at java.base/java.util.Scanner.next(Scanner.java:1594)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
    at chapter6.ForQuestion3.main(ForQuestion3.java:81)

〇BufferedReaderに修正後
コンピュータが0～99までの数字の中から１つ選択しました。
選択した数字を当ててください。[1回目] 五十
数字を入力してください。
選択した数字を当ててください。[1回目] 50
残念、違います。
あなたの値[50]は、コンピュータの値より「大きい」です。
残り6回 解答できます。

選択した数字を当ててください。[2回目] 二十五
数字を入力してください。
選択した数字を当ててください。[2回目] 25
残念、違います。
あなたの値[25]は、コンピュータの値より「小さい」です。
残り5回 解答できます。

選択した数字を当ててください。[3回目] ３０
残念、違います。
あなたの値[30]は、コンピュータの値より「大きい」です。
残り4回 解答できます。

選択した数字を当ててください。[4回目] 27
残念、違います。
あなたの値[27]は、コンピュータの値より「小さい」です。
残り3回 解答できます。

選択した数字を当ててください。[5回目] 28
おめでとうございます。正解です。

 * */
