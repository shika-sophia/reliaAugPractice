/**
 * @title chapter9Add / Additional Quest / ArrayCheck4
 * @contents Array
 * @author Oshika
 * @date 2020-08-18 / 16:30-17:30
 */

/*
 * 以下のプログラムを読んで出力結果を予測してください。
 */
package chapter9Add;

public class ArrayCheck4 {
    public static void main(String[] args) {

        int[] intArray1 = { 2, 8, 6, 2, 7 };
        int[] intArray2 = new int[5];
        int check = 30;

        for(int i = 0; i < intArray1.length; i++) {
            intArray2[i] = intArray1[i] + i * 2;
        }// for

        int j = 0;
        while(check > 0) {
            check -= intArray2[j];
            j++;
        }// while

        System.out.println(check);
    }// main
}// class

/*
//====== My Answer ======
intArray1 = { 2, 8, 6, 2, 7 };
intArray2 = { 6, 24, 18, 6, 21 };

//intArray2を[0][1]...順に引き算
30から負になるまで

int j = 0;
while(check > 0) {
    check -= intArray2[j];
    j++;
}// while

30 - 6 - 24 = 0

//====== Result ======
//0
*/