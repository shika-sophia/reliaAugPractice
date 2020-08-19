/**
 * @title book1General / 上巻総合問題 / 自由制作課題
 * @contents Random
 * @author Oshika
 * @date 2020-08-19 / 14:30-19:00
 * @date 2020-08-20 /
 */
/* RDD: 要件定義

課題2.以下の全ての要件を満たすプログラムを作成してください。
条件
・分岐（if文またはswitch文）の使用 ＊どちらか一方で可
・繰り返し（for文またはwhile文）の使用 ＊どちらか一方で可
・配列の使用
・mainメソッド以外に自作のメソッドを１つ以上作成して使用
＊プログラム読解を助けるための字下げ・コメント文を必ず使用すること。
＊クラス名、変数、メソッドの命名は自由ですが、
      意味のない命名(Kadai・test・a・bなど)は禁止。
条件およびコメント等の作法が守れていないものは評価対象外となりますので注意してください。
*/
package book1General; //←コマンドプロンプトで実行時はここを削除

import java.util.Random;
import java.util.Scanner;

public class HorseGame {
  //---- field definition ----
  //複数メソッドで使うインスタンスをフィールドで定義
  public static Random random = new Random();

  //---- field parameter ----
  public static final String[] horse = {"Ａ","Ｂ","Ｃ"};


  //====== main() ======
  public static void main(String[] args) {

    //---- print infomation ----
    //ゲームルールの説明
    String info = buildInfo();
    System.out.println(info);

    //---- detemine com horse order / 相手の出走順を決める ----
    String[] comOrder = comOrder();

    //---- print comOrder ----
    System.out.print("相手の出走順: ");

    for (int i = 0; i < comOrder.length; i++) {
        System.out.print(comOrder[i] + " ");
    }//for
    System.out.println();

    //---- input userOrder[] ----
    //userの出走順をinput
    String[] userOrder = userOrder(comOrder);

    //---- calc horsePower ----
    String lank = "";
    int horsePower = calcHorsePower(lank);

    //---- make matrix to print result ----
    //結果表示のための表を作成
    result(comOrder, userOrder);

  }//main()


  //====== buildInfo() ======
  //ルール説明、実行時に最初に表示される
  private static String buildInfo() {
    StringBuilder infoBuilder = new StringBuilder();
      infoBuilder.append("\t＊　ルール説明　＊\n");
      infoBuilder.append("３つのランクの馬がいます。\n");
      infoBuilder.append("Ａ(走力120～70)\n");
      infoBuilder.append("Ｂ(走力 90～40)\n");
      infoBuilder.append("Ｃ(走力 60～10)\n\n");

      infoBuilder.append("相手の走力順はあらかじめ判っています。\n");
      infoBuilder.append("あなたは自分の馬の出走順を決めてください。\n\n");

    String info = infoBuilder.toString();
    return info;
  }//buildInfo()


//====== comOrder() ======
  //相手の出走順をランダムで決めて main()にString[]で返すメソッド
  private static String[] comOrder() {
    int[] diceArray = new int[3];

    //---- dice1 ----
    //ランダムに決定
    int dice1 = random.nextInt(3);
    diceArray[0] = dice1;

    //---- dice2 ----
    //dice1と違うものが出るまでランダムし続ける
    int dice2 = -1;  // -1はdice2のスコープを拡げるためのダミー
    do {
        dice2 = random.nextInt(3);
    } while (dice2 == dice1);

    diceArray[1] = dice2;

    //---- dice 3 ----
    //dice1,dice2と違うものが出るまでランダムし続ける
    int dice3 = -1;  // -1はdice3のスコープを拡げるためのダミー
    do {
        dice3 = random.nextInt(3);
    } while (dice3 == dice1 || dice3 == dice2);

    diceArray[2] = dice3;

    //---- int[] -> horse[] -> String[] ----
    //dice番号を馬名に置換

    String[] comOrder = new String[3];
    int count = 0;

    for (int num : diceArray) {
        comOrder[count] = horse[num];
        count++;
    }//for

    return comOrder;
  }//comOrder()


  //====== userOrder() ======
  //userの出走順をinput
  private static String[] userOrder(String[] comOrder) {
    String[] userOrder = new String[3];
    Scanner scn = new Scanner(System.in);

    input: // 入力チェックと確認のためのループ
    for( ; ; ) {
        System.out.println("あなたの馬の出走順を決めてください。");

        for (int i = 0; i < userOrder.length; i++) {
           System.out.println((i + 1) + "番目の出走は？[ 1. Ａ / 2. Ｂ / 3. Ｃ ]");
           String input = scn.nextLine();

           //---- judge input ----
           switch (input) {
             case "1":
             case "a":

               userOrder[i] = horse[0];
               break;

             case "2":
             case "b":
               userOrder[i] = horse[1];
               break;

             case "3":
             case "c":
               userOrder[i] = horse[2];
               break;

             default:
                 System.out.println("入力エラーです。半角 1～3, a～cで入力してください。");
           }//switch
        }//for i [judge input]

        //---- judge horse stack / 馬の重複がないかをチェック ----
        if(userOrder[0] == userOrder[1]
               || userOrder[0] == userOrder[2]
               || userOrder[1] == userOrder[2] ) {
            System.out.println("馬が重複しています。");
            continue input;
        }//if

        //---- print userOrder and certain YES or NO ----
        //出走順を表示し確認を取り YESなら、break input (loop)

        for (int i = 0; i < userOrder.length; i++) {
            System.out.printf("%d番目の出走: %s  / 相手の馬 %s \n", (i + 1), userOrder[i], comOrder[i]);
        }//for i

        System.out.println("これでよろしいですか？[1. YES / 2. NO]");
        String input = scn.nextLine();

        switch (input) {
          case "1":
          case "y":
            break input; //out of for-loop

          case "2":
          case "n":
              ;
              break;

          default:
              System.out.println("入力エラーです。半角 1 or 2 , y or n で入力してください。");
      }//switch

    }//for input loop

    scn.close();
    return userOrder;
  }//inputOrder()


  //====== calcHorsePower() ======
  //ランクのStringを入れると、ランク範囲に合った走力(int horsePower)を返す
  //６回使うので汎用できるように作る
  private static int calcHorsePower(String lank) {
      int horsePower = 0;
      int basePower = random.nextInt(50);

      switch(lank) {
        case "Ａ":
            horsePower = basePower + 70;
            break;

        case "Ｂ":
            horsePower = basePower + 40;
            break;

        case "Ｃ":
            horsePower = basePower + 10;
            break;

        default:
            System.out.println("ERROR: calcHorsePower().switch");
      }//switch

      return horsePower;

  }//calcHorsePower()


  //====== resultMatrix() ======
  private static void result(String[] comOrder, String[] userOrder) {


  }//resultMatrix()

}//class
