import java.io.*;

public class GridShow2 {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		// グリッド表示範囲
		int width = 8;
		int height = 4;
		// ○の初期座標
		int x = 3;
		int y = 1;

		try{
			// 入力なしでENTERを押すまでループする
			do{
				System.out.println("\n↑8　↓2　←4　→6");
				System.out.println("方向を数字で入力してください");
				System.out.println("入力無しENTERで終了\n");
				// 4行分の表示をするforループ
				for (int i = 0; i < height; i++) {
					// 8列分の表示をするforループ
					for (int j = 0; j < width; j++) {
						// ○と■を表示するためのif文
						if (i == y && j == x) {
							System.out.print("○");
						} else {
							System.out.print("■");
						}// if
					}// for2
					System.out.println("");
				}// for1
				line = reader.readLine();
				// 移動を管理するswitch文(if文は回り込み処理)
				switch (line) {
				case "↓":
				case "2":
					y++;
					if (y >= height) {
						y = 0;
					}
					break;

				case "←":
				case "4":
					x--;
					if (x < 0) {
						x = (width - 1);
					}
					break;

				case "→":
				case "6":
					x++;
					if (x >= width) {
						x = 0;
					}
					break;

				case "↑":
				case "8":
					y--;
					if (y < 0) {
						y = (height - 1);
					}
					break;

				case "":// 空文字の場合は何もしない
					break;
					
				default:// 入力が間違っている場合に表示
					System.out.println("入力が正しくありません。");
					break;
				}// switch
			// do-while文の条件式	
			} while (!line.equals(""));// 空文字でない限り回る

			System.out.println("お疲れ様でした。");
		} catch (IOException e) {
			System.out.println(e);
		} catch (NullPointerException e) {
			System.out.println("終了します。");
		}// try～catch

	}// main

}// class