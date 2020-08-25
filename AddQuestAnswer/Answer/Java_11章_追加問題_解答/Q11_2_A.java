/*
	�r�f�I�e�[�v�̃N���X���쐬���Ă��������B
	�N���X�ɂ́A�ȉ��̃����o���������Ă��������B

	�t�B�[���h
		String
			�r�f�I�̃^�C�g��
			���i�ԍ�
		double
			���^����
			�ꎞ��~��������
			�c�莞��
	
	���\�b�h
		Setter��Getter
		
		�^�C�g���E���i�ԍ��E���^���Ԃ�\�����郁�\�b�h
		�c��̎��Ԃ��擾����
		�w�肵�����������肷�郁�\�b�h
		�����߂��Č��݂̎��ԂƎc�莞�Ԃ����Z�b�g���郁�\�b�h

	�R���X�g���N�^�ɂ�鐶�����ɂ́A�t�B�[���h�ɗ^�����^�C�g���A���i�ԍ��A���^���Ԃ���������ݒ肷��B
	�Ȃ��A�ꎞ��~�������Ԃ�0�A�c�莞�Ԃ͎��^���ԂƓ����ɂȂ�悤��Setter���g���Đݒ肵�Ă��������B

	�܂��A�ʃN���X��main���\�b�h����A�r�f�I�e�[�v�̃C���X�^���X�𐶐����āA���\�b�h���Ăяo���Ă��������B


	[���s��]
	�^�C�g�� : ���l�̎�
	���i�ԍ� : KUROSAWA-1954
	���^���� : 207.0
	���݂̎���: 0.0
	�c�莞��: 207.0

	50.2�������肵�܂�

	�^�C�g�� : ���l�̎�
	���i�ԍ� : KUROSAWA-1954
	���^���� : 207.0
	���݂̎���: 50.2
	�c�莞��: 156.8

	�ԋp�p�ɍŏ��܂Ŋ����߂��܂�

	�^�C�g�� : ���l�̎�
	���i�ԍ� : KUROSAWA-1954
	���^���� : 207.0
	���݂̎���: 0.0
	�c�莞��: 207.0

	


*/


class Vhs {
	private String title;
	private String productNumber;
	private double runningTimes;
	private double currentTime;
	private double remainingTime;
	
	Vhs(String title, String productNumber, double runningTimes) {
		setTitle(title);
		setProductNumber(productNumber);
		setRunningTimes(runningTimes);
		setCurrentTime(0);
		setRemainingTime(runningTimes);
		
	}
	
	void setTitle(String title) {
		this.title = title;
	}
	void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}
	void setRunningTimes(double runningTimes) {
		this.runningTimes = runningTimes;
	}
	void setCurrentTime(double currentTime) {
		this.currentTime = currentTime;
	}
	void setRemainingTime(double remainingTime) {
		this.remainingTime = remainingTime;
	}

	String getTitle() {
		return title;
	}
	
	String getProductNumber() {
		return productNumber;
	}
	double getRunningTimes() {
		return runningTimes;
	}
	double getCurrentTimes() {
		return currentTime;
	}
	double getRemainingTime() {
		return remainingTime;
	}

	void putInfomation() {
		System.out.println("�^�C�g�� : " + title);
		System.out.println("���i�ԍ� : " + productNumber);
		System.out.println("���^���� : " + runningTimes);

		System.out.println("���݂̎���: " + currentTime);
		System.out.println("�c�莞��: " + remainingTime);
	}

	boolean fastForward(double x) {
		System.out.println(x + "�������肵�܂�");
		if(x > remainingTime) {
			return false;
		}else {
			remainingTime -= x;
			currentTime += x;

			return true;
		}

	}
	
	void rewind() {
		System.out.println("�ԋp�p�ɍŏ��܂Ŋ����߂��܂�");
		remainingTime = runningTimes;
		currentTime = 0;
	}

}

public class Q11_2_A{
	public static void main(String[] args){
		Vhs vhs = new Vhs("���l�̎�", "KUROSAWA-1954", 207);
		vhs.putInfomation();

		vhs.fastForward(50.2);
		vhs.putInfomation();

		vhs.rewind();
		vhs.putInfomation();

	}
}

