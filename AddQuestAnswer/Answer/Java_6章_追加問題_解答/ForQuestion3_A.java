/*
 *�y���z
 *�R���s���[�^���I���������i0�`99�j�𓖂Ă�Q�[�����쐬���Ă��������B
 *�ԈႦ���ꍇ�A�v���C���[���𓚂����l���A�I�������l�ɔ�ׂāu�傫���v���u�������v��\�����A
 *�c��̉𓚉񐔂��\�����Ă��������B
 *
 *�Ȃ��A�v���C���[���𓚂ł���񐔂�7��܂łɐ������܂��B
 *�i�����Ȃǐ����ȊO����͂��Ă��܂����ꍇ�͊܂݂܂���B�j
 *
 *���������ꍇ�́A�u�����ł��v�ƕ\�����āA���̂܂܃v���O�������I�����Ă��������B
 *�����񐔓��ɓ��Ă��Ȃ������ꍇ�́A������\�����ăv���O�������I�����Ă��������B
 *
 *�v���O�����̓r���ŏI������ɂ�
 *System.exit(0);
 *���\�b�h���g�p���܂��B
 *
 *�y���s���ʁF�������z
 *>java KazuateGame_A
 *�R���s���[�^��0�`99�܂ł̐����̒�����P�I�����܂����B
 *�I�����������𓖂ĂĂ��������B
 *�i1��ځj
 *>50
 *�c�O�A�Ⴂ�܂��B
 *�I�������l�͉𓚂����l�����u�傫���v�ł��B
 *�c��6��𓚂ł��܂��B
 *�i2��ځj
 *>75
 *�c�O�A�Ⴂ�܂��B
 *�I�������l�͉𓚂����l�����u�������v�ł��B
 *�c��5��𓚂ł��܂��B
 *�i3��ځj
 *>60
 *���߂łƂ��������܂��B�����ł��B
 *
 *�y���s���ʁFGameOver���z
 *>java KazuateGame_A
 *�R���s���[�^��0�`99�܂ł̐����̒�����P�I�����܂����B
 *�I�����������𓖂ĂĂ��������B
 *�i1��ځj
 *>5
 *�c�O�A�Ⴂ�܂��B
 *�I�������l�͉𓚂����l�����u�傫���v�ł��B
 *�c��6��𓚂ł��܂��B
 *
 *�`�ȗ�
 *
 *�i7��ځj
 *>35
 *�c�O�A�Ⴂ�܂��B
 *�I�������l�͉𓚂����l�����u�傫���v�ł��B
 *�𓚂̐����񐔂ɒB���܂����B
 *������51�ł����B
 */

import java.io.*;

public class ForQuestion3_A {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int maxCount = 7;// �Q�[����
		int selectedNumber = (int)(Math.random() * 100);// com�ɑI�����ꂽ���l

		System.out.println("�R���s���[�^��0�`99�܂ł̐����̒�����P�I�����܂����B");
		System.out.println("�I�����������𓖂ĂĂ��������B");

		// 1�`maxCount(�����ł�7)�̊ԌJ��Ԃ�(7��)
		for (int i = 1; i <= maxCount; i++) {

			try {
				System.out.println("�i" + i + "��ځj");
				String s = reader.readLine();
				int n = Integer.parseInt(s);

				// ���ۂ̔����if��
				// �����̏ꍇ
				if (n == selectedNumber) {
					System.out.println("���߂łƂ��������܂��B�����ł��B");
					// ���������̂Ńv���O�������I������B
					System.exit(0);
				// �s�����̏ꍇ
				} else {
					System.out.println("�c�O�A�Ⴂ�܂��B");

					if (n < selectedNumber) {// �I�񂾔ԍ���菬�����ꍇ
						System.out.println("�I�������l�͉𓚂����l�����u�傫���v�ł��B");
					} else {// �I�񂾔ԍ����傫���ꍇ
						System.out.println("�I�������l�͉𓚂����l�����u�������v�ł��B");
					}// ������if

				}// �O����if

				// �c��񓚐��̕���
				if (i < maxCount) {// �c��񐔂�����ꍇ
					System.out.println("�c��" + (maxCount - i) + "��𓚂ł��܂��B");
				} else {// �c��0��̏ꍇ
					System.out.println("�𓚂̐����񐔂ɒB���܂����B");
					System.out.println("������" + selectedNumber + "�ł����B");
				}// if

			} catch(IOException e) {
				System.out.println(e);
				System.exit(0);// �v���O�����I��

			} catch(NumberFormatException e) {
				System.out.println("���͂�������������������܂���B�ēx��������͂��Ă��������B");
				// �G���[����(�ē��ׁ͂̈A���͉񐔂̃J�E���g���P����)
				i--;
			}// try�`catch
			// try�`catch��for���̒��ɂ��邽�߁A�G���[���������Ă��J��Ԃ����������s�����

		}// for

	}// main
}// class
