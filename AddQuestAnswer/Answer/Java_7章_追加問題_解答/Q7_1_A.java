/*
while文を使って0から10までの数の和を求めてください。解答が55になれば正解です。

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
0から10までの和は55です。

*/

public class Q7_1_A{
	public static void main(String[] args){
		int num = 0;
		int sum = 0;
		while(num <= 10){
			System.out.println(sum + "+" + num + "=");
			sum += num;
			num ++;
			System.out.println(sum);
		
		System.out.println("0から10までの和は" + sum + "です。");
	}
}