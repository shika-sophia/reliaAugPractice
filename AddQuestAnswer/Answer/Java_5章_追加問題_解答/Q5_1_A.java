/*
	Math.Ramdom()を0～2までの使って乱数を生成し、0は大吉、1は吉、2は凶と表示するプログラムを作成してください。
	

*/

import java.util.*;

public class Q5_1_A{
	public static void main(String[] args){
		int random = (int)(Math.random() * 3);
		
		switch(random){
		case 0:
			System.out.println("大吉");
			break;
		case 1:
			System.out.println("吉");
			break;
		case 2:
			System.out.println("凶");
			break;
		default:
			System.out.println("不正な値です");
			break;
		}
	}
}