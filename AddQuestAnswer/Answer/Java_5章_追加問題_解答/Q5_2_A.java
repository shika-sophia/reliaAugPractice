/*
	入力された数値が7か8だった場合、「夏休みです」と表示するプログラムを作ってください。

	条件：System.out.println("夏休みです");は、【一回】しか使わないようにしてください。

	[実行例]
	(7 or 8)
	夏休みです

	(それ意外)
	夏休みではありません

	(整数値以外)
	数字を入力してください。

*/

import java.io.*;

public class Q5_2_A{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("何月ですか？");
		try{
			String line = reader.readLine();
			int month = Integer.parseInt(line);
			
			switch(month){
			case 7:
			case 8:
				System.out.println("夏休みです");
				break;

			default:
				System.out.println("夏休みではありません。");
				break;
			}
			
		}catch(IOException e){
			System.out.println(e);
		}catch(NumberFormatException e){
			System.out.println("数字を入力して下さい。");
		}
	}
}