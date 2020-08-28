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
		this.expirationDate = new Day(expirationDate);
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


/*
�𓚂�1��ł��B
*/


//Sauce���X�[�p�[�N���X�Ɏ���Ketchup�N���X
class Ketchup extends Sauce{
//100mg������Ɋ܂܂�郊�R�s���̗ʂ�����
	private double lycopene;
	
	public Ketchup(String name,int remainingAmount, double lycopene, Day purchaseDay){
		super(name,remainingAmount,purchaseDay);
		setLycopene(lycopene);
	}
//�Z�b�^
	public void setLycopene(double lycopene){
		this.lycopene = lycopene;
	}

	public double getLycopene(){
		return lycopene;
	}
}

//Sauce���X�[�p�[�N���X�Ɏ���Mayonnaise�N���X
class Mayonnaise extends Sauce{
//100mg������Ɋ܂܂�鎉���̗�
	private double lipid;
	
	public Mayonnaise(String name,int remainingAmount, double lipid, Day purchaseDay){
		super(name,remainingAmount,purchaseDay);
		setLipid(lipid);
	}
//�Z�b�^
	public void setLipid(double lipid){
		this.lipid = lipid;
	}

	public double getLipid(){
		return lipid;
	}
}



//���s�N���X
public class Q12_1_A{
	public static void main(String[] args){
		Ketchup ketchup = new Ketchup("�J�S���g�}�g�P�`���b�v",500,18,new Day(2019,9,4));
		Mayonnaise mayonnaise = new Mayonnaise("�L���s�[�}���l�[�Y",450,73,new Day(2019,7,4));

		System.out.println("�u�����h�� : " + ketchup.getName());
		System.out.println("�ܖ����� : " + ketchup.getExpirationDate());
		System.out.println("�c�� : " + ketchup.getRemainingAmount());
		System.out.println("�c�ʂɊ܂܂�Ă��郊�R�s���̗� : " + ketchup.getLycopene() / 100 * ketchup.getRemainingAmount() + "mg");

		System.out.println("�u�����h�� : " + mayonnaise.getName());
		System.out.println("�ܖ����� : " + mayonnaise.getExpirationDate());
		System.out.println("�c�� : " + mayonnaise.getRemainingAmount());
		System.out.println("�c�ʂɊ܂܂�Ă��鎉���̗� : " + mayonnaise.getLipid() / 100 *mayonnaise.getRemainingAmount() + "mg");
	}	
	
}