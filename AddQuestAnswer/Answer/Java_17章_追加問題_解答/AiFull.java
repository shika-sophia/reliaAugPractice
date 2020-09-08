package pack;

public class AiFull {
	static AiFull ai;
	
	public static void main(String[] args) {
		AiFull i = new AiFull();
		pack.AiFull.ai = i;
		i = pack.AiFull.ai.method(pack.AiFull.ai.ai);
		System.out.println(i);
	}
	
	AiFull method(AiFull x) {
		return x;
	}
	
	public String toString() {
		return "LOVE";
	}
}
