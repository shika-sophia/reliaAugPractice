/*

	Q6_2のブドウをひっくり返してください

	条件 : 前回同様、コード内で●を使えるのは一度だけとします。
	System.out.println("●●●●●");は禁止です。

	[例]
		●
		●●
		●●●
		●●●●
		●●●●●
		　　ト　　
		
*/

public class Q6_2_A{
	public static void main(String[] args) {
		int num = 5;
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("●");
			}
			System.out.println("");
		}
		System.out.println("　　ト　　");

	}
}