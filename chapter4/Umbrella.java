/**
 * @title chapter4 / List 4-1, 4-2, 4-3, Practice 4-1, 4-2
 * @RDD 降水確率を入力して条件分岐しメッセージを表示。
 * @author Oshika
 * @date 2020-08-06 / 11:00-12:00
 */

package chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Umbrella {

  public static void main(String[] args) {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     int message = 0;
     List<String> messageList = new ArrayList<>();
       messageList.add(0, "いってらっしゃい。");
       messageList.add(1, "降水確率は 0～100を入力してください。");
       messageList.add(2, "傘を忘れずにね。");
       messageList.add(3, "傘は要りません。");

     try {

       for( ; ; ) {
           System.out.println("降水確率を入力してください。");
           String line = reader.readLine();
           int rainRate = Integer.parseInt(line);
           System.out.printf("降水確率は %d ％です。\n", rainRate);


           if (rainRate < 0 || rainRate > 100) {
               message = 1;
               System.out.println(messageList.get(message));
               continue;
           } else if (rainRate >= 50) {
               message = 2;
               break;
           } else {
               message = 3;
               break;
           }

       }//for loop

       System.out.println(messageList.get(message));
       System.out.println(messageList.get(0));

     } catch (IOException e) {
         System.out.println(e);
     } catch (NumberFormatException e) {
         System.out.println("数字の形式が正しくありません。");
     }
  }//main()

}//class

/*
//====== Result ======
降水確率を入力してください。
40
降水確率は 40 ％です。
傘は要りません。
いってらっしゃい。

降水確率を入力してください。
1200
降水確率は 1200 ％です。
降水確率は 0～100を入力してください。
降水確率を入力してください。
100
降水確率は 100 ％です。
傘を忘れずにね。

いってらっしゃい。

//【考察】List 'massageList'は何度もsysoutを書かずにすっきり最後にまとめたかったが、
          結局 書いてる数は同じだった・・・
          Listにしておくと、この先メッセージ数がいくら増えてもmessageList.add("～")を
          書き加えていくだけなので見やすくはなる。
 */

/*
//###### Practice 4-1, 4-2 ######
//==== Practice 4-1 ==== 2,3,4,6
//==== Practice 4-2 ==== a, C
//（4-3は別クラスで）
*/
