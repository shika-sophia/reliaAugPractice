/*

	Q6_2�̃u�h�E���Ђ�����Ԃ��Ă�������

	���� : �O�񓯗l�A�R�[�h���Ł����g����͈̂�x�����Ƃ��܂��B
	System.out.println("����������");�͋֎~�ł��B

	[��]
		��
		����
		������
		��������
		����������
		�@�@�g�@�@
		
*/

public class Q6_2_A{
	public static void main(String[] args) {
		int num = 5;
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("��");
			}
			System.out.println("");
		}
		System.out.println("�@�@�g�@�@");

	}
}