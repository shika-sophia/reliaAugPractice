/**
 * @title book1General / 上巻総合問題 / 自由制作課題
 * @contents Random
 * @author Oshika
 * @date 2020-08-19 / 14:30-19:00
 * @date 2020-08-21 / 09:00-13:00
 *
 * @classChart
 *    class HorseGame
 *    method
 *    +public -private / method(引数) / returnの型
 *      + main() / void
 *          各メソッド呼び出しをして表示する。controleとview機能。
 *
 *      - buildInfo() / String
 *          ルール説明のStringBuilder
 *
 *      - comOrder() / String[]
 *          相手の出走順をランダムで決定
 *
 *      - userOrder(String[] comOrder) / String[]
 *          userの出走順をinput。入力チェックと確認表示。view機能はここにも少し出張。
 *
 *      - calcHorsePower(String lank) / int
 *          馬のランクから乱数で走力を決定。
 *
 *      - resultChart(comOrder, userOrder, userHorsePower, comHorsePower) / String
 *          ４つの配列を渡して結果表を作成。
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

    //---- calc horsePower and set them to userHorsePower[],comHorsePower[] ----
    //userOrder[],comOrder[]からlankを取り出してhorsePowerを計算、新配列に格納
    int[] userHorsePower = new int[3];
    int[] comHorsePower = new int[3];

    for (int i = 0; i < userOrder.length; i++) {
        userHorsePower[i] = calcHorsePower(userOrder[i]);
        comHorsePower[i] = calcHorsePower(comOrder[i]);
    }

    //---- make chart to print result ----
    //結果表示のための表を作成
    String resultChart = resultChart(comOrder, userOrder, userHorsePower, comHorsePower);
    System.out.println(resultChart);

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


  //====== resultChart() ======
  //結果表示のための表を作成
  private static String resultChart(String[] comOrder, String[] userOrder,
                                     int[] userHorsePower, int[] comHorsePower) {
    //---- StringBuilder ----
    StringBuilder resultBuilder = new StringBuilder();
      resultBuilder.append("\t\t\t  ＊　対戦結果　＊\n");
      resultBuilder.append("+-----------------+--------+----------------+\n");
      resultBuilder.append("|    あなたの馬   |  勝敗  |    相手の馬    |\n");
      resultBuilder.append("+--------+--------+--------+--------+-------+\n");
      resultBuilder.append("|  Lank  | Power  |  You   |  Lank  | Power |\n");
      resultBuilder.append("+--------+--------+--------+--------+-------+\n");

    int win = 0;
    int lose = 0;
    int draw = 0;
    for(int i = 0; i < userOrder.length; i++) {
      resultBuilder.append("|   ").append(userOrder[i]).append("   ");
      resultBuilder.append("|  ").append(String.format("%3d",userHorsePower[i])).append("   ");

      //---- judge winner ----

      if (userHorsePower[i] > comHorsePower[i]) {
          resultBuilder.append("|  勝ち  ");
          win++;
      } else if (userHorsePower[i] == comHorsePower[i]) {
          resultBuilder.append("|引き分け");
          draw++;
      } else if (userHorsePower[i] < comHorsePower[i]) {
          resultBuilder.append("|  負け  ");
          lose++;
      }

      resultBuilder.append("|   ").append(comOrder[i]).append("   ");
      resultBuilder.append("|  ").append(String.format("%3d",comHorsePower[i])).append("  |\n");
    }//for i
      resultBuilder.append("+--------+--------+--------+--------+-------+\n");
      resultBuilder.append(String.format("\t\t\t  %d勝 %d敗 %d引き分け \n", win, lose, draw));

    String result = resultBuilder.toString();
    return result;
  }//resultChart()

}//class

/*
//====== Result ======
    ＊　ルール説明　＊
３つのランクの馬がいます。
Ａ(走力120～70)
Ｂ(走力 90～40)
Ｃ(走力 60～10)

相手の走力順はあらかじめ判っています。
あなたは自分の馬の出走順を決めてください。


相手の出走順: Ｃ Ａ Ｂ
あなたの馬の出走順を決めてください。
1番目の出走は？[ 1. Ａ / 2. Ｂ / 3. Ｃ ]
b
2番目の出走は？[ 1. Ａ / 2. Ｂ / 3. Ｃ ]
c
3番目の出走は？[ 1. Ａ / 2. Ｂ / 3. Ｃ ]
a
1番目の出走: Ｂ  / 相手の馬 Ｃ
2番目の出走: Ｃ  / 相手の馬 Ａ
3番目の出走: Ａ  / 相手の馬 Ｂ
これでよろしいですか？[1. YES / 2. NO]
1
            ＊　対戦結果　＊
+-----------------+--------+----------------+
|    あなたの馬   |  勝敗  |    相手の馬    |
+--------+--------+--------+--------+-------+
|  Lank  | Power  |  You   |  Lank  | Power |
+--------+--------+--------+--------+-------+
|   Ｂ   |   88   |  勝ち  |   Ｃ   |   23  |
|   Ｃ   |   54   |  負け  |   Ａ   |   85  |
|   Ａ   |   72   |  勝ち  |   Ｂ   |   44  |
+--------+--------+--------+--------+-------+
             2勝 1敗 0引き分け


//====== Note ======
【ＮＯＴＥ】『孫臏兵法』
http://www.jpsn.org/report/iwan/5120/
戦国時代の中国には、王族や将軍達が自分の馬を競走させて賭けをして楽しんだ。
ある日、軍師孫臏(ｿﾝﾋﾟﾝ)は親友の田将軍が この賭けにどうしても勝てないので勝つ方法を相談に来た。
この賭けの競走の仕組みは、参加者は自分の持ち馬を三頭出場させて、それぞれ取り組ませる方法で三回出走させていた。
当然、第一組は一番早い馬同士であり、二番目はその次に速い馬同士となった。三番目は最も遅い馬同士である。

田将軍の馬は三頭ともあまり速くなかった。軍師は田将軍に一番目の出走馬には最も遅い馬を出させた。
相手は最も早い馬であったので簡単に負けてしまった。
二番目には最も早い馬を出走させた。相手の二番目に早い馬には勝つことが出来た。
三番目には、二番目に早い馬を出走させた。これも、相手の一番遅い馬に勝つことが出来た。
2勝1敗で、総合では賭けに勝つことができ大金と名声を得た。一番目の出走を捨てたことが勝因であった。


【考察】
このゲームを思いついたのは上記の故事をうっすら覚えていて、
それをＪａｖａで再現してみました。
てか相手の出走順が判っている時点で情報力(故事では発想の転換)の勝利であって兵法の差ではない。
でもそれを思いつく孫臏(ｿﾝﾋﾟﾝ)は やっぱりすごい。
ちなみに相手のＡに対し、負けを承知であてがう馬Ｃのことを「当て馬」と云い
この言葉はこの故事から来たものかどうか。

私のＪａｖａゲームでは相手の出走順をランダムとし、
ランクの低い馬も 0.4 * 0.4 = 0.16 約16％の確率で勝てる可能性がある設定にしました。

制作課題を頂いて、簡単なミニゲームのようなものを作れば全ての要件はクリアできると思い、
このミニゲームにしました。
単純なミニゲームなので main()と2,3メソッドぐらいで できそうだと思っていたのですが
単純なルールでも内部的な計算はけっこう複雑で main() + 5メソッドと意外と長くなってしまいました。

苦労したのは、乱数ダイスの重複回避するロジックと
userインプットの入力チェックの部分ですね。

try-catchを用いなかったのは
Scannerクラスは catchをされない。Exceptionが出ると値を渡さない仕様のようだ。
そのため nextInt()は使わず nextLine()でinputし、
switchのdefaultで全ての入力をチェックすれば Scannerも安全に使える。
(ただし空enterは やはり対応しきれない)

外部ファイルの読み込みなど IOExceptionの可能性があるときは
BufferedReaderを使いtry-catchを用意したほうがいい。
単純なuser inputだけなら Scannerクラスのが使いやすい気がする。

結城氏の説明はスローモーションなど丁寧で初学者に解りやすいテキストだが、
2012年刊のJava7仕様なので、ちと情報が古いのが残念なところ。
Java11対応の「第４版」へ更版されることに期待。

StringBuilder中や return式で printf()のフォーマットを使いたいときは
「String.format("～", 変数, ...)」を使えば入れられることが解った。

他人の書いたコードは読みづらいものなので、冒頭にメソッド一覧を付しました。
適宜にコメントでプログラム意図の説明を付けましたが
読みやすいものになっているかどうか。

 */

