/**
 * @title chapter17 / Additional Quest / iFull
 * @content package
 * @author Oshika
 * @date 2020-09-07 / 1600-1800
 */
/*
//====== 答案 ======
package i; //パッケージ名

class i { //クラス名

    static i i; //型名 フィールド名

    public static void main (String[] args){
        i i = new i();  //クラス名(型名) ローカル変数名 = new クラス名()

        i. i. i = i;
        //パッケージ.クラス.フィールド = 値(リテラル)

        i = i. i. i. i (i. i. i. i);
        //↑で定義した変数名 = java.package.Class.mathod()
        //()内 実引数 -> (java.package.Class.variant〔変数名〕)

        System.out.println(i); //ローカル変数＝仮引数

    }//main()

    i i (i i){ //戻り値型 メソッド名(型名 仮引数)
        return i; //フィールド名
    }

    public String toString(){
        return "i"; //文字列
    }//toString()
}//class
 */
/*
//====== おまけ ======
package chapter17;

public class iFull {
    static String str;

    public static void main(String[] args) {
        iFull self = new iFull();

        self.str = "";

        str = java.lang.Object.toString(java.util.Scanner(System.in).nextLine);

        System.out.println(str.getStr(str).toString());
    }//main()

    public String getStr(String str) {
        return str;
    }

    @Override
    public String toString() {
        return String.format("[%s]\n", str);
    }//toString()

}//class iFull
*/
/*
【考察】実際のコードに当てはめられるかやってみたけど、あかんかった・・
3つの階層と4つの階層が難しい。(importしろよ)
4つの階層を代入する変数は型名がないので、既出の変数でなければいけない。
とするとフィールドしかない。ここで手が狭まってフィールドstrをたらい回しすることに・・

Object.toString()は引数なしじゃないとあかん。
このクラスのgetterと@OverrideのtoString()も使ってやらんと・・無理やり入れ込んだ

難しかったけど、いい練習になりました。←できてないけど

*/