/*
 *�y���z
 *�R�}���h�v�����v�g���琮���l����͂��āA
 *���̐�Βl��\������v���O�������쐬���Ă��������B
 *����Βl�Ƃ́u�O����̋����v���Ȃ킿�A���̐����畉�̕�������菜�������̂ɂȂ�܂��B
 *
 *�y���s���ʁz
 *>java IfQuestion4
 *��������͂��Ă��������B
 *>10
 *��Βl��10�ł��B
 *
 *>java IfQuestion4
 *��������͂��Ă��������B
 *>-11
 *��Βl��11�ł��B
 */

import java.io.*;

public class IfQuestion4_A {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("��������͂��Ă��������B");
			// ���͑҂�
			String line = reader.readLine();
			// ���͕�����𐮐��l�ɕϊ�
			int num = Integer.parseInt(line);

			// num���}�C�i�X�̎������������s��
			if (num < 0) {
				// ��Βl�͕K�����̒l�ƂȂ�̂ŁA0��菬������΃}�C�i�X���|���Ĕ��]����B
				num = -(num);
			}

			System.out.println("��Βl��" + num + "�ł�");

		} catch (IOException e) {
			System.out.println(e);
		} catch(NumberFormatException e) {
			System.out.println("���͂�����������܂���B");
		}
	}
}