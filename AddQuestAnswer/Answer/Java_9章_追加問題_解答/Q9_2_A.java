/*
	main���\�b�h�̈����AString[] args�ɕ���������ďo�͂��Ă��������B
	
	java �N���X�� args�ɓ���镶����
	�ƃR�}���h�v�����v�g�ɓ��͂���Ɨ��p���邱�Ƃ��o���܂��B

	System.out.println(args[0]);�ŏo�͏o����̂ŁAfor����length���g���āA�������͂������̂�S�ďo�͏o����悤�ɂ��Ă��������B

	[���s��]
	C:\...>java Q9_2_A aaaaa bbbbb ccccc ddddd
	args�ɓ��͂��ꂽ�������aaaaa�ł�
	args�ɓ��͂��ꂽ�������bbbbb�ł�
	args�ɓ��͂��ꂽ�������ccccc�ł�
	args�ɓ��͂��ꂽ�������ddddd�ł�

*/



class Q9_2_A{
	public static void main(String[] args){
		for (int i = 0; i < args.length; i++) {
			System.out.println("args�ɓ��͂��ꂽ�������" + args[i] + "�ł�");
		}

	}
}