// break�̎g�p��T���v��1

public class BreakTest1 {
	public static void main(String[] args) {
		int count = 1;

		try {
			// ��������true�Ȃ̂Ŗ������[�v
			while (true) {	
				Thread.sleep(1000);	// 1�b�ҋ@
				System.out.println("while���[�v" + count + "���");
				count++;
				// count��5�ɂȂ�����break�Ŗ������[�v�𔲂���
				if (count == 5) {
					Thread.sleep(1000);	// 1�b�ҋ@
					System.out.println("if���̒��ɗ��܂���");
					break;
				}// if
			}//while
			Thread.sleep(1000);	// 1�b�ҋ@
			System.out.println("while���[�v�̊O�ɏo�܂���");
		} catch (InterruptedException e) {
			System.out.println(e);
		}// try�`catch

	}// main
}// class