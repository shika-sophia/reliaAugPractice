/*
 * �ȉ��̃v���O���������������ĉ������B
 *
 * int�^�̈������󂯎��A1�̂Ƃ���"���͂悤"�A2�̂Ƃ���"����ɂ���"�A3�̂Ƃ���"����΂��"�A
 * �Ƃ���String�^�̖߂�l��Ԃ����\�b�h��錾���A���C�����\�b�h����Ăяo���Ă��������B
 * �Ȃ��A���\�b�h�̖����͎��R�Ƃ��܂�
 */

import java.io.*;

public class Greetings_If {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1�`3�̐�������͂��ĉ�����");
		
		try {
			String line = reader.readLine();
			int i = Integer.parseInt(line);
			
			// ���L�q���@ ��������
			// showMessage���\�b�h�̌Ăяo��
			String reply = showMessage(i);
			System.out.println(reply);
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

		if (num == 1) {
			return "���͂悤";
		} else if (num == 2) {
			return "����ɂ���";
		} else if (num == 3) {
			return "����΂��";
		} else {
			return "1�`3����͂��ĉ������B";
		}// if

	}// showMessage
	// ���L�q���A �����܂�

}// class