/**
 * @title chapter4 / additional quest / IfQuestion5
 * @author Oshika
 * @date 2020-08-06 16:00
 */

/*
 *【問題】
 *コマンドプロンプトから３つの整数値を入力して、
 *その最小値を表示するプログラムを作成してください。
 *
 *【実行結果】
 *>java IfQuestion5
 *第１数値を入力してください。
 *>10
 *第２数値を入力してください。。
 *>5
 *第３数値を入力してください。
 *>-15
 *第１数値：10
 *第２数値：5
 *第３数値：-15
 *最小値は-15です。
 */
package chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
import java.util.Arrays;

public class IfQuestion5 {
  public static void main(String[] args) {
    //---- user input 'line'----
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] array = new int[3];

    for (int i = 0; i < array.length; i++) {
        System.out.printf("第%d数値を入力してください。\n", i + 1);

        try {
            String line = reader.readLine();
            array[i] = Integer.parseInt(line);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("数値を入力してください。");
        }

    }//for

    //---- console out 'array'----
    for (int i = 0; i < array.length; i++) {
        System.out.printf("第%d数値: %d \n", i + 1, array[i]);
    }//for

    //---- sort minimum among input numbers----
    Arrays.sort(array);
    int min = array[0];

    //---- console out 'min' ----
    System.out.printf("最小値は%dです。\n", min);

  }//main()
}//class
*/
/*
//====== Result ======
第1数値を入力してください。
2
第2数値を入力してください。
5
第3数値を入力してください。
-15

第1数値: 2
第2数値: 5
第3数値: -15
最小値は-15です。

//【考察】できた！
          ・・って、またif文を使ってない。sortするんじゃない。
*/


//###### if文 Version ######
public class IfQuestion5 {
  public static void main(String[] args) {
    //---- user input 'line'----
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] array = new int[3];

    for (int i = 0; i < array.length; i++) {
        System.out.printf("第%d数値を入力してください。\n", i + 1);

        try {
            String line = reader.readLine();
            array[i] = Integer.parseInt(line);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("数値を入力してください。");
        }

    }//for

    //---- console out 'array'----
    for (int i = 0; i < array.length; i++) {
        System.out.printf("第%d数値: %d \n", i + 1, array[i]);
    }//for

    //---- judge minimum among input numbers----
    //【アルゴリズム】他の２つと比較して、どちらにも小なら、その数が最小
    int min = 0;
    if (array[0] <= array[1]){
        if (array[0] <= array[2]) {
            min = array[0];
        }
    }

    if (array[1] <= array[0]){
        if (array[1] <= array[2]) {
            min = array[1];
        }
    }

    if (array[2] <= array[0]){
        if (array[2] <= array[1]) {
            min = array[2];
        }
    }

    //---- console out 'min' ----
    System.out.printf("最小値は%dです。\n", min);
  }//main()
}//class

/*
//====== Result ======
第1数値を入力してください。
2
第2数値を入力してください。
-20
第3数値を入力してください。
-5
第1数値: 2
第2数値: -20
第3数値: -5
最小値は-20です。


●比較条件式の等号は、この結果から修正
第1数値を入力してください。
-20
第2数値を入力してください。
-20
第3数値を入力してください。
5
第1数値: -20
第2数値: -20
第3数値: 5
最小値は0です。


〇修正後
第1数値を入力してください。
-20
第2数値を入力してください。
-20
第3数値を入力してください。
3
第1数値: -20
第2数値: -20
第3数値: 3
最小値は-20です。

*/
