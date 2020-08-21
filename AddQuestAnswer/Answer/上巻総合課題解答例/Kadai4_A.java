/*
 *�y�㊪�m�F���4�z 
 * 3�}�X�̒����瓮��������ł��錊�̏ꏊ�𓖂Ă�Q�[���ł��B
 *
 *  ���C���[�W�}��(�\��������K�v�͂���܂��񂪂ł�����̓`�������W���Ă�������)
 *     1    2    3
 *  |----+----+----|
 *  |    |    | �� |
 *  |----+----+----|
 *
 * ���̏ꍇ�u3�v�ɐ���ł��邱�ƂɂȂ�܂��B
 * �Q�[�����J�n����ƁA�����̓}�X�̂����ꂩ�ɓ������݂܂��B
 * ����������ł���ꏊ��\�z���ďꏊ����͂���ƁA
 * �����������ꍇ�A�u�����I�v
 * ���Ȃ������ꍇ�A�u���܂���ł����B�v
 * �ƕ\������悤�ȃv���O�������쐬���Ă��������B
 *
 *�y���s���ʁz
 * �Q�[�����J�n���܂��B
 *
 * �E�E�E�E�E�������ǂ����ɓ������݂܂����B
 *
 * ����������ꏊ����͂��Ă��������B
 * ��1�`3�̂����ꂩ����͂��Ă��������B
 *
 * 4
 *
 * ���͓��e�Ɍ�肪����܂��B
 * 1�`3�̂����ꂩ����͂��Ă��������B
 *
 * 2
 *
 * ���܂���ł����B
 * ����������ꏊ����͂��Ă��������B
 *
 * 1
 *
 * ���܂���ł����B
 * ����������ꏊ����͂��Ă��������B
 *
 * 3
 *
 * �����I
 * ���߂łƂ��������܂��B
 *
 * �Q�[�����I�����܂��B
 *
 *
 * �ȉ��̉𓚗��@�`�F�Ƀ\�[�X�R�[�h���L�q���āA��L�̗v���𖞂����Ă��������B
 */


import java.io.*;

public class Kadai4_A {
	public static void main(String[] args) {
		String line = "";
		int check = 0;
		int location = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�Q�[�����J�n���܂��B\n");
		System.out.println("�E�E�E�E�E�������ǂ����ɓ������݂܂����B\n");
		System.out.println("����������ꏊ����͂��Ă��������B");
		System.out.println("��1�`3�̂����ꂩ����͂��Ă��������B\n");

		// 1�`3�̂����ꂩ�������_���Ŏ擾
		location = (int)(Math.random() * 3) + 1;// �𓚗��@

		try {

			while((line = reader.readLine()) != null) {

				// ���͓��e�����������`�F�b�N������(���͕����������ɔ��胁�\�b�h�Ăяo��)
				if(checkInput(line)) {// �𓚗��A
					check = Integer.parseInt(line);

					// �����̏ꏊ�Ɠ��͏ꏊ�����������`�F�b�N
					if(location == check) {// ������ �𓚗��B
						System.out.println("\n�����I");
						System.out.println("���߂łƂ��������܂��B\n");
						break;
					} else {// ������Ȃ�����
						System.out.println("\n�����ɂ͂��܂���ł����B");
						System.out.println("����������ꏊ����͂��Ă��������B\n");
					}// if(����)

				} else {// ���̓~�X
					System.out.println("\n���͓��e�Ɍ�肪����܂��B");
					System.out.println("1�`3�̂����ꂩ����͂��Ă��������B\n");
				}// if(�O��)

			}// while

		} catch (IOException e) {
			System.out.println(e);
		}// try�`catch

		System.out.println("�Q�[�����I�����܂��B");
	}// main

	// ���͓��e���`�F�b�N���郁�\�b�h
	public static boolean checkInput(String line) {
		boolean check = true;

		// ���͂�1�����̏ꍇ
		if(line.length() == 1) {// �𓚗��C
			// �����ȊO�����͂���Ă���ꍇ�˕����񂩂當�����擾���Ă��܂��B
			char c = line.charAt(0);// �𓚗��D

			if(c < 49 || c > 51) {// �����R�[�h�Ŕ��肵�Ă���(49��1�A51��3) �𓚗��E
				check = false;
			}// if(����)

		} else {
			check = false;
		}// if(�O��)

		return check;// �𓚗��F

	}// checkInput

}// class