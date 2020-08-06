/**
 * @title chapter4 / Practice 4-3 / Greeting(＝あいさつ)
 * @RDD 時刻を入力して条件分岐しメッセージを表示。
 * @author Oshika
 * @date 2020-08-06 / 13:00-13:45
 */
package chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Greeting {

  public static void main(String[] args) {

    //---- user input 'hour' ----
    Scanner scn = new Scanner(System.in);
    int hour = 0;
    int count = 0;

    do {
        if (count > 0) {
            System.out.println("時刻は 0～24時で入力してください。");

        }//if
        count++;

        try {
            System.out.print("時刻を入力して下さい (例: 18) ");
            hour = scn.nextInt();

        } catch (NumberFormatException e) {
            System.out.println("時刻は 0～24時で入力してください。");
            continue;
        }

    } while (hour < 0 || hour > 24);

    //---- greeting definition ----
    List<String> greetingList = new ArrayList<>();
      greetingList.add(0, "あいさつ");
      greetingList.add(1, "おはようございます");
      greetingList.add(2, "お昼です");
      greetingList.add(3, "こんにちは");
      greetingList.add(4, "こんばんは");
      greetingList.add(5, "それ以外は たぶん出ない");

    int greeting = 0;

    //---- judge condition ----
    if (hour >= 0 && hour <= 11) {
        greeting = 1;
    } else if (hour == 12) {
        greeting = 2;
    } else if (hour >= 13 && hour <= 18) {
        greeting = 3;
    } else if (hour >= 19 && hour <= 24) {
        greeting = 4;
    } else {
        greeting = 5;
    }

    System.out.println(greetingList.get(greeting));

    scn.close();
  }//main()

}//class

/*
//====== Result ======
時刻を入力して下さい (例: 18) 11
おはようございます

時刻を入力して下さい (例: 18) 25
時刻は 0～24時で入力してください。

時刻を入力して下さい (例: 18) 26
時刻は 0～24時で入力してください。

時刻を入力して下さい (例: 18) 14
こんにちは

時刻を入力して下さい (例: 18) 20
こんばんは

●「NumberFormatException」のtry-catchではScannerのInputMismatchを解決できないらしい
時刻を入力して下さい (例: 18) こ
Exception in thread "main" java.util.InputMismatchException
    at java.base/java.util.Scanner.throwFor(Scanner.java:939)
    at java.base/java.util.Scanner.next(Scanner.java:1594)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
    at chapter4.Greeting.main(Greeting.java:30)
*/
