/**
 * @title chapter9Add / Additional Quest / SortDataCheck
 * @contents Array
 * @author Oshika
 * @date 2020-08-19 / 9:30-10:30
 */

/*
 * プログラムを読んで、動作を予想して下さい。
 */
package chapter9Add;

public class SortDataCheck {

    public static void main(String[] args) {
        //---- parameter definition ----
        int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };
        int change = 0;
        int change_sum = 0;

        //---- print default data[] ----
        System.out.println("並べ替える前");

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }// for

        System.out.println("\n");
        System.out.println("***********************************");
        System.out.println("");

        //length - 1 最終要素は次の要素がOutOfBoundsになるので外す。
        //最終要素はチェックしなくても１つ前で比較しているのでＯＫ
        for (int i = 0; i < data.length - 1; i++) {

            for (int j = i + 1; j < data.length; j++) {

                //---- judge larger than next element / 次の要素と大小比較----
                if (data[i] > data[j]) {

                    //---- exchange the order to be larger ----
                    //大小により順番入れ替え aは事前コピー
                    //(data[i]に代入する前の値を一時的に保存しておく)
                    int a = data[i];
                    data[i] = data[j];
                    data[j] = a;

                    //---- count of change times / 入れ替え回数をカウント----
                    change++;
                }// if

            }// for(内側1)

            //---- print judge times and change times ----
            //上段は「交換」ではなく「for iの周回」配列の何番目をチェックしているか
            //下段は順番を入れ替えた「交換回数」
            System.out.println("交換" + (i + 1) + "回目");
            System.out.println("交換回数" + change + "回");

            //---- print current data[] / この時点での配列を表示 ----
            for (int k = 0; k < data.length; k++) {
                System.out.print(data[k] + " ");
            }// for(内側2)

            System.out.println("\n");

            //入れ替え総数を加算
            //change = 0 は for iの次の周回の入れ替え回数をカウントするために初期化
            change_sum += change;
            change = 0;

        }// for(外側)

        System.out.println("***********************************");
        System.out.println("");
        System.out.println("並び変えた総回数" + change_sum + "回");
        System.out.println("並べ替えた最終結果");

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }// for

    }// main

}// class

/*
//====== My Answer ======
(↑コード内のコメントに記述)

//====== Result ======
並べ替える前
31 41 59 26 53 58 97 93 23 84

***********************************

交換1回目
交換回数2回
23 41 59 31 53 58 97 93 26 84

交換2回目
交換回数2回
23 26 59 41 53 58 97 93 31 84

交換3回目
交換回数2回
23 26 31 59 53 58 97 93 41 84

交換4回目
交換回数2回
23 26 31 41 59 58 97 93 53 84

交換5回目
交換回数2回
23 26 31 41 53 59 97 93 58 84

交換6回目
交換回数1回
23 26 31 41 53 58 97 93 59 84

交換7回目
交換回数2回
23 26 31 41 53 58 59 97 93 84

交換8回目
交換回数2回
23 26 31 41 53 58 59 84 97 93

交換9回目
交換回数1回
23 26 31 41 53 58 59 84 93 97

***********************************

並び変えた総回数16回
並べ替えた最終結果
23 26 31 41 53 58 59 84 93 97
 */
