/*
	�L�[�{�[�h������͂��ꂽ���A�ɑΉ����镶�����ԋp���郁�\�b�h���`���āA���ʂ���ʂɏo�͂��Ă��������B

	���͂悤�@�� Good morning
	����ɂ��́@���@Good afternoon
	����΂�́@���@Good evening
	���̑��@���@�Ή����Ă��܂���B
*/

import java.io.*;

public class Q8_2_A{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���͂��ꂽ���A��|�󂵂܂�");
		try{
			String s = reader.readLine();
			s = translation(s);
			System.out.println(s);
		}catch(IOException e){
			System.out.println(e);
		}
	}

	public static String translation(String s){

		if(s.equals("���͂悤")) {
			s = "Good morning";
		}else if (s.equals("����ɂ���")){
			s = "Good afternoon";
		}else if (s.equals("����΂��")){
			s = "Good evening";
		}else {
			s = "���̈��A�ɂ͑Ή����Ă��܂���";
		}
		
		return s;
	}
}