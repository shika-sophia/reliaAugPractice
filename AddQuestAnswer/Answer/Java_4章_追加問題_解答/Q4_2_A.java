/*
	�L�[�{�[�h������͂��ꂽ�T�C�Y�𕪊򂳂��āA

	19�ȉ� ���J�i
	20�ȏ�`40���� �c�o�X
	39���傫���`59�ȉ� �n�}�`
	60�`79 ���W��
	80�ȏ� �u��

	�Ƃ��������ŁA�o�����̖��O���o�͂���v���O�������쐬���Ă��������B

	[�𓚗�]
	���̃T�C�Y����͂��Ă�������
	��
	79
	��
	���W��
*/

import java.io.*;

public class Q4_2_A{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.print("���̃T�C�Y����͂��Ă��������F");
			String line = reader.readLine();
			int size = Integer.parseInt(line);
				
			if(0 <= size && size < 20){
				System.out.println("���J�i");
			}else if(20 <= size && size < 40){
				System.out.println("�c�o�X");
			}else if(40 <= size && size < 60){
				System.out.println("�n�}�`");
			}else if(60 <= size && size < 80){
				System.out.println("���W��");
			}else if(80 <= size){
				System.out.println("�u��");
			}	
		}catch(IOException e){
			System.out.println(e);
		}catch(NumberFormatException e){
			System.out.println("���͂�����������܂���");
		}
	}
}