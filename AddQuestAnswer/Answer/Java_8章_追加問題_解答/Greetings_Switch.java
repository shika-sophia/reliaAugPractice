/*
 * �ȉ��̃v���O���������������ĉ������B
 *
 * int�^�̈������󂯎��A1�̂Ƃ���"���͂悤"�A2�̂Ƃ���"����ɂ���"�A3�̂Ƃ���"����΂��"�A
 * �Ƃ���String�^�̖߂�l��Ԃ����\�b�h��錾���A���C�����\�b�h����Ăяo���Ă��������B
 * �Ȃ��A���\�b�h�̖����͎��R�Ƃ��܂�
 */

import java.io.*;

public class Greetings_Switch {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1�`3�̐�������͂��ĉ�����");

		try {
			String line = reader.readLine();
			int i = Integer.parseInt(line);

			// ���L�q���@ ��������
			// showMessage���\�b�h�̌Ăяo��
			System.out.println(showMessage(i));
			// ���L�q���@ �����܂�

		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("�����œ����ĉ������B");
		}// try�`catch

	}// main

	// String�^�Ŗ߂�l��Ԃ�showMessage���\�b�h
	// ���L�q���A ��������
	public static String showMessage(int num) {
		String message;

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

		default:
			message = "1�`3����͂��ĉ������B";
			break;
		}// switch

		return message;
	}// showMessage
	// ���L�q���A �����܂�

}// class