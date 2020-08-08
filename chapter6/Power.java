/**
 * @title chapter6 / List 6-3
 * @ class for文
 * @author Oshika
 * @date 2020-08-08 / 22:00-23:00
 */
package chapter6;

public class Power {

  public static void main(String[] args) {
      //==== List 6-3 ====
      for (int i = 0; i < 10; i++) {
          System.out.print(i + "の２乗は" + (i * i) + "で、");
          System.out.println(i + "の３乗は" + (i * i * i) + "です。");
      }//for

      System.out.println("end");
      System.out.println();

      //==== Math.pow(a, b) a の b乗 -> doubleを返すのでMath.ronud()で四捨五入 int化 ====
      for (int i = 0; i < 10; i++) {
          System.out.printf("%dの２乗は%dで、３乗は%dです。\n",
              i, Math.round(Math.pow(i, 2)), Math.round(Math.pow(i, 3)) );
      }//for

      System.out.println("end");

  }//main()

}//class
/*
//====== Result ======
0の２乗は0で、0の３乗は0です。
1の２乗は1で、1の３乗は1です。
2の２乗は4で、2の３乗は8です。
3の２乗は9で、3の３乗は27です。
4の２乗は16で、4の３乗は64です。
5の２乗は25で、5の３乗は125です。
6の２乗は36で、6の３乗は216です。
7の２乗は49で、7の３乗は343です。
8の２乗は64で、8の３乗は512です。
9の２乗は81で、9の３乗は729です。
end

0の２乗は0で、３乗は0です。
1の２乗は1で、３乗は1です。
2の２乗は4で、３乗は8です。
3の２乗は9で、３乗は27です。
4の２乗は16で、３乗は64です。
5の２乗は25で、３乗は125です。
6の２乗は36で、３乗は216です。
7の２乗は49で、３乗は343です。
8の２乗は64で、３乗は512です。
9の２乗は81で、３乗は729です。
end

 */

