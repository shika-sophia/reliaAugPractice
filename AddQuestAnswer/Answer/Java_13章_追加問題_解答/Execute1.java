/**
 *	�ȉ��̃v���O������ǂ�ŏo�͌��ʂ�\�z���Ă��������B
 */


class ExceptionCheck1 {

	public void check() {

		System.out.println("check���\�b�h���Ăяo����܂����B");
		String strParam = "abc";
		int intParam = 0;

		try {
			intParam = Integer.parseInt(strParam);
			System.out.println("�����񂩂琔�l�ւ̕ϊ����s���܂����B");
		} catch(NumberFormatException e) {
			System.out.println("catch�߂̏��������s���܂����B");
		} finally {
			System.out.println("finally�߂̏��������s���܂����B");
		}// try�`catch�`finally

	}// check

}// ExceptionCheck1�N���X


// ���s�N���X
class Execute1 {

	public static void main(String[] args) {
		System.out.println("�������J�n���܂��B");
		ExceptionCheck1 exp = new ExceptionCheck1();
		exp.check();
		System.out.println("�������I�����܂��B");
	}// main

}// Execute1�N���X
