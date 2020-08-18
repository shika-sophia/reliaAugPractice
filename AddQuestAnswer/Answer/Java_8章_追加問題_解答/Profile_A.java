/*
 * 以下のプログラムを完成させてください
 *
 * int型とString型の引数をもつ、戻り値のないメソッドを宣言してください。(記述欄②)
 * また、「"Yuki"、36」でメソッドを呼び出してください。(記述欄①)
 * なお、メソッドの命名は自由とします。
 */

public class Profile_A {
	public static void main(String[] args) {

		// ▽記述欄① ここから
		// showProfileメソッドの呼び出し
		showProfile(36, "Yuki");
		// △記述欄① ここまで

	}// main

	// 戻り値なしのshowProfileメソッド
	// ▽記述欄② ここから
	public static void showProfile(int age, String name) {
		System.out.println(name + "さんは" + age + "歳です。");
	}// showProfile
	// △記述欄② ここまで

}// class