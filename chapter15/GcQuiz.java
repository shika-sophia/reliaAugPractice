/**
 * @title chapter15 / Practice 15-1, 15-2 / GcQuiz
 * @content Garbage Collection
 * @class ClassA
 * @class ClassB extends ClassA
 * @execute class GcQuiz
 *
 * @author Oshika
 * @date 2020-09-02 / 1100-1200, 1300-1600
 */
/*
//====== Practice 15-1 ======
(1) × GCによりエラーなし -> Listとか StringBuilderとかよく起こる
(2) 〇 nullに参照なし
    〔答え合わせ〕文字列"null"と リテラルnull。文字列はStringインスタンスを参照してる。

(3) 〇 GCはメモリ再利用の仕組み
(4) 〇 参照型は他のに代入しても同じ参照
(5) × obj2 = nullなら obj2が Garbage
(6) × obj1 = 1でtrue。こういう引っかけ・・ -> obj1 == null で true or false
 */
package chapter15;

class ClassA {
    public static ClassA last = null;
    public String name;

    public ClassA(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("[ %s ]", this.name);
    }
}//classA


class ClassB extends ClassA{
    public ClassA friend;

    public ClassB(String name) {
        super(name);
    }

    public ClassB(String name, ClassA friend) {
        super(name);
        this.friend = friend;
    }

    @Override
    public String toString() {
        return String.format("[ %s , %s ]", super.name, this.friend);
    }
}//classB

public class GcQuiz {
    public static ClassA q = new ClassA("ジマイマ");
    public ClassA r = new ClassA("レベッカ");

    public static void main(String[] args) {
        ClassA a = new ClassA("ミトン");
        ClassA b = new ClassA("トム");
        ClassA c = new ClassA("モペット");
        b = c;

        ClassB[] arrayB = new ClassB[4];

        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = new ClassB("犬" + i);
        }//for

        arrayB[3].friend = arrayB[3]; //[犬3,犬3]
        arrayB[0] = arrayB[1]; //arrayB[0] 犬1, [1]犬1
        c = arrayB[2];
        arrayB[1] = null;
        ClassA d = arrayB[0];//犬1

        ClassB[] arrayB2 = new ClassB[4];
        arrayB2[0] = new ClassB("プロプシー", new ClassA("野ネズミ"));
        arrayB2[1] = new ClassB("モプシー", new ClassA("ナトキン"));
        arrayB2[2] = new ClassB("カトンテール", c);
        arrayB2[3] = new ClassB("ピーター", new ClassA("ベンジャミン"));

        arrayB = null;
        arrayB2[0].friend = null;
        arrayB2[1] = null;
        arrayB2[2] = null;

        ClassB e = new ClassB("ルーシー", new ClassA("ディギー"));
        e = null;

        //問 この時点で参照しているインスタンスは何か
        //System.out.println();

    }//main()

}//class

/*
なんじゃ この問題、結局 全部写してもうた。
e = null;で消してはいるが、
new ClassA("ディギー")のClassAのインスタンスはまだ残っていよう。
ClassAの「name」か Stringオブジェクトの"ディギー"かな

〔答え合わせ〕
あぁ、そう答えるのか。最後のだけかと思った。

・生まれなかったインスタンスは"レベッカ"
public class GcQuiz {
    public static ClassA q = new ClassA("ジマイマ");
    public ClassA r = new ClassA("レベッカ");

    public static void main(String[] args) {
↑main()の前のフィールドでインスタンス。
そうかここはインスタンスされんのか。でもstaticはされるんか

・最後のは public ClassA friend;クラスフィールドで保持する
・代入しても、元の参照にnullを入れたら、代入先もnull

 * */
