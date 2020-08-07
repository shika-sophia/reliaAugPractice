/**
 * @title chapter4 / additional quest / Q4_3
 * @author Oshika
 * @date 2020-08-07 / 10:30-11:00
 */
/*
    上巻のp170を参照してください。

    equalsメソッドを使って、入力された文字列が「おはようございます」だった場合、「おはようございます」と返すプログラムを作成してください。
    また、else ifを用いて、「こんにちは」だった場合は「こんにちは」、「こんばんは」だった場合は「こんばんは」、
    その他だった場合は、「さようなら」と表示する機能を持たせてください。

    [解答例]
    挨拶を入力してください。
    ↓
    （入力）
    ↓
    こんにちは
*/

package chapter4;

import java.util.Scanner;

public class Q4_3 {
  public static void main(String args[]) {
      //---- user input greeting ----
      Scanner scn = new Scanner(System.in);
      System.out.print("あいさつを入力してください。");
      String userVoice = scn.nextLine();
      String voice = "";

      //---- judge user voice ----
      if (userVoice.contains("おはよう")) {
          voice = "おはようございます。";
      } else if(userVoice.contains("こんにち")) {
          voice = "こんにちは。";
      } else if(userVoice.contains("こんばん")) {
          voice = "こんばんは。";
      } else {
          voice = "さようなら。";
      }

      //---- console out 'voice' ----
      System.out.println(voice);

      scn.close();
  }//main()
}//class

/*
//【考察】
題意equals()を使うとのことでしたが、文字列比較に「==」ではなくこれをという問題
ここでまた疑問が・・・
userに入力させて「。」を忘れるひと絶対いる。
それだけで「さようなら」とか言われるのは切なすぎる・・

また「こんにちは」なのか「こんにちわ」なのか、たまに私も迷う
userによっては「わ」のほうを入れるかも、たったそれだけで「さようなら」とか・・以下略

なのでcontains()を試してみました。(←「s」注意)
「xxxx.contains("String")」で「xxxxに"String"を含むか」の booleanを返す。

//====== Result ======
あいさつを入力してください。おはようです
おはようございます。

あいさつを入力してください。こんばんわ
こんばんは。

あいさつを入力してください。こん
さようなら。

*/
