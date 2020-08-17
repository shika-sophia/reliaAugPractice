/**
 * @title chapter7 / Additional Quest / HowOldAreYou_While
 * @class while
 * @author Oshika
 * @date 2020-08-17 / 13:00-13:30
 * @RDD
//C:\Users\sophia\Desktop>java HowOldAreYou_While
名前を入力してください。
shika

shikaさん、こんにちは。年齢を入力してください。
24

10年後のshikaさんは、34歳ですね。

C:\Users\sophia\Desktop>java HowOldAreYou_While
名前を入力してください。
shika

shikaさん、こんにちは。年齢を入力してください。
shika

年齢を数字で入力してください。
-50

年齢がマイナスになっています。
もう一度、入力し直してください。
0.5

年齢を数字で入力してください。
24

10年後のshikaさんは、34歳ですね。

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

//【考察】
 * 実行結果から無効入力を判定する永久ループなので、
 * このコードで良いと思う。
 */


