/**
 * @title chapter12 / Practice 12-1 ～ 12-6 / Rectangle3, B
 * @content abstract / 抽象クラス
 * @author Oshika
 * @date 2020-08-26 / 1300-1530
 */
/*
//====== Practice 12-1 ======
class X extends Y {
    Z z;
}

(1) 〇 Xクラスの宣言である。
(2) × Yクラスは Xクラスのサブクラス -> YはXのスーパークラス、XはYのサブクラス
(3) 〇 Xは Zクラス型のインスタンス変数を持つ。newでインスタンスしている記述はないが・・
(4) × Xは Zのスーパークラス -> インスタンスは継承関係と違う
(5) 〇 Xは Yのpublicメソッドを全て継承している。IS-A関係で X ⊃ Y (XはYを全て含む。private以外)
(6) × Xにメソッドを追加すれば、Yのpublicは全て@Override可
           -> main()や 予約語のメソッドは無理じゃないかな。でもtoStringは@Overrideできるし・・
(7) × Yがfinalなら実行時にエラー -> コンパイル時にエラーでは？
(8) 〇 X->Yのキャストはエラーにならないが、Y->Xは例外の可能性あり。
           アップキャスト(X->Y)は  X ⊃ Yなので問題ないが
           ダウンキャスト(Y->X)は フィールドの追加や @Overrideで型変換できないことがある。

《答え合わせ》
(4) X-Z has-a関係 / 委譲関係
(5) publicだけでなく protectedも、なしのpackage-privateも継承。private以外
(6) public でもfinalは不可。
(8) Y型の変数が、Yのインスタンスを参照しているとY->Xのキャストで例外。
        例えばY型のメソッドを参照していると、X型にキャストすると、
        Xで呼び出せるメソッドはX型だから、Y型のメソッドは呼び出せないということか
        Xクラスからも super.method()なら呼び出せるはず。

//====== Practice 12-2 ======
import java.applet.*;

public class MyApplet extends Applet{

}


//====== Practice 12-3 ======
public class MyThread extends Thread {

    @Override
    public void run(){

    }
}

*/
//====== Practice 12-4 ======
/*
class Rectangle3 {
    int width;
    int height;

    Rectangle3(){
        setSize(0, 0);
    }

    Rectangle3(int width, int height){
        setSize(width, height);
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("[ %d , &d ]", width, height);
    }
}//class Rectangle3


class PlacedRectangle extends Rectangle{
    int x;
    int y;

    PlacedRectangle(){
        setLocation(0, 0); //解答参照後、加筆
    }

    PlacedRectangle(int x, int y){
        setLocation(x, y);
    }

    PlacedRectangle(int width, int height, int x, int y){
        super(width, height);
        setLocation(x, y);
    }

    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format(
          //"[ ( %d , %d ) [ %d , %d ] ] \n", x, y, width, height);
            "[ ( %d , %d ) %s ] \n", x, y, super.toString()); //解答参照後、修正
    }
}//class PlacedRectangle


//====== Practice 12-5 ======
public class PlacedRectangle {
    Rectangle rct = new Rectangle();
    int width = rct.width;
    int height = rct.height;

}//class

《答え合わせ》
public class PlacedRectangle {
    Rectangle rct;
    int x;
    int y;

    public PlacedRectangle(){
        rct = new Rectangle(); ←ここ
        setLocation(0, 0);
    }

    他コンストラクターも同様にインスタンス

*/
package chapter12;

//====== Practice 12-6 ======
class A {
    A(){
        System.out.println("1: A()");
    }

    A(int x){
        System.out.println("2: A(int x)");
    }
}//class A

public class B extends A{
    B(){
        System.out.println("3: B()");
    }

    B(int x){
        System.out.println("4: B(int x)");
    }

    B(String s){
        super(789); //解答参照後、加筆
        System.out.println("5: B(String s)");
    }

    public static void main(String[] args) {
        System.out.println("- - - - -");
        new A();

        System.out.println("- - - - -");
        new B();

        System.out.println("- - - - -");
        new A(123);

        System.out.println("- - - - -");
        new B(456);

        System.out.println("- - - - -");
        new B("test");

    }//main

}//class B

/*
//====== My Answer ======
>java B の実行により
まずコンストラクタ B() -> 3: B()
暗黙的 super()が働き -> 1. A()
B.main()に入り
1: A()はすでに実行済みのため２度目はスルー
次に 2 -> (3: 実行済スルー) -> 4 -> super(a, b) は 2済スルー -> 5

回答 3, 1 ,2 ,4 ,5


ファイル名を B にすると実行できる
//====== Result ======
- - - - -
(1) 1: A()
- - - - -
(2) 1: A()
(3) 3: B()
- - - - -
(4) 2: A(int x)
- - - - -
(5) 1: A()
(6) 4: B(int x)
- - - - -
(7) 1: A()
(8) 5: B(String s)

【考察】
うそーん。なにこれ。
解答を見る前に私なりに考えると〔(n)部分は n行目。結果に加筆〕
(1) A()は、まず B()が実行されるけど
    super()の位置はコンストラクターの先頭行だから B()より先に A()

あっ、ちゃうわ
- - - - -
(1) 1: A()
となっているから、すでにB.main()に入ってる。

すると>java B実行時には B()は起動されないんだ。
そういえばインスタンス実行時て言ってたわ。

なので
(1) は main()1行目のA()
(2) は 上記のB()にある暗黙super()のA()
(3) は main()2行目のB()
あとは順に(4)(6)(8)と進むけど
(5)(7)は Bクラスのコンストラクターの暗黙super()のA()

私が間違っていたこと
・一度実行されても再度実行される。
・暗黙super()は サブのBクラスにだけある。
・暗黙super()で呼び出すのは、A()のみで、A(a, b)は呼び出さない。


《答え合わせ》
super(789);抜けていたので修正、再実行。
- - - - -
1: A()
- - - - -
1: A()
3: B()
- - - - -
2: A(int x)
- - - - -
1: A()
4: B(int x)
- - - - -
2: A(int x)
5: B(String s)

A(int x)は、明示的に super(789)すると呼び出せる。
その際、暗黙super() -> A()は無くなる。
 * */
