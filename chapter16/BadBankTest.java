/**
 * @title chapter16 / List 16-3, 16-4 / BadBankTest
 * @content Multi-Thread / un-synchronized conflict
 * @author Oshika
 * @date 2020-09-04 / 0900-1030
 */

package chapter16;


class BadBank {
    private int value = 0;

    public void addMoney(int money) {
        int currentValue = value;

        System.out.println(Thread.currentThread() + "が addMoney()に入りました");

        value += money;

        if (currentValue + money != value) {
            System.out.println(Thread.currentThread() + "で矛盾が発生しました");
            System.exit(-1);
        }

        System.out.println(Thread.currentThread() + "が addMoney()から出ました");

    }//addMoney()
}//class BadBank


public class BadBankTest extends Thread{
    BadBank bank;

    public BadBankTest(BadBank bank) {
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
        BadBank bank = new BadBank();
        new BadBankTest(bank).start();
        new BadBankTest(bank).start();
    }//main()

}//class BadBankTest

/*
Thread[Thread-0,5,main]が addMoney()に入りました
Thread[Thread-1,5,main]が addMoney()に入りました
Thread[Thread-0,5,main]が addMoney()から出ました
Thread[Thread-1,5,main]で矛盾が発生しました
Thread[Thread-0,5,main]が addMoney()に入りました
Thread[Thread-0,5,main]が addMoney()から出ました
Thread[Thread-0,5,main]が addMoney()に入りました
Thread[Thread-0,5,main]が addMoney()から出ました
Thread[Thread-0,5,main]が addMoney()に入りました
Thread[Thread-0,5,main]が addMoney()から出ました

*/