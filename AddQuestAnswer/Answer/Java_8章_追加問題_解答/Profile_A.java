/*
 * 以下のプログラムを完成させてください
 *
 * int型とString型の引数をもつ、戻り値のないメソッドを宣言してください。(記述欄�A)
 * また、「"Yuki"、36」でメソッドを呼び出してください。(記述欄�@)
 * なお、メソッドの命名は自由とします。
 */

public class Profile_A {
	public static void main(String[] args) {

		// ▽記述欄�@ ここから
		// showProfileメソッドの呼び出し
		showProfile(36, "Yuki");
		// △記述欄�@ ここまで

	}// main

	// 戻り値なしのshowProfileメソッド
	// ▽記述欄�A ここから
	public static void showProfile(int age, String name) {
		System.out.println(name + "さんは" + age + "歳です。");
	}// showProfile
	// △記述欄�A ここまで

}// class