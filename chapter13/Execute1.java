/**
 * @title chapter13 / Additional Quest / Execute1
 * @content Exception Treat
 * @author Oshika
 * @date 2020-08-31 / 1630-1730
 */
/*
 *	以下のプログラムを読んで出力結果を予想してください。
 */
package chapter13;

class ExceptionCheck1 {

    public void check() {

        System.out.println("checkメソッドが呼び出されました。");
        String strParam = "abc";
        int intParam = 0;

        try {
            intParam = Integer.parseInt(strParam);
            System.out.println("文字列から数値への変換を行いました。");
        } catch(NumberFormatException e) {
            System.out.println("catch節の処理を実行しました。");
        } finally {
            System.out.println("finally節の処理を実行しました。");
        }// try～catch～finally

    }// check

}// ExceptionCheck1クラス


// 実行クラス
class Execute1 {

    public static void main(String[] args) {
        System.out.println("処理を開始します。");
        ExceptionCheck1 exp = new ExceptionCheck1();
        exp.check();
        System.out.println("処理を終了します。");
    }// main

}// Execute1クラス

/*
//====== My Answer ======
EntryPoint -> main() -> "処理を開始します。"
exp.check(); -> "checkメソッドが呼び出されました。"
intParam = Integer.parseInt(strParam) <- strParam = "abc"
数値変換できないので例外発生

catch(NumberFormatException e) {
    System.out.println("catch節の処理を実行しました。");

"finally節の処理を実行しました。"

main()に戻り
"処理を終了します。"

//====== Result ======
処理を開始します。
checkメソッドが呼び出されました。
catch節の処理を実行しました。
finally節の処理を実行しました。
処理を終了します。
 */
