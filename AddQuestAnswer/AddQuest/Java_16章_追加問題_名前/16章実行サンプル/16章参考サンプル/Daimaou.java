import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Daimaou extends Thread {

	static boolean flag = false;
	static boolean check = false;

	public static void main (String[] args) {

		System.out.println("");
		System.out.println("*――――――――――――――――――――――――――――――――――――*");
		System.out.println("|世界を恐怖に陥れた大魔王がついにその姿を現しました！！　　　　　　　　　|");
		System.out.println("|無敵の大魔王の息の根を止める方法はたったひとつしかありません！！　　　　|");
		System.out.println("|大魔王が呪文を唱える瞬間のみ無防備になります。　　　　　　　　　　　　　|");
		System.out.println("|大魔王が呪文の名前を高らかに叫んだ瞬間に伝説の剣で攻撃してください！！　|");
		System.out.println("|　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　|");
		System.out.println("|早すぎても遅すぎてもバリアーで跳ね返されてしまいます！！　　　　　　　　|");
		System.out.println("|さぁ！！勇気を持って、最後の戦いに臨みましょう！！　　　　　　　　　　　|");
		System.out.println("*――――――――――――――――――――――――――――――――――――*");
		System.out.println("→Enterで次へ");
		strInput();

		System.out.println("");
		System.out.println("*――――――――――――――――――――――――――――――――――――*");
		System.out.println("|【遊び方】　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　|");
		System.out.println("|呪文の詠唱の最中にEnterキーを押すと、伝説の剣で攻撃することができます。 |");
		System.out.println("|大魔王が呪文を唱えた瞬間を狙って攻撃してください。　　　　　　　　　　　|");
		System.out.println("*――――――――――――――――――――――――――――――――――――*");
		System.out.println("→Enterで次へ");
		strInput();

		System.out.println("");
		System.out.println("*――――――――――――――――――――――――――――――*");
		System.out.println("|大魔王　　　　　　　　　　　　　　　　　　　　　　　　　　　|");	
		System.out.println("|「愚かなる人類どもよ！！　今より全ての生命を消滅させる！！　|");
		System.out.println("|　力無き者どもには死をくれてやろう！！　　　　　　　　　　　|");
		System.out.println("|　それではいくぞ！！」　　　　　　　　　　　　　　　　　　　|");
		System.out.println("*――――――――――――――――――――――――――――――*");
		System.out.println("\n【 HIT ENTER KEY TO START 】");
		strInput();

		Daimaou daimaou = new Daimaou();
		daimaou.start();
		System.out.print("\n「");
		int num1 = (int)(Math.random() * 50D);
		int num2 = 0;

		do {
			if (num2 > num1) break;
			if (num2 == num1) check = true;
			System.out.print("…");
			sleepTime(200);
			if(flag) break;
			num2++;
		} while (true);

		if (check) {
			System.out.println("アルテマ!！」");
		} else {
			System.out.println("\n勇者「キェェェェェェェェェェッ！！」\n");
			System.out.println("早過ぎてバリアで跳ね返されてしまった！！\n");
			System.out.println("*―――――――――――――――――――――――――――*");
			System.out.println("|大魔王　　　　　　　　　　　　　　　　　　　　　　　　|");
			System.out.println("|「そんなに死に急ぐのであれば望み通りにしてやろう！！　|");
			System.out.println("|　未来永劫消滅するがいい！！　死ねい！！」　　　　　　|");
			System.out.println("|　　　　　　　　　　　　　　　　　　　　　　　　　　　|");
			System.out.println("|強大な魔力によって勇者は消滅してしまいました。　　　　|");
			System.out.println("|　　　　　　　　　<< GAME　OVER >>　　　　　　　　　　|");
			System.out.println("*―――――――――――――――――――――――――――*");
			System.exit(0);
		}

		sleepTime(300);

		if (check = flag) {
			System.out.println("\n勇者「キェェェェェェェェェェッ！！」\n");
			System.out.println("伝説の剣が大魔王の体を貫いた！！\n");
			System.out.println("*――――――――――――――――――*");
			System.out.println("|大魔王　　　　　　　　　　　　　　　|");
			System.out.println("|「ギギギ・・・くやしいのう・・・」　|");
			System.out.println("|　　　　　　　　　　　　　　　　　　|");
			System.out.println("|大魔王は消滅し、世界に平和が訪れた。|");
			System.out.println("|　　　　<<　Happy　End　>>　　　　　|");
			System.out.println("*――――――――――――――――――*");
			System.exit(0);
		} else {
			System.out.println("遅すぎて攻撃のタイミングを逃してしまった！！\n");
			System.out.println("*―――――――――――――――――――*");
			System.out.println("|大魔王　　　　　　　　　　　　　　　　|");
			System.out.println("|「ファファファ、もう間に合わんぞ！！　|");
			System.out.println("|　闇の世界で後悔するがいい！」　　　　|");
			System.out.println("*―――――――――――――――――――*");
			System.out.println("");
			System.out.println("　　　 　 　 . -‐ニ￣ニ‐- .");
			System.out.println("　　　　 ＿／　 　　　　　   ＼＿");
			System.out.println("　＝二￣　/　　　　　　　　　 \', ￣二＝");
			System.out.println("　　　￣7\'\' ――　＿＿＿　―― 戈￣");
			System.out.println("―――　从,,i ; 　　　　　`. ､ .尢r､――――");
			System.out.println("　　　 /\\じ\'j|此ﾄ=ﾒi_,,爻,,| 刈ゞﾒ");
			System.out.println("　　　　｀`-ヾ:;!Iﾂﾞ 〃iﾒﾄ辷-\" ^");
			System.out.println("");
			System.out.println("*――――――――――――――――――*");
			System.out.println("|世界は破壊され、闇の力で覆われた･･･ |");
			System.out.println("|　　　　<< GAME　OVER >>　　　　　　|");
			System.out.println("*――――――――――――――――――*");
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