/*
 * プログラムを読んで、動作を予想して下さい。
 */

public class SortDataCheck {

	public static void main(String[] args) {
		
		int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };
		int change = 0;	
		int change_sum = 0;

		System.out.println("並べ替える前");

		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}// for

		System.out.println("\n");
		System.out.println("***********************************");
		System.out.println("");

		for (int i = 0; i < data.length - 1; i++) {

			for (int j = i + 1; j < data.length; j++) {

				if (data[i] > data[j]) {
					int a = data[i];
					data[i] = data[j];
					data[j] = a; 
					change++;
				}// if

			}// for(内側1)

			System.out.println("交換" + (i + 1) + "回目");
			System.out.println("交換回数" + change + "回");

			for (int k = 0; k < data.length; k++) {
				System.out.print(data[k] + " ");
			}// for(内側2)

			System.out.println("\n");
			change_sum += change;
			change = 0;

		}// for(外側)

		System.out.println("***********************************");
		System.out.println("");
		System.out.println("並び変えた総回数" + change_sum + "回");
		System.out.println("並べ替えた最終結果");

		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}// for

	}// main

}// class