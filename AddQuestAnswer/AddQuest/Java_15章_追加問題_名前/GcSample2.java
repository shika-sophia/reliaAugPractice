// ガーベッジコレクションが発生する可能性のある行は何行目か考えてみてください。

class GcSample2 {
	public static void main(String args[]) {
		String a = "Hello";
		String b = "Bye";
		a = a + b;
		System.out.println(a);
		a = null;
		System.out.println("プログラム終了");
    }
}