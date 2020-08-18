/*
 * 以下のプログラムを読んで、出力結果が何になるか予想してください。
 */

class ArrayCheck2 {

	public static void main(String[] args) {
		int[] intArray;
		int sum = 0;
		
		intArray = check();
		
		for(int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}// for
		
		System.out.println(sum);
	}// main
	
	public static int[] check() {
		int[] intArray = new int[10];
		
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = i * 2;
		}// for
		
		return intArray;
	}// check

}// class