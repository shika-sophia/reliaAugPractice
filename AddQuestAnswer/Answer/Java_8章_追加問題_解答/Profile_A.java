/*
 * �ȉ��̃v���O���������������Ă�������
 *
 * int�^��String�^�̈��������A�߂�l�̂Ȃ����\�b�h��錾���Ă��������B(�L�q���A)
 * �܂��A�u"Yuki"�A36�v�Ń��\�b�h���Ăяo���Ă��������B(�L�q���@)
 * �Ȃ��A���\�b�h�̖����͎��R�Ƃ��܂��B
 */

public class Profile_A {
	public static void main(String[] args) {

		// ���L�q���@ ��������
		// showProfile���\�b�h�̌Ăяo��
		showProfile(36, "Yuki");
		// ���L�q���@ �����܂�

	}// main

	// �߂�l�Ȃ���showProfile���\�b�h
	// ���L�q���A ��������
	public static void showProfile(int age, String name) {
		System.out.println(name + "�����" + age + "�΂ł��B");
	}// showProfile
	// ���L�q���A �����܂�

}// class