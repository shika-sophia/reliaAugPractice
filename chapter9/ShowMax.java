/**
 * @title chapter9 / Practice 9-7
 * @contents Array
 * @author Oshika
 * @date 2020-08-18 / 14:00-15:00
 */

package chapter9;

public class ShowMax {

  public static void main(String[] args) {
    int[] data = {31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };
    int max = 0;

    for (int i = 0; i < data.length; i++) {

        if (data[i] >= max) {
            max = data[i];
        }

    }//for

    System.out.println("最大値: " + max);

  }//main()

}//class

//====== Result ======
//最大値: 97