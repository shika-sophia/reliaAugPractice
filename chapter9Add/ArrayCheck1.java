/**
 * @title chapter9Add / Additional Quest / ArrayCheck1
 * @contents Array
 * @author Oshika
 * @date 2020-08-18 / 16:30-17:30
 */

/*
 * 以下のプログラムを完成させてください。
 *
 * 【出力結果】
 * A
 * B
 * C
 * D
 * E
 */
package chapter9Add;

class ArrayCheck1 {
    public static void main(String[] args) {
        String[] strArray = new String[5];

        // ▽解答欄 ここから
        strArray[0] = "A";
        strArray[1] = "B";
        strArray[2] = "C";
        strArray[3] = "D";
        strArray[4] = "E";
        // △解答欄 ここまで

        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }//for
    }//main()
}//class

/*
//====== Result ======
A
B
C
D
E

*/