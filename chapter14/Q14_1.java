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

interface ClothesColor {
    int WHITE = 0;		//public static finalに必ずなるので省略されている
    int BLACK = 1;
    int TIEDYE = 2;

    void changeClothes(/*int clothes*/); //public abstract に必ずなるので省略
}

//以下に解答を記述。上記/* */部分改変 by 大鹿

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


public class Q14_1 {
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
