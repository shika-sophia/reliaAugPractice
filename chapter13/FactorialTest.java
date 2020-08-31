/**
 * @title chapter13 / Practice 13-1, 13-4 / FactorialTest
 * @content exception treat
 * @author Oshika
 * @date 2020-08-31 / 1300-
 */

package chapter13;
/*
//====== Practice 13-1 ======
(1) × if文のelseを例外処理という -> 例外の処理にはtry-catchを使います。
(2) 〇 配列の長さ[3]のとき、添え字に[3]を入れると例外発生
         -> ArrayOutOfBoundsExceptionですね。
(3) 〇 投げられた例外を受けるためにcatchがあります。
(4) × catchは同じメソッド内用 -> 別メソッドのも受けます。
(5) × finalize()は Objectクラスの終了メソッド -> finallyを try-catchで使います
(6) 〇 Integer.praseInt() throws NumberFormatException
(7) 〇 e.printStackTrace()は eのcall stackが表示
        -> call stackにはメソッド呼び出しの履歴が記録されています
(8) × Errorは コンパイラーでチェックされる例外
        -> Errorクラスは「例外」と呼ばない //〔解答〕チェックもされない
(9) 〇 IOExceptionは コンパイラーでチェックされる例外
        -> try-catchを強制される検査例外です。ないとコンパイルできません。


//====== Practice 13-2 ======
別クラス[ExceptionTest]に記述

//====== Practice 13-3 ======
別クラス[ExceptionTest]に記述

//====== Practice 13-4 ======
//[問]  10! (10の階乗)を求めるため、以下のコードを実行したところ
//このような Errorとなった。なぜか。また、いかに修正すべきか。

public class FactorialTest {

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }//main()

    private static int factorial(int n) {
        return n * factorial(n - 1);
    }//factorial()

}//class
*/
/*
//====== Result ======
Exception in thread "main" java.lang.StackOverflowError
    at chapter13.FactorialTest.factorial(FactorialTest.java:18)
    at chapter13.FactorialTest.factorial(FactorialTest.java:18)
    at chapter13.FactorialTest.factorial(FactorialTest.java:18)
    at chapter13.FactorialTest.factorial(FactorialTest.java:18)
    at chapter13.FactorialTest.factorial(FactorialTest.java:18)
    at chapter13.FactorialTest.factorial(FactorialTest.java:18)
        :
        :
【考察】factorial()の中から、また自分自身のメソッドを呼び出して
永久ループのようになっている。
n < 0 になっても終わらないのではないだろうか

StackOverflowErrorは Errorクラスなので try-catchの例外処理では解決しない。
ループそのものを解消して for文で作るべき。
 */

public class FactorialTest {

    public static void main(String[] args) {
        //---- 階乗を計算するメソッドを呼び出し / 引数10からの階乗 ----
        factorial(10);

    }//main()


    private static void factorial(int n) {
        int result = 1;
        var builder = new StringBuilder();
        builder.append("10! ＝ ");

        for (int i = n; i > 0; i--) {
            //---- 階乗の計算 ----
            result *= i;

            //----  階乗の式 String部分を作成 ----
            if (i > 1) {
                builder.append(i).append("×");
            } else if (i == 1) {
                builder.append(i).append(" ＝ ");
            }
        }//for

        //---- 階乗の解を追加 ----
        builder.append(result);

        //---- print ----
        System.out.println(builder.toString());

    }//factorial()

}//class

/*
//====== Result ======
10! ＝ 10×9×8×7×6×5×4×3×2×1 ＝ 3628800

できました。特に例外処理は要らんけど・・

あっ、答え合わせを まだしてないけど
try-catchを if文のように使って題意のループを終了させるんかな。
通常系の処理に try-catchを使ったら可読性に欠くので使わないようにする。
こないだScannerで使ってしまった。

〔解答〕p324
StackOverflowError: メソッドの呼び出しが無限に深くなり、
                    メソッド呼び出しの深さ限界に達した 誤った再帰呼び出し

再帰呼び出し: メッソドが自分自身を呼び出すこと。これ自体は悪くない

//====== Practice 13-5 ======
[ExceptionTest]に記述

*/