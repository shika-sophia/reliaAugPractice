/*
	�ȉ��̕��̐F��\���C���^�[�t�F�[�XClothesColor����������T�V���c�̃N���X�ƁA���s�N���X���쐬���Ă��������B
	����
	�ESetter��Getter���쐬
	�E�F��I�Ԃ��߂�changeClothes����������
	�E���ݒ��Ă���T�V���c�̕�����\�����擾����getClothesString��錾
	�E���s�N���X������ăC���X�^���X�𐶐�����
	�E���s�N���X��changeClothes���\�b�h���Ăяo���B
	�EgetClothesString���\�b�h�̌Ăяo�����s���\��������B

	
	���̃X�L����TIEDYE�ł��B
	���̃X�L����BLACK�ł��B
*/

interface ClothesColor {
	int WHITE = 0;		//public static final�ɕK���Ȃ�̂ŏȗ�����Ă���
	int BLACK = 1;
	int TIEDYE = 2;
	void changeClothes(int clothes); //public abstract �ɕK���Ȃ�̂ŏȗ�
}




//�ȉ��ɉ𓚂��L�q

class Tshirts implements ClothesColor{
//�X�L���̒l��ێ�����t�B�[���h
	int clothes;	
//�R���X�g���N�^
	public Tshirts(){
		this.clothes = WHITE;
	}
	public Tshirts(int clothes){
		setClothes(clothes);
	}
//�X�L���̃Z�b�^
	public void setClothes(int clothes){
		this.clothes = clothes;
	}

//�X�L���̃Q�b�^
	public int getClothes(){
		return clothes;
	}

//�X�L���ύX�̃��\�b�h
	@Override
	public void changeClothes(int clothes){
		this.clothes = clothes;
	}

//�X�L���̕�����𓾂郁�\�b�h
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
		�����ɓ����Ă�̂̓C���^�t�F�[�X�̃t�B�[���h�l�B�C���^�t�F�[�X�^�ł͂Ȃ�
		int�^�ł��鎖�������Ƃ��Ȃ��i�ǂ���̌^���ǂ����̓v���O�����ɂ��j
		*/	
		x.changeClothes(ClothesColor.TIEDYE);
		System.out.println("���̃X�L����" + x.getClothesString() + "�ł��B");
		System.out.println("���̃X�L����" + y.getClothesString() + "�ł��B");
	}//main�I��
}//class Q14_2�I��