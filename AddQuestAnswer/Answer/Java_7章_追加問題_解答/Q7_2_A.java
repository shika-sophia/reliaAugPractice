/*
	Q7_1のプログラムを改造して、do-while文で同じ内容のものを作ってみてください。

	[解答例]
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
	0から9までの和は55です。

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
		System.out.println("0から10までの和は" + sum + "です。");
	}
}