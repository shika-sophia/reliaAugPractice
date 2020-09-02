// ガーベッジコレクションが発生する可能性のある行は何行目か考えてみてください。

class Sample {
	Sample obj;
}

public class GcSample1 {
	public static void main(String[] args) {
		Sample sm1 = new Sample();
		Sample sm2 = new Sample();
		sm1.obj = sm2;
		sm2.obj = sm1;
		sm1 = null;
		sm2 = null;
		System.out.println("プログラム終了")
	}
}