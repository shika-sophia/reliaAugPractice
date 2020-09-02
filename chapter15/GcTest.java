/**
 * @title chapter15 / List 15-1 ～ 15-4 / GcTest
 * @content Garbage Collection
 * @author Oshika
 * @date 2020-09-02 / 1100-1200
 */

package chapter15;

/*
public class GcTest {

    public static void main(String[] args) {
        while(true) {
            String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            System.out.println("残りメモリ: " + Runtime.getRuntime().freeMemory());
        }//while loop
    }//main()

}//class
*/
/*
残りメモリ: 247760640
残りメモリ: 247760640
残りメモリ: 247758592
残りメモリ: 247758592
残りメモリ: 247758592
残りメモリ: 247758592
残りメモリ: 247234304
残りメモリ: 247234304
残りメモリ: 247234304
残りメモリ: 247234304
残りメモリ: 247234304
残りメモリ: 247234304
  :
  :
復活するとこまでいかんかったわ。
すごい勢いで出てたので止めたけど
Runtimeクラス おもしろし・・
*/
/*
public class GcTest {

    public static void main(String[] args) {
        while(true) {
            int[] a = new int[1000];

            int count = 0;
            for (int i = 0; i < a.length; i++) {
                a[i] = i;
                long memory = Runtime.getRuntime().freeMemory();
                System.out.println("残りメモリ: " + memory);

                //---- To be slowly console ----
                if (memory < 110000000) {
                    count = 1;
                }

                if (count == 1 && memory > 200000000) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }//if count
            }//for
        }//while
    }//main()
}//class
*/
/*
残りメモリ: 107314800
残りメモリ: 107314800
残りメモリ: 107314800
残りメモリ: 107314800
残りメモリ: 107314800
残りメモリ: 107314800
残りメモリ: 107314800
残りメモリ: 265597560
残りメモリ: 265597560
残りメモリ: 265597560
残りメモリ: 265597560
残りメモリ: 265073272
残りメモリ: 265073272
残りメモリ: 265073272
    :
    :
復活するとこ捕らえられた。
速すぎて、前のログ消えてしまってたから、ちょっと改良した。
 */
/*
public class GcTest {
    static ArrayList<int[]> list = new ArrayList<>();

    public static void main(String[] args) {
        while(true) {
            int[] a = new int[1000];

            int count = 0;
            for (int i = 0; i < a.length; i++) {
                a[i] = i;
                list.add(a);
                long memory = Runtime.getRuntime().freeMemory();
                System.out.println("残りメモリ: " + memory);

                //---- To be slowly console ----
                if (memory < 10000) {

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }//if count

            }//for
        }//while
    }//main()
}//class
*/
/*
残りメモリ: 494104304
残りメモリ: 494104304
残りメモリ: 494104304
残りメモリ: 494104304
残りメモリ: 494104304

何度も どっかから持ってきて逆に増えとる
なかなか終了しないので止めました。

あ、でもListでループのbreak条件を間違うと
OutOfMemoryException 出るよね。
 */

public class GcTest {
    //static ArrayList<int[]> list = new ArrayList<>();

    public static void main(String[] args) {
        while(true) {
            int[] a = new int[1000];

            for (int i = 0; i < a.length; i++) {
                a[i] = i;
                //list.add(a);
                long memory = Runtime.getRuntime().freeMemory();
                System.out.println("残りメモリ: " + memory);

                //---- artificial Garbage Collection ----
                if (i % 100== 0) {
                    System.out.println("Garbage Collectionします");
                    System.gc();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //---- To be slowly console ----
                if (memory < 10000) {

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }//if count

            }//for
        }//while
    }//main()
}//class

/*
残りメモリ: 264272824
Garbage Collectionします
残りメモリ: 7677096
残りメモリ: 7677096
残りメモリ: 7677096
残りメモリ: 7677096

減ってる・・あ、List付けっぱなしやった

ん？List消しても同じや。ま、いっか
 * */
