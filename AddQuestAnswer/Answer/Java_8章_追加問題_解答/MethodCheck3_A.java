/*
 * �ȉ��̃v���O���������������Ă��������B
 * �߂�l�@�A�Ə����@�A���L�q���Ă�������
 *
 *�y�o�͌��ʁz
 * 1�l�ڂ̖��O����͂��Ă�������
 * test1
 * test1����A����΂��
 * 2�l�ڂ̖��O����͂��Ă�������
 * test2
 * Hello test2
 *
 */

import java.io.*;

class MethodCheck3_A {
	public static void main(String[] argas) {

		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("1�l�ڂ̖��O����͂��Ă�������");
			String input = reader.readLine();
			System.out.println(aisatu1(input));

			System.out.println("2�l�ڂ̖��O����͂��Ă�������");
			input = reader.readLine();
			System.out.println(aisatu2(input));

		} catch (IOException e) {
			System.out.println(e);
		}// try�`catch

	}// main
	
	//��l�ڗp�̃��\�b�h
	public static /* �߂�l�@�L�q�� */String aisatu1(String name) {
		//���@�L�q��
		return name + "����A����΂��";
	}// aisatu1

	//��l�ڗp�̃��\�b�h
	public static /* �߂�l�A�L�q�� */String aisatu2(String name) {
		//���A�L�q��
		return "Hello " + name;
	}// aisatu2

}// class