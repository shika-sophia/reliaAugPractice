/**
 * @title chapter14 / Practice 14-1 ～ 14-5 / MyMediaPlayable
 * @content Interface
 *
 * @interface MyMediaPlayable
 *
 * @author Oshika
 * @date 2020-09-01 / 1300-
 */
/*
//====== Prctice 14-1 ======
(1) 〇 インターフェイスはインスタンス不可
(2) × インターフェース型の変数不可 -> 作れる
(3) 〇 予約語 interface
(4) × 実装 extends -> implements
(5) × インターフェースのメソッドは本体を持つこともある -> abstractのみ
(6) × インターフェースのフィールドは代入不可
        -> static finalだけど、コンストラクターから初期化するときに代入できる
        -> 初期化後は、変更不可
(7) × インターフェイスの実装は１つのみ
        -> 多重継承可、いくつでも可

//====== Practice 14-2 ======
問 super class: Alpha,
   interface Beta, Gamma
   Deltaの宣言

public class Delta extends Alpha implements Beta, Gamma {

}

//====== Practice 14-3 ======
public interface IconInfo {
    public static final int ICON_16x16 = 1;
    public static final int ICON_16x32 = 2;

    public abstract Image getIcon(int iconType);

}//interface IconInfo

//====== Practice 14-4 ======
 */
package chapter14;

public interface MyMediaPlayable {
    public abstract void play();
    public abstract void stop();
    public abstract void loop();
}

interface MySoundPlayable extends MyMediaPlayable {
    public abstract String getSoundName();
}

/*
//====== Practice 14-5 ======
問 抽象クラスとインターフェイスの類似点と相違点

＊類似点
抽象クラス, インターフェイスともに abstract抽象メソッドを持ち
実装される各クラスの雛型もしくは設計図のような存在

＊相違点
一番の違いはインターフェイスが多重継承を認めていること。

抽象クラスで定義されたabstractメソッドは、
継承時に@Overrideすることを強制し、それがゆえに設計図として機能していたが
継承した子クラスでは必要のないメソッドも形式的にでも@Overrideする必要があった。
使わないのにダミー的な記述をするのは無駄である。
また、継承の枠組みなので、単一継承のみしか認められないのは不便である。

その点、機能別にインターフェイスを定義していれば、
クラスで必要なメソッドだけを持つインターフェイスをいくつでも
多重継承することが可能になった。

*/