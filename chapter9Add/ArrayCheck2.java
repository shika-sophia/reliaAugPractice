/**
 * @title chapter9Add / Additional Quest / ArrayCheck2
 * @contents Array
 * @author Oshika
 * @date 2020-08-18 / 16:30-17:30
 */

/*
 * 以下のプログラムを読んで、出力結果が何になるか予想してください。
 */
package chapter9Add;

class ArrayCheck2 {

    public static void main(String[] args) {
        //---- parameter definition ----
        int[] intArray;
        int sum = 0;

        //---- call method 'check()' ----
        intArray = check();

        //---- calc sum ----
        for(int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }// for

        //---- print sum ----
        System.out.println(sum);
    }// main

    //====== check() ======
    public static int[] check() {
        //---- instance of 'intArray' ----
        int[] intArray = new int[10];

        //---- set value to intArray[i] ----
        for(int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 2;
        }// for

        //---- return to 'main()' ----
        return intArray;
    }// check

}// class

//====== My Answer ======
//intArray[] = { 2, 4, 6, ... ,20}
//sum: その総和 -> 110かな

//====== Result ======
//90

//90だったか、あっ0～9までの和の２倍だから
//(55 - 10) * 2 = 90

