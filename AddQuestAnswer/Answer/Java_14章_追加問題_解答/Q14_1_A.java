/*
	以下の服の色を表すインターフェースClothesColorを実装するTシャツのクラスと、実行クラスを作成してください。
	条件
	・SetterとGetterを作成
	・色を選ぶためのchangeClothesを実装する
	・現在着ているTシャツの文字列表現を取得するgetClothesStringを宣言
	・実行クラスを作ってインスタンスを生成する
	・実行クラスでchangeClothesメソッドを呼び出す。
	・getClothesStringメソッドの呼び出しを行い表示させる。

	
	ｘのスキンはTIEDYEです。
	ｙのスキンはBLACKです。
*/

interface ClothesColor {
	int WHITE = 0;		//public static finalに必ずなるので省略されている
	int BLACK = 1;
	int TIEDYE = 2;
	void changeClothes(int clothes); //public abstract に必ずなるので省略
}




//以下に解答を記述

class Tshirts implements ClothesColor{
//スキンの値を保持するフィールド
	int clothes;	
//コンストラクタ
	public Tshirts(){
		this.clothes = WHITE;
	}
	public Tshirts(int clothes){
		setClothes(clothes);
	}
//スキンのセッタ
	public void setClothes(int clothes){
		this.clothes = clothes;
	}

//スキンのゲッタ
	public int getClothes(){
		return clothes;
	}

//スキン変更のメソッド
	@Override
	public void changeClothes(int clothes){
		this.clothes = clothes;
	}

//スキンの文字列を得るメソッド
	public String getClothesString(){
		switch(clothes){
			case 0:
				return "WHITE";
			case 1:
				return "BLACK";
			case 2:
				return "TIEDYE";
			default:
				return "";
		}
	}
}

public class Q14_1_A{
	public static void main(String[] args){
		Tshirts x = new Tshirts();
		Tshirts y = new Tshirts(ClothesColor.BLACK);
		/*
		引数に入ってるのはインタフェースのフィールド値。インタフェース型ではなく
		int型である事を見落とさない（どちらの型が良いかはプログラムによる）
		*/	
		x.changeClothes(ClothesColor.TIEDYE);
		System.out.println("ｘのスキンは" + x.getClothesString() + "です。");
		System.out.println("ｙのスキンは" + y.getClothesString() + "です。");
	}//main終了
}//class Q14_2終了