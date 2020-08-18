/*
 * ˆÈ‰º‚Ìo—ÍŒ‹‰Ê‚É‚È‚é‚æ‚¤‚ÉƒvƒƒOƒ‰ƒ€‚ğŠ®¬‚³‚¹‚Ä‚­‚¾‚³‚¢B
 *
 * yo—ÍŒ‹‰Êz
 * 5 + 5 = 10
 * 10 - 5 = 5
 * 5 * 5 = 25
 * 20 / 5 = 4
 *
 */

class MethodCheck1_A {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;

		// ¤‰ğ“š—“ ‚±‚±‚©‚ç
		// ƒƒ\ƒbƒh‚ğŒÄ‚Ño‚µA–ß‚è’l‚ğ‘ã“ü
		a = tasu(5, 5);
		b = hiku(10, 5);
		c = kakeru(5, 5);
		d = waru(20, 5);

		System.out.println("5 + 5 = " + a);
		System.out.println("10 - 5 = " + b);
		System.out.println("5 * 5 = " + c);
		System.out.println("20 / 5 = " + d);
		// ¢‰ğ“š—“ ‚±‚±‚Ü‚Å
	}// main

	//‘«‚µZ
	public static int tasu(int i, int j) {
		return i + j;
	}// tasu

	//ˆø‚«Z
	public static int hiku(int i, int j) {
		return i - j;
	}// hiku

	//Š|‚¯Z
	public static int kakeru(int i, int j) {
		return i * j;
	}// kakeru

	//Š„‚èZ
	public static int waru(int i, int j) {
		return i / j;
	}// waru

}// class