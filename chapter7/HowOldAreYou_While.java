/**
 * @title chapter7 / Additional Quest / HowOldAreYou_While
 * @class while
 * @author Oshika
 * @date 2020-08-17 / 9:30-10:00
 *
//【註: クラスファイルでの動作確認できませんでした】
題意の GridShow2は どのクラスなのか見つかりませんでした。
HowOldAreYouは、List 3-5でやりましたが、7章追加問題で配布されたクラスファイル
「HowOldAreYou_While」とクラス名が違うため、おそらく動作しないかと・・

たぶんwhile文を使うとしたら、こんなコードかなというものを作ってみました。
 */

package chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowOldAreYou_While {

  public static void main(String[] args) {
      System.out.print("あなたの名前を入力してください。");
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      try {
          String line = reader.readLine();
          System.out.println();
          System.out.println(line + "さん、こんにちは。");

          int age = -1;
          while (age < 0) {
              System.out.print("年齢を入力してください。");
              line = reader.readLine();
              age = Integer.parseInt(line);
          }//while

          System.out.println();
          System.out.printf("いま%d歳とすると、10年後は%d歳ですね。%n", age, age + 10);

      } catch (IOException e) {
          System.out.println(e);
      } catch (NumberFormatException e) {
          System.out.println("年齢が正しくありません。");
      }
  }//main()

}//class

/*
//====== Result ======
あなたの名前を入力してください。shika

shikaさん、こんにちは。
年齢を入力してください。24
いま24歳とすると、10年後は34歳ですね。

//年齢を入力してください。-50
//いま-50歳とすると、10年後は-40歳ですね。

年齢を入力してください。-30
年齢を入力してください。-55
年齢を入力してください。24
いま24歳とすると、10年後は34歳ですね。

年齢を入力してください。shika
年齢が正しくありません。

 */


