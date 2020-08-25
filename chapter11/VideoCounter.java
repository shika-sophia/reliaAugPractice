/**
 * @title chapter11 / Additional Quest / Q11_2 -> refact to VideoCounter
 * @see VideoPlayer
 * @author Oshika
 * @date 2020-08-25 / 1030-1400
 */
/*
    ビデオテープのクラスを作成してください。
    クラスには、以下のメンバを持たせてください。

    フィールド
        String
            ビデオのタイトル
            商品番号
        double
            収録時間
            一時停止した時間
            残り時間

    メソッド
        SetterとGetter

        タイトル・商品番号・収録時間を表示するメソッド
        残りの時間を取得する
        指定した分数早送りするメソッド
        巻き戻して現在の時間と残り時間をリセットするメソッド

    コンストラクタによる生成時には、フィールドに与えたタイトル、商品番号、収録時間を引数から設定する。
    なお、一時停止した時間は0、残り時間は収録時間と同じになるようにSetterを使って設定してください。

    また、別クラスのmainメソッドから、ビデオテープのインスタンスを生成して、メソッドを呼び出してください。


    [実行例]
    タイトル : 七人の侍
    商品番号 : KUROSAWA-1954
    収録時間 : 207.0
    現在の時間: 0.0
    残り時間: 207.0

    50.2分早送りします

    タイトル : 七人の侍
    商品番号 : KUROSAWA-1954
    収録時間 : 207.0
    現在の時間: 50.2
    残り時間: 156.8

    返却用に最初まで巻き戻します

    タイトル : 七人の侍
    商品番号 : KUROSAWA-1954
    収録時間 : 207.0
    現在の時間: 0.0
    残り時間: 207.0

*/
package chapter11;

public class VideoCounter {
    private String title;
    private String id;
    private double wholeTime;
    private double useTime;
    private double restTime;

    public VideoCounter () {}

    public VideoCounter (String title, String id, double wholeTime){
        this.title = title;
        this.id = id;
        this.wholeTime = wholeTime;
    }


    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public double getWholeTime() {
        return wholeTime;
    }

    public double getUseTime() {
        return useTime;
    }

    public void setUseTime(double useTime) {
        this.useTime = useTime;
    }

    public double getRestTime() {
        return restTime;
    }

    public void setRestTime(double useTime) {
        this.restTime = wholeTime - useTime;
    }
}//class

