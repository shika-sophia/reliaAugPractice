/*
	キーボードから入力された挨拶に対応する文字列を返却するメソッドを定義して、結果を画面に出力してください。

	おはよう　→ Good morning
	こんにちは　→　Good afternoon
	こんばんは　→　Good evening
	その他　→　対応していません。
*/

import java.io.*;

public class Q8_2_A{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("入力された挨拶を翻訳します");
		try{
			String s = reader.readLine();
			s = translation(s);
			System.out.println(s);
		}catch(IOException e){
			System.out.println(e);
		}
	}

	public static String translation(String s){

		if(s.equals("おはよう")) {
			s = "Good morning";
		}else if (s.equals("こんにちは")){
			s = "Good afternoon";
		}else if (s.equals("こんばんは")){
			s = "Good evening";
		}else {
			s = "その挨拶には対応していません";
		}
		
		return s;
	}
}