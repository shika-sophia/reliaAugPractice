import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Daimaou extends Thread {

	static boolean flag = false;
	static boolean check = false;

	public static void main (String[] args) {

		System.out.println("");
		System.out.println("*�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\*");
		System.out.println("|���E�����|�Ɋׂꂽ�喂�������ɂ��̎p�������܂����I�I�@�@�@�@�@�@�@�@�@|");
		System.out.println("|���G�̑喂���̑��̍����~�߂���@�͂������ЂƂ�������܂���I�I�@�@�@�@|");
		System.out.println("|�喂����������������u�Ԃ̂ݖ��h���ɂȂ�܂��B�@�@�@�@�@�@�@�@�@�@�@�@�@|");
		System.out.println("|�喂���������̖��O�����炩�ɋ��񂾏u�Ԃɓ`���̌��ōU�����Ă��������I�I�@|");
		System.out.println("|�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@|");
		System.out.println("|�������Ă��x�����Ă��o���A�[�Œ��˕Ԃ���Ă��܂��܂��I�I�@�@�@�@�@�@�@�@|");
		System.out.println("|�����I�I�E�C�������āA�Ō�̐킢�ɗՂ݂܂��傤�I�I�@�@�@�@�@�@�@�@�@�@�@|");
		System.out.println("*�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\*");
		System.out.println("��Enter�Ŏ���");
		strInput();

		System.out.println("");
		System.out.println("*�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\*");
		System.out.println("|�y�V�ѕ��z�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@|");
		System.out.println("|�����̉r���̍Œ���Enter�L�[�������ƁA�`���̌��ōU�����邱�Ƃ��ł��܂��B |");
		System.out.println("|�喂�����������������u�Ԃ�_���čU�����Ă��������B�@�@�@�@�@�@�@�@�@�@�@|");
		System.out.println("*�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\*");
		System.out.println("��Enter�Ŏ���");
		strInput();

		System.out.println("");
		System.out.println("*�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\*");
		System.out.println("|�喂���@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@|");	
		System.out.println("|�u�����Ȃ�l�ނǂ���I�I�@�����S�Ă̐��������ł�����I�I�@|");
		System.out.println("|�@�͖����҂ǂ��ɂ͎�������Ă�낤�I�I�@�@�@�@�@�@�@�@�@�@�@|");
		System.out.println("|�@����ł͂������I�I�v�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@|");
		System.out.println("*�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\*");
		System.out.println("\n�y HIT ENTER KEY TO START �z");
		strInput();

		Daimaou daimaou = new Daimaou();
		daimaou.start();
		System.out.print("\n�u");
		int num1 = (int)(Math.random() * 50D);
		int num2 = 0;

		do {
			if (num2 > num1) break;
			if (num2 == num1) check = true;
			System.out.print("�c");
			sleepTime(200);
			if(flag) break;
			num2++;
		} while (true);

		if (check) {
			System.out.println("�A���e�}!�I�v");
		} else {
			System.out.println("\n�E�ҁu�L�F�F�F�F�F�F�F�F�F�F�b�I�I�v\n");
			System.out.println("���߂��ăo���A�Œ��˕Ԃ���Ă��܂����I�I\n");
			System.out.println("*�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\*");
			System.out.println("|�喂���@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@|");
			System.out.println("|�u����ȂɎ��ɋ}���̂ł���Ζ]�ݒʂ�ɂ��Ă�낤�I�I�@|");
			System.out.println("|�@�����i�����ł��邪�����I�I�@���˂��I�I�v�@�@�@�@�@�@|");
			System.out.println("|�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@|");
			System.out.println("|����Ȗ��͂ɂ���ėE�҂͏��ł��Ă��܂��܂����B�@�@�@�@|");
			System.out.println("|�@�@�@�@�@�@�@�@�@<< GAME�@OVER >>�@�@�@�@�@�@�@�@�@�@|");
			System.out.println("*�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\*");
			System.exit(0);
		}

		sleepTime(300);

		if (check = flag) {
			System.out.println("\n�E�ҁu�L�F�F�F�F�F�F�F�F�F�F�b�I�I�v\n");
			System.out.println("�`���̌����喂���̑̂��т����I�I\n");
			System.out.println("*�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\*");
			System.out.println("|�喂���@�@�@�@�@�@�@�@�@�@�@�@�@�@�@|");
			System.out.println("|�u�M�M�M�E�E�E���₵���̂��E�E�E�v�@|");
			System.out.println("|�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@|");
			System.out.println("|�喂���͏��ł��A���E�ɕ��a���K�ꂽ�B|");
			System.out.println("|�@�@�@�@<<�@Happy�@End�@>>�@�@�@�@�@|");
			System.out.println("*�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\*");
			System.exit(0);
		} else {
			System.out.println("�x�����čU���̃^�C�~���O�𓦂��Ă��܂����I�I\n");
			System.out.println("*�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\*");
			System.out.println("|�喂���@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@|");
			System.out.println("|�u�t�@�t�@�t�@�A�����Ԃɍ���񂼁I�I�@|");
			System.out.println("|�@�ł̐��E�Ō�����邪�����I�v�@�@�@�@|");
			System.out.println("*�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\*");
			System.out.println("");
			System.out.println("�@�@�@ �@ �@ . -�]�j�P�j�]- .");
			System.out.println("�@�@�@�@ �Q�^�@ �@�@�@�@�@   �_�Q");
			System.out.println("�@����P�@/�@�@�@�@�@�@�@�@�@ \', �P��");
			System.out.println("�@�@�@�P7\'\' �\�\�@�Q�Q�Q�@�\�\ ���P");
			System.out.println("�\�\�\�@��,,i ; �@�@�@�@�@`. � .��r��\�\�\�\");
			System.out.println("�@�@�@ /\\��\'j|���=�i_,,�,,| ���U�");
			System.out.println("�@�@�@�@�M`-�S:;!I�� �Vi���-\" ^");
			System.out.println("");
			System.out.println("*�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\*");
			System.out.println("|���E�͔j�󂳂�A�ł̗͂ŕ���ꂽ��� |");
			System.out.println("|�@�@�@�@<< GAME�@OVER >>�@�@�@�@�@�@|");
			System.out.println("*�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\*");
			System.exit(0);
		}

	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		try {
			String s = reader.readLine();
			flag = true;
		} catch (Exception e) { }
	}

	public static void sleepTime (int time) {
		try {
			Thread.sleep(time);
		} catch(Exception e) { }
	}

	public static String strInput () {
		String s = "";
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			s = reader.readLine();
		} catch (Exception e) { }
		return s;
	}
}