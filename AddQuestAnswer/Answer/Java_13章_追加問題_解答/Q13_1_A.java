/*
	main���\�b�h���܂�3�̃��\�b�h�����삵�A2�̗�O���o��N���X������Ă��������B
	�������A�ȉ��̏����𖞂����Ă��������B

	1. ���͂��L�[�{�[�h����擾����
	2. �L�[�{�[�h����擾�����l�������ɓ����ƁA���̒l�ɂ���Ă�Exception��RuntimeException�𓊂��郁�\�b�h��錾
	3. ����2�̃��\�b�h���Ăяo�������̃��\�b�h��錾
	4. ����3�̃��\�b�h��main���\�b�h����Ăяo��
	5. main���\�b�h�ӊO��throws�߂𗘗p���邱�ƁB

	[���s��]
	���� : 1
	�����I��O����

*/

import java.io.*;

public class Q13_1_A{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.print("���� : ");
			String s = reader.readLine();
			int sw = Integer.parseInt(s);
			try{
				test(sw);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}catch(IOException e){
			System.out.println("�������l����͂��ĉ�����");
		}
	}

	public static void test(int sw) throws Exception{
		check(sw);
	}

	public static void check(int sw)throws Exception{
		switch(sw){
		case 1:
			throw new Exception("�����I��O����");
		case 2:
			throw new RuntimeException("�񌟍���O����");
		default:
			System.out.println("1��2�����ĉ�����");
			break;
		}
	}
}