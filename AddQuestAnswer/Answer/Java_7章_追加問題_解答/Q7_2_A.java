/*
	Q7_1�̃v���O�������������āAdo-while���œ������e�̂��̂�����Ă݂Ă��������B

	[�𓚗�]
	0+0=
	0
	0+1=
	1
	1+2=
	3
	3+3=
	6
	6+4=
	10
	10+5=
	15
	15+6=
	21
	21+7=
	28
	28+8=
	36
	36+9=
	45
	45+10=
	55
	0����9�܂ł̘a��55�ł��B

*/


public class Q7_2_A{
	public static void main(String[] args){
		int num = 0;
		int sum = 0;
		do{
			System.out.println(sum + "+" + num + "=");
			sum += num;
			num ++;
			System.out.println(sum);
		}while(num <= 10);
		System.out.println("0����10�܂ł̘a��" + sum + "�ł��B");
	}
}