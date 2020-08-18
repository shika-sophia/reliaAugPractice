/**
 * @title chapter9 / Practice 9-9 / PrintArray
 * @contents Array
 * @author Oshika
 * @date 2020-08-18 / 15:30-16:00
 */

package chapter9;

public class PrintArray {

  public static void main(String[] args) {
    int [][] array = {
        { 3, 1, 4, 1, },
        { 5, 9, 2, },
        { 6, 5, },
        { 3, },
    };

    printArray(array);

  }//main()

  private static void printArray(int[][] array) {
      StringBuilder build = new StringBuilder();
      build.append("{ \n");

      for (int i = 0; i < array.length; i++) {
          build.append("\t{ ");

          for (int j = 0; j < array[i].length; j++) {
              build.append(array[i][j]).append(", ");
            }//for j
          build.append("},\n");

      }//for i
      build.append("}\u003B");

      String arrayFig = build.toString();
      System.out.println(arrayFig);
  }//printArray()

}//class

/*
//====== Result ======
{
    { 3, 1, 4, 1, },
    { 5, 9, 2, },
    { 6, 5, },
    { 3, },
};

〇↑細かいけど「;」の表示に初めて成功した
*/
