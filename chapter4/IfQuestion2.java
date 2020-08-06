/**
 * @title chapter4 / additional quest / IfQuestion2
 * @author Oshika
 * @date 2020-08-06 15:00
 */

/*
 *	次のプログラムの実行結果を予想してください。
 */
package chapter4;

public class IfQuestion2 {
    public static void main(String[] args) {
        String str;
        boolean bln1 = (1 < 5);//常にtrue
        boolean bln2 = false;

        if (bln1) { //bin1 == trueなのでここに入る
            if (bln1 || bln2 != false) { //bin2 == falseなのでWhite消え
                str = "White";
            } else {
                str = "Black";  //←なので、ここ！（間違い↓下に続く）
            }
        } else { //bin1 == true で以下は判定されない
            if (bln1 || bln2 != false) {
                str = "Red";
            } else {
                str = "Blue";
            }
        }

        System.out.println(str);
    }
}
/*
//====== Result ======
White

あれ、Whiteか
if (bln1 || bln2 != false) {
ここだな

「bin1 または bin2 が falseでなければ」と読んでいた。ちゃうやん

「bin1 || bin2 の和集合に falseでないものがあれば（trueがあれば）」
→bin1 == trueなので この条件式全体true → Whiteやん。やられた～
*/
