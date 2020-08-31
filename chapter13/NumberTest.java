/**
 * @title chapter13 / List 13-4 / NumberTest
 * @content exception treat
 * @author Oshika
 * @date 2020-08-31 / 0930-
 */

package chapter13;

public class NumberTest {

    public static void main(String[] args) {

        try {
            //String numStr = "XYZ";
            //int num = Integer.parseInt(numStr);
            //System.out.println("num: " + num);

            int x = 12;
            int y = x / 0;

        } catch (NumberFormatException e) {
            System.out.println("例外: " + e);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("終了します");

    }//main()
}//class
/*
//====== Result ======
例外: java.lang.NumberFormatException: For input string: "XYZ"
終了します

java.lang.ArithmeticException: / by zero
    at chapter13.NumberTest.main(NumberTest.java:20)
終了します
*/