/*

 //* --main--等は変数名を見れば十分わかるので不要。
 //* その変わり重要な意味を持つ変数の名前はしっかりする



public class HorseGame {

    //フィールドに置くのナイスです。

    //複数メソッドで使うインスタンスをフィールドで定義
    public static Random random = new Random();
    public static final String[] alphabets = new String[26];
    //追加、拡張用に馬の数
    public static final int HORSE_COUNT = 5;

    public static void main(String[] args) {
        //アルファベット26文字を自動で生成
        makeAlphabet();
        //ゲームルールの説明「を表示」
        printInfo();

        //---- detemine com horse order / 相手の出走順を決める ----
        String[] comOrder = comOrder();

        System.out.print("相手の出走順: ");

        for (int i = 0; i < comOrder.length; i++) {
            System.out.print(comOrder[i] + " ");
        } //for
        System.out.println();

        //---- input userOrder[] ----
        //userの出走順をinput
        String[] userOrder = userOrder(comOrder);

        //---- calc horsePower and set them to userHorsePower[],comHorsePower[] ----
        //userOrder[],comOrder[]からlankを取り出してhorsePowerを計算、新配列に格納
        int[] userHorsePower = new int[3];
        int[] comHorsePower = new int[3];

        for (int i = 0; i < userOrder.length; i++) {
            userHorsePower[i] = calcHorsePower(userOrder[i]);
            comHorsePower[i] = calcHorsePower(comOrder[i]);
        }

        //---- make chart to print result ----
        //結果表示のための表を作成
        String resultChart = resultChart(comOrder, userOrder, userHorsePower, comHorsePower);
        System.out.println(resultChart);

    }

    public static void makeAlphabet() {
        //アルファベット26文字の配列を生成
        for (int i = 0; i < alphabets.length; i++) {
            int x = i + 65;
            char c = (char)x;
            alphabets[i] = String.valueOf(c);
        }
    }

    //ルール説明、実行時に最初に表示される
    private static void printInfo() {
        //決まった文字列を表示するだけなので、この中で表示させてしまえば良いです。

        StringBuilder infoBuilder = new StringBuilder();
        infoBuilder.append("\t＊　ルール説明　＊\n");
        infoBuilder.append("３つのランクの馬がいます。\n");
        infoBuilder.append("Ａ(走力120～70)\n");
        infoBuilder.append("Ｂ(走力 90～40)\n");
        infoBuilder.append("Ｃ(走力 60～10)\n\n");

        infoBuilder.append("相手の走力順はあらかじめ判っています。\n");
        infoBuilder.append("あなたは自分の馬の出走順を決めてください。\n\n");

        System.out.println(infoBuilder.toString());
    }

    //相手の出走順をランダムで決めて main()にString[]で返すメソッド
    private static String[] comOrder() {
        int[] diceArray = new int[HORSE_COUNT];

        //1～馬の数を順に入れる
        for (int i = 0; i < HORSE_COUNT; i++) {
            diceArray[i] = i;
        }

        //シャッフル用メソッド
        diceArray = shuffle(diceArray);

        //dice番号を馬名に置換
        String[] comOrder = new String[HORSE_COUNT];
        int count = 0;
        for (int num : diceArray) {
            comOrder[count] = alphabets[num];
            count++;
        }

        return comOrder;
    }


    public static int[] shuffle(int[] diceArray) {
        //配列の長さが1以下ならシャッフルの意味がないのでそのままリターン。
        if (diceArray.length <= 1) {
            return diceArray;
        }

        //フィッシャー–イェーツシャッフル
        for (int i = diceArray.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int tmp = diceArray[index];
            diceArray[index] = diceArray[i];
            diceArray[i] = tmp;
        }

        return diceArray;
    }





    //userの出走順をinput
    private static String[] userOrder(String[] comOrder) {
        String[] userOrder = new String[HORSE_COUNT];

        boolean chk = false;

        Scanner scn = new Scanner(System.in);

        while(!chk) {
            System.out.println("あなたの馬の出走順を決めてください。");
            for(int i = 0; i < HORSE_COUNT; i++) {
                System.out.println((i + 1) + "番目の出走は？");

                System.out.print("[");
                for(int j = 0; j < HORSE_COUNT; j++) {
                    System.out.print((j + 1) + ". " + alphabets[j] + " / ");
                }
                System.out.println("]");


                //ABCDEでもセレクトするの面倒だったので、数字だけにして飛ばします。
                String input = scn.nextLine();
                int select = 0;
                try {
                    select = Integer.parseInt(input);
                }catch(NumberFormatException e) {
                    System.out.println("数字で入力してください。");
                }
                userOrder[i] = alphabets[select];
            }

            boolean chofuku = false;
            for (int i = 0; i < userOrder.length; i++) {
                if(userOrder[i] == userOrder[i + 1]) {
                    chofuku = true;
                }

            }
        }
        */
        /*
        input: // 入力チェックと確認のためのループ
        for (;;) {
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
            } //for i [judge input]

            //---- judge horse stack / 馬の重複がないかをチェック ----
            if (userOrder[0] == userOrder[1]
                    || userOrder[0] == userOrder[2]
                    || userOrder[1] == userOrder[2]) {
                System.out.println("馬が重複しています。");
                continue input;
            } //if

            //---- print userOrder and certain YES or NO ----
            //出走順を表示し確認を取り YESなら、break input (loop)

            for (int i = 0; i < userOrder.length; i++) {
                System.out.printf("%d番目の出走: %s  / 相手の馬 %s \n", (i + 1), userOrder[i], comOrder[i]);
            } //for i

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

        } //for input loop

        scn.close();
        */
