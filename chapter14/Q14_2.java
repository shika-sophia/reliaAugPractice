/**
 * @title chapter14 / Additonal Quest / Q14_2
 * @content Interface
 *
 * @interface Wearable
 * @class Headphone implements Wearable
 * @class Power implements Wearable
 * @class PortableMediaPlayer implements Wearable
 * @execute class Q14_2
 *
 * @author Oshika
 * @date 2020-09-01 / 1530-1700
 */
/*
    以下のプログラムを作成してください

    条件
    ・「付ける・外す/電源を入れる・消す」を表すonとoffというメソッドを持つインターフェースWerableを作成してください
    ・Wearableを実装したHeadphoneクラスを作成
    ・Wearableを実装したPortableMediaPlayerクラス（引数からボリュームの調整をするメソッドを持つ）を作成
    ・実行クラスを作成。それぞれの「付ける・電源を入れる」メソッドを配列を利用して呼び出して下さい。
    ・PortableMediaPlayerのボリュームを調整してみてください。


    [実行例]
    ヘッドホンを付けました。
    音楽プレーヤーの電源をオンにしました。
    ボリュームを10に変更しました。
    ヘッドホンを外しました。
    音楽プレーヤーの電源をオフにしました。

*/
package chapter14;

import java.util.InputMismatchException;
import java.util.Scanner;


interface Wearable {
    public abstract String onOff(int io);
}

class Headphone implements Wearable {

    @Override
    public String onOff(int io) {
        String move = "";

        if (io == 0) {
            move = "ヘッドホンを外しました";
        } else if (io == 1) {
            move = "ヘッドホンを付けました";
        }
        return move;
    }//onOff()

}//class Headphone


class Power implements Wearable{

    @Override
    public String onOff(int io) {
        String move = "";

        if (io == 0) {
            move = "電源を消しました";
        } else if (io == 1) {
            move = "電源を付けました";
        }
        return move;

    }//onOff()

}//class Power


class PortableMediaPlayer implements Wearable{

    @Override
    public String onOff(int io) {

        String move = String.format("ボリュームを%dにしました", io);

        return move;

    }//onOff()

}//class PortableMediaPlayer


public class Q14_2 {
    public static void main(String[] args) {
        //---- instance array definition ----
        Wearable[] device = new Wearable[] {
            new Headphone(),
            new Power(),
            new PortableMediaPlayer(),
        };

        //---- print ON ----
        int io = 1;//onOff(io) on = 1, off = 0
        System.out.println(device[0].onOff(io));
        System.out.println(device[1].onOff(io));

        //---- print volume ----
        try(Scanner scn = new Scanner(System.in)){

            System.out.print("ボリュームをいくつにしますか？");
            io = scn.nextInt();

        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

        System.out.println(device[2].onOff(io));

        //---- print OFF ----
        io = 0;//onOff(io) on = 1, off = 0
        System.out.println(device[0].onOff(io));
        System.out.println(device[1].onOff(io));

    }//main
}//class Q14_2

/*
//====== Result ======
ヘッドホンを付けました
電源を付けました
ボリュームをいくつにしますか？10
ボリュームを10にしました
ヘッドホンを外しました
電源を消しました


【考察】
一応、問題の要件は全て満たしつつ、
インターフェース abstractしかない。
これでいいのか。フィールドとか使ったほうがいいのか。

enum Move {
    DEVICE_ON(0, "を付けました"),
    POWER_ON(1, "電源を入れました"),
      :
      :
};も考えてみたのだけど

複雑なフィールド定義のわりには場合分けが多くて、
結局、各メソッドで条件分岐とString定義したほうが解りやすいと思い
今のスタイルに

各メソッドで print 出さなかったのは
interfaceで 戻り値 Stringにしたし、
なんか、もっとうまいことできそうな気もして
結局、たくさん同じことを書いてしまった・・

*/