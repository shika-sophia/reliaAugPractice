/*
 * FizzBuzz��� ��while�����g�p���Ă�������
 *
 * 1����100�܂ŃR�}���h�v�����v�g��ɕ\�����܂��B
 * ������3�Ŋ���؂��ꍇ�́A�uFizz�v
 * 5�Ŋ���؂��ꍇ�́A�uBuzz�v
 * 3�ł�5�ł�����؂��ꍇ�́A�uFizzBuzz�v
 * �ƕ\������悤�ɂ��Ă��������B
 *
 *�y�o�͌��ʁz
 * 1
 * 2
 * Fizz
 * 4
 * Buzz
 * Fizz
 * 7
 * 8
 * Fizz
 * Buzz
 * 11
 * Fizz
 * 13
 * 14
 * Fizz Buzz
 * 16
 * 17
 * Fizz
 * 19
 * Buzz
 */

class WhileCheck_A {

	public static void main(String[] args) {
		int i = 1;

		// 1�`100�܂ŌJ��Ԃ�while���[�v
		while(i <= 100) {
			// 3�ł�5�ł�����؂�鐔���̔���
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			// 3�ł̂݊���؂�鐔���̔���
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			// 5�ł̂݊���؂�鐔���̔���
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			// ��L�ȊO�̐����̏���
			} else {
				System.out.println(i);
			}// if			
			i++;
		}// while

	}// main

}// class