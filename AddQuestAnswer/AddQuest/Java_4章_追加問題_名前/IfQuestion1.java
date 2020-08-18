/*
 * 問題：以下の出力結果となるように、条件式を記述してください
 *
 *【出力結果】
 * checkの値を偶数(2,4,6････)に設定すると「偶数です」
 * checkの値を奇数(1,3,5････)に設定すると「奇数です」
 * と表示される
 */

public class IfQuestion1 {
	public static void main(String[] args) {
		int check = 10;	

		if(check % 2 == 0) {
			System.out.println("偶数です");
		} else if (check % == 1){
			System.out.println("奇数です");
		}//if else
	}//main()
}//class
