/*
	2��int�^�̕ϐ��ɒl�����āA����2���r���A�ȉ��̂悤�ɕ\������v���O�������쐬���Ă��������B
	�ux�̕����傫���v
	�uy�̕����傫���v
	�ux��y�͓����l�ł��v
	
	[���s��]
	x:50
	y:100
	y�̕����傫���ł��B
	
*/

class Q4_1_A{
	public static void main(String[] args){
		int x = 50; //�C�ӂ̐����l
		int y = 100; //����
		
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		
		if(x > y){
			System.out.println("x�̕����傫���ł��B");
		}else if(x < y){
			System.out.println("y�̕����傫���ł��B");
		}else{
			System.out.println("x��y�͓����l�ł�");
		}
	}
}