// break�̎g�p��T���v��3

public class BreakTest3{
	public static void main(String[] args) {
		int count = 1;

		try {
			// ���x����ݒ�
			outer:
				// ��������true�Ȃ̂Ŗ������[�v
				while (true) {
					Thread.sleep(1000);	// 1�b�ҋ@
					System.out.println("���x���L��while���[�v" + count + "���");

					while (true) {
						Thread.sleep(1000);	// 1�b�ҋ@
						System.out.println("���x������while���[�v" + count + "���");
						count++;
						// count��5�ɂȂ�����break�Ń��x����while���[�v�܂Ŕ�����
						if (count == 5) {
							Thread.sleep(1000);	// 1�b�ҋ@
							System.out.println("if���̒��ɗ��܂���");
							break outer;
						}// if
					}// while2(���x������)
					/* �����ɂ͐�΂ɗ��Ȃ��̂Œ��߂��O���ƃR���p�C���G���[
					 * Thread.sleep(1000);
					 * System.out.println("���x������while���[�v�̊O�ɏo�܂���");
					*/
				}// while1(���x���L��)
				Thread.sleep(1000);	// 1�b�ҋ@
				System.out.println("���x���L��while���[�v�̊O�ɏo�܂���");
		} catch (InterruptedException e) {
			System.out.println(e);
		}// try�`catch

	}//main
}//class