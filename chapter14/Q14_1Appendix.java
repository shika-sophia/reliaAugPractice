/**
 * @title chapter14 / Additonal Quest / Q14_1
 * @content Interface
 *
 * @interface ClothesColor
 * @class Tshirt implements ClothesColor
 * @execute class Q14_1
 *
 * @author Oshika
 * @date 2020-09-01 / 1400-1530
 * @date 2020-09-02 / 0930-1100
 */
/*
    以下の服の色を表すインターフェースClothesColorを実装するTシャツのクラスと、
    実行クラスを作成してください。

    条件
    ・SetterとGetterを作成
    ・色を選ぶためのchangeClothesを実装する
    ・現在着ているTシャツの文字列表現を取得するgetClothesStringを宣言
    ・実行クラスを作ってインスタンスを生成する
    ・実行クラスでchangeClothesメソッドを呼び出す。
    ・getClothesStringメソッドの呼び出しを行い表示させる。


    ｘのスキンはTIEDYEです。
    ｙのスキンはBLACKです。
*/
package chapter14;

//import java.util.InputMismatchException;
//import java.util.Scanner;

/*
interface ClothesColor {
    int WHITE = 0;		//public static finalに必ずなるので省略されている
    int BLACK = 1;
    int TIEDYE = 2;

    void changeClothes(*//*int clothes*//*); //public abstract に必ずなるので省略
}

//以下に解答を記述。上記*//* *//*部分改変 by 大鹿

class Tshirt implements ClothesColor{
    private String name;
    private String color;

    public Tshirt(String name, int clothes) {
        this.setName(name);
        this.color = getClothesString(clothes);
    }

    @Override
    public void changeClothes(){
         System.out.printf("%sのスキンは%sです。\n", this.name, this.color);
    }//changeClothes


    private String getClothesString(int clothes) {

        switch(clothes) {
        case 0:
            color = "WHITE";
            break;

        case 1:
            color = "BLACK";
            break;

        case 2:
            color = "TIEDYE";
            break;

        default:
            System.out.println("数字の0～2でインスタンス");
            System.exit(0);
        }//switch

        return color;
    }//getClothesString()


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}//class Tshirt


public class Q14_1Appendix {
    public static void main(String[] args) {
        Tshirt[] t = new Tshirt[] {
            new Tshirt("x", 2),
            new Tshirt("y", 1),
        };

        for (Tshirt tBit : t) {
            tBit.changeClothes();
        }//for t

    }//main()

}//class Q14_1
*/
/*
//====== Result ======
xのスキンはTIEDYEです。
yのスキンはBLACKです。


【考察】
ふぅ、意外と苦しんだ。
このインターフェイス・・

たぶんこれは、「ちゃんと設計してからインターフェースを作らんと
あとで苦労するよ」っていう例だろう。

インターフェイスのフィールドが intなのに Stringを出さなならんので
改めて どこかで同じことをStringで定義しなならん。

んで、インスタンス時に すでにint clothesを入れてるのに
changeClothes()で もう一度 入れるとか・・

もう我慢ならんくて、問題のほうを改変してしまった。(禁じ手)
問題文を活かすならインスタンス時のclothesを intのまま
Tshirtクラスのフィールドで保持して
changeClothes(clothes)で もう一度 入れるか（無駄すぎる）

nameだけのTshirtコンストラクターと
改めてsetterでclothes入れるとか・・

いずれにしてもインターフェースが一番問題多いから、
設計段階で ＳＥさん ちゃんとやらんと、こんな感じになるのだろう。
 */
