/**
 * @title chapter11 / Additional Quest / Q11_1_Test
 * @see Q11_1_Drink
 * @author Oshika
 * @dete 2020-08-24 / 1630-1730
 * @date 2020-08-25 / 0930-1030
 */
/*
    Q11_1_Drinkを実行するためのクラスを作成してください。

    [実行例]
    カルピスウォーター 残り430ml
    コカコーラ 残り500ml
    カルピスウォーターを飲みます
    カルピスウォーターの残りの量は380ml
    コカコーラの残りの量は500ml
*/
package chapter11;

import java.util.List;
import java.util.Random;

public class Q11_1_Test {
    static Q11_1_Drink drink = new Q11_1_Drink();
    static List<String> nameList = drink.buildNameList();
    static List<String> companyList = drink.buildCompanyList();
    static List<Integer> contentList = drink.buildContentList();

    public static void main(String[] args) {

        int drinkFlow = 0; //飲んだ量
        //---- print 初期のドリンク ----
        for (int i = 0; i < nameList.size(); i++) {
            printDrink(i, drinkFlow);
        }

        System.out.println();

        //---- まず全種を飲んでみる ----
        //drinkFlow += 180;

        //---- print 飲んだ後ドリンク ----
        //printDrink(drinkFlow);

        //---- 飲んだ量を記録 ----
        //contentList = drink.memoDrinkFlow(contentList, drinkFlow);
        //System.out.println(contentList);


        //---- 一種飲み ----
        Random random = new Random();
        int handDrink = random.nextInt(4);
        drinkFlow = random.nextInt(500);

        System.out.printf("%s(%s)を %d ml飲みます。\n",
            nameList.get(handDrink), companyList.get(handDrink), drinkFlow);

        printDrink(handDrink, drinkFlow);

    }//main()


    private static void printDrink(int handDrink, int drinkFlow) {

        //for (int i = 0; i < nameList.size(); i++) {
        int i = handDrink;
            //---- 残量チェック ----
            String rest = "";
            if(contentList.get(i) > drinkFlow) {
                rest = String.format("残り %d ml",
                    contentList.get(i) - drinkFlow);

            } else if(contentList.get(i) <= drinkFlow) {
                rest = "飲み終わりました。";
            }

            //---- print message ----
            System.out.printf("%s(%s) %s \n",
                nameList.get(i), companyList.get(i), rest );
        //}//for

    }//printDrink

}//class

/*
//====== Result ======
//---- 全種飲みテスト ----
コカコーラ(Ｃボトリング) 残り 350 ml
カルピス(株カルピコ) 残り 600 ml
午後の紅茶(希林) 残り 500 ml
金の微糖(BOZUcompaby) 残り 180 ml

コカコーラ(Ｃボトリング) 残り 170 ml
カルピス(株カルピコ) 残り 420 ml
午後の紅茶(希林) 残り 320 ml
金の微糖(BOZUcompaby) 飲み終わりました。
[170, 420, 320, 0]

【考察】
Drinkのフィールド、コンストラクター使ってない。
Listを書き換えるなら、drinkFlowを渡す必要ない。
あっでも残量チェックするんか。なら意味ある。

もう一度、練り直しだな。
 */
/*
//---- 一種飲み ----
コカコーラ(Ｃボトリング) 残り 350 ml
カルピス(株カルピコ) 残り 600 ml
午後の紅茶(希林) 残り 500 ml
金の微糖(BOZUcompaby) 残り 180 ml

午後の紅茶(希林)を 213 ml飲みます。
午後の紅茶(希林) 残り 287 ml


コカコーラ(Ｃボトリング) 残り 350 ml
カルピス(株カルピコ) 残り 600 ml
午後の紅茶(希林) 残り 500 ml
金の微糖(BOZUcompaby) 残り 180 ml

コカコーラ(Ｃボトリング)を 425 ml飲みます。
コカコーラ(Ｃボトリング) 飲み終わりました。

【考察】
結局、Drinkフィールド使ってない・・けど、できてしまった。
getter, setterでフィールドの出し入れをしたかったのだけど

今回、ドリンクが複数あるんで、Drinkフィールドは毎回書き換わってしまうので
その情報を保持しようとしてListを利用。
getter,setterの機能をList.get()とset()でやってしまったから、こうなった。
でもTestフィールドにList置いたら、すごく便利だった。(クセになりそう・・)

次は、ちゃんとフィールド、コンストラクター使いますので許してください。
*/