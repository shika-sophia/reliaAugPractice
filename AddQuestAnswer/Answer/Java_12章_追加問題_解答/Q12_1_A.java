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
		this.expirationDate = new Day(expirationDate);
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


/*
解答は1例です。
*/


//Sauceをスーパークラスに持つKetchupクラス
class Ketchup extends Sauce{
//100mgあたりに含まれるリコピンの量を示す
	private double lycopene;
	
	public Ketchup(String name,int remainingAmount, double lycopene, Day purchaseDay){
		super(name,remainingAmount,purchaseDay);
		setLycopene(lycopene);
	}
//セッタ
	public void setLycopene(double lycopene){
		this.lycopene = lycopene;
	}

	public double getLycopene(){
		return lycopene;
	}
}

//Sauceをスーパークラスに持つMayonnaiseクラス
class Mayonnaise extends Sauce{
//100mgあたりに含まれる脂質の量
	private double lipid;
	
	public Mayonnaise(String name,int remainingAmount, double lipid, Day purchaseDay){
		super(name,remainingAmount,purchaseDay);
		setLipid(lipid);
	}
//セッタ
	public void setLipid(double lipid){
		this.lipid = lipid;
	}

	public double getLipid(){
		return lipid;
	}
}



//実行クラス
public class Q12_1_A{
	public static void main(String[] args){
		Ketchup ketchup = new Ketchup("カゴメトマトケチャップ",500,18,new Day(2019,9,4));
		Mayonnaise mayonnaise = new Mayonnaise("キュピーマヨネーズ",450,73,new Day(2019,7,4));

		System.out.println("ブランド名 : " + ketchup.getName());
		System.out.println("賞味期限 : " + ketchup.getExpirationDate());
		System.out.println("残量 : " + ketchup.getRemainingAmount());
		System.out.println("残量に含まれているリコピンの量 : " + ketchup.getLycopene() / 100 * ketchup.getRemainingAmount() + "mg");

		System.out.println("ブランド名 : " + mayonnaise.getName());
		System.out.println("賞味期限 : " + mayonnaise.getExpirationDate());
		System.out.println("残量 : " + mayonnaise.getRemainingAmount());
		System.out.println("残量に含まれている脂質の量 : " + mayonnaise.getLipid() / 100 *mayonnaise.getRemainingAmount() + "mg");
	}	
	
}