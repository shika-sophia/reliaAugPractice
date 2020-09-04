/**
 * @title chapter16 / List 16-5, 16-6 / GoodBankTest
 * @content Multi-Thread / synchronized
 * @author Oshika
 * @date 2020-09-04 / 0900-1000
 */
package chapter16;

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

/*
Thread[Thread-0,5,main]が addMoney()に入りました
Thread[Thread-0,5,main]が addMoney()から出ました
Thread[Thread-0,5,main]が addMoney()に入りました
Thread[Thread-0,5,main]が addMoney()から出ました
Thread[Thread-0,5,main]が addMoney()に入りました
Thread[Thread-0,5,main]が addMoney()から出ました
Thread[Thread-0,5,main]が addMoney()に入りました
Thread[Thread-0,5,main]が addMoney()から出ました
Thread[Thread-0,5,main]が addMoney()に入りました
Thread[Thread-0,5,main]が addMoney()から出ました
Thread[Thread-0,5,main]が addMoney()に入りました
Thread[Thread-0,5,main]が addMoney()から出ました
Thread[Thread-0,5,main]が addMoney()に入りました
Thread[Thread-0,5,main]が addMoney()から出ました
Thread[Thread-0,5,main]が addMoney()に入りました
Thread[Thread-0,5,main]が addMoney()から出ました
Thread[Thread-0,5,main]が addMoney()に入りました
Thread[Thread-0,5,main]が addMoney()から出ました
Thread[Thread-0,5,main]が addMoney()に入りました
Thread[Thread-0,5,main]が addMoney()から出ました
Thread[Thread-0,5,main]が addMoney()に入りました
Thread[Thread-0,5,main]が addMoney()から出ました
Thread[Thread-0,5,main]が addMoney()に入りました
Thread[Thread-0,5,main]が addMoney()から出ました
Thread[Thread-0,5,main]が addMoney()に入りました
Thread[Thread-0,5,main]が addMoney()から出ました
Thread[Thread-0,5,main]が addMoney()に入りました
Thread[Thread-0,5,main]が addMoney()から出ました
Thread[Thread-0,5,main]が addMoney()に入りました
Thread[Thread-0,5,main]が addMoney()から出ました
Thread[Thread-0,5,main]が addMoney()に入りました
Thread[Thread-0,5,main]が addMoney()から出ました
Thread[Thread-0,5,main]が addMoney()に入りました
Thread[Thread-0,5,main]が addMoney()から出ました
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
Thread[Thread-1,5,main]が addMoney()に入りました
Thread[Thread-1,5,main]が addMoney()から出ました
Thread[Thread-1,5,main]が addMoney()に入りました
Thread[Thread-1,5,main]が addMoney()から出ました
Thread[Thread-1,5,main]が addMoney()に入りました
Thread[Thread-1,5,main]が addMoney()から出ました
Thread[Thread-1,5,main]が addMoney()に入りました
Thread[Thread-1,5,main]が addMoney()から出ました
Thread[Thread-1,5,main]が addMoney()に入りました
Thread[Thread-1,5,main]が addMoney()から出ました
Thread[Thread-1,5,main]が addMoney()に入りました
Thread[Thread-1,5,main]が addMoney()から出ました
Thread[Thread-1,5,main]が addMoney()に入りました
Thread[Thread-1,5,main]が addMoney()から出ました
Thread[Thread-1,5,main]が addMoney()に入りました
Thread[Thread-1,5,main]が addMoney()から出ました
Thread[Thread-1,5,main]が addMoney()に入りました
Thread[Thread-1,5,main]が addMoney()から出ました
Thread[Thread-1,5,main]が addMoney()に入りました
Thread[Thread-1,5,main]が addMoney()から出ました
Thread[Thread-1,5,main]が addMoney()に入りました
Thread[Thread-1,5,main]が addMoney()から出ました
Thread[Thread-1,5,main]が addMoney()に入りました
Thread[Thread-1,5,main]が addMoney()から出ました
Thread[Thread-1,5,main]が addMoney()に入りました
Thread[Thread-1,5,main]が addMoney()から出ました
Thread[Thread-1,5,main]が addMoney()に入りました
Thread[Thread-1,5,main]が addMoney()から出ました
Thread[Thread-1,5,main]が addMoney()に入りました
Thread[Thread-1,5,main]が addMoney()から出ました
Thread[Thread-1,5,main]が addMoney()に入りました
Thread[Thread-1,5,main]が addMoney()から出ました

Thread[Thread-19082,5,main]が addMoney()に入りました
Thread[Thread-19082,5,main]が addMoney()から出ました
Thread[Thread-19083,5,main]が addMoney()に入りました
Thread[Thread-19083,5,main]が addMoney()から出ました
Thread[Thread-19083,5,main]が addMoney()に入りました
Thread[Thread-19083,5,main]が addMoney()から出ました
Thread[Thread-19084,5,main]が addMoney()に入りました
Thread[Thread-19084,5,main]が addMoney()から出ました
Thread[Thread-19084,5,main]が addMoney()に入りました
Thread[Thread-19084,5,main]が addMoney()から出ました
Thread[Thread-19085,5,main]が addMoney()に入りました
Thread[Thread-19085,5,main]が addMoney()から出ました
Thread[Thread-19085,5,main]が addMoney()に入りました
Thread[Thread-19085,5,main]が addMoney()から出ました
Thread[Thread-19086,5,main]が addMoney()に入りました
Thread[Thread-19086,5,main]が addMoney()から出ました
Thread[Thread-19086,5,main]が addMoney()に入りました
Thread[Thread-19086,5,main]が addMoney()から出ました
Thread[Thread-19087,5,main]が addMoney()に入りました
Thread[Thread-19087,5,main]が addMoney()から出ました
Thread[Thread-19087,5,main]が addMoney()に入りました
Thread[Thread-19087,5,main]が addMoney()から出ました
Thread[Thread-19088,5,main]が addMoney()に入りました
Thread[Thread-19088,5,main]が addMoney()から出ました
Thread[Thread-19088,5,main]が addMoney()に入りました
Thread[Thread-19088,5,main]が addMoney()から出ました

【考察】
defaultのwhile(true)だと、Thread-0と1が ちらちら変わるけど
止めると、どちらかのTreadしか見えなかったので
whileの位置をインスタンス生成ループに変えてみたら
大量のThreadを作り出してしまった。

でもdafaultの永久ループだと他のThreadが入り込む余地が無さそうだけど
addMoney()から抜けた わずかなタイミングで入り込むのか。

元に戻しとく。
*/