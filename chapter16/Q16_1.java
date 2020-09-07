/**
 * @title chapter16 / Additional Quest / Q16_1
 * @content Multi-Thread /
 * @author Oshika
 * @date 2020-09-07 / 1100-1200
 */
/*
    以下のプログラムを作成してください。

    ・Threadを拡張したGoodMorningクラス、GoodAfternoonクラスの2つを作成
    ・Threadを拡張していないGoodEveningクラスを作成
    ・その3つのクラスに各自「おはようございます」「こんにちは」「こんばんは」と10回表示させる機能を持たせてください
    ・mainメソッドから各クラスを実行してください。



    [実行例] 環境によって異なるので、これと同じ順にならなくても大丈夫です。
    こんばんは
    こんばんは
    こんばんは
    (略)
    こんにちは
    (略)
    おはようございます
    (略)

*/
package chapter16;

import java.util.Random;

class GoodMorning extends Thread {

    @Override
    public void run() {
        String message = "おはよう";
        Q16_1.print(message);
    }//run()

}//class GoodMorning


class GoodAfternoon extends Thread {

    @Override
    public void run() {
        String message = "こんにちは";
        Q16_1.print(message);
    }//run()

}//class GoodAfternoon


class GoodEvening {

    public void run() {
        String message = "こんばんは";
        Q16_1.print(message);
    }//run()

}//class GoodEvening


public class Q16_1{
    public static void main(String[] args) {
        GoodMorning th1 = new GoodMorning();
        GoodAfternoon th2 = new GoodAfternoon();
        GoodEvening thMain = new GoodEvening();

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

}//class Q16_1

/*
【Try & Error】
「GoodEvening」をどうするか考えて、以下のようにRunnableに無理やりキャスト。
キャストできませんって言われた。残念っ。

GoodMorning th1 = new GoodMorning();
GoodAfternoon th2 = new GoodAfternoon();
Thread th3 = new Thread((Runnable) new GoodEvening());

th1.start();
th2.start();
th3.start();

Exception in thread "main" java.lang.ClassCastException:
    class chapter16.GoodEvening cannot be cast to class java.lang.Runnable
    (chapter16.GoodEvening is in unnamed module of loader 'app';
    java.lang.Runnable is in module java.base of loader 'bootstrap')
at chapter16.Q16_1.main(Q16_1.java:66)

//====== Result ======
２つはスレッドで、「GoodEvening」は mainスレッドで実行。
「GoodEvening」を普通のメソッドのように呼び出す。

Thread-0: おはよう
Thread-0: おはよう
Thread-0: おはよう
Thread-0: おはよう
Thread-0: おはよう
Thread-0: おはよう
Thread-0: おはよう
Thread-0: おはよう
Thread-0: おはよう
Thread-0: おはよう
Thread-1: こんにちは
Thread-1: こんにちは
Thread-1: こんにちは
Thread-1: こんにちは
Thread-1: こんにちは
Thread-1: こんにちは
Thread-1: こんにちは
Thread-1: こんにちは
Thread-1: こんにちは
Thread-1: こんにちは
main: こんばんは
main: こんばんは
main: こんばんは
main: こんばんは
main: こんばんは
main: こんばんは
main: こんばんは
main: こんばんは
main: こんばんは
main: こんばんは

一気に処理しとるなぁ

間に入る感じにするため、ランダムのThread.sleep()を追加
//====== Result ======
Thread-0: おはよう
main: こんばんは
Thread-1: こんにちは
main: こんばんは
main: こんばんは
main: こんばんは
Thread-0: おはよう
Thread-1: こんにちは
main: こんばんは
Thread-0: おはよう
Thread-1: こんにちは
Thread-0: おはよう
Thread-0: おはよう
main: こんばんは
Thread-1: こんにちは
main: こんばんは
Thread-1: こんにちは
Thread-0: おはよう
Thread-1: こんにちは
main: こんばんは
Thread-0: おはよう
Thread-1: こんにちは
main: こんばんは
main: こんばんは
Thread-1: こんにちは
Thread-0: おはよう
Thread-0: おはよう
Thread-0: おはよう
Thread-1: こんにちは
Thread-1: こんにちは

 */