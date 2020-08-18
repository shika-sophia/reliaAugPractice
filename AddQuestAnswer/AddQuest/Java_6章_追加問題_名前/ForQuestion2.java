/*
 * 問題：以下のプログラムを読み、出力結果がどのようになるか予測してください
 */

public class ForQuestion2 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 3 ;i++) {

			for(int j = 1; j <= 3; j++) {
				sum += i * j;
			}// 内側のfor

		}// 外側のfor
		
		System.out.println(sum);
	}// main
}// class