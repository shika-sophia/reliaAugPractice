/*
 *�y�㊪�m�F���2�z
 * �ȉ��̏����𖞂����v���O���������������Ă��������B
 *
 * �y�����z
 * �E�v���O�����ɏ�����Ă���ϐ��͕K���g�p����
 * �Efor������g�p����
 *
 *�y�o�͌��ʁz
 * �e�w�N�̍��v�l���́A
 * 1�N�F78�l
 * 2�N�F76�l
 * 3�N�F93�l
 * �ł��B
 */

public class Kadai2_A {
	public static void main(String[] args) {
		int sum = 0;

		// �N���X�ʂ̓_�����Ǘ�����z��
		int[][] intArray = {
			{ 30, 24, 24 },	//1�N�F1�g,2�g,3�g
			{ 29, 21, 26 },	//2�N�F1�g,2�g,3�g
			{ 31, 31, 31 },	//3�N�F1�g,2�g,3�g
		};

		// �w�N�����Ǘ�����z��
		String[] strArray = { "1�N", "2�N", "3�N" };
		
		System.out.println("�e�w�N�̍��v�l���́A");

		// �w�N���Ǘ�����for���[�v
		for(int i = 0; i < intArray.length; i++) {
			sum = 0;

			// ���k�������v����for���[�v
			for(int j = 0; j < intArray[i].length ;j++) {
				sum = sum + intArray[i][j];
			}// for()����

			// ���ʂ̕\��
			System.out.println(strArray[i] + "�F" + sum + "�l");
		}// for(�O��)

		System.out.println("�ł��B");
	}// main
}// class