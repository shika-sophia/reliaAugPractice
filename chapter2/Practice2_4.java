/**
 * @title chapter2 / Practice 2-4
 * @author Oshika
 * @date 2020-08-04 18:30
 */

package chapter2;

//public class CalcBig {
public class Practice2_4 {

    public static void main(String[] args) {
        //final int A = 100000;
        final long A = 100000L;
        long result = 0L;

        result = A * A;

        System.out.println("result: " + result);

    }//main()

}//class
/*
//====== Result 2-4 ======
//---- final long A = 100000L; ----
result: 10000000000

//---- final int A = 100000; ----
result: 1410065408

 */
