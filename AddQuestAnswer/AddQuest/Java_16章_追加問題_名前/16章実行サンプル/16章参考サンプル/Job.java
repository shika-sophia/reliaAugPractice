// P191 ���16�\10�̓���m�F�pJob�N���X

class Job {

	// �t�B�[���h
	int num;

	// �R���X�g���N�^
	public Job(int n) {
		num = n;
	}

	public void work() {
		System.out.println(this + " �������Ă��܂�");

		try {
			Thread.sleep((int)(Math.random() * 10000));
		} catch (InterruptedException e) {
		}// try�`catch

	}// work

	@Override
	public String toString() {
		return "[Job " + num + "]";
	}// toString

}// class
