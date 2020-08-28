/**
 * @title chapter12 / Additional Quest / HumanEx
 * @class super: Human
 * @class sub: HumanHobby
 * @class execute: HumanEx
 *
 * @author Oshika
 * @date 2020-08-26 / 1630-1800
 */
/*
 * 【練習問題】
 * 以下のクラス「Human」を拡張したクラスを解答欄①に宣言し、
 * 実行クラス「HumanEx」の解答欄②で自己紹介を出力してください。
 * ただし、以下の要件を満たしてください。
 *
 * 1. 拡張したクラスでフィールドを追加してください。
 * 	（フィールドの内容は問いません。自由に宣言してください。）
 * 2. showProfileメソッドをオーバーライドしてください。
 * 3.「HumanEx」の自己紹介メソッド「introduce」を利用してください。
 */
package chapter12;

class Human {

    private String name;
    private int age;

    Human() {
        this("No Name", 0);
    }
    Human(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void showProfile() {
        System.out.println("私の名前は " + this.name + " で、" + this.age + " 歳です。");
    }

}// Human


// 以下に拡張したクラスを宣言する
// ▽解答欄① ここから
class HumanHobby extends Human {
    String hobby;
    String author;
    String tvHuman;

    HumanHobby(){
        this("","","");
    }

    HumanHobby(String hobby, String author, String tvHuman){
        super("ソフィア", 24);
        this.hobby = hobby;
        this.author = author;
        this.tvHuman = tvHuman;
    }

    @Override
    public void showProfile() {
        super.showProfile();
        System.out.printf("  私の趣味: %s \n  好きな作家: %s \n  好きな芸能人: %s \nです。",
            hobby, author, tvHuman);
    }

}//HumanHobby
// △解答欄① ここまで


// 実行クラス(拡張したクラスのインスタンスを使用する)
public class HumanEx {

    public static void main(String[] args) {

        // ▽解答欄② ここから
        HumanHobby hb = new HumanHobby("美の追究","司馬遼太郎","明石家さんま");

        if (hb instanceof Human) {
            Human human = (Human) hb;
            introduce(human);

        } else {
            System.out.println("Error: このインスタンスは Humanと継承関係にありません");
        }

        // △解答欄② ここまで

    }// main

    // 自己紹介メソッド
    static void introduce(Human human) {
        human.showProfile();

    }// introduce

}// HumanExnEx

/*
//====== Result ======
私の名前は ソフィア で、24 歳です。
私の趣味: 美の追究
好きな作家: 司馬遼太郎
好きな芸能人: 明石家さんま
です。


【考察】
一発で出たことに自分でビックリ。

あっアップキャスト(sub -> supper)だから if文 要らんかったような。

human.showProfile();なのに、@Override側のメソッドが呼び出されるのは
アップキャストして変数型はHuman型 humanでも、
このmain()でインスタンスしたのは HumanHobbyだからオブジェクトの型は HumanHobbyのまま
呼び出されるメソッドは、オブジェクト型の@Overrideのほう。

って、どこかで習った あれか。ここが一番ややこしい。
*/

