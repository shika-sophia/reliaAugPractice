/**
 * @title chapter12 / List12-11, 12-12 / TextPlayer
 * @content abstract / 抽象クラス
 * @author Oshika
 * @date 2020-08-26 / 1100-1200
 */
package chapter12;

abstract class Player {
    public abstract void play();

    public void loop(int n) {
        for (int i = 0; i < n; i++) {
            play();
        }//for

    }//loop()

}//class Player


public class TextPlayer extends Player{
    String text;

    public TextPlayer(String text) {
        this.text = text;
    }

    @Override
    public void play() {
        System.out.println(text);
    }

    public static void main (String[] args) {
        TextPlayer player = new TextPlayer("こんにちは");
        player.loop( 3 );

    }//main()
}//class TextPlayer

/*
//====== Result ======
こんにちは
こんにちは
こんにちは
*/