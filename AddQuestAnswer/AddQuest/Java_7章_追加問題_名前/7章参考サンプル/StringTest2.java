// String�^(�Q�ƌ^)�̔�r���@�ɂ��Ⴂ2

public class StringTest2 {
	public static void main(String[] args) {

			String s1 = "Hello";
			String s2 = "Hello";
			String s3 = new String("Hello");
			String s4 = null;

			System.out.println("\ns1��s2�̔�r");
			// �A�h���X�̔�r(�������̂��Q�Ƃ��Ă��邩�̊m�F)
			if (s1 == s2) {
				System.out.println("s1��s2�͈�v���܂��B");
			} else {
				System.out.println("s1��s2�͈�v���܂���B");
			}

			System.out.println("\ns1��s3�̔�r");
			// �A�h���X�̔�r(�������̂��Q�Ƃ��Ă��邩�̊m�F)
			if (s1 == s3) {
				System.out.println("s1��s3�͈�v���܂��B");
			} else {
				System.out.println("s1��s3�͈�v���܂���B");
			}

			// s2��null�ɂ��čēx������Ă݂�
			s2 = null;
			s2 = "Hello";
			System.out.println("\ns1��s2(null��)�̔�r");
			// �A�h���X�̔�r(�������̂��Q�Ƃ��Ă��邩�̊m�F)
			if (s1 == s2) {
				System.out.println("s1��s2�͈�v���܂��B");
			} else {
				System.out.println("s1��s2�͈�v���܂���B");
			}

			// s4��s3���R�s�[���As3��null�ɂ�����đ�����Ĕ�r���Ă݂�B
			s4 = s3;
			s3 = null;
			s3 = new String("Hello");
			System.out.println("\ns3(null��)��s4�̔�r");
			// �A�h���X�̔�r(�������̂��Q�Ƃ��Ă��邩�̊m�F)
			if (s3 == s4) {
				System.out.println("s3��s4�͈�v���܂��B");
			} else {
				System.out.println("s3��s4�͈�v���܂���B");
			}

	}// main
}// class
