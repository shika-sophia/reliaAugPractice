/**
 *	�ȉ��̃v���O������ǂ�ŏo�͌��ʂ�\�z���Ă��������B
 */

class ExceptionCheck2 {

	public void check() throws NumberFormatException {
		String strParam = "abc";
		int intParam = 0;
		intParam = Integer.parseInt(strParam);

		System.out.println("�����񂩂琔�l�ւ̕ϊ����s���܂����B");
	}// check

}// ExceptionCheck2�N���X


// ���s�N���X
class Execute2 {

	public static void main(String[] args) {
		ExceptionCheck2 exp = new ExceptionCheck2();
		System.out.println("�������J�n���܂��B");

		try{
			exp.check();
		} catch (NumberFormatException e) {
			System.out.println("catch�߂̏��������s���܂����B");
		}// try�`catch

		System.out.println("�������I�����܂��B");
	}// main

}// Execute2�N���X
