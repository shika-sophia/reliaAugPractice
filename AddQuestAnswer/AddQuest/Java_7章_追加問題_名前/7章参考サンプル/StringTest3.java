// String�^(�Q�ƌ^)�̔�r���@�ɂ��Ⴂ3

public class StringTest3 {
	public static void main(String[] args) {

			String s1 = "Hello";
			String s2 = new String("Hello");
			String s3 = null;

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

			// s3��s2���R�s�[���As2��null�ɂ�����"Hello"�������Ĕ�r���Ă݂�B
			s3 = s2;
			s2 = null;
			s2 = "Hello";
			System.out.println("\ns2(null��)��s1�̔�r");
			// �A�h���X�̔�r(�������̂��Q�Ƃ��Ă��邩�̊m�F)
			if (s2 == s1) {
				System.out.println("s2��s1�͈�v���܂��B");
			} else {
				System.out.println("s2��s1�͈�v���܂���B");
			}
			System.out.println("\ns2(null��)��s3�̔�r");
			// �A�h���X�̔�r(�������̂��Q�Ƃ��Ă��邩�̊m�F)
			if (s2 == s3) {
				System.out.println("s2��s3�͈�v���܂��B");
			} else {
				System.out.println("s2��s3�͈�v���܂���B");
			}

	}// main
}// class
