/**
 * @title chapter2 / Practice2-1, 2-2
 * @author Oshika
 * @date 2020-08-04 18:30
 */
/*
//====== Practice 2-1 ======
1.〇
2.× -> 剰余は「%」
3.× -> 式 1 + 2 * 3 - 9 は 2 * 3が先に計算され 1 + 6 - 9 = -2が正しい
4.〇
5.〇
6.× -> -128～127の256通り
7.× -> 正数のみ16bit 0～65535の65536通りだが、charは文字(Unicode)に限定し、
        整数を表すときは int を用いるほうが可読性の良いコードだと思う。
 */
/*
//====== Practice 2-2 ======
 */
package chapter2;

public class Practice2 {

    public static void main(String[] args) {
        //---- Practice 2-1 ----
        System.out.println("10/100 = " + (10/100));//結果: 10/100 = 0
        System.out.println("123 - 123 / 123 = " + (123 - 123 / 123));
            //結果: 123 - 123 / 123 = 122
        //---- Practice 2-2 ----
        System.out.println("====== Result 2-2 ======");
        for(int i = 0; i <= 10; i++) {
            System.out.println(i + "×" + i + " = " + (i * i));
        }//for

        //
    }//main()

}//class

/*
//====== Result 2-2 ======
0×0 = 0
1×1 = 1
2×2 = 4
3×3 = 9
4×4 = 16
5×5 = 25
6×6 = 36
7×7 = 49
8×8 = 64
9×9 = 81
10×10 = 100

 */
