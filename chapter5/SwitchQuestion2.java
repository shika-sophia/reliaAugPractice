/**
 * @title chapter5 / Additional Quest / SwitchQuestion2
 * @author Oshika
 * @date 2020-08-11 / 13:00-13:30
 */

/*
 * 問題：以下の結果が表示されるようなプログラムを記述してください。
 * ★条件
 * ・switch文を使用してください
 * ・以下のプログラムに記述されている変数は全て使用してください
 * ・同じ文字列、変数のprintln表記(重複)は禁止です。
 *
 *【出力結果】
 * >
 * 帰りにどこかに寄っていく？
 * 1:カラオケ  2:買い物  3:家に帰る
 * 1
 * カラオケに行きました。
 * そして
 * 買い物に行きました。
 * その後
 * 家に帰宅。
 * 以上。
 *
 * >
 * 帰りにどこかに寄っていく？
 * 1:カラオケ  2:買い物  3:家に帰る
 * 2
 * 買い物に行きました。
 * その後
 * 家に帰宅。
 * 以上。
 *
 * >
 * 帰りにどこかに寄っていく？
 * 1:カラオケ  2:買い物  3:家に帰る
 * 3
 * 家に帰宅。
 * 以上。
 *
 * >
 * 帰りにどこかに寄っていく？
 * 1:カラオケ  2:買い物  3:家に帰る
 * 4
 * 今日は帰りません。
 * 以上。
*/
package chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchQuestion2 {

    public static void main(String[] args) {
        String line = "";		// コマンドプロンプトから入力された内容を保持する
        int x = 0;				// switch文の式として使う変数

        System.out.println("帰りにどこかに寄っていく？");
        System.out.println("1:カラオケ  2:買い物  3:家に帰る");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            // ▽解答スペース ここから
            line = reader.readLine();
            x = Integer.parseInt(line);

            switch (x) {
              case 1:
                  System.out.println("カラオケに行きました。");

              case 2:
                  if (x == 1) {
                      System.out.println("そして");
                  }
                  System.out.println("買い物に行きました。");

              case 3:
                  if (x == 1 || x == 2) {
                      System.out.println("その後");
                  }
                  System.out.println("家に帰宅。");
                  break;

              case 4:
                  System.out.println("今日は帰りません。");
                  break;

              default:
                  System.out.println("1～4を入力してください。");
                  break;
            }//switch

            System.out.println("以上。");
            // △解答スペース ここまで

        } catch(IOException e) {
            System.out.println(e);
        }catch(NumberFormatException e) {
            System.out.println("数字を入力してください");
        }
    }// main

}// class

/*
//====== Result ======
帰りにどこかに寄っていく？
1:カラオケ  2:買い物  3:家に帰る
1
カラオケに行きました。
そして
買い物に行きました。
その後
家に帰宅。
以上。

帰りにどこかに寄っていく？
1:カラオケ  2:買い物  3:家に帰る
2
買い物に行きました。
その後
家に帰宅。
以上。

帰りにどこかに寄っていく？
1:カラオケ  2:買い物  3:家に帰る
3
家に帰宅。
以上。

1:カラオケ  2:買い物  3:家に帰る
4
今日は帰りません。
以上。

帰りにどこかに寄っていく？
1:カラオケ  2:買い物  3:家に帰る
カラオケ
数字を入力してください。
以上。

 */
