/**
 * @title chapter8 / List 8-1, 8-2
 * @class method
 * @author Oshika
 * @date 2020-08-17 / 10:00-
 */

package chapter8;

public class Discount {

  public static void main(String[] args) {
    int price = 10000;
    //int halfPrice = price / 2;
    int halfPrice = half(price);

    System.out.printf("元の値段が%d円なら、半額だと%d円です。",
            price, halfPrice);
  }//main()

  private static int half(int price) {
    return price / 2;
  }//half()

}//class

/*
//====== Result ======
元の値段が10000円なら、半額だと5000円です。
 * */
