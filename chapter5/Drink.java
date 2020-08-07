/**
 * @title chapter5 / List 5-1, 5-2, 5-3, 5-4,
 *                   Practice 5-4, 5-1, 5-2, 5-3, 5-5, 5-6
 * @class select drink by switch()
 * @author Oshika
 * @date 2020-08-07 / 13:00-14:00
 */

package chapter5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Drink {

  public static void main(String[] args) {
      //---- parameter definition ----
      List<String> drinkList = new ArrayList<>();
          drinkList.add(0, "＊ Drink Menu ＊");
          drinkList.add(1, "オレンジジュース");
          drinkList.add(2, "コーヒー");
          drinkList.add(3, "ミルク");
          drinkList.add(4, "どれでもありません");

      List<String> selectList = new ArrayList<>();
          selectList.add(0, "＊ Select List ＊");
          selectList.add(1, "(a. orange) ");
          selectList.add(2, "(b. coffee) ");
          selectList.add(3, "(c.milk) ");
          selectList.add(4, "(d. none) ");

      //---- show drink menu and user input drinkKey ----
      Scanner scn = new Scanner(System.in);
      System.out.println("飲み物は何が好きですか？");

      for (int i = 1; i <= 4; i++) {
          System.out.printf("%d. %s %s \n", i, drinkList.get(i), selectList.get(i));
      }//for

      System.out.println("Please input [1,2,3,4] or [a,b,c,d] or English or Japanese.");
      String drinkKey = scn.nextLine();

      switch (drinkKey) {
        case "1":
        case "a":
        case "orange":
        case "オレンジジュース":
            System.out.println(drinkList.get(1));
            break;

        case "2":
        case "b":
        case "coffee":
        case "コーヒー":
            System.out.println(drinkList.get(2));
            break;

        case "3":
        case "c":
        case "milk":
        case "ミルク":
            System.out.println(drinkList.get(3));
            break;

        case "4":
        case "d":
        case "none":
        case "どれでもない":
            System.out.println(drinkList.get(4));
            break;

        default:
            System.out.println("入力ミスです。");

      }//switch

      scn.close();
  }//main()

}//class

/*
【考察】
全Sampleをまとめてしまったが、switch文は条件が整然と並んでて好きだ(個人的)。
変数１つのときしか使えないけど、多岐分岐ならこっち。
細かい条件式を書きたいときは、やっぱり if文のが便利かも

//====== Result ======
飲み物は何が好きですか？
1. オレンジジュース (a. orange)
2. コーヒー (b. coffee)
3. ミルク (c.milk)
4. どれでもありません (d. none)
Please input [1,2,3,4] or [a,b,c,d] or English or Japanese.
3
ミルク

●nextLine()だと全角「１」は除外された。
  Stringだから、そりゃそうか。
  switch文で equalsIgnoreCase()使えるのかな。
  これ大文字と小文字の無差別だから、全角と半角は無理っぽい

//====== Result ======
飲み物は何が好きですか？
1. オレンジジュース (a. orange)
2. コーヒー (b. coffee)
3. ミルク (c.milk)
4. どれでもありません (d. none)
Please input [1,2,3,4] or [a,b,c,d] or English or Japanese.
１
入力ミスです。

*/
/*
//###### Practice 5-1, 5-2, 5-3 ######
続いて文章題もここに

//====== 5-1 ======
n = 1;
2 * n + 1 = 3 -> "サン"

//====== 5-2 ======
n = -1;
1 + n * n = 2 -> case 2: -> (n < 0) -> else -> 2F

//====== 5-3 ======
15行目 case句のラベルが「;」 -> 「:」
18行目 条件が同じものがある case 1: -> case 2:
22行目 スペルミスか誤植 difault -> default

//(答え合わせ)17行目 break抜け

//====== 5-4 ======
上記

//====== 5-5 ======
if (c.equals('1') || c.equals('a'){
    System.out.println("オレンジジュースです。");
} else if (c.equals('2') || c.equals('b'){
    System.out.println("コーヒーです。");
} else {
    System.out.println("どちらでもありません。");
}

//(答え合わせ)おお、char型は「==」でいいんかい。

//====== 5-6 ======
switch (line){
  case "あ":
    System.out.println("オレンジジュースです。");
    break;

  case "い":
    System.out.println("コーヒーです。");
    break;

  default:
    System.out.println("どちらでもありません。");
}//switch

//(5-7, 5-8は別クラスに記述)
*/
