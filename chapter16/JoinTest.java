/**
 * @title chapter16 / List 16-10 / JoinTest
 * @content Multi-Thread / join()
 * @author Oshika
 * @date 2020-09-04 / 1030-1045
 */
package chapter16;

public class JoinTest extends Thread {

    public static void main(String[] args) {
        JoinTest th = new JoinTest();
        System.out.println("main: 始め");
        th.start();
        System.out.println("main: 終了待ちに入る");

        try {
            th.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main: 終わり");
    }//main()

    @Override
    public void run() {
        System.out.println("run: スレッド実行開始");

        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("run: スレッド実行終了");

    }//run()

}//class

/*
main: 始め
main: 終了待ちに入る
run: スレッド実行開始
  (５秒待つ・・)
run: スレッド実行終了
main: 終わり

 */
