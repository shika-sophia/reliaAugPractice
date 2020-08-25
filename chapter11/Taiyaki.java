/**
 * @title chapter11 / Additional Quest / Taiyaki
 * @see VideoCounter
 * @author Oshika
 * @date 2020-08-25 / 1400-1500
 */
/*
 * ◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆たい焼き練習問題◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆
 * 上から順番に解答していくと、ひとつのクラスとして完結します。
 * (メソッドやクラスの｛ と ｝は忘れずに書いてクラスの形を整えてください。
 * 　また一部後回しにした方が解答しやすい問題があります。)
 *
 * これが解ければ、クラスとインスタンスについてかなり理解できていると思います。
 * テキストなどを参考に頑張りましょう！
 */
package chapter11;

// 問1.Taiyakiクラスを宣言しなさい
public class Taiyaki {


// 問2.価格のインスタンスフィールドを宣言しなさい
    private int price;


// 問3.あんの種類のインスタンスフィールドを宣言しなさい
    private String type;


// 問4.たい焼きの生産数をカウントするクラスフィールドを宣言しなさい
    private static int count;


// 問5.つぶあんとクリームの定数フィールドを宣言しなさい
    private final String JAPANBEEN = "つぶあん";
    private final String CREAM = "クリーム";


// 問6.定価100円の定数フィールドを宣言しなさい
    private final int BASE_PRICE = 100;


// 問7.フィールドを100円・つぶあんで初期化する引数なしコンストラクタを宣言しなさい
    public Taiyaki() {
        price = BASE_PRICE;
        type = JAPANBEEN;
    }


// 問8.価格とあんの種類フィールドを初期化するコンストラクタを宣言しなさい
    public Taiyaki (int price, String type){
        this.price = price;
        this.type = type;
    }


// 問9.価格を設定するsetPrice()メソッドを宣言しなさい
    public void setPrice(int price) {
        this.price = price;
    }


// 問10.価格を取得するgetPrice()メソッドを宣言しなさい
    public int getPrice() {
        return price;
    }


// 問11.あんの種類を取得するgetType()メソッドを宣言しなさい
    public String getType() {
        return type;
    }


// 問12.生産数を取得するgetCount()メソッドを宣言しなさい
    public static int getCount() {
        return count;
    }


// 問13.mainメソッドを宣言しなさい
    public static void main (String[] args) {



// 問14.たい焼きのインスタンスを生成しなさい
        Taiyaki japanBeen = new Taiyaki();
        count++;

// 問15.作ったたい焼きのあんの種類を求めなさい
        String type = japanBeen.getType();
        System.out.println("type: " + type);

// 問16.クリームたい焼きのインスタンスを生成し、価格を120円に設定しなさい
        Taiyaki cream = new Taiyaki (120, japanBeen.CREAM);
        count++;


// 問17.クリームたい焼きの価格が本当に120円か確認しなさい
        int creamPrice = cream.getPrice();
        System.out.println("creamPrice: " + creamPrice);


// 問18.配列を使って、10匹(あん5匹、クリーム5匹)のたい焼きパックを生成しなさい
        int[] pac = new int[10];
        for (int i = 0; i < pac.length; i++) {
            if (i <= 4) {
                pac[i] = japanBeen.getPrice();
            } else {
                pac[i] = cream.getPrice();
            }//if

            //System.out.print(pac[i] + " ");
            count++;
        }//for


// 問19.たい焼きパックの価格を求めなさい
        int total = 0;
        for (int price : pac) {
            total += price;
        }

        System.out.println("pacの総額: " + total);


// 問20.これまでに焼き上げたたい焼きの匹数を求めなさい
        int count = getCount();
        System.out.println("たいやき総数: " + count);

    }//main()

}//class

/*
//====== Result ======
type: つぶあん
creamPrice: 120
pacの総額: 1100 //pac[] = [100 100 100 100 100 120 120 120 120 120 ]
たいやき総数: 12

 */
