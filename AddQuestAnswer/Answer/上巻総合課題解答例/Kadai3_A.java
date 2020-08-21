/*
 *�y�㊪�m�F���3�z
 * �ȉ��̏����𖞂����v���O���������������Ă��������B
 *
 *�y�����z
 * �E�l�����Z���s���v�Z�@���쐬���Ă��������B
 * �E���s���Ɂwjava Kadai3 ���l1 ���l2 ���Z�q�x�Ƃ����`���Ŏ��s��������
 *   �g�p���Ď��s����ƁA�A�L���ɂ������v�Z���ʂ��\�������悤�ɂ��܂��B
 *
 * ���E����Z���ʂ�int�^�ɃL���X�g(�ϊ�)���Ă��������B
 *   �E���̓~�X���ɂ̓G���[���b�Z�[�W�Ǝ��s���\�����ďI�����܂��B
 *
 *<��>
 * C:\work>java Kadai3 5 10 �{
 * C:\work>java Kadai3 4 2 �|
 * C:\work>java Kadai3 6 9 �~
 * C:\work>java Kadai3 8 2 ��
 *
 *�y�o�͌��ʁz
 * C:\work>java Kadai3 3 4 �{
 * �v�Z���ʂ�
 * 7
 *
 * C:\work>java Kadai3 5 2 �|
 * �v�Z���ʂ�
 * 3
 *
 * C:\work>java Kadai3
 * ���̓G���[�F�ȉ��̌`���œ��͂��ĉ������B(���Z�q�͔��p�ł���)
 * �y���s��zC:\work>java Kadai3 3 4 ��
 */

public class Kadai3_A {
	public static void main(String[] args) {

		int param1;// args[0]���i�[����ϐ�
		int param2;// args[1]���i�[����ϐ�
		int result;// �v�Z���ʂ��i�[����ϐ�

		// �v���ɂ͂Ȃ������s�������̓��͊m�F
		if (args.length != 3) {
			System.out.println("���̓G���[�F�ȉ��̂悤�ɔ��p�����ƑS�p�L���œ��͂��ĉ������B");
			System.out.println("�y���s��zC:\\work>java Kadai3 3 4 ��");
			System.exit(0);
		}

		try {
			// ���s�����͈�������
			param1 = Integer.parseInt(args[0]);// args[0]��ϊ�
			param2 = Integer.parseInt(args[1]);// args[1]��ϊ�

			// ���\�b�h�̌Ăяo��
			result = calc(param1,param2,args[2]);

			// ���ʕ\��
			System.out.println("�v�Z����" + result);
		} catch (NumberFormatException e) {
			System.out.println("���l�̓��͂��Ԉ���Ă��܂��B");
		}
	}// main
	
	/*�l�����Z���s�����\�b�h
		(String operator�ɂ� "�{"�A"�|"�A"�~"�A"��" �̂����ꂩ������܂��B)*/
	public static int calc(int param1 ,int param2 ,String operator) {
		int r = 0;

		// ���͂��ꂽ�����ł̕���
		if(operator.equals("�{") || operator.equals("+")) {
			r = param1 + param2;
		} else if(operator.equals("�|") || operator.equals("-")) {
			r = param1 - param2;
		} else if(operator.equals("�~") || operator.equals("*")) {
			r = param1 * param2;
		} else if(operator.equals("��") || operator.equals("/")) {
			r = param1 / param2;
		} else {// ���̓~�X���̏���
			System.out.println("���̓G���[�F�ȉ��̌`���œ��͂��ĉ������B(���Z�q�͔��p�ł���)");
			System.out.println("�y���s��zC:\\work>java Kadai3 3 4 ��");
			System.exit(0);// �g�p���\�����ďI��������
		}// if
		return r;

	}// calc
}// class