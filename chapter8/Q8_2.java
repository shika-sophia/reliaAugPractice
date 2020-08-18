/**
 * @title chapter8 / Additional Quest / Q8_2
 * @class Method
 * @author Oshika
 * @date 2020-08-18 / 9:30-10:00
 */
/*
    キーボードから入力された挨拶に対応する文字列を返却するメソッドを定義して、結果を画面に出力してください。

    おはよう　→ Good morning
    こんにちは　→　Good afternoon
    こんばんは　→　Good evening
    その他　→　対応していません。
*/
package chapter8;

import java.util.HashMap;
import java.util.Scanner;
/*
//###### Array Version ######
public class Q8_2 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("あいさつを入力してください[おはよう,こんにちは,こんばんは]");
    String input = scn.nextLine();
    int index = 0;

    switch (input) {
    case "おはよう":
        index = 0;
        break;

    case "こんにちは":
        index = 1;
        break;

    case "こんばんは":
        index = 2;
        break;

    default:
        index = 3;
    }//switch

    String english = translater(index);
    System.out.println(english);
  }//main0

  private static String translater(int index) {
    String[] dictionary = new String[]{
      "Good morning", "Good afternoon", "Good evening", "対応していません"
    };

    String english = dictionary[index];
    return english;
  }//translater()
}//class
*/
/*
//====== Result ======
あいさつを入力してください[おはよう,こんにちは,こんばんは]
おはよう
Good morning

あいさつを入力してください[おはよう,こんにちは,こんばんは]
こんにちは
Good afternoon

あいさつを入力してください[おはよう,こんにちは,こんばんは]
いろはにほ
対応していません

 * */

//###### HashMap Version ######
public class Q8_2 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("あいさつを入力してください[おはよう,こんにちは,こんばんは]");
    String input = scn.nextLine();

    String english = translater(input);
    System.out.println(english);
  }//main()

  private static String translater(String input) {
    HashMap<String, String> dictionary = new HashMap<>();
      dictionary.put("おはよう","Good morning");
      dictionary.put("こんにちは","Good afternoon");
      dictionary.put("こんばんは","Good evening");
      dictionary.put("","対応していません");

    String english = "";
    if (dictionary.containsKey(input)) {
        english = dictionary.get(input);
    } else {
        english = "対応していません。";
    }
    return english;
  }//translater()
}//class

/*
//====== Result ======
あいさつを入力してください[おはよう,こんにちは,こんばんは]
こんばんは
Good evening

あいさつを入力してください[おはよう,こんにちは,こんばんは]

対応していません

あいさつを入力してください[おはよう,こんにちは,こんばんは]
Good Morning
対応していません。
*/