/*
	1.���̃N���X�ABird���쐬���Ă��������B
		���O�t�B�[���h�A���O��Setter�A���O��Getter�A������sing���\�b�h���������邱�ƁB
	2.���ۃN���XBird����h������j���g���̃N���XChicken�ƃI�E���̃N���X��Parrot���쐬���Ă��������B
		�Ȃ��AChicken�ɂ͕i���String�^��breeds�ƁAParrot�ɂ�int�^��size�t�B�[���h��ǉ����Ă��������B
	3.��L�̃N���X�����s����N���X���쐬���A���O�Ɩ������Ăяo���Ă��������B
		���̍ہABird�^�̔z����g���āAfor���ŏo�͂��Ă��������B
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
		System.out.println("�R�P�R�b�R�[");
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
		System.out.println("����ɂ���");
	}
}

public class Q12_2_A {
	public static void main(String[] args) {
		Bird[] birds = new Bird[2];
		birds[0] = new Chicken("�s�������", "���É��R�[�`��");
		birds[1] = new Parrot("�A���b�N�X", 33);

		for(int i = 0; i < birds.length; i++) {
			System.out.print(birds[i].getName() + " : ");
			birds[i].sing();
		}
	}
}