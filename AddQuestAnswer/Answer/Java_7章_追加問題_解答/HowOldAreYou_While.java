import java.io.*;

public class HowOldAreYou_While {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name = "";		// 入力された名前を格納
		int age = 0;			// 入力された年齢を格納
		boolean flag1 = true;	// 名前入力表示切替用
		boolean flag2 = true;	// 年齢入力表示切替用

		try {

			// 空文字･スペースが入力された場合にループするwhile文
			do {
				if (flag1) {// 初回入力時はflag1がtrueなのでこちらを表示
					System.out.println("名前を入力してください。");
					flag1 = false;// エラー時の再入力のためにflug1の切り替え
				} else {// 再入力時はこちらを表示
					System.out.println("入力エラー:何も入力されていないか");
					System.out.println("　　　　　 先頭にスペースが入っています");
					System.out.println("もう一度名前を入力してください。");
				}
				name = reader.readLine();
			// スコープに注目
			} while (name.length() == 0 || name.charAt(0) == ' ' || name.charAt(0) == '　');

			System.out.println("\n" + name + "さん、こんにちは。年齢を入力してください。");
			age = Integer.parseInt(reader.readLine());	// 変数を使用しない省略した書き方

		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			age = -1;		// 次のwhileループ(再入力要求)の条件を満たす為の処理
			flag2 = false;	// 再入力要求時の表示切替用の処理
		}// try～catch

		// 入力された年齢の値がマイナスの場合にループするwhile文
		while (age < 0) {

			try{
				// 表示切替処理
				if (flag2) {	// マイナス年齢を入力しているとtrue
					System.out.println("\n年齢がマイナスになっています\n再入力してください");
				} else {	// エラー発生時にはこちらを通る
					System.out.println("\n年齢を数字で入力してください。");
					flag2 = true;	//次にマイナス値を入力された場合の表示切替処理
				}// try～else

				age = Integer.parseInt(reader.readLine());// 再入力用

			} catch (IOException e) {
				System.out.println(e);
			} catch (NumberFormatException e) {
				flag2 = false;	// 再入力要求時にelseを通らせるための処理
			}// try～catch

		}// while

		System.out.println("\n10年後の" + name + "さんは、" + (age + 10) + "歳ですね。");

	}//main

}//class