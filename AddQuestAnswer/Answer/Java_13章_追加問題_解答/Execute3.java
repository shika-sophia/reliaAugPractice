/**
 *	�ȉ��̃v���O������ǂ�ŏo�͌��ʂ�\�z���Ă��������B
 *
 *	�y���s���@�z
 *�@java Execute3 4
 *�Ajava Execute3 ABC
 *�Bjava Execute3 10
 */


class ExceptionCheck3 {

	public void check1(int inputParam) throws ArrayIndexOutOfBoundsException {
		int[] intArray = new int[5];

		for(int i = 0; i < inputParam; i++ ) {
			intArray[i] = i;
		}// for

		System.out.println("check1���\�b�h�����������s����܂����B");
	}// check1
	
	public void check2(String inputParam)  {
		System.out.println(inputParam + "�͐����ł͂���܂���B");
	}// check2

}// ExceptionTest3�N���X


// ���s�N���X
class Execute3 {

	public static void main(String[] args) {
		ExceptionCheck3 exp = new ExceptionCheck3();
		int inputParam = 0;

		//���̓`�F�b�N
		if(args.length != 1) {
			System.out.println("�g�p���@�Fjava Execute3 ����");
			System.exit(0);
		}// if

		try{
			inputParam = Integer.parseInt(args[0]);

			try{
				exp.check1(inputParam);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("check1���\�b�h�͐��������s����܂���ł����B");
			}// try�`catch

		} catch (NumberFormatException e) {
			exp.check2(args[0]);
		}// try�`catch
	}// main

}// Execute3�N���X
