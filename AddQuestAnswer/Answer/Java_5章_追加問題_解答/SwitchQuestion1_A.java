/*
 * ���F�ȉ��̌��ʂ��\�������悤�ȃv���O�������L�q���Ă��������B
 * ������
 * �Eswitch�����g�p���Ă�������
 * �E�ȉ��̃v���O�����ɋL�q����Ă���ϐ��͑S�Ďg�p���Ă�������
 *
 *�y�o�͌��ʁz
 * �ǂ��ɍs���H
 * 1:�J���I�P  2:������  3:�ƂɋA��
 * 2
 * ������
 */

import java.io.*;

public class SwitchQuestion1_A {

	public static void main(String[] args) {
		String line = "";		// �R�}���h�v�����v�g������͂��ꂽ���e��ێ�
		String result = "";		// �R�}���h�v�����v�g��ɕ\�����镶�����ێ�
		int x = 0;				// switch���̎��Ƃ��Ďg���ϐ�
		
		System.out.println("�ǂ��ɍs���H");
		System.out.println("1:�J���I�P  2:������  3:�ƂɋA��");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			// ���𓚃X�y�[�X ��������

			// line��x�����łɐ錾���ꂽ�ϐ��Ȃ̂ŁA�������ł͂Ȃ�����݂̂ŗǂ��B
			line = reader.readLine();
			x = Integer.parseInt(line);

			switch(x) {
			case 1:// ������String�^�Ő錾����Ă���result�ɑ���̂݁B
				result = "�J���I�P";
				break;

			case 2:
				result = "������";
				break;

			default:
				result = "�ƂɋA��";
				break;
			}
			// case���ɏ����Ă��ǂ����A�ϐ����g�p���Ă���̂ň�x�̋L�q�őΉ��ł���B
			System.out.println(result);

			// ���𓚃X�y�[�X �����܂�
		} catch(IOException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println("��������͂��Ă�������");
		}
	}// main

}// class