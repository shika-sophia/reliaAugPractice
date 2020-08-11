/**
 * @title chapter5 / Additional Quest / Q5_1
 * @author Oshika
 * @date 2020-08-11 / 9:30-12:00
 */

/*
    Math.Ramdom()を0～2までの使って乱数を生成し、0は大吉、1は吉、2は凶と表示するプログラムを作成してください。

*/

package chapter5;

//import java.util.Random;

/*
public class Q5_1 {
  public static void main (String[] args) {
    for(int i = 0; i < 5; i++) {
      int lucky = (int)(Math.random() * 2);
      String message = "";


      if (lucky == 0) {
          message = "大吉";

      } else if (lucky == 1) {
          message = "吉";

      } else if (lucky == 2) {
          message = "凶";
      }


      System.out.println(lucky + ":" + message);
    }//for
  }//main()
}//class
*/
/*
//====== Result ======
0:大吉
0:大吉
0:大吉
0:大吉
0:大吉

【考察】「0:大吉」しか出てない・・
int lucky = (int)(Math.random() * 2);
試しに intのキャストを外して、以下のように修正

double lucky = Math.random() * 2;
lucky: 0.04473866606172505 と出た。

Math.random()は 0.0～1.0のランダムとのこと。
「*2」しても、ほぼ１未満にしかならない。(大吉ばかり出るはずだ)
しかもこの桁数・・1.0が出るのは 10の18乗分の１

要件定義の「Math.random()を使って」を変更し「Random()」使えば実現できるのではないだろうか
 */
/*
//###### Random() Version ######
public class Q5_1 {
  public static void main (String[] args) {
      Random random = new Random();

      for(int i = 0; i < 5; i++) {

          int lucky = random.nextInt(3);
          String message = "";

          if (lucky == 0) {
              message = "大吉";
          } else if (lucky == 1) {
              message = "吉";
          } else if (lucky == 2) {
              message = "凶";
          } else {
              message = "error";
          }

          System.out.println(lucky + ":" + message);
      }//for
  }//main()
}//class
*/
/*
//====== Result ======
1:吉
0:大吉
1:吉
1:吉
2:凶

0:大吉
0:大吉
2:凶
2:凶
1:吉

【考察】できた！
でも要件定義「Math.random()」を外したらいかんから、0～2のほうを修正してみるか
int lucky = (int)(Math.random() * 2);が違うんだな。
単純に「*2」しても0～2の乱数にならないのでは？
理由: 1未満の数に２を掛けても１未満にしかならない

最初に+1してから*2すべき。
*/
/*
//###### Math.random() 修正Version ######
public class Q5_1 {
  public static void main (String[] args) {
      for(int i = 0; i < 5; i++) {
          double random = Math.random();
          double luckyDouble = ( random + 1) * 2;
          int lucky = (int) luckyDouble;

          String message = "";

          if (lucky == 1) {
              message = "大吉";

          } else if (lucky == 2) {
              message = "吉";

          } else if (lucky == 3) {
              message = "凶";
          }
          System.out.println("random: " + random);
          System.out.println("luckyDouble:" + luckyDouble);
          System.out.println(lucky + ": " + message);
      }//for
  }//main()
}//class
*/
/*
//====== Result ======
random: 0.8660147488199986
luckyDouble:3.7320294976399975
3: 凶

random: 0.860462326146153
luckyDouble:3.720924652292306
3: 凶

random: 0.6124158812403536
luckyDouble:3.224831762480707
3: 凶

random: 0.7175101736464446
luckyDouble:3.4350203472928893
3: 凶

random: 0.4550176945846881
luckyDouble:2.9100353891693764
2: 吉

【考察】
今度は「吉」と「凶」しか出んな
Math.random()は確率乱数(0.0～1.0)だから
等分の確率で出したければ「*100」してから条件分岐すればいいか

*/

//###### Math.random() Percent Version ######
public class Q5_1 {
  public static void main (String[] args) {
    for(int i = 0; i < 5; i++) {
        double random = Math.random();
        int percent = (int)(random * 100);

        String message = "";

        if (percent >= 0 && percent < 33) {
            message = "大吉";

        } else if (percent >= 33 && percent < 66) {
            message = "吉";

        } else if (percent >= 66 && percent <= 100) {
            message = "凶";
        } else {
            message = "error";
        }

        System.out.println("random: " + random);
        System.out.println(percent + ": " + message);
    }//for
  }//main()
}//class
/*
random: 0.2517980300299393
25: 大吉

random: 0.8321962575545612
83: 凶

random: 0.7543492532089784
75: 凶

random: 0.6127005134221201
61: 吉

random: 0.518142555840082
51: 吉

【考察】できた。数字で出されると、おみくじのありがたみは全くないが・・
キャストは*100より先に計算されるのか。-> ()が必要。

１問で午前中いっぱい掛かってもうた
*/
