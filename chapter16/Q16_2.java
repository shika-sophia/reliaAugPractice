/**
 * @title chapter16 / Additional Quest / Q16_2
 * @content Multi-Thread /
 * @author Oshika
 * @date 2020-09-07 / 1300-1330
 */
/*

Q16_1で作ったプログラムをインタフェース実装タイプに変更してみてください。

*/
package chapter16;

import java.util.Random;

class GoodMorningR implements Runnable {

    @Override
    public void run() {
        String message = "おはよう";
        Q16_2.print(message);
    }//run()

}//class GoodMorningR


class GoodAfternoonR implements Runnable {

    @Override
    public void run() {
        String message = "こんにちは";
        Q16_2.print(message);
    }//run()

}//class GoodAfternoonR


class GoodEveningR {

    public void run() {
        String message = "こんばんは";
        Q16_2.print(message);
    }//run()

}//class GoodEveningR


public class Q16_2{
    public static void main(String[] args) {
        Thread th1 = new Thread(new GoodMorningR());
        Thread th2 = new Thread(new GoodAfternoonR());
        GoodEveningR thMain = new GoodEveningR();

        th1.start();
        th2.start();
        thMain.run();

    }//main()

    public static void print(String message) {
        Random rdm = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.printf("%s: %s \n",Thread.currentThread().getName(), message );

            int waitTime = rdm.nextInt(5) * 100;

            try {
                Thread.sleep(waitTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }//for
    }//print()

}//class Q16_2

/*
【考察】Q16_1の雛型ができてしまえば、Runnableへの転向は容易。
各々クラスのインスタンスだったものを Threadクラスのインスタンスとすれば良い。
「GoodEvening」は従来設定通り非実装だとすると、同様にmain()で実行。

同package内でclass名だけ衝突したので、「-R」を付与しました。


//====== Result ======
Thread-1: おはよう
Thread-3: こんにちは
main: こんばんは
main: こんばんは
Thread-3: こんにちは
Thread-3: こんにちは
Thread-3: こんにちは
main: こんばんは
Thread-1: おはよう
Thread-3: こんにちは
main: こんばんは
main: こんばんは
main: こんばんは
Thread-1: おはよう
main: こんばんは
Thread-3: こんにちは
main: こんばんは
Thread-1: おはよう
Thread-3: こんにちは
Thread-1: おはよう
main: こんばんは
main: こんばんは
Thread-3: こんにちは
Thread-1: おはよう
Thread-3: こんにちは
Thread-3: こんにちは
Thread-1: おはよう
Thread-1: おはよう
Thread-1: おはよう
Thread-1: おはよう

※なぜThread-1, 3, mainなんだ。0, 2 は どこ行った。
Thread th1 = new Thread(new GoodMorningR());
Thread th2 = new Thread(new GoodAfternoonR());
これか・・
new Thread()で Thread-0生成。
new GoodMorningR()でThread-1
new Thread()で Thread-2
new GoodAfternoonR()で Thread-3 ってことかな。たぶん
*/