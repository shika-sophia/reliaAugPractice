/**
 * @title chapter8 / Additional Quest / MethodCheck1
 * @class Method
 * @author Oshika
 * @date 2020-08-17 / 16:30-17:30
 */
/*
 * 以下の出力結果になるようにプログラムを完成させてください。
 *
 * 【出力結果】
 * 5 + 5 = 10
 * 10 - 5 = 5
 * 5 * 5 = 25
 * 20 / 5 = 4
 *
 */
package chapter8;

class MethodCheck1 {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;

        // ▽解答欄 ここから
        a = tasu(5, 5);
        b = hiku(10, 5);
        c = kakeru(5, 5);
        d = waru(20, 5);

        System.out.println("5 + 5 = " + a);
        System.out.println("10 - 5 = " + b);
        System.out.println("5 * 5 = " + c);
        System.out.println("20 / 5 = " + d);

        // △解答欄 ここまで

    }// main

    //足し算
    public static int tasu(int i, int j) {
        return i + j;
    }// tasu

    //引き算
    public static int hiku(int i, int j) {
        return i - j;
    }// hiku

    //掛け算
    public static int kakeru(int i, int j) {
        return i * j;
    }// kakeru

    //割り算
    public static int waru(int i, int j) {
        return i / j;
    }// waru

}// class
/*
//====== Result ======
5 + 5 = 10
10 - 5 = 5
5 * 5 = 25
20 / 5 = 4
*/