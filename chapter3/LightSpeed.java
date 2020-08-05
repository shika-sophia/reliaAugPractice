/**
 * @title chapter3 / Practice 3-1
 * @RDD 光の速度を秒速30万メートルとします。
 *      このとき光が１日で進む距離をJavaで計算して求めなさい。
 * @author Oshika
 * @date 2020-08-05
 */

package chapter3;

import java.util.Scanner;

public class LightSpeed {
  private static final int lightSpeed = 300000;

  public static void main(String[] args) {
      //---- user input 'day' ----
      Scanner scn = new Scanner(System.in);
      System.out.print("日数を入れてください。");
      int day = scn.nextInt();

      //---- call method ----
      int second = calcSecond(day);
      long distance = (long) lightSpeed * second;

      System.out.printf("光速 %d ｍ／秒の光が %d日で 進む距離は%dｍ(%d km)です。",
              lightSpeed, day, distance, distance / 1000);

      scn.close();
  }//main()

  //====== calcSecond ======
  //day日の秒数を計算する
  private static int calcSecond(int day) {
      int hour = day * 24;
      int minute = hour * 60;
      int second = minute * 60;

      return second;
  }//calcSecond()

}//class
/*
//====== Result =======
日数を入れてください。1
光速 300000 ｍ／秒の光が 1日で 進む距離は25920000000ｍ(25920000 km)です。
*/
