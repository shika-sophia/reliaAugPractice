/* �\�[�g(���ёւ�)�v���O����
 *
 * �y�o�͌��ʁz
 *
 * ���בւ���O
 * 31 41 59 26 53 58 97 93 23 84
 *
 ************************************
 *
 * ����1���
 * ������2��
 * 23 41 59 31 53 58 97 93 26 84
 *
 * ����2���
 * ������2��
 * 23 26 59 41 53 58 97 93 31 84
 *
 * ��������
 *
 * ����9���
 * ������1��
 * 23 26 31 41 53 58 59 84 93 97
 *
 ************************************
 *
 * ���ёւ�������16��
 * ���ёւ����ŏI����
 * 23 26 31 41 53 58 59 84 93 97
 */

public class SortDataCheck_A {
	public static void main(String[] args) {
		
		int change = 0;	
		int change_sum = 0;

		// ���߂�ꂽ���l�Ŕz������ꍇ
		int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };
		/* �����_���ɔz������ꍇ(��:30��) 
		int[] data = new int[30];
		//�\�[�g�������z��f�[�^�������_���Ő���(��:0�`499)
		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random() * 500);
		}*/

		// 	������Ԃ̈ꗗ
		System.out.println("���בւ���O");

		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}// for

		System.out.println("\n");
		System.out.println("***********************************");
		System.out.println("");

		// �z��̐������`�F�b�N����(��{�����@�A�אڌ����@)
		for (int i = 0; i < data.length - 1; i++) {
			// ���Ԃɔ�r���Ă���
			for (int j = i + 1; j < data.length; j++) {
				// ���������������������i�K�Ō������s��
				if (data[i] > data[j]) {
					// �����̌���
					int a = data[i];
					data[i] = data[j];
					data[j] = a; 
					// �����񐔂��`�F�b�N����
					change++;
				}// if
			}// for(����1)

			// ������̏�ԕ\��
			System.out.println("����" + (i + 1) + "���");
			System.out.println("������" + change + "��");

			for (int k = 0; k < data.length; k++) {
				System.out.print(data[k] + " ");
			}// for(����2)

			System.out.println("\n");
			change_sum += change;
			change = 0;// �����񐔂̃��Z�b�g

		}// for(�O��)
	
		//�ŏI���ʂ̕\��
		System.out.println("***********************************");
		System.out.println("");
		System.out.println("���ѕς�������" + change_sum + "��");
		System.out.println("���בւ����ŏI����");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}// for

		System.out.println("");

	}// main

}// class