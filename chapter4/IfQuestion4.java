/**
 * @title chapter4 / additional quest / IfQuestion4
 * @author Oshika
 * @date 2020-08-06 15:40
 */

/*
 *【問題】
 * コマンドプロンプトから整数値を入力して、
 * その絶対値を表示するプログラムを作成してください。
 * ※絶対値とは「０からの距離」すなわち、その数から負の符号を取り除いたものになります。
 *
 *【実行結果】
 * >java IfQuestion4
 * 整数を入力してください。
 * >10
 * 絶対値は10です。
 *
 * >java IfQuestion4
 * 整数を入力してください。
 * >-11
 * 絶対値は11です。
 */

package chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfQuestion4 {
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("整数を入力してください。");
    int decimal = 0;

    try {
        String line = reader.readLine();
        decimal = Integer.parseInt(line);

    } catch (IOException e) {
        e.printStackTrace();
    } catch (NumberFormatException e) {
        System.out.println("整数を入力してください。");
    }

    int absolute = Math.abs(decimal);
    System.out.printf("%dの絶対値は %dです。",decimal, absolute);

  }//main()
}//class

/*
//====== Result =====
整数を入力してください。
-39
-39の絶対値は 39です。

【考察】↑if文 使うてない・・

本来なら、こうか
if (decimal < 0){
    absolute = decimal * (-1);
} else if (decimal >= 0){
    absolute = decimal;
}

System.out.printf("%dの絶対値は %dです。",decimal, absolute);
*/