// String�^(�Q�ƌ^)�̔�r���@�ɂ��Ⴂ1

import java.io.*;

public class StringTest1 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {

			System.out.println("\"Hello\"�Ƃ�����������͂��Ă�������");
			String s1 = "Hello";
			String s2 = "Hello";
			String s3 = new String("Hello");
			String s4 = reader.readLine();

			System.out.println("\ns1��s2�̔�r");
			// �u==�v�Ŕ�r(�A�h���X�Ŕ�r)
			if (s1 == s2) {
				System.out.println("������==�̂Ƃ��A��v");
			} else {
				System.out.println("������==�̂Ƃ��A�s��v");
			}
			// �uequals���\�b�h�v�Ŕ�r(���g�̕�����ł̔�r)
			if (s2.equals(s1)) {
				System.out.println("s2.equals(s1)�̂Ƃ��A��v");
			} else {
				System.out.println("s2.equals(s1)�̂Ƃ��A�s��v");
			}

			System.out.println("\ns1��s3�̔�r");
			// �u==�v�Ŕ�r(�A�h���X�Ŕ�r)
			if (s1 == s3) {
				System.out.println("������==�̂Ƃ��A��v");
			} else {
				System.out.println("������==�̂Ƃ��A�s��v");
			}
			// �uequals���\�b�h�v�Ŕ�r(���g�̕�����ł̔�r)
			if (s3.equals(s1)) {
				System.out.println("s3.equals(s1)�̂Ƃ��A��v");
			} else {
				System.out.println("s3.equals(s1)�̂Ƃ��A�s��v");
			}

			System.out.println("\ns1��s4�̔�r");
			// �u==�v�Ŕ�r(�A�h���X�Ŕ�r)
			if (s1 == s4) {
				System.out.println("������==�̂Ƃ��A��v");
			} else {
				System.out.println("������==�̂Ƃ��A�s��v");
			}
			// �uequals���\�b�h�v�Ŕ�r(���g�̕�����ł̔�r)
			if (s4.equals(s1)) {
				System.out.println("s4.equals(s1)�̂Ƃ��A��v");
			} else {
				System.out.println("s4.equals(s1)�̂Ƃ��A�s��v");
			}

		} catch (IOException e) {
			System.out.println(e);
		}// try�`catch

	}// main
}// class
