/**
 * @title chapter6 / List 6-1, 6-2, 6-7
 * @ class for文
 * @author Oshika
 * @date 2020-08-08 / 22:00-23:00
 */

package chapter6;

public class Count {

  public static void main(String[] args) {
      System.out.println(0);
      System.out.println(1);
      System.out.println(2);
      System.out.println("end");

      for (int i=0; i < 3; i++) {
          System.out.println(i);
      }//for

      System.out.println("end");

      int i = 0;
      for (i=0; i < 3; i++) {
          System.out.println(i);
      }//for

      System.out.println("i: " + i);
      System.out.println("end");

  }//main()

}//class

/*
//====== Result ======
0
1
2
end

0
1
2
end

0
1
2
i: 3
end
*/
