/*
	1.鳥のクラス、Birdを作成してください。
		名前フィールド、名前のSetter、名前のGetter、鳴き声のsingメソッドを持たせること。
	2.抽象クラスBirdから派生するニワトリのクラスChickenとオウムのクラスのParrotを作成してください。
		なお、Chickenには品種のString型のbreedsと、Parrotにはint型のsizeフィールドを追加してください。
	3.上記のクラスを実行するクラスを作成し、名前と鳴き声を呼び出してください。
		その際、Bird型の配列を使って、for文で出力してください。
*/


abstract class Bird {
	private String name;
	
	public Bird(String name) {
		setName(name);
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public abstract void sing();

}

class Chicken extends Bird {
	private String breeds;

	public Chicken(String name, String breeds) {
		super(name);
		setBreeds(breeds);
	}

	public void setBreeds(String breeds){
		this.breeds = breeds;
	}
	public String getBreeds(){
		return breeds;
	}
	
	@Override
	public void sing() {
		System.out.println("コケコッコー");
	}
}

class Parrot extends Bird {
	private int size;
	public Parrot(String name, int size) {
		super(name);
		setSize(size);
	}

	public void setSize(int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}

	@Override
	public void sing() {
		System.out.println("こんにちは");
	}
}

public class Q12_2_A {
	public static void main(String[] args) {
		Bird[] birds = new Bird[2];
		birds[0] = new Chicken("ピヨちゃん", "名古屋コーチン");
		birds[1] = new Parrot("アレックス", 33);

		for(int i = 0; i < birds.length; i++) {
			System.out.print(birds[i].getName() + " : ");
			birds[i].sing();
		}
	}
}