/*
        return userOrder;
    }//inputOrder()


    //ランクのStringを入れると、ランク範囲に合った走力(int horsePower)を返す
    //６回使うので汎用できるように作る
    private static int calcHorsePower(String lank) {
        int horsePower = 0;
        int basePower = random.nextInt(50);

        switch (lank) {
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

    }

    //結果表示のための表を作成
    private static String resultChart(String[] comOrder, String[] userOrder,
            int[] userHorsePower, int[] comHorsePower) {
        //---- StringBuilder ----
        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append("\t\t\t  ＊　対戦結果　＊\n");
        resultBuilder.append("+-----------------+--------+----------------+\n");
        resultBuilder.append("|    あなたの馬   |  勝敗  |    相手の馬    |\n");
        resultBuilder.append("+--------+--------+--------+--------+-------+\n");
        resultBuilder.append("|  Lank  | Power  |  You   |  Lank  | Power |\n");
        resultBuilder.append("+--------+--------+--------+--------+-------+\n");

        int win = 0;
        int lose = 0;
        int draw = 0;
        for (int i = 0; i < userOrder.length; i++) {
            resultBuilder.append("|   ").append(userOrder[i]).append("   ");
            resultBuilder.append("|  ").append(String.format("%3d", userHorsePower[i])).append("   ");

            //---- judge winner ----

            if (userHorsePower[i] > comHorsePower[i]) {
                resultBuilder.append("|  勝ち  ");
                win++;
            } else if (userHorsePower[i] == comHorsePower[i]) {
                resultBuilder.append("|引き分け");
                draw++;
            } else if (userHorsePower[i] < comHorsePower[i]) {
                resultBuilder.append("|  負け  ");
                lose++;
            }

            resultBuilder.append("|   ").append(comOrder[i]).append("   ");
            resultBuilder.append("|  ").append(String.format("%3d", comHorsePower[i])).append("  |\n");
        } //for i
        resultBuilder.append("+--------+--------+--------+--------+-------+\n");
        resultBuilder.append(String.format("\t\t\t  %d勝 %d敗 %d引き分け \n", win, lose, draw));
        String result = resultBuilder.toString();
        return result;
    }

}


//====== Result ======
    ＊　ルール説明　＊
３つのランクの馬がいます。
Ａ(走力120～70)
Ｂ(走力 90～40)
Ｃ(走力 60～10)

相手の走力順はあらかじめ判っています。
あなたは自分の馬の出走順を決めてください。


相手の出走順: Ｃ Ａ Ｂ
あなたの馬の出走順を決めてください。
1番目の出走は？[ 1. Ａ / 2. Ｂ / 3. Ｃ ]
b
2番目の出走は？[ 1. Ａ / 2. Ｂ / 3. Ｃ ]
c
3番目の出走は？[ 1. Ａ / 2. Ｂ / 3. Ｃ ]
a
1番目の出走: Ｂ  / 相手の馬 Ｃ
2番目の出走: Ｃ  / 相手の馬 Ａ
3番目の出走: Ａ  / 相手の馬 Ｂ
これでよろしいですか？[1. YES / 2. NO]
1
            ＊　対戦結果　＊
+-----------------+--------+----------------+
|    あなたの馬   |  勝敗  |    相手の馬    |
+--------+--------+--------+--------+-------+
|  Lank  | Power  |  You   |  Lank  | Power |
+--------+--------+--------+--------+-------+
|   Ｂ   |   88   |  勝ち  |   Ｃ   |   23  |
|   Ｃ   |   54   |  負け  |   Ａ   |   85  |
|   Ａ   |   72   |  勝ち  |   Ｂ   |   44  |
+--------+--------+--------+--------+-------+
             2勝 1敗 0引き分け


//====== Note ======
【ＮＯＴＥ】『孫'月賓'兵法』
http://www.jpsn.org/report/iwan/5120/
戦国時代の中国には、王族や将軍達が自分の馬を競走させて賭けをして楽しんだ。
ある日、軍師孫'月賓'(ｿﾝﾋﾟﾝ)は親友の田将軍が この賭けにどうしても勝てないので勝つ方法を相談に来た。
この賭けの競走の仕組みは、参加者は自分の持ち馬を三頭出場させて、それぞれ取り組ませる方法で三回出走させていた。
当然、第一組は一番早い馬同士であり、二番目はその次に速い馬同士となった。三番目は最も遅い馬同士である。

田将軍の馬は三頭ともあまり速くなかった。軍師は田将軍に一番目の出走馬には最も遅い馬を出させた。
相手は最も早い馬であったので簡単に負けてしまった。
二番目には最も早い馬を出走させた。相手の二番目に早い馬には勝つことが出来た。
三番目には、二番目に早い馬を出走させた。これも、相手の一番遅い馬に勝つことが出来た。
2勝1敗で、総合では賭けに勝つことができ大金と名声を得た。一番目の出走を捨てたことが勝因であった。


【考察】
このゲームを思いついたのは上記の故事をうっすら覚えていて、
それをＪａｖａで再現してみました。
てか相手の出走順が判っている時点で情報力(故事では発想の転換)の勝利であって兵法の差ではない。
でもそれを思いつく孫'月賓'(ｿﾝﾋﾟﾝ)は やっぱりすごい。
ちなみに相手のＡに対し、負けを承知であてがう馬Ｃのことを「当て馬」と云い
この言葉はこの故事から来たものかどうか。

私のＪａｖａゲームでは相手の出走順をランダムとし、
ランクの低い馬も 0.4 * 0.4 = 0.16 約16％の確率で勝てる可能性がある設定にしました。

制作課題を頂いて、簡単なミニゲームのようなものを作れば全ての要件はクリアできると思い、
このミニゲームにしました。
単純なミニゲームなので main()と2,3メソッドぐらいで できそうだと思っていたのですが
単純なルールでも内部的な計算はけっこう複雑で main() + 5メソッドと意外と長くなってしまいました。

苦労したのは、乱数ダイスの重複回避するロジックと
userインプットの入力チェックの部分ですね。

try-catchを用いなかったのは
Scannerクラスは catchをされない。Exceptionが出ると値を渡さない仕様のようだ。
そのため nextInt()は使わず nextLine()でinputし、
switchのdefaultで全ての入力をチェックすれば Scannerも安全に使える。
(ただし空enterは やはり対応しきれない)

外部ファイルの読み込みなど IOExceptionの可能性があるときは
BufferedReaderを使いtry-catchを用意したほうがいい。
単純なuser inputだけなら Scannerクラスのが使いやすい気がする。

結城氏の説明はスローモーションなど丁寧で初学者に解りやすいテキストだが、
2012年刊のJava7仕様なので、ちと情報が古いのが残念なところ。
Java11対応の「第４版」へ更版されることに期待。

StringBuilder中や return式で printf()のフォーマットを使いたいときは
「String.format("～", 変数, ...)」を使えば入れられることが解った。

他人の書いたコードは読みづらいものなので、冒頭にメソッド一覧を付しました。
適宜にコメントでプログラム意図の説明を付けましたが
読みやすいものになっているかどうか。

 */

