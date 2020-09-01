/**
 * @title chapter13 / Additional Quest / Execute2
 * @content Exception Treat
 * @author Oshika
 * @date 2020-08-31 / 1630-1730
 */
/*
 *	以下のプログラムを読んで出力結果を予想してください。
 */
package chapter13;

class ExceptionCheck2 {

    public void check() throws NumberFormatException {
        String strParam = "abc";
        int intParam = 0;
        intParam = Integer.parseInt(strParam);

        System.out.println("文字列から数値への変換を行いました。");
    }// check

}// ExceptionCheck2クラス


// 実行クラス
class Execute2 {

    public static void main(String[] args) {
        ExceptionCheck2 exp = new ExceptionCheck2();
        System.out.println("処理を開始します。");

        try{
            exp.check();
        } catch (NumberFormatException e) {
            System.out.println("catch節の処理を実行しました。");
        }// try～catch

        System.out.println("処理を終了します。");
    }// main

}// Execute2クラス

/*
//====== My Answer ======
EntryPoint -> main() -> "処理を開始します。"
exp.check(); -> check()呼び出し

intParam = Integer.parseInt(strParam);
例外発生 -> main().catch節へ
catch (NumberFormatException e) {
            System.out.println("catch節の処理を実行しました。");

System.out.println("処理を終了します。");


//====== Result ======
処理を開始します。
catch節の処理を実行しました。
処理を終了します。
*/
