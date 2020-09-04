/**
 * @title chapter16 / Practice 16-8 / NoGoodBank
 * @content Multi-Thread /
 * @author Oshika
 * @date 2020-09-04 / 1600-
 */
package chapter16;

class NoGoodBank {
    private int value = 0;
    private boolean busy = false;

    public void addMoney(int money) {

        System.out.println(Thread.currentThread() +
            "が addMoney()に入りました");

        busy = true;
        while (busy) {
            try {
                Thread.sleep(100);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }//while

        //実行開始
        busy = true;

        int currentValue = value;
        value += money;

        if (currentValue + money != value) {
            System.out.println(Thread.currentThread() +
                    "で矛盾発生");
            System.exit(-1);
        }//if

        //実行終了
        System.out.println(Thread.currentThread() +
                "が addMoney()から出ました");
        busy = false;
    }//addMoney()

    public static void main(String[] args) {


    }//main()

}//class NoGoodBank


public class NoGoodBankTest extends Thread{
    NoGoodBank bank;

    public NoGoodBankTest(NoGoodBank bank) {
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
        NoGoodBank bank = new NoGoodBank();
        new NoGoodBankTest(bank).start();
        new NoGoodBankTest(bank).start();
    }//main()

}//class NoGoodBankTest

/*
//====== My Answer ======
busy = true;の位置から最初に入ると必ずfalseで
while(busy)は実行されない。

計算処理中は busy = true;となり、
Thread.sleep(100);
その間、他のスレッドから入ったのは0.1秒待機。

計算修了すると再びfalseで計算処理が可能。
ここでタイミングよく飛び込んできたスレッドは、
待たされることなく計算処理へ。
待たされたスレッドは不当に横入りされたみたいになるけど
けっこう うまく行けるような気もする。

ただ、これだけの処理を synchronaized 一語でやってくれるのだから
素直に使おう。

それにsynchronizedなら完全にロックしてくれるから、
待ち時間もないし、
ん？スレッド眠ってたら、
次のが入ってきても眠りから覚めるまで計算処理してくれないのでは？
やっぱ、このコードはだめだ
自分で「NoGood」って言ってるだけのことはある。

↓実行してみて「矛盾」がでたらＯＵＴ。

//====== Result ======
Thread[Thread-0,5,main]が addMoney()に入りました
Thread[Thread-1,5,main]が addMoney()に入りました
(このまま固まる・・何か おかしいかも)

〔答え合わせ〕
うまく動かんみたい。
trueになったままスレッドの切り替えが起こる可能性もある。
不当に待たされ、たまにbusyチェックをし、ＣＰＵの無駄使いだそうな。
 */
