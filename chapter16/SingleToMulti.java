/**
 * @title chapter16 / Practice 16-10 / SingleToMulti
 * @content Multi-Thread /
 * @author Oshika
 * @date 2020-09-07 / 0900-0930
 */
package chapter16;

/*
//====== Practice 16-10 ======
//---- default with Job class----
public class SingleToMulti {
    Job[] jobs;

    class Job {
        int i;
        public Job(int i) {
            this.i = i;
        }
    }//inner class

    public SingleToMulti(int jobBound) {
        jobs = new Job[jobBound];
        for (int i = 0; i < jobs.length; i++) {
            jobs[i] = new Job(i);
        }//for
    }

    public void workAllJob() {
        for (var job : jobs) {
            System.out.println(job.i);
        }//for jobs
    }//workAllJob()

    public static void main(String[] args) {
        var self = new SingleToMulti(10);

        while(true) {
            self.workAllJob();
        }//while loop
    }//main()

}//class SingleToMulti
*/
/*
0
1
2
3
4
5
6
7
8
9
0
1
2
3
4
5
6
:
:(loop)
*/

public class SingleToMulti implements Runnable{
    Job[] jobs;

    class Job {
        int i;
        public Job(int i) {
            this.i = i;
        }
    }//inner class Job

    public SingleToMulti(int jobBound) {
        jobs = new Job[jobBound];
        for (int i = 0; i < jobs.length; i++) {
            jobs[i] = new Job(i);
        }//for
    }

    public void run() {
        for (Job job : jobs) {
            System.out.println(job.i);
        }//for jobs
    }//workAllJob()

    public static void main(String[] args) {
        Thread th1 = new Thread(new SingleToMulti(10));
        Thread th2 = new Thread(new SingleToMulti(10));
        th1.start();
        th2.start();
    }//main()

}//class SingleToMulti

/*
0
1
2
3
4
5
6
7
8
9

0
1
2
3
4
5
6
7
8
9

//loopにするときはmain()内の
th1.start();
th2.start();
を while(true){}で囲う。
 */
