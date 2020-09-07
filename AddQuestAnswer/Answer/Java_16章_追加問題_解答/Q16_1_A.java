/*
	以下のプログラムを作成してください。

	・Threadを拡張したGoodMorningクラス、GoodAfternoonクラスの2つを作成
	・Threadを拡張していないGoodEveningクラスを作成
	・その3つのクラスに各自「おはようございます」「こんにちは」「こんばんは」と10回表示させる機能を持たせてください
	・mainメソッドから各クラスを実行してください。



	[実行例] 環境によって異なるので、これと同じ順にならなくても大丈夫です。
	こんばんは
	こんばんは
	こんばんは
	(略)
	こんにちは
	(略)
	おはようございます
	(略)
	
*/


class GoodMorning extends Thread {
	@Override
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println("おはようございます");
		}
	}
}

class GoodAfternoon extends Thread {
	@Override
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println("こんにちは");
		}
	}
}

class GoodEvening {
	public void display(){
		for(int i = 0; i < 10; i++){
			System.out.println("こんばんは");
		}
	}
}

class Q16_1_A{
	public static void main (String[] args){
		GoodMorning goodMorning = new GoodMorning();
		GoodAfternoon goodAfternoon = new GoodAfternoon();
		GoodEvening goodEvening = new GoodEvening();

		goodMorning.start();
		goodAfternoon.start();
		goodEvening.display();
		
	}
}
