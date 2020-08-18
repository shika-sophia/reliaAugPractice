// String型(参照型)の比較方法による違い2

public class StringTest2 {
	public static void main(String[] args) {

			String s1 = "Hello";
			String s2 = "Hello";
			String s3 = new String("Hello");
			String s4 = null;

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

			// s2をnullにして再度代入してみる
			s2 = null;
			s2 = "Hello";
			System.out.println("\ns1とs2(null後)の比較");
			// アドレスの比較(同じものを参照しているかの確認)
			if (s1 == s2) {
				System.out.println("s1とs2は一致します。");
			} else {
				System.out.println("s1とs2は一致しません。");
			}

			// s4にs3をコピーし、s3をnullにした後再代入して比較してみる。
			s4 = s3;
			s3 = null;
			s3 = new String("Hello");
			System.out.println("\ns3(null後)とs4の比較");
			// アドレスの比較(同じものを参照しているかの確認)
			if (s3 == s4) {
				System.out.println("s3とs4は一致します。");
			} else {
				System.out.println("s3とs4は一致しません。");
			}

	}// main
}// class
