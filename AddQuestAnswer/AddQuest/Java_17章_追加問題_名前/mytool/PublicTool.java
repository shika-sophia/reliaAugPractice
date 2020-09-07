// P204 List17-4

package mytool;

//import static java.lang.System.out;

public class PublicTool {
	public PublicTool() {
		System.out.println("クラスがpublicだから使える");
	}
}

class Tool {
	public Tool() {
		System.out.println("クラスがpublicじゃないから使えない");
	}
}
