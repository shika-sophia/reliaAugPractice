/* while����do while���̓����r
* �ꌩ�����悤�Ɍ����܂����A����̈Ⴂ���m�F���ĉ������B
*/

public class DoWhileTest {
	public static void main(String[] args) {

		int i = 0;

		while (i < 0) {
			System.out.println("while���̏����ł��B");
		}

		do {
			System.out.println("do while���̏����ł��B");
		} while(i < 0);

		/* do-while���͏�������{}�̊O�ɂ��邽�߁A�ϐ��̈����ɋC��t����B
		 * �ȉ��̏ꍇname�̓��[�J���ϐ��̂��߁A�������̏ꏊ�ł̓X�R�[�v�O�ɂȂ�B
		 */
		//do {
		//	String line = "end";
		//} while(!line.equals("end"));
	}
}