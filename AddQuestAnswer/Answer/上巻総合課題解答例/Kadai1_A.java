/*
 *�y�㊪�m�F���1�z
 * �ȉ��̏����𖞂����v���O���������������Ă��������B
 *
 *�y�����z
 * �E�������擾���A1�̏ꍇ�́u�����v�A2�̏ꍇ�́u�Ɂv�A3�̏ꍇ�́u����v
 *   �ƕ\�������悤�ɂ���
 * �Eswitch�����g�p����
 *
 *�y�o�͌��ʁz
 * ����
 */

public class Kadai1_A {
	public static void main(String[] args) {
		int count = 0;
		String result = "";

		// �����_���ɐ�����I��
		count = (int)(Math.random() * 3) + 1;

		switch (count) {
		case 1:
			result = "����";
			break;

		case 2:
			result = "��";
			break;

		case 3:
			result = "����";
			break;
		}// switch

		// ���ʂ̏o��
		System.out.println(result);

	}// main
}// class