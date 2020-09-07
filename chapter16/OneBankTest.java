/**
 * @title chapter16 / Practice 16-11 / OneBankTest
 * @content Multi-Thread /
 * @author Oshika
 * @date 2020-09-07 / 0930-1030
 */
package chapter16;

/*
//====== (参考) List 16-6 ======
class GoodBank {
    private int value = 0;

    public synchronized void addMoney(int money) {
        int currentValue = value;

        System.out.println(Thread.currentThread() + "が addMoney()に入りました");

        value += money;

        if (currentValue + money != value) {
            System.out.println(Thread.currentThread() + "で矛盾が発生しました");
            System.exit(-1);
        }

        System.out.println(Thread.currentThread() + "が addMoney()から出ました");

    }//addMoney()
}//class GoodBank


public class GoodBankTest extends Thread{
    GoodBank bank;

    public GoodBankTest(GoodBank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while(true) {
            bank.addMoney(100);
            bank.addMoney(-100);
        }//while loop
    }//run()

    public static void main(String[] args) {
        GoodBank bank = new GoodBank();
        //while(true) {
            new GoodBankTest(bank).start();
            new GoodBankTest(bank).start();
        //}//while loop
    }//main()

}//class GoodBankTest
 */

//====== Practice 16-11 ======

class OneBank{
    private static int value = 0;

    public static synchronized void addMoney(int money) {
        int currentValue = value;

        System.out.println(Thread.currentThread() + "が addMoney()に入りました");

        value += money;

        if (currentValue + money != value) {
            System.out.println(Thread.currentThread() + "で矛盾が発生しました");
            System.exit(-1);
        }

        System.out.println(Thread.currentThread() + "が addMoney()から出ました");

    }//addMoney()
}//class OneBank


public class OneBankTest implements Runnable{
    OneBank bank;

    public OneBankTest(OneBank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while(true) {
            bank.addMoney(100);
            bank.addMoney(-100);
        }//while loop
    }//run()

    public static void main(String[] args) {
        OneBank bank = new OneBank();

        Thread th1 = new Thread(new OneBankTest(bank));
        Thread th2 = new Thread(new OneBankTest(bank));
        th1.start();
        th2.start();
    }//main()

}//class OneBankTest

/*
【考察】
問題で言われた通り、OneBankのフィールドとメソッドを staticにしてみたが、
私は いまいちstaticというのを理解不足だ。

【staticまとめ】+ 下巻p25～28 復習
・クラスメンバーを規定する
・全インスタンス共通の情報を保持する場所
・インスタンスフィールドはインスタンスごとに作られるが、
    staticフィールドはクラスに１つずつだけしか作られない。
・インスタンス不要でクラスから直接呼び出せる。
・thisは使えない (thisは現在のインスタンスを表すから)
・staticから非staticは参照不可
・「静的」と言われたら、これ

ということは、OneBankを何回インスタンスしても
staticを付与したフィールドとメソッドは同じもので、１つしかできない。
それだから OneBankなのか。

あっ、OneBankのインスタンスを増やせないなら Runnableにして
Theadのインスタンスを増やせば行けるのでは？よし implements Runnableにしよう。

//====== Result ======
    :
Thread[Thread-0,5,main]が addMoney()に入りました
Thread[Thread-0,5,main]が addMoney()から出ました
Thread[Thread-0,5,main]が addMoney()に入りました
Thread[Thread-0,5,main]が addMoney()から出ました
Thread[Thread-0,5,main]が addMoney()に入りました
Thread[Thread-0,5,main]が addMoney()から出ました

Thread[Thread-1,5,main]が addMoney()に入りました
Thread[Thread-1,5,main]が addMoney()から出ました
Thread[Thread-1,5,main]が addMoney()に入りました
Thread[Thread-1,5,main]が addMoney()から出ました
Thread[Thread-1,5,main]が addMoney()に入りました
Thread[Thread-1,5,main]が addMoney()から出ました
Thread[Thread-1,5,main]が addMoney()に入りました
Thread[Thread-1,5,main]が addMoney()から出ました
    :
マルチスレッドになりました。


〔答え合わせ〕
OneBank.addMoney(100);
OneBank.addMoney(-100);

クラスメソッドだから、そうしないと参照できんよね。
私のは Onebank bank;のフィールドからクラス変数bankで同じことしてました。

〔答え合わせ〕
GoodBankと OneBankの違いは、銀行のインスタンスを生成するかどうかです。

そういえば解答は new OneBankがないなぁ。
なくても行けるんだ。staticでインスタンスせんでも生成してくれるのかな
 */
