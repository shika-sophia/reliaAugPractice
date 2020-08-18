/* while文とdo while文の動作比較
* 一見同じように見えますが、動作の違いを確認して下さい。
*/

public class DoWhileTest {
	public static void main(String[] args) {

		int i = 0;

		while (i < 0) {
			System.out.println("while文の処理です。");
		}

		do {
			System.out.println("do while文の処理です。");
		} while(i < 0);

		/* do-while文は条件式が{}の外にあるため、変数の扱いに気を付ける。
		 * 以下の場合nameはローカル変数のため、条件式の場所ではスコープ外になる。
		 */
		//do {
		//	String line = "end";
		//} while(!line.equals("end"));
	}
}