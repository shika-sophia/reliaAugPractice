/**
 * @title chapter6 / Additional Quest / Q6_3
 * @author Oshika
 * @date 2020-08-12 / 9:00-10:00
 */

/*
    キーボードからいくつかの整数値を受け取って、それらを足していくプログラムを作成してください。
    いくつの整数値を受け取るか指定されるようにプログラムしてください。

    条件
    0が入力された場合、値の受け取りを終了すること（breakを利用してください)


[実行例]

整数を加算します。
何個加算しますか：3

整数(0で終了)：10
整数(0で終了)：48
整数(0で終了)：0
58です。
*/

package chapter6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q6_3 {
  public static void main(String[] args) {
      //---- parameter definition ----
      List<Integer> decimalList = new ArrayList<>();
      Scanner scn = new Scanner(System.in);
      int sum = 0; //as total of decimals

      //---- try catch for Scanner InputMismatchException ----
      try {
          //---- user input 'num' as the times to add decimals ----
          System.out.print("整数を加算します。\n何個加算しますか？");
          int num = scn.nextInt();

          for (int i = 1; i <= num; i++) {
              System.out.printf("%d個目の整数(0で終了):", i);
              int decimal = scn.nextInt();

              sum += decimal;
              decimalList.add(decimal);

              //---- judge '0' ----
              if (decimal == 0) {
                  break;
              }//if

          }//for

      } catch (NumberFormatException e) {
          e.printStackTrace();
      //} catch (Exception e) {
          //System.out.println("整数を入力してください。");
      } finally {
          scn.close();
      }

      //---- console out ----
      System.out.println("入力した整数: " + decimalList);
      System.out.println("合計: " + sum);

  }//main()
}//class

/*
//====== Result =======
整数を加算します。
何個加算しますか？5
1個目の整数(0で終了):7
2個目の整数(0で終了):14
3個目の整数(0で終了):56
4個目の整数(0で終了):81
5個目の整数(0で終了):24
入力した整数: [7, 14, 56, 81, 24]
合計: 182

整数を加算します。
何個加算しますか？5
1個目の整数(0で終了):24
2個目の整数(0で終了):16
3個目の整数(0で終了):0
入力した整数: [24, 16, 0]
合計: 40

//====== Test of try catch ======
//'Exception'だけだと、整数を入れても反応する。
} catch (Exception e) {
      System.out.println("整数を入力してください。");
}
整数を加算します。
何個加算しますか？
5
整数を入力してください。
入力した整数: []
合計: 0

 */
