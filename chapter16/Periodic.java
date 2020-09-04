/**
 * @title chapter16 / List 16-7, 16-8, 16-9 / Runner, Perodic
 * @content Multi-Thread / stop thread, sleep()
 * @author Oshika
 * @date 2020-09-04 / 1000-1030
 */
package chapter16;

/*
//====== List 16-7 ======
class Runner extends Thread {
    private boolean running = true;

    public static void stopRunning() {
        running = false;
    }//stopRunning()

    @Override
    public void run(){
        while(running){
            doCommand();
        }
    }//run()

}//class Runner

//下p170
//※stopするメソッドは synchronizedの整合性を崩す可能性があるため非推奨らしい。
*/

//====== List 16-8 ======
public class Periodic {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int tm = i * 1000;
            System.out.println("Start sleep: " + tm);

            try {
                Thread.sleep(tm);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }//for

    }//main()

}//class

/*
Start sleep: 0
Start sleep: 1000
Start sleep: 2000
Start sleep: 3000
Start sleep: 4000
Start sleep: 5000
Start sleep: 6000
Start sleep: 7000
Start sleep: 8000
Start sleep: 9000

*/