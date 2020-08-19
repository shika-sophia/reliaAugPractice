/**
 * @title chapter9Add / Additional Quest / ArrayCheck3
 * @contents Array
 * @author Oshika
 * @date 2020-08-18 / 16:30-17:30
 */

/*
 * 以下のプログラムを読んで出力結果を予想してください。
 */
package chapter9Add;

class ArrayCheck3 {

    public static void main(String[] args) {
        int[][] intArray = new int[2][4];
        int sum = 0;

        intArray[0] = new int[]{ 1, 2 ,3, 4 };
        intArray[1] = new int[]{ 2, 3, 4, 5 };

        for(int i = 0; i <intArray.length; i++) {

            for(int j = 0; j < intArray[i].length ;j++) {
                sum += intArray[i][j];
            }// for2

        }// for1

        System.out.println(sum);
    }// main

}// class

/*
//====== My Answer ======
ネストfor文２つで、二次元配列の各要素を合計するコード
1 + 2 + 3 + 4 = 10
10 + 10 + 4 = 24

//====== Result ======
//24

 */
