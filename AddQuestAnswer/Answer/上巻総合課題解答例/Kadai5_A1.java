/*
 *�y�㊪�m�F���5�z
 * �ȉ��̏����𖞂����v���O���������������Ă��������B
 *
 * �ȉ��̃v���O�����̓A�p�[�g�̊e�����̏Z�l�̐����o�͂�����̂ł��B
 * �z��apartmentHouse�́AapartmentHouse[�K][�����ԍ�]��
 * ����A�p�[�g�̊e�����̏Z�l�̐���\���Ă��܂��B
 * ���̃A�p�[�g�̊e�����̏Z�l�̐����o�͗�̂悤�Ȍ`��
 * �i0�l�̂Ƃ��́u�󎺁v�ƕ\�����邱�Ƃɒ��Ӂj��
 * �\������悤�Ƀv���O���������������Ă��������B
 * ��101�����ł͂Ȃ��A11�����̂悤�ɂȂ�Ȃ��悤���ӂ��ĉ������B
 *
 *�y���s���ʁz
 * 101����: 1�l
 * 102����: 1�l
 * 103����: 1�l
 * �i�����j
 * 312����: ��
 * 313����: 2�l
 * 314����: 3�l
*/

// ���\�b�h���g�p�����𓚗�1
public class Kadai5_A1 {
	public static void main(String[] args) {

		// ����A�p�[�g�̊e�K�̊e�����̏Z�l�̐�
		int[][] apartmentHouse = {
			{ 1, 1, 1, 2, 1, 1, 2, 2, 0, 0, 3, 2, 2, 1 },
			{ 2, 2, 2, 1, 1, 1, 0, 0, 0, 1, 3, 0, 3, 2 },
			{ 1, 1, 1, 1, 2, 2, 2, 2, 3, 2, 1, 0, 2, 3 },
		};

		// �K���Ǘ�����for���[�v�B
		for (int floorIndex = 0; floorIndex < apartmentHouse.length; floorIndex++) {

			// �������Ǘ�����for���[�v�B
			for (int roomIndex = 0; roomIndex < apartmentHouse[floorIndex].length; roomIndex++) {
				// XYZ�����̊K�ɓ�����X�̕����̕\���B
				System.out.print(floorIndex + 1);// 0�E1�E2�K�ƕ\�������̂�1�E2�E3�K�ɂ��邽��
				
				// �����ԍ���1���̎���XYZ������Y�̕�����0��\���B
				if (roomIndex < 9) {
					System.out.print("0");
				}// if1
				
				// �����ԍ���\�����郁�\�b�h�̌Ăяo���B
				display(roomIndex);
				
				// �������Ƃ̓����Ґ��𔻒肷��if��
				if (apartmentHouse[floorIndex][roomIndex] > 0) {
					// �󎺂łȂ��ꍇ�͐l����\���B
					System.out.print(apartmentHouse[floorIndex][roomIndex]);
					System.out.println("�l");
				} else {
					// �󎺂̏ꍇ�͋󎺂ƕ\���B
					System.out.println("��");
				}// if2

			}// for(����)

		}//for(�O��)

	}// main

	// �����ԍ���\�����郁�\�b�h
	public static void display(int roomIndex) {
		System.out.print(roomIndex + 1);
		System.out.print("����: ");
	}// display

}//class