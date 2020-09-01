/**
 * @title chapter13 / Additional Quest / Q13_1
 * @content Exception Treat
 * @author Oshika
 * @date 2020-09-01 / 0930-1030
 */
/*
    mainメソッドを含む3つのメソッドを自作し、2つの例外が出るクラスを作ってください。
    ただし、以下の条件を満たしてください。

    1. 入力をキーボードから取得する
    2. キーボードから取得した値を引数に入れると、その値によってはExceptionかRuntimeExceptionを投げるメソッドを宣言
    3. 条件2のメソッドを呼び出すだけのメソッドを宣言
    4. 条件3のメソッドをmainメソッドから呼び出す
    5. mainメソッド意外はthrows節を利用すること。

    [実行例]
    入力 : 1
    検査的例外発生

*/

package chapter13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExceptionQ13_1 {

    public ScannerExceptionQ13_1(String line) throws RuntimeException{
        judgeException(line);
    }

    private void judgeException(String line)
         throws NumberFormatException,
                InputMismatchException,
                ArrayIndexOutOfBoundsException,
                ArithmeticException {

        int[] dammy = new int[3];

        try {
            System.out.println("入力: " + line);

            int input = Integer.parseInt(line);

            dammy[input] = 0;
            int result = input / dammy[input];

        } catch (RuntimeException e) {
            System.out.println("RuntimeException 非検査例外 発生");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception 検査例外 発生");
            e.printStackTrace();
        }
    }//judgeException()


    public static void main(String[] args) {

        try (Scanner scn = new Scanner(System.in)){
            System.out.println("◆何か入力してください。");
            String line = scn.nextLine();
            new ScannerExceptionQ13_1(line);
        }

    }//main()
}//class

/*
//====== Result ======
◆何か入力してください。
あ
入力: あ
java.lang.NumberFormatException: For input string: "あ"
RuntimeException 非検査例外 発生
    at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
    at java.base/java.lang.Integer.parseInt(Integer.java:652)
    at java.base/java.lang.Integer.parseInt(Integer.java:770)
    at chapter13.ScannerExceptionQ13_1.judgeException(ScannerExceptionQ13_1.java:45)
    at chapter13.ScannerExceptionQ13_1.<init>(ScannerExceptionQ13_1.java:31)
    at chapter13.ScannerExceptionQ13_1.main(ScannerExceptionQ13_1.java:64)

◆何か入力してください。
5
入力: 5
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
    at chapter13.ScannerExceptionQ13_1.judgeException(ScannerExceptionQ13_1.java:47)
    at chapter13.ScannerExceptionQ13_1.<init>(ScannerExceptionQ13_1.java:31)
    at chapter13.ScannerExceptionQ13_1.main(ScannerExceptionQ13_1.java:64)
RuntimeException 非検査例外 発生

◆何か入力してください。
0
入力: 0
java.lang.ArithmeticException: / by zero
    at chapter13.ScannerExceptionQ13_1.judgeException(ScannerExceptionQ13_1.java:48)
    at chapter13.ScannerExceptionQ13_1.<init>(ScannerExceptionQ13_1.java:31)
    at chapter13.ScannerExceptionQ13_1.main(ScannerExceptionQ13_1.java:64)
RuntimeException 非検査例外 発生

入力:   (空 enter)
java.lang.NumberFormatException: For input string: ""
RuntimeException 非検査例外 発生
    at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
    at java.base/java.lang.Integer.parseInt(Integer.java:662)
    at java.base/java.lang.Integer.parseInt(Integer.java:770)
    at chapter13.ScannerExceptionQ13_1.judgeException(ScannerExceptionQ13_1.java:45)
    at chapter13.ScannerExceptionQ13_1.<init>(ScannerExceptionQ13_1.java:31)
    at chapter13.ScannerExceptionQ13_1.main(ScannerExceptionQ13_1.java:65)

 */

/*
//###### Scanner class Exception ######
//◆Oracle JavaSE11 仕様書 Scannerクラス
//https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Scanner.html

public class ScannerExceptionQ13_1 {

    import java.util.InputMismatchException;
    import java.util.NoSuchElementException;
    import java.util.Scanner;

    public static void main(String[] args) {

      Scanner scn = new Scanner(System.in);

      try {

          //String line = scn.nextLine();
          int input = scn.nextInt();

      } catch (InputMismatchException e)	{
          System.out.println("数値に変換できません");

      } catch (NoSuchElementException e) {
          System.out.println("入力情報が見当たりません");

      } catch (IllegalStateException e){
          System.out.println("Scanner.close()しています");

      //} catch (IOException e) {
      //	System.out.println("ファイル入出力エラー / Readableインターフェース由来");

      } finally {
          scn.close();
      }

  }//main()
}//class
*/