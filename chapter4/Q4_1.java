/**
 * @title chapter4 / additional quest / Q4_1
 * @author Oshika
 * @date 2020-08-07 8:40-9:00
 */

/*
    2つのint型の変数に値を入れて、その2つを比較し、以下のように表示するプログラムを作成してください。
    「xの方が大きい」
    「yの方が大きい」
    「xとyは同じ値です」

    [実行例]
    x:50
    y:100
    yの方が大きいです。

*/

package chapter4;

import java.util.Scanner;

public class Q4_1 {
  public static void main(String args[]) {
      //---- user input x & y ----
      Scanner scn = new Scanner(System.in);
      System.out.print("xの数値を入れてください。");
      int x = scn.nextInt();

      System.out.print("yの数値を入れてください。");
      int y = scn.nextInt();

      //---- console out 'x' & 'y' ----
      System.out.println("x: " + x);
      System.out.println("y: " + y);

      //---- compare large or small about x & y ----
      if (x > y) {
          System.out.println("xのほうが大きい。");
      } else if (x < y) {
          System.out.println("yのほうが大きい。");
      } else if (x == y) {
          System.out.println("xとyは等しい。");
      }
  scn.close();
  }//main()
}//class

/*
//====== Result ======
xの数値を入れてください6
yの数値を入れてください7
x: 6
y: 7
yのほうが大きい

xの数値を入れてください。１０
yの数値を入れてください。１０
x: 10
y: 10
xとyは等しい。

【考察】Scanner.nextInt()は「１０」と全角(たぶんString)で入れてもintに変換してる。
        数値を入力すると改行して次を表示。
*/
