/**
 * @title chapter3 / Practice 3-2
 * @RDD ２人の名前と年齢を入力するとそのひとたちの平均年齢を表示。
 * @author Oshika
 * @date 2020-08-05
 */

package chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
//###### Scanner Version ######
import java.util.Scanner;

public class AverageAge {

  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      List<String> nameList = new ArrayList<>();
      List<Integer> ageList = new ArrayList<>();

      for( ; ; ) {

          //---- input name ----
          System.out.println("名前を入れてください。(0で終了) ");
          String name = scn.nextLine();

          if (name.equals("0") || name.equals("０")) {
              break;
          }//if

          nameList.add(name);

          //---- input age ----
          System.out.println("年齢を入れてください。(0で終了) ");
          int age = scn.nextInt();

          if (age == 0) {
              break;
          }//if

          ageList.add(age);

          System.out.println();

      }//for loup

      //---- console-out nameList ----
      for (String name : nameList) {
          System.out.print(name + "さん ");
      }//for name

      double total = 0d;
      //---- calc averageAge ----
      for (int age : ageList) {
          total += age;
      }

      double averageAge = Math.round(total / ageList.size());
      System.out.println("平均年齢は" + averageAge + "歳です。");

      scn.close();
  }//main()

}//class
*/
/*
//====== Result ======
名前を入れてください。(0で終了)
shika
年齢を入れてください。(0で終了)
24

名前を入れてください。(0で終了)
年齢を入れてください。(0で終了)
40

名前を入れてください。(0で終了)
年齢を入れてください。(0で終了)
40

名前を入れてください。(0で終了)
年齢を入れてください。(0で終了)
0
shikaさん さん さん さん 平均年齢は35.0歳です。
--------------------------------------
名前を入れてください。(0で終了) shika
年齢を入れてください。(0で終了)
24

名前を入れてください。(0で終了)
年齢を入れてください。(0で終了)
deka
Exception in thread "main" java.util.InputMismatchException
    at java.base/java.util.Scanner.throwFor(Scanner.java:939)
    at java.base/java.util.Scanner.next(Scanner.java:1594)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
    at chapter3.AverageAge.main(AverageAge.java:35)

【問題点】
・２回目以降、名前と年齢が同時に出力される
・２回目に名前を入れると上記のエラー
・数字を入れると通るが、nameListには空白として格納されている。
・終了時の「0」も人数に入ってる

*/

//###### BufferedReader Version ######(解答を参照)
public class AverageAge {

  public static void main(String[] args) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      List<String> nameList = new ArrayList<>();
      List<Integer> ageList = new ArrayList<>();

      try {
        for(int i = 0; i < 2; i++) {
          System.out.println("名前を入力してください");
          String name = reader.readLine();
          nameList.add(name);

          System.out.println("年齢を入れてください");
          int age = Integer.parseInt(reader.readLine());
          ageList.add(age);
        }//for
      } catch (IOException e) {
          System.out.println(e);
      } catch (NumberFormatException e) {
          System.out.println("年齢が正しくありません。");
      }

      System.out.println(nameList);

      double total = 0d;
      for (int age : ageList) {
         total += age;
      }//for age

      double averageAge = total / ageList.size();
      System.out.println("平均年齢は" + averageAge);

  }//main()

}//class

/*
//====== Result ======
名前を入力してください
shika
年齢を入れてください
24

名前を入力してください
deka
年齢を入れてください
47
[shika, deka]
平均年齢は35.5

*/
