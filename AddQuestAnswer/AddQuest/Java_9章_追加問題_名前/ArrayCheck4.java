/* 
 * 以下のプログラムを読んで出力結果を予測してください。
 */

public class ArrayCheck4 {
	public static void main(String[] args) {

		int[] intArray1 = { 2, 8, 6, 2, 7 };
		int[] intArray2 = new int[5];
		int check = 30;
		
		for(int i = 0; i < intArray1.length; i++) {
			intArray2[i] = intArray1[i] + i * 2;
		}// for

		int j = 0;
		while(check > 0) {
			check -= intArray2[j];
			j++;
		}// while

		System.out.println(check);
	}// main
}// class