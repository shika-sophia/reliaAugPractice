/**
 * @title chapter16 / List 16-11 / ProducerConsumer
 * @content Multi-Thread / wait(), notifyAll()
 * @author Oshika
 * @date 2020-09-04 / 1045-1200
 */
package chapter16;

public class ProducerConsumer {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(3);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        producer.start();
        consumer.start();

    }//main()

}//class ProducerConsumer


class MyQueue {
    int[] intbuf;
    int start;
    int count;

    public MyQueue (int size) {
        intbuf = new int[size];
        start = 0;
        count = 0;
    }

    public synchronized void put(int n) throws InterruptedException {
        while(count >= intbuf.length) {
            System.out.println(Thread.currentThread().getName() +
                "/wait: バッファの空きを待つ");
            wait();
        }//while

        int end = (start + count) % intbuf.length;
        intbuf[end] = n;
        count++;
        notifyAll();
    }//put()

    public synchronized int take() throws InterruptedException {
        while(count == 0) {
            System.out.println(Thread.currentThread().getName() +
                "/wait: データを待つ");
            wait();
        }//while

        int n = intbuf[start];
        start = (start + 1) % intbuf.length;
        count--;
        notifyAll();

        return n;
    }//take()

}//class MyQueue


class Producer extends Thread {
    static final int END = -1;
    MyQueue queue = null;

    Producer (MyQueue queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for(int i = 0; i < 100; i++) {
                int n = produce(i);
                queue.put(n);
            }//for
            queue.put(Producer.END);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }//run()

    int produce(int n) {
        sleepRandomly();
        System.out.printf("Producer: %sは %dを生産完了 \n",
            Thread.currentThread().getName(), n);

        return n;
    }//produce()

    void sleepRandomly() {
        int n = (int)(Math.random() * 1000);

        try {
            Thread.sleep(n);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }//sleepRandom()

}//class Producer


class Consumer extends Thread {
    static final int END = -1;
    MyQueue queue = null;

    Consumer (MyQueue queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while(true) {
                int n = queue.take();

                if (n == Producer.END) {
                    break;
                }//if

                consume(n);

            }//while

       } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }//run()

    int consume(int n) {
        System.out.printf("Consumer: %sは %dを消費中 \n",
            Thread.currentThread().getName(), n);

        sleepRandomly();

        return n;
    }//consume()

    void sleepRandomly() {
        int n = (int)(Math.random() * 1000);

        try {
            Thread.sleep(n);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }//sleepRandom()

}//class Consumer

/*
Thread-1/wait: データを待つ
Producer: Thread-0は 0を生産完了
Consumer: Thread-1は 0を消費中
Producer: Thread-0は 1を生産完了
Consumer: Thread-1は 1を消費中
Thread-1/wait: データを待つ
Producer: Thread-0は 2を生産完了
Consumer: Thread-1は 2を消費中
Producer: Thread-0は 3を生産完了
Consumer: Thread-1は 3を消費中
Producer: Thread-0は 4を生産完了
Consumer: Thread-1は 4を消費中
Producer: Thread-0は 5を生産完了
Producer: Thread-0は 6を生産完了
Consumer: Thread-1は 5を消費中
Consumer: Thread-1は 6を消費中
Producer: Thread-0は 7を生産完了
Producer: Thread-0は 8を生産完了
Producer: Thread-0は 9を生産完了
Consumer: Thread-1は 7を消費中
Consumer: Thread-1は 8を消費中
Producer: Thread-0は 10を生産完了
Producer: Thread-0は 11を生産完了
Producer: Thread-0は 12を生産完了
Thread-0/wait: バッファの空きを待つ
Consumer: Thread-1は 9を消費中
Consumer: Thread-1は 10を消費中
Producer: Thread-0は 13を生産完了
Producer: Thread-0は 14を生産完了
Thread-0/wait: バッファの空きを待つ
Consumer: Thread-1は 11を消費中
Producer: Thread-0は 15を生産完了
Thread-0/wait: バッファの空きを待つ
Consumer: Thread-1は 12を消費中

*/