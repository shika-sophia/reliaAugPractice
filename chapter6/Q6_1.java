/**
 * @title chapter6 / Additional Quest / Q6_1
 * @author Oshika
 * @date 2020-08-11 / 17:00-17:30
 */

/*

    二重for文を使って「●」でブドウを作ってください。

    条件 : コード内で●を使えるのは一度だけとします。
    System.out.println("●●●●●");は禁止です。

    [例]
        ト
    　　●●●●●
    　　●●●●
    　　●●●
    　　●●
    　　●

*/
package chapter6;

/*
class Q6_1{
    public static void main(String[] args){
        int num = 5;

        //ヘタの部分はこれを使ってください。
        System.out.println("　　ト　　");

        for(int i = 1; i <= num; i++){
            System.out.print("　　");

            for(int j = num; j >= i; j--){
                System.out.print("●");
            }//for j

            System.out.println();
        }//for i

    }//main()
}//class
*/
/*
//====== Result ======
　　ト　　
　　●●●●●
　　●●●●
　　●●●
　　●●
　　●
*/


//###### Improvement Version / 改良版 ######
class Q6_1{
    public static void main(String[] args){
        int num = 5;

        //ヘタの部分はこれを使ってください。
        System.out.println("　　ト　　");

        for(int i = 0; i <= num - 1; i++){
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }//for space

            for(int j = num; j > i; j--){
                System.out.print("●");
            }//for j

            System.out.println();
        }//for i

    }//main()
}//class
/*
//====== Result ======
　　ト　　
●●●●●
 ●●●●
  ●●●
   ●●
    ●

*/