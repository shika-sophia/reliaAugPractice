
/*
	
	Q11_1_Drink�����s���邽�߂̃N���X���쐬���Ă��������B


	[���s��]
	�J���s�X�E�H�[�^�[ �c��430ml
	�R�J�R�[�� �c��500ml
	�J���s�X�E�H�[�^�[�����݂܂�
	�J���s�X�E�H�[�^�[�̎c��̗ʂ�380ml
	�R�J�R�[���̎c��̗ʂ�500ml
*/


public class Q11_1_A_Test{
	public static void main(String[] args){
		Q11_1_A_Drink calpis = new Q11_1_A_Drink("�J���s�X�E�H�[�^�[", "�A�T�q����", 430);
		Q11_1_A_Drink cocacola = new Q11_1_A_Drink("�R�J�R�[��", "�R�J�E�R�[����", 500);


		System.out.println(calpis.getProductName() + " �c��" + calpis.getAmount() + "ml");
		System.out.println(cocacola.getProductName() + " �c��" + cocacola.getAmount() + "ml");
		
		System.out.println(calpis.getProductName() + "�����݂܂�");
		calpis.drink();

		System.out.println(calpis.getProductName() + "�̎c��̗ʂ�" + calpis.getAmount() + "ml");
		System.out.println(cocacola.getProductName() + "�̎c��̗ʂ�" + cocacola.getAmount() + "ml");
	}

}