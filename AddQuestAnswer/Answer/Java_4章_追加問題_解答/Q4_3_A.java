/*
	�㊪��p170���Q�Ƃ��Ă��������B

	equals���\�b�h���g���āA���͂��ꂽ�����񂪁u���͂悤�������܂��v�������ꍇ�A�u���͂悤�������܂��v�ƕԂ��v���O�������쐬���Ă��������B
	�܂��Aelse if��p���āA�u����ɂ��́v�������ꍇ�́u����ɂ��́v�A�u����΂�́v�������ꍇ�́u����΂�́v�A
	���̑��������ꍇ�́A�u���悤�Ȃ�v�ƕ\������@�\���������Ă��������B

	[�𓚗�]
	���A����͂��Ă��������B
	��
	�i���́j
	��
	����ɂ���
	

*/


import java.io.*;

public class Q4_3_A{
	public static void main(String[] args){

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try{
			System.out.println("���A����͂��Ă�������");

			String line = reader.readLine();
			
			if(line.equals("���͂悤�������܂�")) {
				System.out.println("���͂悤�������܂�");
			}else if (line.equals("����ɂ���")) {
				System.out.println("����ɂ���");
			}else if (line.equals("����΂��")) {
				System.out.println("����΂��");
			}else {
				System.out.println("���悤�Ȃ�");
			}

		}catch(IOException e){
			System.out.println(e);
		}
	}
}