/*

work�t�H���_��Day�t�@�C�����ړ������ĉ������B

�ȉ��Ɏ����������N���XSauce���X�[�p�[�N���X�Ɏ��T�u�N���X�AMayonnaise��Ketchup���쐬���ĉ������B
�}���l�[�Y�N���X�ɂ�100g�Ɋ܂܂�鎉���̗ʁA�P�`���b�v�N���X�ɂ�100g�Ɋ܂܂�郊�R�s���̗ʂ����t�B�[���h���쐬���Ă��������B
�����āA���s�N���X�ŁA�e�t�B�[���h���Ăяo���Ă��������B


�y���s��z
�u�����h�� : �J�S���g�}�g�P�`���b�v
�ܖ����� : [ year = 2019, month = 9, date = 4]
�c�� : 500
�c�ʂɊ܂܂�Ă��郊�R�s���̗� : 90.0mg

�u�����h�� : �L���s�[�}���l�[�Y
�ܖ����� : [ year = 2019, month = 7, date = 4]
�c�� : 450
�c�ʂɊ܂܂�Ă��鎉���̗� : 328.5mg

*/



class Sauce {
	private String name; 
	private int remainingAmount; //�c��
	private Day expirationDate; // �ܖ�����
		
	public Sauce(String name,int remainingAmount,Day expirationDate){
		this.setName(name);
		this.setRemainingAmount(remainingAmount);
		this.setExpirationDate(expirationDate);
	}

//�Z�b�^�Q
	public void setName(String name){
		this.name = name;
	}

	public void setRemainingAmount(int remainingAmount){
		this.remainingAmount = remainingAmount;
	}

	public void setExpirationDate(Day expirationDate){
		this.expirationDate = expirationDate;
	}

//�Q�b�^�Q
	public String getName(){
		return name;
	}

	public int getRemainingAmount(){
		return remainingAmount;
	}

	public Day getExpirationDate(){
		return new Day(expirationDate);
	}

}//class Sauce�I��
