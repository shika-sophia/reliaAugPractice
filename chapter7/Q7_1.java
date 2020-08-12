/**
 * @title chapter7 / Additional Quest / Q7_1
 * @class while
 * @author Oshika
 * @date 2020-08-12 / 16:30-17:30
 */

/*
while文を使って0から10までの数の和を求めてください。解答が55になれば正解です。

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
0から10までの和は55です。

*/
package chapter7;

public class Q7_1 {
  public static void main (String[] args) {

    int i = 0;
    int sum = 0;

    while (i <= 10) {
        System.out.printf("%d＋%d＝%d \n", sum, i, sum += i);
        i++;
    }

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