/*Skype Log copy
◆出射:
お疲れさまです。修正して送ります。
手直し完璧にやろうと思ったらめちゃくちゃ時間かかるので、
他の生徒に影響も出てきますし、途中までですが。。。

まず、--main()--などは特に不要です。
クラスフィールドを利用しているので、出走馬数を定数で設置して、
ここを編集するだけで全てが変わるように変更しています（しようとしています）。

入力の部分で諦めたので、入力部分は途中となっていますが、
大きく変更したのはそことアルファベットをランダムで生成する部分です。

重複しないようRandomで生成していましたが、馬の数の定数を元に配列を作って、
フィッシャーイエーツシャッフルで行う方がスムーズかと思います。

comの順番ですが、021とあれば生成した自動で生成したアルファベットの一覧から
対応するものを持ってきて、コードを省略しています。

送って貰った状態だと、5頭のバージョンに変更したい場合に修正箇所が多かったり、
switch文を増設して～ということになってしまいます。

半年後修正するときに楽出来るようにっていうのを念頭に入れて書くことがベストなので、
そのあたりを意識してやってみてください。

例えば僕が今「これの5頭のバージョンと10頭のバージョンも作って」って指示出したら
めちゃくちゃめんどくさいはずなので、基本的に楽出来るよう意識してください。

自主制作について色々言いましたが、「かなり良」なのでそのままガンガン進めてください。


◆大鹿:
制作課題の添削ありがとうございます。ここのログと合わせて(コピー保存して)、
じっくり確認してみます。すごく勉強になります。
はい了解しました。ここのログも大切に保存しておきます。ありがとうございます。
いえいえ、たくさんアドバイス頂き、勉強になりますのでガンガン言ってくださいませ。
11章の前に頂いた修正箇所の確認をじっくりしてみます

*/