// continue�̎g�p��T���v��2

public class ContinueTest2 {
	public static void main(String[] args) {
		try {
			// i��1�`10�̊ԌJ��Ԃ�for���[�v
			for(int i = 1; i <= 10; i++) {
				// i�������̎���continue����
				if(i%2 == 0) {
					Thread.sleep(1000);
					System.out.println("�����͖������܂�");
					continue;
				}// if
				Thread.sleep(1000); // 1sec�ҋ@
				System.out.println("for���[�v" + i + "���");
			}// for
		} catch(InterruptedException e) {
			e.printStackTrace();
		}// try�`catch
	}// main
}// class