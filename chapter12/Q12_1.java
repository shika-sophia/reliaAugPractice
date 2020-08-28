/**
 * @title chapter12 / Additional Quest / Q12_1
 * @class super: Sauce
 * @class sub: Mayonnaise
 * @class sub: Kttchup
 * @class execute: Q12_1
 * @class Day: year, month, day -> 賞味期限 : [ year = 2019, month = 9, date = 4]
 *
 * @author Oshika
 * @date 2020-08-28 / 0930-1200
 */

/*

workフォルダにDayファイルも移動させて下さい。

以下に示す調味料クラスSauceをスーパークラスに持つサブクラス、MayonnaiseとKetchupを作成して下さい。
マヨネーズクラスには100gに含まれる脂質の量、ケチャップクラスには100gに含まれるリコピンの量を持つフィールドを作成してください。
そして、実行クラスで、各フィールドを呼び出してください。


【実行例】
ブランド名 : カゴメトマトケチャップ
賞味期限 : [ year = 2019, month = 9, date = 4]
残量 : 500
残量に含まれているリコピンの量 : 90.0mg

ブランド名 : キュピーマヨネーズ
賞味期限 : [ year = 2019, month = 7, date = 4]
残量 : 450
残量に含まれている脂質の量 : 328.5mg

*/

package chapter12;

class Sauce {
    private String name;
    private int remainingAmount; //残量
    private Day expirationDate; // 賞味期限

    public Sauce(String name,int remainingAmount,Day expirationDate){
        this.setName(name);
        this.setRemainingAmount(remainingAmount);
        this.setExpirationDate(expirationDate);
    }

//セッタ群
    public void setName(String name){
        this.name = name;
    }

    public void setRemainingAmount(int remainingAmount){
        this.remainingAmount = remainingAmount;
    }

    public void setExpirationDate(Day expirationDate){
        this.expirationDate = expirationDate;
    }

//ゲッタ群
    public String getName(){
        return name;
    }

    public int getRemainingAmount(){
        return remainingAmount;
    }

    public Day getExpirationDate(){
        return new Day(expirationDate);
    }

}//class Sauce終了


class Mayonnaise extends Sauce {
    private String contentName = "脂質";
    private final int OIL_RATE = 73; // (mg) oil per 100g
    private double content;

    public Mayonnaise(String name, int remainingAmount, Day expirationDate) {
        super(name, remainingAmount, expirationDate);
        setContent(remainingAmount);
    }

    public double calcOilContent (int remainingAmount) {

        content = (double)(remainingAmount * OIL_RATE / 100);

        return content;
    }//calcOilContent()

    //====== getter ======
    public String getContentName() {
        return contentName;
    }

    public int getOIL_RATE() {
        return OIL_RATE;
    }

    public double getContent() {
        return content;
    }

    //====== setter ======
    public void setContent(int remainingAmount) {
        this.content = calcOilContent(remainingAmount);
    }

}//class Mayonnaise


class Ketchup extends Sauce {
    private String contentName = "リコピン";
    private final int RICOPIN_RATE = 18; // (mg) ricopin per 100g
    private double content;

    public Ketchup(String name, int remainingAmount, Day expirationDate) {
        super(name, remainingAmount, expirationDate);
        setContent(remainingAmount);
    }

    public double calcRicopinContent (int remainingAmount) {

        content = (double)(remainingAmount * RICOPIN_RATE / 100 );

        return content;
    }//calcRicopinContent()

    //====== getter ======
    public String getContentName() {
        return contentName;
    }

    public int getRICOPIN_RATE() {
        return RICOPIN_RATE;
    }

    public double getContent() {
        return content;
    }

    //====== setter ======
    public void setContent(int remainingAmount) {
        this.content = calcRicopinContent(remainingAmount);
    }

}//class Ketchup


public class Q12_1 {
    public static void main(String[] args) {
        final int SAUCE_NUM = 2;
        Sauce[] sauceArray = new Sauce[SAUCE_NUM];

        Day mayoDay = new Day(2019, 7, 4);
        Mayonnaise mayo = new Mayonnaise(
            "キュピーマヨネーズ", 450, mayoDay);

        Day ketDay = new Day(2019, 9, 4);
        Ketchup ket = new Ketchup(
            "カゴメトマトケチャップ", 500, ketDay);

        sauceArray[0] = mayo;
        sauceArray[1] = ket;

        printForm(sauceArray);

    }//main()

    private static void printForm(Sauce[] sauceArray) {
        for (int i = 0; i < sauceArray.length; i++) {
            StringBuilder bld = new StringBuilder();

              bld.append(String.format("ブランド名 : %s \n",
                sauceArray[i].getName()));
              bld.append(String.format("賞味期限 : %s \n",
                sauceArray[i].getExpirationDate().toString()));
              bld.append(String.format("残量 : %d \n",
                      sauceArray[i].getRemainingAmount()));

            if (i == 0) {
              bld.append(String.format("残量に含まれている%sの量 : %.1f mg \n",
                      ((Mayonnaise) sauceArray[i]).getContentName(),
                      ((Mayonnaise) sauceArray[i]).getContent()));

            } else if (i == 1) {
                bld.append(String.format("残量に含まれている%sの量 : %.1f mg \n",
                        ((Ketchup) sauceArray[i]).getContentName(),
                        ((Ketchup) sauceArray[i]).getContent()));
            }

            System.out.println(bld.toString());
        }//for

    }//printForm

}//class Q12_1

/*
//====== Result ======
ブランド名 : キュピーマヨネーズ
賞味期限 : [ year = 2019, month = 7, date = 4 ]
残量 : 450
残量に含まれている脂質の量 : 328.0 mg

ブランド名 : カゴメトマトケチャップ
賞味期限 : [ year = 2019, month = 9, date = 4 ]
残量 : 500
残量に含まれているリコピンの量 : 90.0 mg


 【考察】
 ふぅ、やっと出た。今回は苦労しました。
 一番、詰まったのは 脂質量・リコピン量のところだけど、
 printForm()を２個(Mayonnaise, Ketchup)書けば解決なのだけど
 同じ処理なので１つにまとめられないかを考えた。
 でも ifで場合わけしてるから同じか。

 あっ、@Override toString()を Mayonnaise, Ketchup両クラスに書いて
 main()から toString()すれば良かったんだ。
 そしたら、souceArray[]を作らんで済む。
 なるほど、多態性の便利さはこういうところか。苦労した分、実感できました。

 */


