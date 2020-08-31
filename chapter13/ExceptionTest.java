/**
 * @title chapter13 / List 13-1, 2, 3, 7 / Practice 13-2, 3, 5 / ExceptionTest
 * @content exception treat
 * @author Oshika
 * @date 2020-08-31 / 0900-1030, 1300-1400
 */

package chapter13;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;

/*
public class ExceptionTest {

    public static void main(String[] args) {
        int[] myArray = new int[3];

        try {
            System.out.println("代入します");
            myAssign(myArray, 100 , 0);
            System.out.println("代入しました");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("代入できませんでした");
            System.out.println("例外:" + e);
            e.printStackTrace();
        }
        System.out.println("終了します");
    }//main()

    private static void myAssign(int[] myArray, int index, int value) {
        System.out.println("myAssignに来ました");
        myArray[index] = value;
        System.out.println("myAssignから帰ります");
    }//myAssign()

}//class
*/
/*
//====== Result ======
//---- 13-1 ----
代入します
Exception in thread "main"
java.lang.ArrayIndexOutOfBoundsException:
Index 100 out of bounds for length 3
at chapter13.ExceptionTest.main(ExceptionTest.java:8)

//---- 13-2 ----
代入します
代入できませんでした
例外:java.lang.ArrayIndexOutOfBoundsException:
Index 100 out of bounds for length 3
終了します

---- 13-3 ----
代入します
myAssignに来ました
代入できませんでした
例外:java.lang.ArrayIndexOutOfBoundsException:
Index 100 out of bounds for length 3
終了します

---- 13-7 ----
代入します
myAssignに来ました
代入できませんでした
例外:java.lang.ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 3
java.lang.ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 3
終了します

    at chapter13.ExceptionTest.myAssign(ExceptionTest.java:29)
    at chapter13.ExceptionTest.main(ExceptionTest.java:17)
*/
/*
//====== Practice 13-2 ======
public class ExceptionTest {

    public static void main(String[] args) {
        int[] myArray = new int[3];


            System.out.println("代入します");
            myAssign(myArray, 100 , 0);
            System.out.println("代入しました");

        System.out.println("終了します");
    }//main()

    private static void myAssign(int[] myArray, int index, int value) {
        System.out.println("myAssignに来ました");
        try {
            myArray[index] = value;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("代入できませんでした");
            System.out.println("例外:" + e);
            e.printStackTrace();
        }
        System.out.println("myAssignから帰ります");

    }//myAssign()

}//class
*/
/*
//====== Result ======
代入します
myAssignに来ました
代入できませんでした
例外:java.lang.ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 3
java.lang.ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 3
    at chapter13.ExceptionTest.myAssign(ExceptionTest.java:87)
    at chapter13.ExceptionTest.main(ExceptionTest.java:78)
myAssignから帰ります
代入しました
終了します
 */
/*
//====== Practice 13-3 ======
public class ExceptionTest {

  public static void main(String[] args) {
      try {
          method1(0);
          method2(0);
          method3(0);
      } catch (Exception e) {
          System.out.println("例外: " + e);
          e.printStackTrace();
      }
         System.out.println("終了します");
  }//main()


    private static void method1(int i) throws FileNotFoundException {
        String path = String.valueOf(i);
        var in = new FileInputStream(path);

    }//method1()

    private static void method2(int i) throws ArithmeticException{
        int x = 12 / i;

    }//method2()

    private static void method3(int i) {

    }

}//class
*/
/*
//====== Result ======
例外: java.io.FileNotFoundException: 0 (指定されたファイルが見つかりません。)

java.io.FileNotFoundException: 0 (指定されたファイルが見つかりません。)
    at java.base/java.io.FileInputStream.open0(Native Method)
    at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
    at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
    at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
    at chapter13.ExceptionTest.method1(ExceptionTest.java:136)
    at chapter13.ExceptionTest.main(ExceptionTest.java:123)
終了します
*/
//====== Practice 13-5 ======
public class ExceptionTest {

    public static void main(String[] args) {
        System.out.println("START");
        try {
            int[] a = new int[3];
            System.out.println("代入します");
            a[3] = 123;
            System.out.println("代入しました");

        } catch (RuntimeException e) {
            System.out.println("代入できませんでした。catch_1");
        } catch (Exception e) {
            System.out.println("代入できませんでした。catch_2");
        } finally {
            System.out.println("finally");
        }
        System.out.println("END");
    }//main()

}//class

/*
//====== My Answer ======
START
代入します

〔int[3]に a[3]=123 は代入できない
ArrayIndexOutOfBoundsException -> これはRuntimeExceptionの派生クラス〕

よって
代入できませんでした。catch_1
finally
END
でしょ。

//====== Result ======
START
代入します
代入できませんでした。catch_1
finally
END

 * */
