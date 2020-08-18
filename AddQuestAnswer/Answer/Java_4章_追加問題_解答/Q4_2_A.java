/*
	キーボードから入力されたサイズを分岐させて、

	19以下 ワカナ
	20以上～40未満 ツバス
	39より大きい～59以下 ハマチ
	60～79 メジロ
	80以上 ブリ

	という条件で、出世魚の名前を出力するプログラムを作成してください。

	[解答例]
	魚のサイズを入力してください
	↓
	79
	↓
	メジロ
*/

import java.io.*;

public class Q4_2_A{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.print("魚のサイズを入力してください：");
			String line = reader.readLine();
			int size = Integer.parseInt(line);
				
			if(0 <= size && size < 20){
				System.out.println("ワカナ");
			}else if(20 <= size && size < 40){
				System.out.println("ツバス");
			}else if(40 <= size && size < 60){
				System.out.println("ハマチ");
			}else if(60 <= size && size < 80){
				System.out.println("メジロ");
			}else if(80 <= size){
				System.out.println("ブリ");
			}	
		}catch(IOException e){
			System.out.println(e);
		}catch(NumberFormatException e){
			System.out.println("入力が正しくありません");
		}
	}
}