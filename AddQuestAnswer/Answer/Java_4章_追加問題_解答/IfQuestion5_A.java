/*
 *�y���z
 *�R�}���h�v�����v�g����R�̐����l����͂��āA
 *���̍ŏ��l��\������v���O�������쐬���Ă��������B
 *
 *�y���s���ʁz
 *>java IfQuestion5
 *��P���l����͂��Ă��������B
 *>10
 *��Q���l����͂��Ă��������B
 *>5
 *��R���l����͂��Ă��������B
 *>-15
 *��P���l�F10
 *��Q���l�F5
 *��R���l�F-15
 *�ŏ��l��-15�ł��B
 */

import java.io.*;

public class IfQuestion5_A {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			String line;
			// �P�ڂ̐��l�̓���
			System.out.println("��P���l����͂��Ă��������B");
			line = reader.readLine();
			int num1 = Integer.parseInt(line);
			// �Q�ڂ̐��l�̓���
			System.out.println("��Q���l����͂��Ă��������B");
			line = reader.readLine();
			int num2 = Integer.parseInt(line);
			// �R�ڂ̐��l�̓���
			System.out.println("��R���l����͂��Ă��������B");
			line = reader.readLine();
			int num3 = Integer.parseInt(line);

			// �ŏ��l��ۑ�����ϐ���錾�B
			int min;

			// �ŏ��ɑ�P���l�Ƒ�Q���l���r����B
			if (num1 < num2) {
				min = num1;
			} else {
				min = num2;
			}

			// ��r�������ʂƑ�R���l���r����B
			if (min > num3) {
				min = num3;
			}

			System.out.println("��P���l�F" + num1);
			System.out.println("��Q���l�F" + num2);
			System.out.println("��R���l�F" + num3);
			System.out.println("�ŏ��l��" + min + "�ł�");

		} catch (IOException e) {
			System.out.println(e);
		} catch(NumberFormatException e) {
			System.out.println("���͂�����������܂���B");
		}
	}
}