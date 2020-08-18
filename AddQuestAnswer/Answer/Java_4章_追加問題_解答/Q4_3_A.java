/*
	上巻のp170を参照してください。

	equalsメソッドを使って、入力された文字列が「おはようございます」だった場合、「おはようございます」と返すプログラムを作成してください。
	また、else ifを用いて、「こんにちは」だった場合は「こんにちは」、「こんばんは」だった場合は「こんばんは」、
	その他だった場合は、「さようなら」と表示する機能を持たせてください。

	[解答例]
	挨拶を入力してください。
	↓
	（入力）
	↓
	こんにちは
	

*/


import java.io.*;

public class Q4_3_A{
	public static void main(String[] args){

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try{
			System.out.println("挨拶を入力してください");

			String line = reader.readLine();
			
			if(line.equals("おはようございます")) {
				System.out.println("おはようございます");
			}else if (line.equals("こんにちは")) {
				System.out.println("こんにちは");
			}else if (line.equals("こんばんは")) {
				System.out.println("こんばんは");
			}else {
				System.out.println("さようなら");
			}

		}catch(IOException e){
			System.out.println(e);
		}
	}
}