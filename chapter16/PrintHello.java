/**
 * @title chapter16 / Practice 16-1, 16-2, 16-3, 16-4 / PrintHello
 * @content Multi-Thread /
 * @author Oshika
 * @date 2020-09-04 / 1300-1400
 */
package chapter16;
/*
//====== Practice 16-1 ======
(1)× Thred -> Thread
(2)〇 Ronnableインターフェイスは abstract run()を持ち
        Runnableを実装するクラスは必ず run()を@Overrideする。
(3)×? 新しいスレッドを生成するには run()を呼び出す -> start()では？(あやふや)
〔答え合わせ〕やっぱ start()でした。

(4)〇 複数スレッドから実行されたくないメソッドは synchronized
(5)×スレッド一定時間停止 -> Thread.sleep()
     スレッド一時停止 -> Object.wait()
(6)× 1つのスレッドがsynchronized実行中は他の全てのスレッドで動作を一時停止。
         -> synchronizedがロックをかけるのはインスタンスであって、
            他のインスタンスによるスレッドは実行されている

(7)× synchronized 中で wait()を呼び出してはいけない
        -> wait()してても、他のインスタンスで notifyAll()されることを期待できるならＯＫ。

〔答え合わせ〕下p181, むしろ必ずロックを掛けた状態でしか wait(), notify()を実行できない
もしロックなしで実行すると、IllegalMonitorStateException
*/
//====== Practice 16-2 ======
/*
class LabelPrinter extends Thread {
    String label = "no label";

    LabelPrinter(String label){
        this.label = label;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(label);

            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }//try-catch

        }//while
    }//run()
}//class LabelPrinter


public class PrintHello {

    public static void main(String[] args) {
        LabelPrinter th = new LabelPrinter("こんにちは");
        th.start();

    }//main()

}//class PrinterTest
*/
/*
//====== 修正箇所 ======
start()するなら -> LabelPrinter extends Thread
run()の @Overrideなら -> static除去。除去しないと labelも参照できない
Thread.sleep(1000); -> try-catchで囲む

これで行けたわ。

//====== Result ======
こんにちは
こんにちは
こんにちは
こんにちは
こんにちは
こんにちは
こんにちは
こんにちは
*/

//====== Practice 16-3 ======

class LabelPrinter extends Thread {
    String label = "no label";

    LabelPrinter(String label){
        this.label = label;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(label);

            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }//try-catch

        }//while
    }//run()
}//class LabelPrinter


public class PrintHello {

    public static void main(String[] args) {
        LabelPrinter th1 = new LabelPrinter("おはよう");
        LabelPrinter th2 = new LabelPrinter("こんにちは");
        LabelPrinter th3 = new LabelPrinter("こんばんは");
        th1.start();
        th2.start();
        th3.start();

    }//main()

}//class PrinterTest

/*
//====== 修正部分 ======
main()のインスタンスを３つにする。
main()のstart()を３つにする。

ここしか変えとらん

//====== Result ======
おはよう
こんにちは
こんばんは
おはよう
こんにちは
こんばんは
おはよう
こんにちは
こんばんは
おはよう
こんにちは
こんばんは
おはよう
こんにちは
こんばんは
おはよう
こんにちは
こんばんは

*/
/*
//====== Practice 16-4 ======
run(): スレッドの実行内容を定義。
       呼び出してもスレッドは作成されず、実行もされない。
       どこかで start()されるのをひたすら待つ。

xxx.start(): Threadを継承したクラスの run()を探しに行く。
              xxxインスタンスのスレッドを作成し、実行開始

〔答え合わせ〕
start(): 新たなスレッドを生成して、制御はすぐに戻ってくる。

run(): runが終了しない限り、制御は戻ってこない。
       runを直接呼び出しても、シングルスレッドのままなのです。

//====== Practice 16-5 ======
[countTenに記述]


 */
