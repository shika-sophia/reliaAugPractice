/*
 * 問題：以下のプログラムを読み、出力結果がどのようになるか予測してください
 *
 * 補足：「+=」とは左辺に対して右辺の値を足し込むという意味です。
 *		「sum += 3」は「sum = sum + 3」と同じ意味になります。
 */

public class ForQuestion1 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 5 ;i++) {

			switch(i) {
			case 1:
				sum += 3;
				break;

			case 3:
				sum += 3;
				break;

			default:
				sum++;
			}// switch
			
			if(i % 2 == 0) {
				sum += 10;
			}// if
			
			System.out.println(sum);
		}// for

	}// main
}// class