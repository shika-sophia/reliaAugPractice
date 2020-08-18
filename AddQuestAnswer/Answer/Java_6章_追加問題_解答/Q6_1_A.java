/*

	二重for文を使って「●」でブドウを作ってください。

	条件 : コード内で●を使えるのは一度だけとします。
	System.out.println("●●●●●");は禁止です。

	[例]
		ト
	　　●●●●●
	　　●●●●
	　　●●●
	　　●●
	　　●
		
*/

class Q6_1_A{
	public static void main(String[] args){
		int num = 10;

		//ヘタの部分はこれを使ってください。
		System.out.println("　　ト　　");

		for(int i = 1; i <= num; i++){
			for(int j = 1; j <= num - i + 1; j++){
				System.out.print("●");
			}
			System.out.println();
		}

		
	}
}