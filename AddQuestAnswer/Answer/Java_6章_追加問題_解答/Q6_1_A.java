/*

	��dfor�����g���āu���v�Ńu�h�E������Ă��������B

	���� : �R�[�h���Ł����g����͈̂�x�����Ƃ��܂��B
	System.out.println("����������");�͋֎~�ł��B

	[��]
		�g
	�@�@����������
	�@�@��������
	�@�@������
	�@�@����
	�@�@��
		
*/

class Q6_1_A{
	public static void main(String[] args){
		int num = 10;

		//�w�^�̕����͂�����g���Ă��������B
		System.out.println("�@�@�g�@�@");

		for(int i = 1; i <= num; i++){
			for(int j = 1; j <= num - i + 1; j++){
				System.out.print("��");
			}
			System.out.println();
		}

		
	}
}