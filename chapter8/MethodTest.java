/**
 * @title chapter8 / Practice 8-4, 8-5_Advanced
 * @class method
 * @author Oshika
 * @date 2020-08-17 / 15:00-16:00
 */
/*
//====== Practice 8-4 ======
〇メソッド /（ 引数 )
  main() / args
  printGraph() / getPower(), '-','+'
  getPower() / i, 2, x, n
  printGraph() / x, '*', c
  print() / c

〇変数
  i, x, n, y, c
 */

//====== Practice 8-5 ======
package chapter8;
/*
//####### A + B = C Version ######
public class MethodTest {

  public static String getYourName (String lastName, String firstName) {
      lastName = "結城";
      firstName = "浩";

      String yourName = lastName + firstName;
      return yourName;
  }//grtYourName()

  public static void main(String[] args) {
      String x = "";
      String y = "";
      String yourName = getYourName(x, y);

      System.out.println(yourName);

  }//main()

}//class

//====== Result ======
//結城浩
*/


//###### List 8-5 (解答参照)######
public class MethodTest {
  String lastName;
  String firstName;

  public static void main(String[] args) {
     MethodTest yourName = getYourName();
     System.out.println("名字: " + yourName.lastName);
     System.out.println("名前: " + yourName.firstName);

  }//main()

  public static MethodTest getYourName() {
      MethodTest yourName = new MethodTest();
      yourName.lastName = "結城";
      yourName.firstName = "浩";
    return yourName;

  }

}//class

/*
//====== Result ======
名字: 結城
名前: 浩

【考察】
自クラスでインスタンスしているのが珍しくて、つい写ししまった。

配列するぐらいなら「+演算子」で結合のがいい気がする。
てか、フィールドで代入してmainで参照すればいいのに

*/