/**
 * @title chapter4 / additional quest / IfQuestion1
 * @author Oshika
 * @date 2020-08-06 15:00
 */

/*
 * 問題：以下の出力結果となるように、条件式を記述してください
 *
 *【出力結果】
 * checkの値を偶数(2,4,6････)に設定すると「偶数です」
 * checkの値を奇数(1,3,5････)に設定すると「奇数です」
 * と表示される
 */
package chapter4;

public class IfQuestion1 {
    public static void main(String[] args) {
        int check = 11;
        System.out.println("check:" + check);

        if(check % 2 == 0) {
            System.out.println("偶数です");
        } else if (check % 2 == 1){
            System.out.println("奇数です");
        }//if else
    }//main()
}//class

/*
//====== Result ======
check:10
偶数です

check:11
奇数です
*/
