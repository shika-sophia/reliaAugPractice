/*
 * 以下のプログラムを読んで出力結果を予想してください。
 */

class ArrayCheck3 {

	public static void main(String[] args) {
		int[][] intArray = new int[2][4];
		int sum = 0;
		
		intArray[0] = new int[]{ 1, 2 ,3, 4 };
		intArray[1] = new int[]{ 2, 3, 4, 5 };
		
		for(int i = 0; i <intArray.length; i++) {

			for(int j = 0; j < intArray[i].length ;j++) {
				sum += intArray[i][j];
			}// for2

		}// for1
		
		System.out.println(sum);
	}// main

}// class