// たいやき問題解答例

// 問1.Taiyakiクラスを宣言しなさい

class Taiyaki_A {

// 問2.価格のインスタンスフィールドを宣言しなさい

	int price;

// 問3.あんの種類のインスタンスフィールドを宣言しなさい

	int type;

// 問4.たい焼きの生産数をカウントするクラスフィールドを宣言しなさい

	static int count = 0;

// 問5.つぶあんとクリームの定数フィールドを宣言しなさい

	static final int TYPE_TSUBU = 1;
	static final int TYPE_CREAM = 2;

// 問6.定価100円の定数フィールドを宣言しなさい

	static final int FIXED_PRICE = 100;

// 問7.フィールドを100円・つぶあんで初期化する引数なしコンストラクタを宣言しなさい

	Taiyaki_A() {
		this.setPrice(FIXED_PRICE);
		this.type = TYPE_TSUBU;
		count++;
	}

// 問8.価格とあんの種類フィールドを初期化するコンストラクタを宣言しなさい

	Taiyaki_A(int price, int type) {
		this.setPrice(price);
		this.type = type;
		count++;
	}

// 問9.価格を設定するsetPrice()メソッドを宣言しなさい

	void setPrice(int changedPrice) {
		this.price = changedPrice;
	}

// 問10.価格を取得するgetPrice()メソッドを宣言しなさい

	int getPrice() {
		return price;
	}

// 問11.あんの種類を取得するgetType()メソッドを宣言しなさい

	String getType() {
		String value = null;

		switch(type) {
		case TYPE_TSUBU:// 1でも可
			value = "つぶあん";
			break;

		case TYPE_CREAM:// 2でも可
			value = "クリーム";
			break;

		default:
			break;
		}
		return value;
	}

// 問12.生産数を取得するgetCount()メソッドを宣言しなさい

	static int getCount() {
		return count;
	}

// 問13.mainメソッドを宣言しなさい

	public static void main(String[] args) {

// 問14.たい焼きのインスタンスを生成しなさい

		Taiyaki_A myTaiyaki = new Taiyaki_A();

// 問15.作ったたい焼きのあんの種類を求めなさい

		System.out.println("1匹目のあんの種類は" + myTaiyaki.getType() + "です。");

// 問16.クリームたい焼きのインスタンスを生成し、価格を120円に設定しなさい

		Taiyaki_A crTaiyaki = new Taiyaki_A(120, Taiyaki_A.TYPE_CREAM);

// 問17.クリームたい焼きの価格が本当に120円か確認しなさい

		System.out.println("クリームたい焼きの価格は" + crTaiyaki.getPrice() + "円です。");

// 問18.配列を使って、10匹(あん5匹、クリーム5匹)のたい焼きパックを生成しなさい

		Taiyaki_A[] packTaiyaki = {
			new Taiyaki_A(),
			new Taiyaki_A(),
			new Taiyaki_A(),
			new Taiyaki_A(),
			new Taiyaki_A(),
			new Taiyaki_A(120, Taiyaki_A.TYPE_CREAM),
			new Taiyaki_A(120, Taiyaki_A.TYPE_CREAM),
			new Taiyaki_A(120, Taiyaki_A.TYPE_CREAM),
			new Taiyaki_A(120, Taiyaki_A.TYPE_CREAM),
			new Taiyaki_A(120, Taiyaki_A.TYPE_CREAM),
		};

// 問19.たい焼きパックの価格を求めなさい

		int sum = 0;
		for (int i = 0; i < packTaiyaki.length; i++) {
			sum += packTaiyaki[i].getPrice();
		}
		System.out.println("10匹入りたい焼きパックの価格は" + sum + "円です。");

// 問20.これまでに焼き上げたたい焼きの匹数を求めなさい

		System.out.println("たい焼きは合計" + Taiyaki_A.getCount() + "匹です。");

// <おまけ> メソッドを使ってたい焼きを泳がせなさい

		myTaiyaki.swim();

	}

	void swim() {
		System.out.println(this.getType() + "のたい焼き君は食べられる前に泳ぎ去った……。");
	}

	/*	// toStringを使った場合
		System.out.println(myTaiyaki);

	}

	@Override
	public String toString() {
		return this.getType() + "のたい焼き君は食べられる前に泳ぎ去った……。";
	}*/

}