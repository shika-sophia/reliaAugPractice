/*
	���͂��ꂽ���l��7��8�������ꍇ�A�u�ċx�݂ł��v�ƕ\������v���O����������Ă��������B

	�����FSystem.out.println("�ċx�݂ł�");�́A�y���z�����g��Ȃ��悤�ɂ��Ă��������B

	[���s��]
	(7 or 8)
	�ċx�݂ł�

	(����ӊO)
	�ċx�݂ł͂���܂���

	(�����l�ȊO)
	��������͂��Ă��������B

*/

import java.io.*;

public class Q5_2_A{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�����ł����H");
		try{
			String line = reader.readLine();
			int month = Integer.parseInt(line);
			
			switch(month){
			case 7:
			case 8:
				System.out.println("�ċx�݂ł�");
				break;

			default:
				System.out.println("�ċx�݂ł͂���܂���B");
				break;
			}
			
		}catch(IOException e){
			System.out.println(e);
		}catch(NumberFormatException e){
			System.out.println("��������͂��ĉ������B");
		}
	}
}