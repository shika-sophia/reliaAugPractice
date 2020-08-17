/**
 * @title chapter8 / List 8-3
 * @class method
 * @author Oshika
 * @date 2020-08-17 / 10:00-
 */

package chapter8;

public class Power {

  public static void main(String[] args) {
    System.out.printf("%dの%d乗は %dです。 ",8 ,2, getPower(8, 2));

  }//main()

  private static int getPower(int x, int n) {
      int y = 1;
      for (int i = 0; i < n; i++) {
          y *= x;
      }//for

      return y;
  }//getPower()

}//class
/*
//====== Result ======
8の2乗は 64です。
 * */
