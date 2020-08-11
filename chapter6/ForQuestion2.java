/**
 * @title chapter6 / Additional Quest / ForQuestion1
 * @author Oshika
 * @date 2020-08-11 / 14:00-
 */

/*
 * 問題：以下のプログラムを読み、出力結果がどのようになるか予測してください
 */
package chapter6;

public class ForQuestion2 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i <= 3 ;i++) {

            for(int j = 1; j <= 3; j++) {
                sum += i * j;
            }// 内側のfor

        }// 外側のfor

        System.out.println(sum);
    }// main
}// class

/*
//====== My Answer =======
i==1のとき
  sum = 0 + 1*1 + 1*2 + 1*3 = 6
i==2のとき
  sum = 6 + 2*1 + 2*2 + 2*3 = 6 + 2 + 4 + 6 = 18
i==3のとき
  sum = 18 + 3*1 + 3*2 + 3*3 = 18 + 3 + 6 + 9 = 36

System.out.println(sum); -> 36

//====== Result ======
36

*/
