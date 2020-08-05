/**
 * @title chapter3 / List 3-5
 * @class ask user name and age.
 * @author Oshika
 * @date 2020-08-05
 */
package chapter3;

import java.util.Scanner;

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//###### BufferedReader Version ######
public class HowOldAreYou {
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
*/
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


//###### Scanner Version ######
/*【考察】
BufferedReaderやStreamは、多数の細切れデータを読み込んで、
Bufferという8192byteのメモリに一旦蓄積し、Streamの小川で一気に流すイメージ。
単発の入力ならScannerでよいのでは？
同じことをScannerでやってみる。
*/
/*
public class HowOldAreYou {
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.print("あなたの名前を入力してください。");
      String name = scn.nextLine();

      System.out.println();
      System.out.println(name + "さん、こんにちは。");
      scn.close();

      Scanner scn2 = new Scanner(System.in);
      int age = -1;
      while (age < 0) {
          System.out.print("年齢を入力してください。");
          age = scn2.nextInt();
      }//while

      System.out.println();
      System.out.printf("いま%d歳とすると、10年後は%d歳ですね。%n", age, age + 10);

      scn2.close();
  }//main()
}//class
*/
/*
//====== Result ======
あなたの名前を入力してください。shika

shikaさん、こんにちは。
年齢を入力してください。Exception in thread "main" java.util.NoSuchElementException
    at java.base/java.util.Scanner.throwFor(Scanner.java:937)
    at java.base/java.util.Scanner.next(Scanner.java:1594)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
    at chapter3.HowOldAreYou.main(HowOldAreYou.java:88)

【考察】こんなエラー出た。

Google検索「Scanner java.util.NoSuchElementException」

https://teratail.com/questions/126925
◆おそらく「Scannerの使い方が不適切」です。
    countメソッドは何度も呼び出されるメソッドだと思います。
    その中で毎回Scannerインスタンスをnewしてメソッドが終わるときにcloseしていますね？
    closeするとSystem.inもcloseされます。
    よって2回目にこのメソッドを呼び出したときには既にSystem.inはclose済みなので二度と入力処理はできません。

    そのためNoSuchElementExceptionが発生したのでしょう。

    対策：
    プログラムの中ではScannerは一度だけ生成し、それをずっと使い続けてください。
    closeをする適切なタイミングはアプリケーションを終了するときです。
    countメソッドの中でScannerインスタンスが必要なのでcountメソッドの引数として渡すか
    フィールドに覚えておくかしなければなりません。
 */

//###### Scanner Version改 ######
public class HowOldAreYou {
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.print("あなたの名前を入力してください。");
      String name = scn.nextLine();

      System.out.println();
      System.out.println(name + "さん、こんにちは。");

      int age = -1;
      while (age < 0) {
          System.out.print("年齢を入力してください。");
          age = scn.nextInt();
      }//while

      System.out.println();
      System.out.printf("いま%d歳とすると、10年後は%d歳ですね。%n", age, age + 10);

      scn.close();
  }//main()
}//class
/*
//====== Result ======
あなたの名前を入力してください。shika

shikaさん、こんにちは。
年齢を入力してください。24

いま24歳とすると、10年後は34歳ですね。

*/