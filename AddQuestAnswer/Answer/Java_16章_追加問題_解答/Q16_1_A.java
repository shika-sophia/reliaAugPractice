/*
	�ȉ��̃v���O�������쐬���Ă��������B

	�EThread���g������GoodMorning�N���X�AGoodAfternoon�N���X��2���쐬
	�EThread���g�����Ă��Ȃ�GoodEvening�N���X���쐬
	�E����3�̃N���X�Ɋe���u���͂悤�������܂��v�u����ɂ��́v�u����΂�́v��10��\��������@�\���������Ă�������
	�Emain���\�b�h����e�N���X�����s���Ă��������B



	[���s��] ���ɂ���ĈقȂ�̂ŁA����Ɠ������ɂȂ�Ȃ��Ă����v�ł��B
	����΂��
	����΂��
	����΂��
	(��)
	����ɂ���
	(��)
	���͂悤�������܂�
	(��)
	
*/


class GoodMorning extends Thread {
	@Override
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println("���͂悤�������܂�");
		}
	}
}

class GoodAfternoon extends Thread {
	@Override
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println("����ɂ���");
		}
	}
}

class GoodEvening {
	public void display(){
		for(int i = 0; i < 10; i++){
			System.out.println("����΂��");
		}
	}
}

class Q16_1_A{
	public static void main (String[] args){
		GoodMorning goodMorning = new GoodMorning();
		GoodAfternoon goodAfternoon = new GoodAfternoon();
		GoodEvening goodEvening = new GoodEvening();

		goodMorning.start();
		goodAfternoon.start();
		goodEvening.display();
		
	}
}
