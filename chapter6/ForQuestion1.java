/**
 * @title chapter6 / Additional Quest / ForQuestion1
 * @author Oshika
 * @date 2020-08-11 / 13:30-
 */

/*
 * 問題：以下のプログラムを読み、出力結果がどのようになるか予測してください
 *
 * 補足：「+=」とは左辺に対して右辺の値を足し込むという意味です。
 *		「sum += 3」は「sum = sum + 3」と同じ意味になります。
 */
package chapter6;

public class ForQuestion1 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i <= 5 ;i++) {

            switch(i) {
            case 1:
                sum += 3;
                break;

            case 3:
                sum += 3;
                break;

            default:
                sum++;
            }// switch

            if(i % 2 == 0) {
                sum += 10;
            }// if

            System.out.println(sum);
        }// for

    }// main
}// class

/*
//====== My Answer======
i==1のとき -> case 1: -> sum += 3 -> sum == 3
i==2のとき -> defailt: -> sum++ -> (sum == 4)
              if(i % 2 == 0) -> sum += 10 -> sum == 14
i==3のとき -> case 3: -> sum += 3 -> sum == 17
i==4のとき -> (i==2と同様 sum += 11) -> sum == 28
i==5のとき -> default: -> sum++ -> sum == 29

System.out.println(sum); -> 29

//====== Result ======
3
14
17
28
29

//あっ、毎回出るのか・・
 * */
