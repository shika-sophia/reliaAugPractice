/*
 * ���F�ȉ��̌��ʂ��\�������悤�ȃv���O�������L�q���Ă��������B
 * ������
 * �Eswitch�����g�p���Ă�������
 * �E�ȉ��̃v���O�����ɋL�q����Ă���ϐ��͑S�Ďg�p���Ă�������
 * �E����������A�ϐ���println�\�L(�d��)�͋֎~�ł��B
 *
 *�y�o�͌��ʁz
 * >
 * �A��ɂǂ����Ɋ���Ă����H
 * 1:�J���I�P  2:������  3:�ƂɋA��
 * 1
 * �J���I�P�ɍs���܂����B
 * ������
 * �������ɍs���܂����B
 * ���̌�
 * �ƂɋA��B
 * �ȏ�B
 *
 * >
 *�A��ɂǂ����Ɋ���Ă����H
 *1:�J���I�P  2:������  3:�ƂɋA��
 *2
 *�������ɍs���܂����B
 *���̌�
 *�ƂɋA��B
 *�ȏ�B
 *
 *>
 *�A��ɂǂ����Ɋ���Ă����H
 *1:�J���I�P  2:������  3:�ƂɋA��
 *3
 *�ƂɋA��B
 *�ȏ�B
 *
 *>
 *�A��ɂǂ����Ɋ���Ă����H
 *1:�J���I�P  2:������  3:�ƂɋA��
 *4
 *�����͋A��܂���B
 *�ȏ�B
*/

import java.io.*;

public class SwitchQuestion2_A {

	public static void main(String[] args) {
		String line = "";		// �R�}���h�v�����v�g������͂��ꂽ���e��ێ�����
		int x = 0;				// switch���̎��Ƃ��Ďg���ϐ�
		
		System.out.println("�A��ɂǂ����Ɋ���Ă����H");
		System.out.println("1:�J���I�P  2:������  3:�ƂɋA��");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			// ���𓚃X�y�[�X ��������

			line = reader.readLine();
			x = Integer.parseInt(line);

			switch(x) {
			case 1:// �I�񂾑I�����ȍ~�̑S�Ă̏������s�����߂ɁA�킴��break�������Ă��Ȃ��B
				System.out.println("�J���I�P�ɍs���܂����B\n������");

			case 2:
				System.out.println("�������ɍs���܂����B\n���̌�");

			case 3:
				System.out.println("�ƂɋA��B");
				break;

			default:
				System.out.println("�����͋A��܂���B");
				break;
			}
			
			System.out.println("�ȏ�B");

			// ���𓚃X�y�[�X �����܂�

		} catch(IOException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println("��������͂��Ă�������");
		}
	}// main

}// class