/*
	Math.Ramdom()��0�`2�܂ł̎g���ė����𐶐����A0�͑�g�A1�͋g�A2�͋��ƕ\������v���O�������쐬���Ă��������B
	

*/

import java.util.*;

public class Q5_1_A{
	public static void main(String[] args){
		int random = (int)(Math.random() * 3);
		
		switch(random){
		case 0:
			System.out.println("��g");
			break;
		case 1:
			System.out.println("�g");
			break;
		case 2:
			System.out.println("��");
			break;
		default:
			System.out.println("�s���Ȓl�ł�");
			break;
		}
	}
}