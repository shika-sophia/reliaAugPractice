/*
	キーボードからいくつかの整数値を受け取って、それらを足していくプログラムを作成してください。
	いくつの整数値を受け取るか指定されるようにプログラムしてください。
	
	条件
	0が入力された場合、値の受け取りを終了すること（breakを利用してください)


[実行例]

整数を加算します。
何個加算しますか：3

整数(0で終了)：10
整数(0で終了)：48
整数(0で終了)：0
58です。

*/

import java.io.*;

public class Q6_3_A{
	public static void main(String[] args){
		System.out.println("整数を加算します。");
		System.out.print("何個加算しますか？：");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line = reader.readLine();
			int quan = Integer.parseInt(line); //加算する個数
			System.out.println();
			int sum = 0; //合計値
			for(int i = 0; i < quan; i++){
				System.out.print("整数(0で終了)：");
				line = reader.readLine();
				int num = Integer.parseInt(line);
				if(num == 0){
					break; //for文から抜け出る
				}
				sum += num;
			}
			System.out.println(sum + "です。");
		}catch(IOException e){
			System.out.println(e);
		}catch(NumberFormatException e){
			System.out.println("入力が正しくありません");
		}
	}
}