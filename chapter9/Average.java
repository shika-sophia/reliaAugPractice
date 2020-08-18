/**
 * @title chapter9 / List 9-1, 9-2, 9-3, 9-4, 9-5, 9-6
 * @contents Array
 * @author Oshika
 * @date 2020-08-18 / 10:00-11:00
 */

package chapter9;

/*
//====== List 9-1 ======
public class Average {

  public static void main(String[] args) {
    int japanese = 63;
    int math = 90;
    int english = 75;
    double average = 0d;

    average = (japanese + math + english ) / 3.0;

    System.out.println("国語: " + japanese);
    System.out.println("数学: " + math);
    System.out.println("英語: " + english);
    System.out.println("平均点: " + average);

  }//main()

}//class
*/
/*
//====== Result ======
国語: 63
数学: 90
英語: 75
平均点: 76.0
 */
/*
//====== List 9-2, 9-3 ======
public class Average {

  public static void main(String[] args) {
    int[] examin = new int[3];

    examin[0] = 63;
    examin[1] = 90;
    examin[2] = 75;
    int sum = 0;
    double average = 0d;

    for (int i = 0; i < examin.length; i++) {
        sum += examin[i];
    }//for

    average = sum / examin.length;

    System.out.println("国語: " + examin[0]);
    System.out.println("数学: " + examin[1]);
    System.out.println("英語: " + examin[2]);
    System.out.println("平均点: " + average);

  }//main()

}//class
*/
/*
//====== Result ======
国語: 63
数学: 90
英語: 75
平均点: 76.0
*/
//====== List 9-4, 9-5 ======
/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Average {

  public static void main(String[] args) {
      //---- parameter definion ----
      List<String> subject = new ArrayList<>();
        subject.add("国語");
        subject.add("数学");
        subject.add("英語");
        subject.add("理科");
        subject.add("社会");

      List<Integer> point = new ArrayList<>(Arrays.asList(63, 90, 75, 45, 81));

      int sum = 0;
      double average = 0d;

      //---- calc sum and average ----
      for (int p : point) {
          sum += p;
      }//for p

      average = (double)sum / point.size();

      //---- print subject, point, sum, average ----
      for (int i = 0; i < subject.size(); i++) {
          System.out.printf("%s: %d点 \n", subject.get(i), point.get(i));
      }//for i

      System.out.println("合計点: " + sum);
      System.out.println("平均点: " + average);

  }//main()
}//class
*/
/*
//====== Result ======

●修正前 average = sum / point.size();
国語: 63点
数学: 90点
英語: 75点
理科: 45点
社会: 81点
合計点: 354
平均点: 70.0

●ちなみに average = (double)(sum / point.size());
平均点: 70.0

〇修正後 average = (double)sum / point.size();
国語: 63点
数学: 90点
英語: 75点
理科: 45点
社会: 81点
合計点: 354
平均点: 70.8
*/

//====== List 9-6 二次元配列 ======
public class Average {

  public static void main(String[] args) {
      int[][] point = {
          {63, 90, 75, 45, 81},
          {85, 100, 95, 80, 90},
          {100, 100, 100, 100, 99},
      };

      for(int i = 0; i < point.length; i++) {
          int sum = 0;
          for (int j = 0; j < point[i].length; j++) {
              System.out.printf("\t%3d", point[i][j]);
              sum += point[i][j];
          }//for j
          System.out.println("\t| " + ((double) sum / point[i].length));
      }//for i
  }//main()
}//class

/*
//====== Result ======
     63	 90	 75	 45	 81	| 70.8
     85	100	 95	 80	 90	| 90.0
    100	100	100	100	 99	| 99.8

△「\t」のタブマーク「^」は一応 間に入っているけど、
半角１文字分になるらしい。(Eclipse)
最初だけ半角4文字スペースになっとる。
 */

