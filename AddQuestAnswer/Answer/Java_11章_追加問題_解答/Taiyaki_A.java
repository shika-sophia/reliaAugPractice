// �����₫���𓚗�

// ��1.Taiyaki�N���X��錾���Ȃ���

class Taiyaki_A {

// ��2.���i�̃C���X�^���X�t�B�[���h��錾���Ȃ���

	int price;

// ��3.����̎�ނ̃C���X�^���X�t�B�[���h��錾���Ȃ���

	int type;

// ��4.�����Ă��̐��Y�����J�E���g����N���X�t�B�[���h��錾���Ȃ���

	static int count = 0;

// ��5.�Ԃ���ƃN���[���̒萔�t�B�[���h��錾���Ȃ���

	static final int TYPE_TSUBU = 1;
	static final int TYPE_CREAM = 2;

// ��6.�艿100�~�̒萔�t�B�[���h��錾���Ȃ���

	static final int FIXED_PRICE = 100;

// ��7.�t�B�[���h��100�~�E�Ԃ���ŏ�������������Ȃ��R���X�g���N�^��錾���Ȃ���

	Taiyaki_A() {
		this.setPrice(FIXED_PRICE);
		this.type = TYPE_TSUBU;
		count++;
	}

// ��8.���i�Ƃ���̎�ރt�B�[���h������������R���X�g���N�^��錾���Ȃ���

	Taiyaki_A(int price, int type) {
		this.setPrice(price);
		this.type = type;
		count++;
	}

// ��9.���i��ݒ肷��setPrice()���\�b�h��錾���Ȃ���

	void setPrice(int changedPrice) {
		this.price = changedPrice;
	}

// ��10.���i���擾����getPrice()���\�b�h��錾���Ȃ���

	int getPrice() {
		return price;
	}

// ��11.����̎�ނ��擾����getType()���\�b�h��錾���Ȃ���

	String getType() {
		String value = null;

		switch(type) {
		case TYPE_TSUBU:// 1�ł���
			value = "�Ԃ���";
			break;

		case TYPE_CREAM:// 2�ł���
			value = "�N���[��";
			break;

		default:
			break;
		}
		return value;
	}

// ��12.���Y�����擾����getCount()���\�b�h��錾���Ȃ���

	static int getCount() {
		return count;
	}

// ��13.main���\�b�h��錾���Ȃ���

	public static void main(String[] args) {

// ��14.�����Ă��̃C���X�^���X�𐶐����Ȃ���

		Taiyaki_A myTaiyaki = new Taiyaki_A();

// ��15.����������Ă��̂���̎�ނ����߂Ȃ���

		System.out.println("1�C�ڂ̂���̎�ނ�" + myTaiyaki.getType() + "�ł��B");

// ��16.�N���[�������Ă��̃C���X�^���X�𐶐����A���i��120�~�ɐݒ肵�Ȃ���

		Taiyaki_A crTaiyaki = new Taiyaki_A(120, Taiyaki_A.TYPE_CREAM);

// ��17.�N���[�������Ă��̉��i���{����120�~���m�F���Ȃ���

		System.out.println("�N���[�������Ă��̉��i��" + crTaiyaki.getPrice() + "�~�ł��B");

// ��18.�z����g���āA10�C(����5�C�A�N���[��5�C)�̂����Ă��p�b�N�𐶐����Ȃ���

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

// ��19.�����Ă��p�b�N�̉��i�����߂Ȃ���

		int sum = 0;
		for (int i = 0; i < packTaiyaki.length; i++) {
			sum += packTaiyaki[i].getPrice();
		}
		System.out.println("10�C���肽���Ă��p�b�N�̉��i��" + sum + "�~�ł��B");

// ��20.����܂łɏĂ��グ�������Ă��̕C�������߂Ȃ���

		System.out.println("�����Ă��͍��v" + Taiyaki_A.getCount() + "�C�ł��B");

// <���܂�> ���\�b�h���g���Ă����Ă����j�����Ȃ���

		myTaiyaki.swim();

	}

	void swim() {
		System.out.println(this.getType() + "�̂����Ă��N�͐H�ׂ���O�ɉj���������c�c�B");
	}

	/*	// toString���g�����ꍇ
		System.out.println(myTaiyaki);

	}

	@Override
	public String toString() {
		return this.getType() + "�̂����Ă��N�͐H�ׂ���O�ɉj���������c�c�B";
	}*/

}