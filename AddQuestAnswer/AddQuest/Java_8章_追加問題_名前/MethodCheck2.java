/*
 * 以下のプログラムを読んで出力結果を予想してください。
 */

class MethodCheck2 {
	public static void main(String[] args) {
		System.out.println(method1());
	}

	public static int method1() {
		return method2() + 10;
	}

	public static int method2() {
		return method3() + 10;
	}

	public static int method3() {
		return 10;
	}
}