/**
 * @title chapter9 / List 9-9
 * @see Subject / List 9-8
 * @contents classArray
 * @author Oshika
 * @date 2020-08-18 / 13:00-13:30
 */

package chapter9;

public class Examination {

  public static void main(String[] args) {
    Subject[] subjectArray = {
        new Subject("国語", 63),
        new Subject("数学", 90),
        new Subject("英語", 75),
        new Subject("理科", 45),
        new Subject("社会", 81),
    };

    int sum = 0;

    for (int i = 0; i < subjectArray.length; i++) {
        System.out.println(subjectArray[i]);
        sum += subjectArray[i].getPoint();
    }//for

    double average = (double) sum / subjectArray.length;
    System.out.println("平均点: " + average);

  }//main()

}//class

/*
//====== Result ======
国語は63点

数学は90点

英語は75点

理科は45点

社会は81点

平均点: 70.8

//【考察】クラス配列って初めて見た。しかもコンストラクターに代入しながらの配列
 * System.out.println(subjectArray[i]);だけで @Overrideの toString()起動してるし・・
 * いろいろ興味深い List 9-8, 9-9であった。
 */
