/*
 * �ȉ��̏o�͌��ʂɂȂ�悤�Ƀv���O���������������Ă��������B
 *
 * �y�o�͌��ʁz
 * 5 + 5 = 10
 * 10 - 5 = 5
 * 5 * 5 = 25
 * 20 / 5 = 4
 *
 */

class MethodCheck1_A {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;

		// ���𓚗� ��������
		// ���\�b�h���Ăяo���A�߂�l����
		a = tasu(5, 5);
		b = hiku(10, 5);
		c = kakeru(5, 5);
		d = waru(20, 5);

		System.out.println("5 + 5 = " + a);
		System.out.println("10 - 5 = " + b);
		System.out.println("5 * 5 = " + c);
		System.out.println("20 / 5 = " + d);
		// ���𓚗� �����܂�
	}// main

	//�����Z
	public static int tasu(int i, int j) {
		return i + j;
	}// tasu

	//�����Z
	public static int hiku(int i, int j) {
		return i - j;
	}// hiku

	//�|���Z
	public static int kakeru(int i, int j) {
		return i * j;
	}// kakeru

	//����Z
	public static int waru(int i, int j) {
		return i / j;
	}// waru

}// class