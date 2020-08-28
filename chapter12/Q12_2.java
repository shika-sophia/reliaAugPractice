/**
 * @title chapter12 / Additional Quest / Q12_2
 * @class super abstract: Bird
 * @class sub: Chickin*
 * @class sub: Parrot
 * @class execute: Q12_2
 *
 * @author Oshika
 * @date 2020-08-28 / 1300-
 */
/*
    1.鳥のクラス、Birdを作成してください。
        名前フィールド、名前のSetter、名前のGetter、鳴き声のsingメソッドを持たせること。
    2.抽象クラスBirdから派生するニワトリのクラスChickenとオウムのクラスのParrotを作成してください。
        なお、Chickenには品種のString型のbreedsと、Parrotにはint型のsizeフィールドを追加してください。
    3.上記のクラスを実行するクラスを作成し、名前と鳴き声を呼び出してください。
        その際、Bird型の配列を使って、for文で出力してください。
*/
package chapter12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Bird{
    private String name;

    Bird(String name){
        setName(name);
    }

    abstract String sing();

    @Override
    public String toString() {
        return String.format("◆名前は %s です。\n", getName());

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}//abstract class Bird


class Chicken extends Bird{
    private final String BIRD_TYPE = "ニワトリ";
    private String breeds; //品種

    public Chicken(String name, String breeds) {
        super(name);
        setBreeds(breeds);

    }

    public String getBreeds() {
        return breeds;
    }

    public void setBreeds(String breeds) {
        this.breeds = breeds;
    }

    public String getBIRD_TYPE() {
        return BIRD_TYPE;
    }

    @Override
    public String sing() {
        String sing = "";

        Scanner scn = new Scanner(System.in);

        for ( ; ; ) {
            System.out.println("いま何時ですか？[4 ～ 9 時だと鳴き声が変わります] ");
            String line = scn.nextLine();
            int inputTime = 0;

            try {
                inputTime = Integer.parseInt(line);

            } catch (NumberFormatException e ) {
                System.out.println("数字で入力して下さい");
                continue;

            }

            if (inputTime < 0 || inputTime > 24 ) {
                System.out.println("0 ～ 24の数字を入力して下さい");
                continue;

            } else if (inputTime >= 4 && inputTime <= 9 ) {
                sing = super.getName() + ": コーッケコッコーーォ \n";
                break;

            } else {
                sing = super.getName() + ": コッコッ クゥワ コッコッ \n";
                break;

            }

        }//for loop

        return sing;

    }//sing()

    @Override
    public String toString() {
        return String.format("%s%s(品種: %s)です。 \n",
            super.toString(), getBIRD_TYPE(), getBreeds());

    }//toString()

}//class Chicken


class Parrot extends Bird{
    private final String BIRD_TYPE = "オーム";
    private int size; //サイズ

    public Parrot(String name, int size) {
        super(name);
        setSize(size);

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBIRD_TYPE() {
        return BIRD_TYPE;
    }

    @Override
    public String sing() {
        String sing = "";
        int size = getSize();

        Scanner scn = new Scanner(System.in);
        List<String> inputList = new ArrayList<>();

        int count = 0;

        loop:
        for ( ; ; ) {
            System.out.println("何か話かけてください。[何回か同じ言葉を入れると覚えます] ");
            String line = scn.nextLine();

            inputList.add(line);

            if (size >= 3) {
                sing = super.getName() + ": " + line;
                break loop;

            } else if (size < 2) {

                if (count >= 2) {
                    for(int i = 1; i < inputList.size(); i++) {
                        //---- 連続で同じ言葉の場合、覚える ----
                        if (inputList.get(i).equals(inputList.get(i - 1))) {
                            sing = super.getName() + ": " + line;
                            break loop;
                        }
                    }//for

                }

                //---- 覚えてないとき ----
                System.out.printf("%1$s: %1$s です \n", super.getName());
                count++;
            } //if size

            size++;
        }//for loop

        scn.close();
        return sing;

    }//sing()

    @Override
    public String toString() {
        return String.format("%s%s(サイズ: %d)です。 \n",
            super.toString(), getBIRD_TYPE(), getSize());
    }//toString()

}//class Parrot


public class Q12_2 {
    public static void main (String[] args) {

        Bird[] bird = new Bird[]{
            new Chicken("鶏媛", "姫路城地鶏"),
            new Parrot("Ｐちゃん", 0),
        };

        for (int i = 0; i < bird.length; i++) {
            System.out.println(bird[i].toString());
            System.out.println(bird[i].sing());
        }

    }//main()
}//class

/*
//====== Result ======
◆名前は 鶏媛 です。
ニワトリ(品種: 姫路城地鶏)です。

いま何時ですか？[4 ～ 9 時だと鳴き声が変わります]
５
鶏媛: コーッケコッコーーォ

いま何時ですか？[4 ～ 9 時だと鳴き声が変わります]
10
鶏媛: コッコッ クゥワ コッコッ


◆名前は Ｐちゃん です。
オーム(サイズ: 0)です。

何か話かけてください。[何回か同じ言葉を入れると覚えます]
おはよう
Ｐちゃん: Ｐちゃん です

何か話かけてください。[何回か同じ言葉を入れると覚えます]
おはよう
Ｐちゃん: Ｐちゃん です

何か話かけてください。[何回か同じ言葉を入れると覚えます]
おはよう

何か話かけてください。[何回か同じ言葉を入れると覚えます]
おはよう
Ｐちゃん: おはよう


【考察】
おぉ、Ｐちゃんが、覚えた。

今回は @Override toString()も使ってみた。
お題の Bird配列で２つのインスタンスを呼び出してる。
Q12_1 はキャストしたけど、こっちはキャストなしでいけるんだ。

ちなみにＰちゃんは２回目で覚えるはずだけど、なんか４回掛かるなぁ。
いろいろ考えたけど解らん。本題じゃないから、この辺にしておこう。
*/
