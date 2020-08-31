/**
 *	以下のプログラムを読んで出力結果を予想してください。
 *
 *	【実行方法】
 *①java Execute3 4
 *②java Execute3 ABC
 *③java Execute3 10
 */


class ExceptionCheck3 {

	public void check1(int inputParam) throws ArrayIndexOutOfBoundsException {
		int[] intArray = new int[5];

		for(int i = 0; i < inputParam; i++ ) {
			intArray[i] = i;
		}// for

		System.out.println("check1メソッドが正しく実行されました。");
	}// check1
	
	public void check2(String inputParam)  {
		System.out.println(inputParam + "は数字ではありません。");
	}// check2

}// ExceptionTest3クラス


// 実行クラス
class Execute3 {

	public static void main(String[] args) {
		ExceptionCheck3 exp = new ExceptionCheck3();
		int inputParam = 0;

		//入力チェック
		if(args.length != 1) {
			System.out.println("使用方法：java Execute3 数字");
			System.exit(0);
		}// if

		try{
			inputParam = Integer.parseInt(args[0]);

			try{
				exp.check1(inputParam);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("check1メソッドは正しく実行されませんでした。");
			}// try～catch

		} catch (NumberFormatException e) {
			exp.check2(args[0]);
		}// try～catch
	}// main

}// Execute3クラス
