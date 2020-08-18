/**
 * @title chapter8 / Additional Quest / Q8_1
 * @class Method
 * @author Oshika
 * @date 2020-08-18 / 9:30-10:00
 */
/*

    int型のnに好きな数字を代入してください。

    渡した数字を3倍にしてリターンするメソッド、5倍のメソッド、10倍のメソッドを宣言し、それぞれを経由して出力してください。


    [例]

    5を3倍にします。
    ↓
    （メソッドに渡す）
    ↓
    5を3倍にすると15になりました。

    ↓

    5を5倍にします。
    ↓
    （メソッドに渡す）
    ↓
    5を5倍にすると25になりました

    ↓

    5を10倍にします。
    ↓
    （メソッドに渡す）
    ↓
    5を10倍にすると50になりました


*/

package chapter8;

public class Q8_1 {
  public static void main (String[] args) {
      int n = 5;
      int[] multiple = new int[] {3, 5, 10};
      String message = "";

      for (int multiBit : multiple) {
          message = message (n, multiBit);
          System.out.println(message);
      }//for

  }//main()

  private static String message(int n, int multiBit) {

    return String.format("%dの%d倍は%dです。" , n, multiBit, n * multiBit);
  }//message()

}//class

/*
//====== Result ======
5の3倍は15です。
5の5倍は25です。
5の10倍は50です。

 */
