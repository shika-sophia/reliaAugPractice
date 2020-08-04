/**
 * @title chapter2 / List 2-1, 2-2, 2-3
 * @author Oshika
 * @date 2020-08-04 17:00
 */

package chapter2;

public class Calc1 {
//public class Calc2 {
//public class Calc1a {

    public static void main(String[] args) {
        //---- List 2-1 ----
        System.out.println("3 + 2 の加算の結果は" + (3 + 2) + "です。");
        System.out.println("5 - 8 の減算の結果は" + (5 - 8) + "です。");
        System.out.println("3 × 4 の乗算の結果は" + (3 * 4) + "です。");
        System.out.println("7 ÷ 3 の徐算の結果は 商:" + (7 / 3) + ",余り:"+ 7 % 3 +"です。");

        // ---- List 2-2 ----
        System.out.println("----------");
        System.out.println("1 + 2 * 3 - 4 / 2 = " + (1 + 2 * 3 - 4 / 2));

        // ---- List 2-3 ----
        System.out.println("----------");
        System.out.printf("3 + 2 の加算の結果は%dです。\n",3 + 2);
        System.out.printf("5 - 8 の減算の結果は%dです。\n" ,5 - 8);
        System.out.printf("3 × 4 の乗算の結果は%dです。\n",3 * 4);
        System.out.printf("7 ÷ 3 の徐算の結果は 商%d,余り%dです。\n", 7 / 3, 7 % 3);
    }//main()

}//class

/*
//====== Result 2-1======
3 + 2 の加算の結果は5です。
5 - 8 の減算の結果は-3です。
3 × 4 の乗算の結果は12です。
7 ÷ 3 の徐算の結果は 商:2,余り:1です。
----------
//====== Result 2-2 ======
1 + 2 * 3 - 4 / 2 = 5
----------
//====== Result 2-3 ======
3 + 2 の加算の結果は5です。
5 - 8 の減算の結果は-3です。
3 × 4 の乗算の結果は12です。
7 ÷ 3 の徐算の結果は 商2,余り1です。

 */
