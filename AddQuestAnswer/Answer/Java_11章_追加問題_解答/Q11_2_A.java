/*
	ビデオテープのクラスを作成してください。
	クラスには、以下のメンバを持たせてください。

	フィールド
		String
			ビデオのタイトル
			商品番号
		double
			収録時間
			一時停止した時間
			残り時間
	
	メソッド
		SetterとGetter
		
		タイトル・商品番号・収録時間を表示するメソッド
		残りの時間を取得する
		指定した分数早送りするメソッド
		巻き戻して現在の時間と残り時間をリセットするメソッド

	コンストラクタによる生成時には、フィールドに与えたタイトル、商品番号、収録時間を引数から設定する。
	なお、一時停止した時間は0、残り時間は収録時間と同じになるようにSetterを使って設定してください。

	また、別クラスのmainメソッドから、ビデオテープのインスタンスを生成して、メソッドを呼び出してください。


	[実行例]
	タイトル : 七人の侍
	商品番号 : KUROSAWA-1954
	収録時間 : 207.0
	現在の時間: 0.0
	残り時間: 207.0

	50.2分早送りします

	タイトル : 七人の侍
	商品番号 : KUROSAWA-1954
	収録時間 : 207.0
	現在の時間: 50.2
	残り時間: 156.8

	返却用に最初まで巻き戻します

	タイトル : 七人の侍
	商品番号 : KUROSAWA-1954
	収録時間 : 207.0
	現在の時間: 0.0
	残り時間: 207.0

	


*/


class Vhs {
	private String title;
	private String productNumber;
	private double runningTimes;
	private double currentTime;
	private double remainingTime;
	
	Vhs(String title, String productNumber, double runningTimes) {
		setTitle(title);
		setProductNumber(productNumber);
		setRunningTimes(runningTimes);
		setCurrentTime(0);
		setRemainingTime(runningTimes);
		
	}
	
	void setTitle(String title) {
		this.title = title;
	}
	void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}
	void setRunningTimes(double runningTimes) {
		this.runningTimes = runningTimes;
	}
	void setCurrentTime(double currentTime) {
		this.currentTime = currentTime;
	}
	void setRemainingTime(double remainingTime) {
		this.remainingTime = remainingTime;
	}

	String getTitle() {
		return title;
	}
	
	String getProductNumber() {
		return productNumber;
	}
	double getRunningTimes() {
		return runningTimes;
	}
	double getCurrentTimes() {
		return currentTime;
	}
	double getRemainingTime() {
		return remainingTime;
	}

	void putInfomation() {
		System.out.println("タイトル : " + title);
		System.out.println("商品番号 : " + productNumber);
		System.out.println("収録時間 : " + runningTimes);

		System.out.println("現在の時間: " + currentTime);
		System.out.println("残り時間: " + remainingTime);
	}

	boolean fastForward(double x) {
		System.out.println(x + "分早送りします");
		if(x > remainingTime) {
			return false;
		}else {
			remainingTime -= x;
			currentTime += x;

			return true;
		}

	}
	
	void rewind() {
		System.out.println("返却用に最初まで巻き戻します");
		remainingTime = runningTimes;
		currentTime = 0;
	}

}

public class Q11_2_A{
	public static void main(String[] args){
		Vhs vhs = new Vhs("七人の侍", "KUROSAWA-1954", 207);
		vhs.putInfomation();

		vhs.fastForward(50.2);
		vhs.putInfomation();

		vhs.rewind();
		vhs.putInfomation();

	}
}

