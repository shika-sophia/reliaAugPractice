// continue�̎g�p��T���v��1

public class ContinueTest1 {
	public static void main(String[] args) {
		int count = 0;

		try {
			while(count <= 9) {
				count++;
				// count�������̎���continue����
				if(count%2 == 0) {
					Thread.sleep(1000); // 1sec�ҋ@
					System.out.println("�����͖������܂�");
					continue;
				}// if
				Thread.sleep(1000); // 1sec�ҋ@
				System.out.println("while���[�v" + count + "���");
			}// while
		} catch(InterruptedException e) {
			e.printStackTrace();
		}// try�`catch

	}// main
}// class