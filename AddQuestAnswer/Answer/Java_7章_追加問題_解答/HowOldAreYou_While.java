import java.io.*;

public class HowOldAreYou_While {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name = "";		// ���͂��ꂽ���O���i�[
		int age = 0;			// ���͂��ꂽ�N����i�[
		boolean flag1 = true;	// ���O���͕\���ؑ֗p
		boolean flag2 = true;	// �N����͕\���ؑ֗p

		try {

			// �󕶎���X�y�[�X�����͂��ꂽ�ꍇ�Ƀ��[�v����while��
			do {
				if (flag1) {// ������͎���flag1��true�Ȃ̂ł������\��
					System.out.println("���O����͂��Ă��������B");
					flag1 = false;// �G���[���̍ē��͂̂��߂�flug1�̐؂�ւ�
				} else {// �ē��͎��͂������\��
					System.out.println("���̓G���[:�������͂���Ă��Ȃ���");
					System.out.println("�@�@�@�@�@ �擪�ɃX�y�[�X�������Ă��܂�");
					System.out.println("������x���O����͂��Ă��������B");
				}
				name = reader.readLine();
			// �X�R�[�v�ɒ���
			} while (name.length() == 0 || name.charAt(0) == ' ' || name.charAt(0) == '�@');

			System.out.println("\n" + name + "����A����ɂ��́B�N�����͂��Ă��������B");
			age = Integer.parseInt(reader.readLine());	// �ϐ����g�p���Ȃ��ȗ�����������

		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			age = -1;		// ����while���[�v(�ē��͗v��)�̏����𖞂����ׂ̏���
			flag2 = false;	// �ē��͗v�����̕\���ؑ֗p�̏���
		}// try�`catch

		// ���͂��ꂽ�N��̒l���}�C�i�X�̏ꍇ�Ƀ��[�v����while��
		while (age < 0) {

			try{
				// �\���ؑ֏���
				if (flag2) {	// �}�C�i�X�N�����͂��Ă����true
					System.out.println("\n�N��}�C�i�X�ɂȂ��Ă��܂�\n�ē��͂��Ă�������");
				} else {	// �G���[�������ɂ͂������ʂ�
					System.out.println("\n�N��𐔎��œ��͂��Ă��������B");
					flag2 = true;	//���Ƀ}�C�i�X�l����͂��ꂽ�ꍇ�̕\���ؑ֏���
				}// try�`else

				age = Integer.parseInt(reader.readLine());// �ē��͗p

			} catch (IOException e) {
				System.out.println(e);
			} catch (NumberFormatException e) {
				flag2 = false;	// �ē��͗v������else��ʂ点�邽�߂̏���
			}// try�`catch

		}// while

		System.out.println("\n10�N���" + name + "����́A" + (age + 10) + "�΂ł��ˁB");

	}//main

}//class