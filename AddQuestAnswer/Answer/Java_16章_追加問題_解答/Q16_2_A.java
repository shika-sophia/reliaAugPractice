/*

Q16_1�ō�����v���O�������C���^�t�F�[�X�����^�C�v�ɕύX���Ă݂Ă��������B

*/
class GoodMorning implements Runnable {
	@Override
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println("���͂悤�������܂�");
		}
	}
}

class GoodAfternoon implements Runnable {
	@Override
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println("����ɂ���");
		}
	}
}

class Q16_2_A{
	public static void main (String[] args){
		GoodMorning goodMorning = new GoodMorning();
		GoodAfternoon goodAfternoon = new GoodAfternoon();
		Q16_2_A evening = new Q16_2_A();

		Thread morning = new Thread(goodMorning);
		Thread afternoon = new Thread(goodAfternoon);

		morning.start();
		afternoon.start();
		evening.display();
		
	}
	public void display(){
		for(int i = 0; i < 10; i++){
			System.out.println("����΂��");
		}
	}
}
