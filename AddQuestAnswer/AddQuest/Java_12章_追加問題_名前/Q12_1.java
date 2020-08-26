/*

workフォルダにDayファイルも移動させて下さい。

以下に示す調味料クラスSauceをスーパークラスに持つサブクラス、MayonnaiseとKetchupを作成して下さい。
マヨネーズクラスには100gに含まれる脂質の量、ケチャップクラスには100gに含まれるリコピンの量を持つフィールドを作成してください。
そして、実行クラスで、各フィールドを呼び出してください。


【実行例】
ブランド名 : カゴメトマトケチャップ
賞味期限 : [ year = 2019, month = 9, date = 4]
残量 : 500
残量に含まれているリコピンの量 : 90.0mg

ブランド名 : キュピーマヨネーズ
賞味期限 : [ year = 2019, month = 7, date = 4]
残量 : 450
残量に含まれている脂質の量 : 328.5mg

*/



class Sauce {
	private String name; 
	private int remainingAmount; //残量
	private Day expirationDate; // 賞味期限
		
	public Sauce(String name,int remainingAmount,Day expirationDate){
		this.setName(name);
		this.setRemainingAmount(remainingAmount);
		this.setExpirationDate(expirationDate);
	}

//セッタ群
	public void setName(String name){
		this.name = name;
	}

	public void setRemainingAmount(int remainingAmount){
		this.remainingAmount = remainingAmount;
	}

	public void setExpirationDate(Day expirationDate){
		this.expirationDate = expirationDate;
	}

//ゲッタ群
	public String getName(){
		return name;
	}

	public int getRemainingAmount(){
		return remainingAmount;
	}

	public Day getExpirationDate(){
		return new Day(expirationDate);
	}

}//class Sauce終了
