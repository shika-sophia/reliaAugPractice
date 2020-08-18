// String型(参照型)の比較方法による違い3

public class StringTest3 {
	public static void main(String[] args) {

			String s1 = "Hello";
			String s2 = new String("Hello");
			String s3 = null;

			System.out.println("\ns1とs2の比較");
			// アドレスの比較(同じものを参照しているかの確認)
			if (s1 == s2) {
				System.out.println("s1とs2は一致します。");
			} else {
				System.out.println("s1とs2は一致しません。");
			}

			System.out.println("\ns1とs3の比較");
			// アドレスの比較(同じものを参照しているかの確認)
			if (s1 == s3) {
				System.out.println("s1とs3は一致します。");
			} else {
				System.out.println("s1とs3は一致しません。");
			}

			// s3にs2をコピーし、s2をnullにした後"Hello"を代入して比較してみる。
			s3 = s2;
			s2 = null;
			s2 = "Hello";
			System.out.println("\ns2(null後)とs1の比較");
			// アドレスの比較(同じものを参照しているかの確認)
			if (s2 == s1) {
				System.out.println("s2とs1は一致します。");
			} else {
				System.out.println("s2とs1は一致しません。");
			}
			System.out.println("\ns2(null後)とs3の比較");
			// アドレスの比較(同じものを参照しているかの確認)
			if (s2 == s3) {
				System.out.println("s2とs3は一致します。");
			} else {
				System.out.println("s2とs3は一致しません。");
			}

	}// main
}// class
