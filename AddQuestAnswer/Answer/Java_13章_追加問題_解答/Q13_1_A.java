/*
	mainメソッドを含む3つのメソッドを自作し、2つの例外が出るクラスを作ってください。
	ただし、以下の条件を満たしてください。

	1. 入力をキーボードから取得する
	2. キーボードから取得した値を引数に入れると、その値によってはExceptionかRuntimeExceptionを投げるメソッドを宣言
	3. 条件2のメソッドを呼び出すだけのメソッドを宣言
	4. 条件3のメソッドをmainメソッドから呼び出す
	5. mainメソッド意外はthrows節を利用すること。

	[実行例]
	入力 : 1
	検査的例外発生

*/

import java.io.*;

public class Q13_1_A{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.print("入力 : ");
			String s = reader.readLine();
			int sw = Integer.parseInt(s);
			try{
				test(sw);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}catch(IOException e){
			System.out.println("正しい値を入力して下さい");
		}
	}

	public static void test(int sw) throws Exception{
		check(sw);
	}

	public static void check(int sw)throws Exception{
		switch(sw){
		case 1:
			throw new Exception("検査的例外発生");
		case 2:
			throw new RuntimeException("非検査例外発生");
		default:
			System.out.println("1か2を入れて下さい");
			break;
		}
	}
}