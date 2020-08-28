/* 
 * �y���K���z
 * �ȉ��̃N���X�uHuman�v���g�������N���X���𓚗��@�ɐ錾���A
 * ���s�N���X�uHumanEx�v�̉𓚗��A�Ŏ��ȏЉ���o�͂��Ă��������B
 * �������A�ȉ��̗v���𖞂����Ă��������B
 * 
 * 1. �g�������N���X�Ńt�B�[���h��ǉ����Ă��������B
 * 	�i�t�B�[���h�̓��e�͖₢�܂���B���R�ɐ錾���Ă��������B�j
 * 2. showProfile���\�b�h���I�[�o�[���C�h���Ă��������B
 * 3.�uHumanEx�v�̎��ȏЉ�\�b�h�uintroduce�v�𗘗p���Ă��������B
 */

class Human {

	private String name;
	private int age;

	Human() {
		this("No Name", 0);
	}
	Human(String name, int age) {
		setName(name);
		setAge(age);
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void showProfile() {
		System.out.println("���̖��O�� " + this.name + " �ŁA" + this.age + " �΂ł��B");
	}

}// Human

// �ȉ��Ɋg�������N���X��錾����
// ���𓚗��@ ��������
class MyData extends Human {

	// �t�B�[���h�̒ǉ�
	private String hobby;

	// �R���X�g���N�^
	MyData(String name, int age, String hobby) {
		super(name, age);	// �X�[�p�[�N���X�̃R���X�g���N�^�̌Ăяo��
		setHobby(hobby);	// Setter�̌Ăяo��
	}

	// ��̐ݒ�
	void setHobby(String hobby) {
		this.hobby = hobby;
	}

	// ��̎擾
	String getHobby() {
		return this.hobby;
	}

	// ���ȏЉ�̃I�[�o�[���C�h
	@Override
	public void showProfile() {
		super.showProfile();// �X�[�p�[�N���X�̓����̃��\�b�h�̌Ăяo��
		System.out.println("���" + getHobby() + "�ł��B");
	}

}// MyData
// ���𓚗��@ �����܂�


// ���s�N���X(�g�������N���X�̃C���X�^���X���g�p����)
public class HumanEx_A {

	public static void main(String[] args) {

		// ���𓚗��A ��������
		// ���ȏЉ�\�b�h�ɃC���X�^���X��n��
		introduce(new MyData("�k��", 34, "�Q�[��"));
		// ���𓚗��A �����܂�

	}// main

	// ���ȏЉ�\�b�h
	static void introduce(Human human) {
		human.showProfile();

	}// introduce

}// HumanExnEx