/*
	�L�[�{�[�h���炢�����̐����l���󂯎���āA�����𑫂��Ă����v���O�������쐬���Ă��������B
	�����̐����l���󂯎�邩�w�肳���悤�Ƀv���O�������Ă��������B
	
	����
	0�����͂��ꂽ�ꍇ�A�l�̎󂯎����I�����邱�Ɓibreak�𗘗p���Ă�������)


[���s��]

���������Z���܂��B
�����Z���܂����F3

����(0�ŏI��)�F10
����(0�ŏI��)�F48
����(0�ŏI��)�F0
58�ł��B

*/

import java.io.*;

public class Q6_3_A{
	public static void main(String[] args){
		System.out.println("���������Z���܂��B");
		System.out.print("�����Z���܂����H�F");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line = reader.readLine();
			int quan = Integer.parseInt(line); //���Z�����
			System.out.println();
			int sum = 0; //���v�l
			for(int i = 0; i < quan; i++){
				System.out.print("����(0�ŏI��)�F");
				line = reader.readLine();
				int num = Integer.parseInt(line);
				if(num == 0){
					break; //for�����甲���o��
				}
				sum += num;
			}
			System.out.println(sum + "�ł��B");
		}catch(IOException e){
			System.out.println(e);
		}catch(NumberFormatException e){
			System.out.println("���͂�����������܂���");
		}
	}
}