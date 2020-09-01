/*
	�ȉ��̃v���O�������쐬���Ă�������

	����
	�E�u�t����E�O��/�d��������E�����v��\��on��off�Ƃ������\�b�h�����C���^�[�t�F�[�XWerable���쐬���Ă�������
	�EWearable����������Headphone�N���X���쐬
	�EWearable����������PortableMediaPlayer�N���X�i��������{�����[���̒��������郁�\�b�h�����j���쐬
	�E���s�N���X���쐬�B���ꂼ��́u�t����E�d��������v���\�b�h��z��𗘗p���ČĂяo���ĉ������B
	�EPortableMediaPlayer�̃{�����[���𒲐����Ă݂Ă��������B


	[���s��]
	�w�b�h�z����t���܂����B
	���y�v���[���[�̓d�����I���ɂ��܂����B
	�{�����[����10�ɕύX���܂����B
	�w�b�h�z�����O���܂����B
	���y�v���[���[�̓d�����I�t�ɂ��܂����B

*/
//
interface Wearable{
	void on();	//pubulic abstract �Ȃ̂ŃZ�~�R�����ŏI���
	void off();	
}

class Headphone implements Wearable{
	
	@Override
	public void on(){
		System.out.println("�w�b�h�z����t���܂����B");
	}
	
	@Override
	public void off(){
		System.out.println("�w�b�h�z�����O���܂����B");
	}
	

}

class PortableMediaPlayer implements Wearable {
	int volume = 0;

	@Override
	public void on() {
		System.out.println("���y�v���[���[�̓d�����I���ɂ��܂����B");
	}
	
	@Override
	public void off(){
		System.out.println("���y�v���[���[�̓d�����I�t�ɂ��܂����B");
	}
	
	public void setVolume(int volume){
		this.volume = volume;
		System.out.println("�{�����[����" + volume + "�ɕύX���܂����B");
	}
}

class Q14_2_A{
	public static void main(String[] args){
		Wearable[] player = new Wearable[2];
		player[0] = new Headphone();
		player[1] = new PortableMediaPlayer();
		
		for(int i = 0; i < player.length; i++){
			player[i].on();
		}

		((PortableMediaPlayer)player[1]).setVolume(10);

		for(int i = 0; i < player.length; i++){
			player[i].off();
		}


//�C���X�^���X���C���^�t�F�[�X�^�̕ϐ��ɑ�����A�L���X�g���Ďg������
//(���ȏ�P.114)
		
		Wearable headphone = new Headphone();
		Wearable portableMediaPlayer = new PortableMediaPlayer();
		((PortableMediaPlayer)portableMediaPlayer).setVolume(10);
	}
}