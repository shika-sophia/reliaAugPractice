/*
 * �ȉ��̃v���O���������s����Ɖ����\������邩�\�z���ĉ�����
 * �u���͂悤�v���\������܂��B
 */

public class Greetings2_A {

	public static void main(String[] args) {

		/* 4�������Ƃ���showMessage���Ăяo���A
		   �߂�l��"�P"�𐮐��ϊ�����replyNum�ɑ���B*/
		int replyNum = Integer.parseInt(showMessage(4));

		/* 1��������ꂽreplyNum�������Ƃ���showMessage���Ăяo���A
		   �߂�l��"���͂悤"��reply�ɑ���B*/
		String reply = showMessage(replyNum);

		// reply���Q�Ƃ���B
		System.out.println(reply);

	}// main

	// ���A��I������showMessage���\�b�h
	public static String showMessage(int num) {
		String message = "";

		switch (num) {
		case 1:
			message = "���͂悤";
			break;

		case 2:
			message = "����ɂ���";
			break;

		case 3:
			message = "����΂��";
			break;

		case 4:
			message = "1";
			break;
		}// switch

		return message;
	}// showMessage

}// class