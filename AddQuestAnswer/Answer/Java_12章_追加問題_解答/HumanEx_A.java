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
class MyData extends Human {

	// フィールドの追加
	private String hobby;

	// コンストラクタ
	MyData(String name, int age, String hobby) {
		super(name, age);	// スーパークラスのコンストラクタの呼び出し
		setHobby(hobby);	// Setterの呼び出し
	}

	// 趣味の設定
	void setHobby(String hobby) {
		this.hobby = hobby;
	}

	// 趣味の取得
	String getHobby() {
		return this.hobby;
	}

	// 自己紹介のオーバーライド
	@Override
	public void showProfile() {
		super.showProfile();// スーパークラスの同名のメソッドの呼び出し
		System.out.println("趣味は" + getHobby() + "です。");
	}

}// MyData
// △解答欄① ここまで


// 実行クラス(拡張したクラスのインスタンスを使用する)
public class HumanEx_A {

	public static void main(String[] args) {

		// ▽解答欄② ここから
		// 自己紹介メソッドにインスタンスを渡す
		introduce(new MyData("北川", 34, "ゲーム"));
		// △解答欄② ここまで

	}// main

	// 自己紹介メソッド
	static void introduce(Human human) {
		human.showProfile();

	}// introduce

}// HumanExnEx