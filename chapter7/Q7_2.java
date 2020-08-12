/**
 * @title chapter7 / Additional Quest / Q7_2
 * @class while
 * @author Oshika
 * @date 2020-08-12 / 16:30-17:30
 */

/*
    Q7_1のプログラムを改造して、do-while文で同じ内容のものを作ってみてください。

    [解答例]
    0+0=
    0
    0+1=
    1
    1+2=
    3
    3+3=
    6
    6+4=
    10
    10+5=
    15
    15+6=
    21
    21+7=
    28
    28+8=
    36
    36+9=
    45
    45+10=
    55
    0から9までの和は55です。

*/

package chapter7;

public class Q7_2 {
  public static void main (String[] args) {

    int i = 0;
    int sum = 0;

    do {
        System.out.printf("%d＋%d＝%d \n", sum, i, sum += i);
        i++;
    }while (i <= 10);

    System.out.println("0～10までの和は " + sum);

  }//main()
}//class

/*
//====== Result ======
0＋0＝0
0＋1＝1
1＋2＝3
3＋3＝6
6＋4＝10
10＋5＝15
15＋6＝21
21＋7＝28
28＋8＝36
36＋9＝45
45＋10＝55
0～10までの和は 55

*/