/**
 * @title chapter11 / Practice11-1 ～11-5
 * @contents 'class' and 'instance'
 * @author Oshika
 * @date 2020-08-24 / 1030-1200
 */

package chapter11;

/*
//====== Practice 11-1 ======
1. × 'A'は Stringのインスタンス -> char型
2. 〇 自分でクラスを作れる
3. × クラスは必ずフィールドとメソッドを持つ
          -> フィールドないのあるし、コンストラクターはメソッドないのもあるし
          (答え)あっクラスか。私のコンストラクターの記述、間違い

4. 〇 クラスは大文字始まり。Pascal記法,UpperCamelCase記法といいます。
5. 〇 newはインスタンスを作る予約語。記憶領域を確保するんだって結城氏が言ってた
6. × メソッドは必ずreturnを含む -> voidはないよ。こなだも聞いてた。
7. 〇 コンストラクターの名前はクラス名と同じ
8. 〇 メソッドの仮引数はフィールドと同じにできる。
           (答え)フィールド名であることを明示するため
           「this.name = name」とthisを使う

9. 〇 引数を持つコンストラクタも作れる
10. × コンストラクタの戻り値はそのクラスのインスタンス
          -> 戻り値は持たない。voidでもない。

//====== Practice 11-2 ======
問 Rectangle r = Rectangle(); でコンパイルエラーなぜか？

「new」がないから。
題意の式は rに Rectangle()メソッドの結果を代入という式になってる。
コンストラクタはインスタンス時に実行されるから「new」のないRectangle()は
コンストラクタでもない。

//====== Practice 11-3 ======
識別子の識別
class A {
  int a = 123; //インスタンスフィールド
  static int b = 456; //クラスフィールド

  int c (int d) { // c()インスタンスメソッド / d 仮引数
        int e = 1;  //局所変数
        return a + d + e;
  }// c()

  static int f (int g){ //f() クラスメソッド / g 仮引数
        int h = 789;      //局所変数
        for (int i = 0; i < h; i++){ //局所変数
            g++
        }//for
  }// f()
//class

 //====== Practice 11-4 ======
問 コンパイルエラーはなぜか？
class Point {
    int x;
    int y;

    static void setPosition (int x, int y){
        this.x = x;
        this.y = y;
    }
}

staticメソッド内で「this」を使っているから。
staticからインスタンスフィールドは参照できません。
参照させたければフィールドにもstaticを付ける。
 */

//====== Practice 11-5 ======
/*
public class GamePlayer {
    public static String playerName;
    private static final int PLAYER_NUM = 3;

    public GamePlayer(String name) {
        playerName = name;
    }//GamePlayer()

    @Override
    public String toString() {
        return String.format("[player: %s ]", playerName);
    }//toString()


    public static void main(String[] args) {
        GamePlayer[] player = new GamePlayer[PLAYER_NUM];
        player[0] = new GamePlayer("Mad Hatter");
        player[1] = new GamePlayer("March Hare");
        player[2] = new GamePlayer("Alice");

        for(int i = 0; i < player.length; i++) {
            System.out.println(player[i]);
        }//for i

    }//main()

}//class
*/
/*
//====== Result ======
●修正前
[player: Alice ]
[player: Alice ]
[player: Alice ]

【考察】toString()が参照しているのは上のフィールドで
 player[2] = new GamePlayer("Alice");の時点で以後
 public static String playerName;の値はずっと"Alice"
 よってfor文で回しても"Alice"の３連続
   ↓
 解決策は player[0] ～ player[2]のインスタンスを配列に代入する式を
 for文の中に入れ、インスタンスしたらすぐprint、またインスタンスしたらprintにする

  */
public class GamePlayer {
    public static String playerName;
    private static final int PLAYER_NUM = 3;

    public GamePlayer(String name) {
        playerName = name;
    }//GamePlayer()

    @Override
    public String toString() {
        return String.format("[player: %s ]", playerName);
    }//toString()


    public static void main(String[] args) {
        GamePlayer[] player = new GamePlayer[PLAYER_NUM];

        String[] name = new String[] {"Mad Hatter","March Hare","Alice"};

        for(int i = 0; i < player.length; i++) {
            player[i] = new GamePlayer(name[i]);

            System.out.println(player[i]);

        }//for i

    }//main()

}//class

/*
〇修正後
[player: Mad Hatter ]
[player: March Hare ]
[player: Alice ]

(答え)おぉフィールドのstaticを外すだけやった。
奥が深いのう。
ああ、インスタンスフィールドならnewの度に新しいインスタンスを複数作るんだ。
クラスフィールドだと１個しかないから上書きされると。なるほど納得。
*/
