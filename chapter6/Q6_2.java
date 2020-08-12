/**
 * @title chapter6 / Additional Quest / Q6_2
 * @author Oshika
 * @date 2020-08-11 / 17:00-17:30
 */

/*

    Q6_2のブドウをひっくり返してください

    条件 : 前回同様、コード内で●を使えるのは一度だけとします。
    System.out.println("●●●●●");は禁止です。

    [例]
        ●
        ●●
        ●●●
        ●●●●
        ●●●●●
        　　ト　　

*/
package chapter6;
/*
class Q6_2{
    public static void main(String[] args){
        int num = 5;

        for(int i = 1; i <= num; i++){

            for(int j = 1; j <= i; j++){
                System.out.print("●");
            }//for j

            System.out.println();
        }//for i

        System.out.println("　　ト　　");
    }//main()
}//class
*/
/*
//====== Result ======
●
●●
●●●
●●●●
●●●●●
　　ト　　

 */
//###### Improvement Version / 改良版 ######
class Q6_2{
  public static void main(String[] args){
      int num = 5;

      for(int i = 1; i <= num; i++){
          for (int space = num - i; space > 0; space--) {
              System.out.print(" ");
          }//for space

          for(int j = 1; j <= i; j++){
              System.out.print("●");
          }//for j

          System.out.println();
      }//for i

      System.out.println("　　ト　　");
  }//main()
}//class

/*
//====== Result ======
    ●
   ●●
  ●●●
 ●●●●
●●●●●
　　ト　　

 */
