/*
 *	次のプログラムの実行結果を予想してください。
 */

public class IfQuestion2 {
	public static void main(String[] args) {
		String str;
		boolean bln1 = (1 < 5);
		boolean bln2 = false;

		if (bln1) {
			if (bln1 || bln2 != false) {
				str = "White";
			} else {
				str = "Black";
			}
		} else {
			if (bln1 || bln2 != false) {
				str = "Red";
			} else {
				str = "Blue";
			}
		}

		System.out.println(str);
	}
}
