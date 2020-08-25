/*
	11章の内容を使って、飲み物のクラスを作成してください。
	メンバには、商品名、会社名、内容量のフィールドを宣言してください。
	また、飲むと減るというメソッドも作成してください。

	ファイルはクラスごとに分けて作成してください。

	このクラス名はQ11_1_Drinkというクラス、実行するクラスはQ11_1_Testというクラスで作成してください


*/

public class Q11_1_A_Drink{
	private String productName;
	private String company;
	private int amount;

	Q11_1_A_Drink(String productName, String company,int amount){
		this.productName = productName;
		this.company = company;
		this.amount = amount;
	}

	public String getProductName(){
		return productName;
	}
	
	public String getCompany(){
		return company;
	}
	
	public int getAmount(){
		return amount;
	}

	public void drink(){
		amount -= 50;
	}
}
	