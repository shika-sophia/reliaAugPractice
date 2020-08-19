/**
 * @title chapter9Add / Additional Quest / Q9_2
 * @contents Array
 * @author Oshika
 * @date 2020-08-19 / 9:30-10:30
 */

/*
    mainメソッドの引数、String[] argsに文字列を入れて出力してください。

    java クラス名 argsに入れる文字列
    とコマンドプロンプトに入力すると利用することが出来ます。

    System.out.println(args[0]);で出力出来るので、for文とlengthを使って、複数入力したものを全て出力出来るようにしてください。

    [実行例]
    C:\...>java Q9_2_A aaaaa bbbbb ccccc ddddd
    argsに入力された文字列はaaaaaです
    argsに入力された文字列はbbbbbです
    argsに入力された文字列はcccccです
    argsに入力された文字列はdddddです

*/

package chapter9Add;

public class Q9_2 {
  public static void main(String[] args) {

      for (int i = 0; i < args.length; i++) {

          System.out.println(args[i]);

      }//for

  }//main()
}//class

/*
//====== Command Prompt ======
C:\Users\sophia\Desktop>javac Q9_2.java -encoding UTF-8

C:\Users\sophia\Desktop>java Q9_2 shika deka poka suka
shika
deka
poka
suka

*/