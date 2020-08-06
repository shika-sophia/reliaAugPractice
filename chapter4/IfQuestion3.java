/**
 * @title chapter4 / additional quest / IfQuestion3
 * @author Oshika
 * @date 2020-08-06 15:00
 */

/*
 *	次のプログラムの実行結果を予想してください。
 */
package chapter4;

public class IfQuestion3 {
    public static void main(String[] args) {
        int i = 5;
        boolean b = (i < 10);//true

        if (b) {// b == trueで true!
            System.out.println("true(真)です。");
        } else {
            System.out.println("false(偽)です。");
        }
    }
}

//====== Result ======
//true(真)です。