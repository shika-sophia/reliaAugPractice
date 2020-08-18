
/*

	int型のnに好きな数字を代入してください。

	渡した数字を3倍にしてリターンするメソッド、5倍のメソッド、10倍のメソッドを宣言し、それぞれを経由して出力してください。


	[例]
	
	5を3倍にします。
	↓
	（メソッドに渡す）
	↓
	5を3倍にすると15になりました。

	↓

	5を5倍にします。
	↓
	（メソッドに渡す）
	↓
	5を5倍にすると25になりました

	↓

	5を10倍にします。
	↓
	（メソッドに渡す）
	↓
	5を10倍にすると50になりました
	

*/




public class Q8_1_A{
	public static void main(String[] args){
		int n = 5;
		int m;

		System.out.println(n + "を3倍にします。");
		m = threeTimes(n);
		System.out.println(n + "を3倍にすると" + m + "になりました。");

		System.out.println(n + "を5倍にします。");
		m = fiveTimes(n);
		System.out.println(n + "を5倍にすると" + m + "になりました。");

		System.out.println(n + "を10倍にします。");
		m = tenTimes(n);
		System.out.println(n + "を10倍にすると" + m + "になりました。");
	}

	public static int threeTimes(int n){
		return n * 3;
	}

	public static int fiveTimes(int n){
		return n * 5;
	}

	public static int tenTimes(int n){
		return n * 10;
	}
}
