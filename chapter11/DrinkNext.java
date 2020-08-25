/**
 * @title chapter11 / Additional Quest / DrinkNext
 * @author Oshika
 * @date 2020-08-25 / 1630-1730
 */
/*
    11章の内容を使って、飲み物のクラスを作成してください。
    メンバには、商品名、会社名、内容量のフィールドを宣言してください。
    また、飲むと減るというメソッドも作成してください。

    ファイルはクラスごとに分けて作成してください。

    このクラス名はQ11_1_Drinkというクラス、実行するクラスはQ11_1_Testというクラスで作成してください

出射さん：
回答確認しましたが、正直オブジェクト指向を活用出来ていないので、
解答を確認してみてください。

鯛焼きのパックの部分もそうですね、インスタンスを入れてあげる必要があるので、
Taiyaki[] pack = new Taiyaki[10]で作成して、
インスタンスを入れるようにしてください。

*/
package chapter11;

import java.util.Random;

public class DrinkNext {
    private String name;
    private String company;
    private int content;
    private static int count;


    public DrinkNext(String name, String company, int content) {
        this.name = name;
        this.company = company;
        this.content = content;

        count++;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int drinkFlow) {
        this.content = content - drinkFlow;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public static int getCount() {
        return count;
    }


    public static void main(String[] args) {
        DrinkNext cola = new DrinkNext("コカコーラ", "Ｃボトリング", 200);
        DrinkNext calpis = new DrinkNext("カルピス", "株カルピコ", 500);

        System.out.printf("%s(%s) %d ml \n",
            cola.getName(), cola.getCompany(), cola.getContent());
        System.out.printf("%s(%s) %d ml \n\n",
            calpis.getName(), calpis.getCompany(), calpis.getContent());

        //---- 飲む	----
        Random random = new Random();
        int drinkFlow = random.nextInt(cola.getContent());
        System.out.printf("コーラを%d ml 飲む \n", drinkFlow);
        cola.setContent(drinkFlow);
        System.out.printf("%s(%s) %d ml \n\n",
                cola.getName(), cola.getCompany(), cola.getContent());

        drinkFlow = random.nextInt(calpis.getContent());
        System.out.printf("カルピスを%d ml飲む \n", drinkFlow);
        calpis.setContent(drinkFlow);
        System.out.printf("%s(%s) %d ml \n\n",
            calpis.getName(), calpis.getCompany(), calpis.getContent());

        System.out.println("count: " + count);
    }//main

}//class

/*
//==== Result ====
コカコーラ(Ｃボトリング) 200 ml
カルピス(株カルピコ) 500 ml

コーラを133 ml 飲む
コカコーラ(Ｃボトリング) 67 ml

カルピスを63 ml飲む
カルピス(株カルピコ) 437 ml

count: 2

【考察】
Q11_1_Drinkできてなかったので、出射さんのサンプルをもう一度読み直し
再度、作ってみました。

私の勘違いしていたのは、
新たにインスタンスすると前のは消えてなくなると思っていました。
ここの設計図を元に何個でもインスタンスが作れるし、
前のインスタンスの値は cola, calpisの変数に入れたインスタンスで保持されている
ことを確認しました。

たい焼きのcount++はコンストラクターに付けなきゃですね。
配列にインスタンスを入れてパックを作るのも納得です。
*/
