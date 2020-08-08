/**
 * @title chapter6 / List 6-4, Practice 6-2, 6-3
 * @ class for文
 * @author Oshika
 * @date 2020-08-08 / 22:00-23:00
 */

package chapter6;

public class DrawGraph {

  public static void main(String[] args) {
    //==== List 6-4 ====
    for (int i = 0; i < 10; i++) {
        System.out.print(i + ":");

        for(int j = 0; j < i; j++) {
            System.out.print("*");
        }//for j

        System.out.println();
    }//for i

    //==== Practice 6-2 ====
    System.out.println();
    for (int i = 0; i < 10; i++) {
        System.out.print(i + ":");

        for(int j = 0; j < i * i; j++) {
            System.out.print("*");
        }//for j

        System.out.println();
    }//for i
  }//main()

}//class

/*
//====== Result ======
0:
1:*
2:**
3:***
4:****
5:*****
6:******
7:*******
8:********
9:*********

0:
1:*
2:****
3:*********
4:****************
5:*************************
6:************************************
7:*************************************************
8:****************************************************************
9:*********************************************************************************

//====== Practice 6-3 ======
List 6-8は、上記のList6-2と同じコードで、for文の終了条件が j < i になっている。
２乗のグラフを描くには j < i * i とすべき。(Practice 6-2 参照)

（答え合わせ）
あっ、j++じゃなくi++で無限ループになるのか
*/
