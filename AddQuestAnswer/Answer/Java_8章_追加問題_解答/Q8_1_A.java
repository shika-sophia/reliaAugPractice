
/*

	int�^��n�ɍD���Ȑ����������Ă��������B

	�n����������3�{�ɂ��ă��^�[�����郁�\�b�h�A5�{�̃��\�b�h�A10�{�̃��\�b�h��錾���A���ꂼ����o�R���ďo�͂��Ă��������B


	[��]
	
	5��3�{�ɂ��܂��B
	��
	�i���\�b�h�ɓn���j
	��
	5��3�{�ɂ����15�ɂȂ�܂����B

	��

	5��5�{�ɂ��܂��B
	��
	�i���\�b�h�ɓn���j
	��
	5��5�{�ɂ����25�ɂȂ�܂���

	��

	5��10�{�ɂ��܂��B
	��
	�i���\�b�h�ɓn���j
	��
	5��10�{�ɂ����50�ɂȂ�܂���
	

*/




public class Q8_1_A{
	public static void main(String[] args){
		int n = 5;
		int m;

		System.out.println(n + "��3�{�ɂ��܂��B");
		m = threeTimes(n);
		System.out.println(n + "��3�{�ɂ����" + m + "�ɂȂ�܂����B");

		System.out.println(n + "��5�{�ɂ��܂��B");
		m = fiveTimes(n);
		System.out.println(n + "��5�{�ɂ����" + m + "�ɂȂ�܂����B");

		System.out.println(n + "��10�{�ɂ��܂��B");
		m = tenTimes(n);
		System.out.println(n + "��10�{�ɂ����" + m + "�ɂȂ�܂����B");
	}

	public static int threeTimes(int n){
		return n * 3;
	}

	public static int fiveTimes(int n){
		return n * 5;
	}

	public static int tenTimes(int n){
		return n * 10;
	}
}
