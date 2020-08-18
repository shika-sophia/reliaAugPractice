/**
 * @title chapter9 / Practice 9-8 / SortData
 * @contents Array
 * @author Oshika
 * @date 2020-08-18 / 15:00-15:30
 */

package chapter9;

public class SortData {

  public static void main(String[] args) {
      int[] data = {31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };

      System.out.println("並び替える前");
      for (int d : data ) {
          System.out.print(d + " ");
      }

      System.out.println();

      //---- sort data[] ----
      for (int i = 0; i < data.length; i++) {
          for (int j = i + 1; j < data.length; j++) {
              if (data[i] > data[j]) {
                  //---- data[i]とdata[j]の入れ替え ----
                  int copy = data[j];
                  data[j] = data[i];
                  data[i] = copy;
              }
          }//for j
      }//for i

      System.out.println("並び替えた後");
      for (int d : data ) {
          System.out.print(d + " ");
      }
  }//main()

}//class

/*
//====== Result ======
並び替える前
31 41 59 26 53 58 97 93 23 84
並び替えた後
23 26 31 41 53 58 59 84 93 97
*/
