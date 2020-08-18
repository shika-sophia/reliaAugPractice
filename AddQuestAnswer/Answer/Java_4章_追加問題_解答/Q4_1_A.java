/*
	2つのint型の変数に値を入れて、その2つを比較し、以下のように表示するプログラムを作成してください。
	「xの方が大きい」
	「yの方が大きい」
	「xとyは同じ値です」
	
	[実行例]
	x:50
	y:100
	yの方が大きいです。
	
*/

class Q4_1_A{
	public static void main(String[] args){
		int x = 50; //任意の整数値
		int y = 100; //同上
		
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		
		if(x > y){
			System.out.println("xの方が大きいです。");
		}else if(x < y){
			System.out.println("yの方が大きいです。");
		}else{
			System.out.println("xとyは同じ値です");
		}
	}
}