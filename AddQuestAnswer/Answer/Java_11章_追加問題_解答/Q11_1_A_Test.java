
/*
	
	Q11_1_Drinkを実行するためのクラスを作成してください。


	[実行例]
	カルピスウォーター 残り430ml
	コカコーラ 残り500ml
	カルピスウォーターを飲みます
	カルピスウォーターの残りの量は380ml
	コカコーラの残りの量は500ml
*/


public class Q11_1_A_Test{
	public static void main(String[] args){
		Q11_1_A_Drink calpis = new Q11_1_A_Drink("カルピスウォーター", "アサヒ飲料", 430);
		Q11_1_A_Drink cocacola = new Q11_1_A_Drink("コカコーラ", "コカ・コーラ社", 500);


		System.out.println(calpis.getProductName() + " 残り" + calpis.getAmount() + "ml");
		System.out.println(cocacola.getProductName() + " 残り" + cocacola.getAmount() + "ml");
		
		System.out.println(calpis.getProductName() + "を飲みます");
		calpis.drink();

		System.out.println(calpis.getProductName() + "の残りの量は" + calpis.getAmount() + "ml");
		System.out.println(cocacola.getProductName() + "の残りの量は" + cocacola.getAmount() + "ml");
	}

}