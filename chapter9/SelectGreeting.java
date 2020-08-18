/**
 * @title chapter9 / Practice 9-1 ～ 9-6
 * @contents Array
 * @author Oshika
 * @date 2020-08-18 / 13:30-
 */
/*
//====== Practice 9-1 ======
3, 5

//====== Practice 9-2 ======
×a[0] ～ a[99]の100個

//====== Pracrice 9-3 ======
a[5] = 5 * 5 = 25

//====== Practice 9-4 ======
a[5] = a[5 - 1] + 5

a[0] = 0
a[1] = a[0] + 1 = 1
a[2] = a[1] + 2 = 3
a[3] = a[2] + 3 = 6
a[4] = a[3] + 4 = 10
a[5] = a[4] + 5 = 15

//====== Practice 9-5 ======
data = new double[5];
  :
data[5]がある。５個なので 0～4まで
越えると「ArrayIndexOutOfBoundsException」という、よく見かけるやつ
*/

//====== Practice 9-6 ======
package chapter9;

public class SelectGreeting {

  public static void main(String[] args) {
    String[] message = new String[]
      {"おはよう","こんにちは","こんばんは"};

    if (args.length != 1) {
        System.out.println("使い方; java SelectGreeting X(←数字)");
        System.exit(0);
    }

    int num = Integer.parseInt(args[0]);
    if (num >= 0 && num < message.length) {
        System.out.println(message[num]);
    } else {
        System.out.println("数字は 0 ～ " + (message.length - 1) + "の範囲で指定");
    }

  }//main()

}//class

/*
//====== Command Prompt ======
C:\Users\sophia\Desktop>javac SelectGreeting.java -encoding UTF-8

C:\Users\sophia\Desktop>java SelectGreeting
使い方; java SelectGreeting X(←数字)

C:\Users\sophia\Desktop>java SelectGreeting 0
おはよう

C:\Users\sophia\Desktop>java SelectGreeting 1
こんにちは

C:\Users\sophia\Desktop>java SelectGreeting 2
こんばんは

C:\Users\sophia\Desktop>java SelectGreeting 3
数字は 0 ～ 3の範囲で指定

C:\Users\sophia\Desktop>java SelectGreeting -100
数字は 0 ～ 3の範囲で指定

●↑上記
System.out.println("数字は 0 ～ " + message.length + "の範囲で指定");

〇↓修正後
System.out.println("数字は 0 ～ " + (message.length - 1) + "の範囲で指定");

C:\Users\sophia\Desktop>java SelectGreeting 3
数字は 0 ～ 2の範囲で指定

C:\Users\sophia\Desktop>java SelectGreeting -100
数字は 0 ～ 2の範囲で指定

 */

