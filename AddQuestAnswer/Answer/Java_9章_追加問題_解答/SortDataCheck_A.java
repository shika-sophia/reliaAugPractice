/* ソート(並び替え)プログラム
 *
 * 【出力結果】
 *
 * 並べ替える前
 * 31 41 59 26 53 58 97 93 23 84
 *
 ************************************
 *
 * 交換1回目
 * 交換回数2回
 * 23 41 59 31 53 58 97 93 26 84
 *
 * 交換2回目
 * 交換回数2回
 * 23 26 59 41 53 58 97 93 31 84
 *
 * ＜中略＞
 *
 * 交換9回目
 * 交換回数1回
 * 23 26 31 41 53 58 59 84 93 97
 *
 ************************************
 *
 * 並び替えた総回数16回
 * 並び替えた最終結果
 * 23 26 31 41 53 58 59 84 93 97
 */

public class SortDataCheck_A {
	public static void main(String[] args) {
		
		int change = 0;	
		int change_sum = 0;

		// 決められた数値で配列を作る場合
		int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };
		/* ランダムに配列を作る場合(例:30個) 
		int[] data = new int[30];
		//ソートしたい配列データをランダムで生成(例:0～499)
		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random() * 500);
		}*/

		// 	初期状態の一覧
		System.out.println("並べ替える前");

		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}// for

		System.out.println("\n");
		System.out.println("***********************************");
		System.out.println("");

		// 配列の数字をチェックする(基本交換法、隣接交換法)
		for (int i = 0; i < data.length - 1; i++) {
			// 順番に比較していく
			for (int j = i + 1; j < data.length; j++) {
				// 小さい数字が見つかった段階で交換を行う
				if (data[i] > data[j]) {
					// 数字の交換
					int a = data[i];
					data[i] = data[j];
					data[j] = a; 
					// 交換回数をチェックする
					change++;
				}// if
			}// for(内側1)

			// 交換後の状態表示
			System.out.println("交換" + (i + 1) + "回目");
			System.out.println("交換回数" + change + "回");

			for (int k = 0; k < data.length; k++) {
				System.out.print(data[k] + " ");
			}// for(内側2)

			System.out.println("\n");
			change_sum += change;
			change = 0;// 交換回数のリセット

		}// for(外側)
	
		//最終結果の表示
		System.out.println("***********************************");
		System.out.println("");
		System.out.println("並び変えた総回数" + change_sum + "回");
		System.out.println("並べ替えた最終結果");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}// for

		System.out.println("");

	}// main

}// class