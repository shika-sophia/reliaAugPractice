// P191 問題16―10の動作確認用Jobクラス

class Job {

	// フィールド
	int num;

	// コンストラクタ
	public Job(int n) {
		num = n;
	}

	public void work() {
		System.out.println(this + " が働いています");

		try {
			Thread.sleep((int)(Math.random() * 10000));
		} catch (InterruptedException e) {
		}// try～catch

	}// work

	@Override
	public String toString() {
		return "[Job " + num + "]";
	}// toString

}// class
