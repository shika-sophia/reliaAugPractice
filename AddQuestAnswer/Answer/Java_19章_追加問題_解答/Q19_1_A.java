/*
	ArrayList型のコレクションを作ってみてください。
	・要素の型と要素数は自由です。
	・最後に追加した要素を表示させてください。
	・作ったコレクションのサイズを表示させてください。
*/



import java.util.ArrayList;

public class Q19_1_A{
	public static void main(String[] args){
		ArrayList<String> ozuMovies = new ArrayList<String>();
		ozuMovies.add("晩春");
		ozuMovies.add("麦秋");
		ozuMovies.add("早春");
		System.out.println(ozuMovies.get(2));
		System.out.println(ozuMovies.size());
	}
}