// break�̎g�p��T���v��2

public class BreakTest2 {
	public static void main(String[] args) {

		try {
			// i��1�`100�܂ŉ��for���[�v
			for (int i = 1; i <= 100; i++) {
				Thread.sleep(1000);	// 1�b�ҋ@
				System.out.println("for���[�v" + i + "���");
				// i��5�ɂȂ�����break��for���[�v�𔲂���
				if (i == 5) {
					Thread.sleep(1000);
					System.out.println("if���̒��ɗ��܂���");
					break;
				}// if
			}// for
			Thread.sleep(1000);	// 1�b�ҋ@
			System.out.println("for���[�v�̊O�ɏo�܂���");
		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}// main
}// class