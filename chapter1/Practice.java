/**
 * @title chapter1 / Practice1-1, 1-2, 1-4
 * @author Oshika
 * @date 2020-08-04
 */

package chapter1;


//====== Practice 1-1 ======
//「FunnyGame.java」というファイル名から、クラス名「FunnyGame」
//楽しそうなゲームらしい名前だが、javaアプリケーションがスタートでvoid main()だけぽいので
//たいして楽しくはないかもしれない

//====== Practice 1-2 ======
//packageでどこに属すクラスか
//class宣言でアクセスと継承関係を確認
//methodに何があるかを見てこのクラスの役割を把握

//====== Practice 1-3,1-4 ======
//public class Kantan {

public class Practice {

    public static void main(String[] args) {
        for(int i = 0; i < 3; i++) {
            System.out.println("意外と\"java\"って簡単だ。");
        }//for
        System.out.println();
        System.out.print("おはよう。\nこんにちは。\nこんばんは。\n");
    }//main()

}//class

//======= Result 1-3 ======
/*
意外と"java"って簡単だ。
意外と"java"って簡単だ。
意外と"java"って簡単だ。

おはよう。
こんにちは。
こんばんは。

 */

