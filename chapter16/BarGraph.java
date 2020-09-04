/**
 * @title chapter16 / Practice 16-6, 16-7 / BarGraph
 * @content Multi-Thread /
 * @author Oshika
 * @date 2020-09-04 / 1500-1600
 */
package chapter16;
/*
//====== Practice 16-6 ======
public class BarGraph {

    public static void main(String[] args) {
        Bar bar1 = new Bar("* * *", 3);
        Bar bar2 = new Bar("=====", 5);

        bar1.start();
        bar2.start();

    }//main()

}//class BarGraph


class Bar extends Thread {
    private String barType;
    private int sleepSecond;

    Bar (String barType, int sleepSecond) {
        this.barType = barType;
        this.sleepSecond = sleepSecond;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(barType);

            try {
                Thread.sleep(sleepSecond * 1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }//for i
    }//run()

}//class Bar
*/
/*
* * *
=====
* * *
=====
* * *
* * *
=====
* * *
* * *
=====
* * *
=====
* * *
* * *
=====
* * *
=====
=====
=====
=====

*/
/*【ネット参照】
◆Javaコード入門
＊Threadクラス／Runnableインターフェイス
https://java-code.jp/297

・Threadクラス
スレッドで処理すべき内容は、Threadクラスのrunメソッドに定義します。
定義したスレッドを出力するには、Thread#startメソッドを呼び出します。

・Runnnableインターフェイス
スレッド処理を、Runnableインターフェイスの実装クラスとして定義することもできます。
その場合、Runnable実装クラスのインスタンスを引数にThreadクラスをインスタンス化します。

public static void main(String[] args) {
      Thread t1 = new Thread(new MyThread());
      Thread t2 = new Thread(new MyThread());
      t1.start();
      t2.start();
    }
  }

//【考察】
MyThreadがRunnableの実装クラス。
Runnableは Threadクラスのインスタンスを作って
それに start()を掛けるんだ。

Practice 16-5で それまでThreadクラスでインスタンスをあまり見かけてなくて
なんでこれしてるか、やっと解ったわ。
そういえば 16-5も Runnableだった。

*/
//====== Practice 16-7 ======

public class BarGraph {

    public static void main(String[] args) {
    //###### (修正前) Bar extends Threadの場合 ######
    //   Bar bar1 = new Bar("* * *", 3);
    //   Bar bar2 = new Bar("=====", 5);

    //   bar1.start();
    //   bar2.start();

    //###### (修正後) Bar implements Runnableの場合 ######
        Thread th1 = new Thread(new Bar("* * *", 3));
        Thread th2 = new Thread(new Bar("=====", 5));
        th1.start();
        th2.start();

    }//main()

}//class BarGraph

class Bar implements Runnable {
    private String barType;
    private int sleepSecond;

    Bar (String barType, int sleepSecond) {
        this.barType = barType;
        this.sleepSecond = sleepSecond;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(barType);

            try {
                Thread.sleep(sleepSecond * 1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }//for i
    }//run()

}//class Bar

/*
でけた。RunnableはThreadクラスでインスタンス。
そういえば 今回はThreadクラスをextendsしてないから
まだどこにもThreadクラス出てきてない。
Thread.start()使うのだから、Threadクラスでのインスタンスが必要。
* * *
=====
* * *
=====
* * *
* * *
=====
* * *
=====
* * *
* * *
=====
* * *
* * *
=====
* * *
=====
=====
=====
=====


*/