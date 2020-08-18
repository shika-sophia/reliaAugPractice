// String型(参照型)の比較方法による違い1

import java.io.*;

public class StringTest1 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {

			System.out.println("\"Hello\"という文字を入力してください");
			String s1 = "Hello";
			String s2 = "Hello";
			String s3 = new String("Hello");
			String s4 = reader.readLine();

			System.out.println("\ns1とs2の比較");
			// 「==」で比較(アドレスで比較)
			if (s1 == s2) {
				System.out.println("条件式==のとき、一致");
			} else {
				System.out.println("条件式==のとき、不一致");
			}
			// 「equalsメソッド」で比較(中身の文字列での比較)
			if (s2.equals(s1)) {
				System.out.println("s2.equals(s1)のとき、一致");
			} else {
				System.out.println("s2.equals(s1)のとき、不一致");
			}

			System.out.println("\ns1とs3の比較");
			// 「==」で比較(アドレスで比較)
			if (s1 == s3) {
				System.out.println("条件式==のとき、一致");
			} else {
				System.out.println("条件式==のとき、不一致");
			}
			// 「equalsメソッド」で比較(中身の文字列での比較)
			if (s3.equals(s1)) {
				System.out.println("s3.equals(s1)のとき、一致");
			} else {
				System.out.println("s3.equals(s1)のとき、不一致");
			}

			System.out.println("\ns1とs4の比較");
			// 「==」で比較(アドレスで比較)
			if (s1 == s4) {
				System.out.println("条件式==のとき、一致");
			} else {
				System.out.println("条件式==のとき、不一致");
			}
			// 「equalsメソッド」で比較(中身の文字列での比較)
			if (s4.equals(s1)) {
				System.out.println("s4.equals(s1)のとき、一致");
			} else {
				System.out.println("s4.equals(s1)のとき、不一致");
			}

		} catch (IOException e) {
			System.out.println(e);
		}// try～catch

	}// main
}// class
