/**
 * @title chapter16 / List 16-1, 16-2, Practice 16-5 / CountTen
 * @content Multi-Thread / Thread.run(), Thread.start()
 * @author Oshika
 * @date 2020-09-02 / 1630-1730
 * @date 2020-09-04 / 1400-1430
 */

package chapter16;
/*
public class CountTen extends Thread {

    public static void main(String[] args) {
        CountTen ct = new CountTen();
        ct.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main: " + i);
        }//for i

    }//main()

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("run: " + i);
        }//for i

    }//run()
}//class
*/
/*
//====== Result =======
main: 0
main: 1
main: 2
main: 3
main: 4
main: 5
main: 6
main: 7
main: 8
main: 9
run: 0
run: 1
run: 2
run: 3
run: 4
run: 5
run: 6
run: 7
run: 8
run: 9

マルチスレッド 愉し～
でも、テキストは main: 2 の途中から runが始まっていたけど
私のは mainが終了してから runだ。

んーでも、
ct.start();のほうが先にあって、どうしてmainからなんだ。
仮に、ここを ct.run();にしたら当然 runの表示が先になるが

main表示が先に出るということは
start()で完全にrun()に移行してるのではないことがわかる。
マルチスレッドやな～

たぶん、start() -> Threadクラス -> run()探す -> run()実行 -> for節
この間に わずかな時間が掛かっていて、その間にmainは処理を終えてしまう。
テキストが main: 2からなのは、
このわずか時間の処理速度が私のＰＣと違っているということか
 * */
/*
public class CountTen implements Runnable{

    public static void main(String[] args) {
        CountTen ct = new CountTen();
        Thread th = new Thread(ct);
        th.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main: " + i);
        }//for i

    }//main()

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("run: " + i);
        }//for i

    }//run()
}//class
*/
/*
main: 0
main: 1
main: 2
main: 3
main: 4
run: 0
run: 1
run: 2
run: 3
run: 4
run: 5
run: 6
main: 5
main: 6
main: 7
main: 8
main: 9
run: 7
run: 8
run: 9

おっ、今度は互い違いに表示。
まさしく
マルチスレッドやの～
*/

//====== Practice 16-5 ======
public class CountTen implements Runnable{

    public static void main(String[] args) {
        CountTen ct = new CountTen();
        Thread th1 = new Thread(ct);
        Thread th2 = new Thread(ct);
        Thread th3 = new Thread(ct);

        th1.start();
        th2.start();
        th3.start();
    }//main()

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.printf("%s: %d \n",
                Thread.currentThread().getName(), i);
        }//for i

    }//run()
}//class
/*
Thread-0: 0
Thread-0: 1
Thread-0: 2
Thread-0: 3
Thread-0: 4
Thread-0: 5
Thread-0: 6
Thread-0: 7
Thread-0: 8
Thread-0: 9
Thread-2: 0
Thread-2: 1
Thread-2: 2
Thread-2: 3
Thread-2: 4
Thread-2: 5
Thread-2: 6
Thread-2: 7
Thread-2: 8
Thread-2: 9
Thread-1: 0
Thread-1: 1
Thread-1: 2
Thread-1: 3
Thread-1: 4
Thread-1: 5
Thread-1: 6
Thread-1: 7
Thread-1: 8
Thread-1: 9

【考察】
できたけど、これでいいのか。
Thread th1 = new Thread(ct);に ct入れとる
ct入れんと、run()の定義が thに入らんから入れてるのかな
あれ？他の所で Threadを一個ずつ作っていなかったような・・
LabelPrinterとか run()を@Overrideしてるクラスのインスタンスを作って
それに thという変数を付けてスレッドを作ってはいる。
*/