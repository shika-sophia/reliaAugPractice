/*
 * �ȉ��̃v���O���������������Ă��������B
 *
 * �y�o�͌��ʁz
 * A
 * B
 * C
 * D
 * E
 */

class ArrayCheck1_A {
	public static void main(String[] args) {

		// �T���̔z��̗v�f�̊m��
		String[] strArray = new String[5];

		// �e�v�f�ɕ��������
		strArray[0] = "A";
		strArray[1] = "B";
		strArray[2] = "C";
		strArray[3] = "D";
		strArray[4] = "E";

		/* ��̑���ɂ܂Ƃ߂ď������ł��ǂ�
		 * 	String[] strArray = { "A", "B", "C", "D", "E" };
		 */

		// �z��̒���-1�܂ŉ��for���[�v		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}// for

	}// main
}// class