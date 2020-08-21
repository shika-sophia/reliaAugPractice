/*
 *【上巻確認問題5】
 * 以下の条件を満たすプログラムを完成させてください。
 *
 * 以下のプログラムはアパートの各部屋の住人の数を出力するものです。
 * 配列apartmentHouseは、apartmentHouse[階][部屋番号]で
 * あるアパートの各部屋の住人の数を表しています。
 * このアパートの各部屋の住人の数を出力例のような形式
 * （0人のときは「空室」と表示することに注意）で
 * 表示するようにプログラムを完成させてください。
 * ※101号室ではなく、11号室のようにならないよう注意して下さい。
 *
 *【実行結果】
 * 101号室: 1人
 * 102号室: 1人
 * 103号室: 1人
 * （中略）
 * 312号室: 空室
 * 313号室: 2人
 * 314号室: 3人
*/

// メソッドを使用した解答例1
public class Kadai5_A1 {
	public static void main(String[] args) {

		// あるアパートの各階の各部屋の住人の数
		int[][] apartmentHouse = {
			{ 1, 1, 1, 2, 1, 1, 2, 2, 0, 0, 3, 2, 2, 1 },
			{ 2, 2, 2, 1, 1, 1, 0, 0, 0, 1, 3, 0, 3, 2 },
			{ 1, 1, 1, 1, 2, 2, 2, 2, 3, 2, 1, 0, 2, 3 },
		};

		// 階を管理するforループ。
		for (int floorIndex = 0; floorIndex < apartmentHouse.length; floorIndex++) {

			// 部屋を管理するforループ。
			for (int roomIndex = 0; roomIndex < apartmentHouse[floorIndex].length; roomIndex++) {
				// XYZ号室の階に当たるXの部分の表示。
				System.out.print(floorIndex + 1);// 0・1・2階と表示されるのを1・2・3階にするため
				
				// 部屋番号が1桁の時はXYZ号室のYの部分に0を表示。
				if (roomIndex < 9) {
					System.out.print("0");
				}// if1
				
				// 部屋番号を表示するメソッドの呼び出し。
				display(roomIndex);
				
				// 部屋ごとの入居者数を判定するif文
				if (apartmentHouse[floorIndex][roomIndex] > 0) {
					// 空室でない場合は人数を表示。
					System.out.print(apartmentHouse[floorIndex][roomIndex]);
					System.out.println("人");
				} else {
					// 空室の場合は空室と表示。
					System.out.println("空室");
				}// if2

			}// for(内側)

		}//for(外側)

	}// main

	// 部屋番号を表示するメソッド
	public static void display(int roomIndex) {
		System.out.print(roomIndex + 1);
		System.out.print("号室: ");
	}// display

}//class