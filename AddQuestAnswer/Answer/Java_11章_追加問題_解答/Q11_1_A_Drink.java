/*
	11�͂̓��e���g���āA���ݕ��̃N���X���쐬���Ă��������B
	�����o�ɂ́A���i���A��Ж��A���e�ʂ̃t�B�[���h��錾���Ă��������B
	�܂��A���ނƌ���Ƃ������\�b�h���쐬���Ă��������B

	�t�@�C���̓N���X���Ƃɕ����č쐬���Ă��������B

	���̃N���X����Q11_1_Drink�Ƃ����N���X�A���s����N���X��Q11_1_Test�Ƃ����N���X�ō쐬���Ă�������


*/

public class Q11_1_A_Drink{
	private String productName;
	private String company;
	private int amount;

	Q11_1_A_Drink(String productName, String company,int amount){
		this.productName = productName;
		this.company = company;
		this.amount = amount;
	}

	public String getProductName(){
		return productName;
	}
	
	public String getCompany(){
		return company;
	}
	
	public int getAmount(){
		return amount;
	}

	public void drink(){
		amount -= 50;
	}
}
	