/*
//###### 出射さん解答 ######
interface ClothesColor {
    int WHITE = 0;		//public static finalに必ずなるので省略されている
    int BLACK = 1;
    int TIEDYE = 2;
    void changeClothes(int clothes); //public abstract に必ずなるので省略
}

//以下に解答を記述

class Tshirts implements ClothesColor{
//スキンの値を保持するフィールド
    int clothes;
//コンストラクタ
    public Tshirts(){
        this.clothes = WHITE;
    }
    public Tshirts(int clothes){
        setClothes(clothes);
    }
//スキンのセッタ
    public void setClothes(int clothes){
        this.clothes = clothes;
    }

//スキンのゲッタ
    public int getClothes(){
        return clothes;
    }

//スキン変更のメソッド
    @Override
    public void changeClothes(int clothes){
        this.clothes = clothes;
    }

//スキンの文字列を得るメソッド
    public String getClothesString(){
        switch(clothes){
            case 0:
                return "WHITE";
            case 1:
                return "BLACK";
            case 2:
                return "TIEDYE";
            default:
                return "";
        }
    }
}

public class Q14_1_A{
    public static void main(String[] args){
        Tshirts x = new Tshirts();
        Tshirts y = new Tshirts(ClothesColor.BLACK);

        //引数に入ってるのはインタフェースのフィールド値。インタフェース型ではなく
        //int型である事を見落とさない（どちらの型が良いかはプログラムによる）

        x.changeClothes(ClothesColor.TIEDYE);
        System.out.println("ｘのスキンは" + x.getClothesString() + "です。");
        System.out.println("ｙのスキンは" + y.getClothesString() + "です。");
    }//main終了
}//class Q14_1終了
*/
/*
interface ClothColor {
    public enum Color{
        WHITE(0, "白"),
        BLACK(1, "黒"),
        PINK(2, "桃"),
        BLUE(3, "青");

        private int index;
        private String jpName;

        private Color(int index, String jpName){
            this.index = index;
            this.jpName = jpName;
        }

        public int getIndex() {
            return index;
        }

        public String getJpName() {
            return jpName;
        }

    }//enum Color

    public abstract String changeCloth();

    public abstract void showCloth();

}//interface ClothColor


class Blouse implements ClothColor{
    private String name;
    private int colorId;

    @Override
    public String changeCloth() {
        int colorId = -1;

        try(Scanner scn = new Scanner(System.in)){

            for (int i = 0; i < ClothColor.Color.values().length; i++) {
                System.out.printf("%d: %s",
                    (ClothColor.Color.getIndex() + 1), ClothColor.Color.getJpName());
            }//for i

            System.out.println("色チェンジ: どの色にしますか？[1～4] ");
            colorId = (scn.nextInt() - 1);

        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }//changeCloth()

    @Override
    public void showCloth() {

    }//showCloth()
}//class Blouse

//class Skirt implements ClothColor {

//}//class Skirt

public class Q14_1Appendix {
    public static void main(String[] args) {


    }//main()
}//class Q14_1Appendix
*/

/*
//【考察】
まだ途中だけど、この辺にしておこう。
Q14_1 -> Q14_1Appendix クラス名変更。
Appendixは、Q14_1のとき、問題文を書き換えてしまい、
できてなかったので やり直そうと思い始めたけど
[出射さん解答]で よくわかるので、違うことにチャレンジ。

列挙型enumでインターフェイスの定数定義をしてみたかった。
定義自体はできたけど、問題は
実装クラスからenum Colorの参照が難しく
ClothColor.Color.getIndex()としても
「staticから非staticメソッドを参照できません」となる。
getterに static付与すると ここの参照は解決するが
今度、enum内のgetter,setter,field,constracterをstaticに せねばならず、
すると、そのstaticから列挙型定数を参照できませんとな。

ここで詰んだので撤退。
課題はインスタンスできないinterface, enumを参照するときどうするか
これを解決してから再トライだな。

あとインターフェイスは実装してて型が違うなぁと思ったら
インターフェイスのほうを好きに改変すべきだけど、
自分ひとりで作っているならそれもありだが、

実際の開発現場では、インターフェイスが他のたくさんのクラスに影響していて
「好きに改変」なんてことはできないのかも・・

 * */
