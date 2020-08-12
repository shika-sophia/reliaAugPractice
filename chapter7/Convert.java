/**
 * @title chapter7 / List 7-6
 * @class while, String
 * @author Oshika
 * @date 2020-08-12 / 13:00-14:00
 */

package chapter7;

import java.util.Scanner;

public class Convert {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    String line;
    if ((line  = scn.nextLine()) != null) {
        String replace = line.replace('。', '.');
        replace = replace.replace('、', ',');
        System.out.println(replace);
    }
  }//main()

}//class

/*
//====== 7-6 ======
abc
abc

こんにちは。
こんにちは.

ああ、うん。
ああ,うん.
 * */

