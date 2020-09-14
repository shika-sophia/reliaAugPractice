/*

	以下のプログラムを作成して下さい。
	
	条件
	1.まず、「ファイルの中身」と書かれた内容(18～24行目)を打ち込んだファイルを作成し、テキスト形式で保存する（ファイル名はActor.txt）

	2.そのテキストファイルの内容を1行ずつ読み込みMapに格納する
	その時、テキスト1行に対して、空白区切りで2つの文字列があるので、1つ目をキー、2つ目を値とする（ファイルの読み込みについては18章を参考にして下さい）
	3.すべてのキーと値を参照し出力する
	4.キー「MIFUNE」の値を参照し出力する

	ヒント：空白区切りでキーと値を作る為にsplit(String regex)メソッドを使用します。


ファイルの中身

MIFUNE 三船敏郎
SUGAWARA 菅原文太
TAKAKURA 高倉健
ISHIHARA 石原裕次郎
MIKUNI 三國連太郎
HARADA 原田敏夫
AKAGI 赤木圭一郎



【実行結果】

SUGAWARA : 菅原文太
HARADA : 原田敏夫
TAKAKURA : 高倉健
MIFUNE : 三船敏郎
MIKUNI : 三國連太郎
ISHIHARA : 石原裕次郎
AKAGI : 赤木圭一郎
MIFUNE => 三船敏郎
*/

//以下解答  教科書と少し違う書き方にしています。読めるかやってみましょう。
import java.io.*;
import java.util.*;

public class Q19_2_A {
	public static void main(String[] args) {
		try{
			if (args.length != 1) {
			System.out.println("使用法: java Q19_2 ファイル");
			System.out.println("例: java Q19_2 Actor.txt");
			System.exit(0);
			}
			InputStreamReader reader = new InputStreamReader(new FileInputStream(args[0]));
			BufferedReader buff = new BufferedReader(reader);
			String text ;
			Map<String,String> map = new HashMap<String,String>();
			while ((text = buff.readLine()) != null) {
//splitメソッド  スペースで分割し配列にしている
				String[] value = text.split(" ");
				map.put(value[0], value[1]);
			}
			reader.close();
//拡張for文を使い、全てのエントリを取得し表示している

			for (Map.Entry<String, String> entry : map.entrySet()) {
				System.out.println(entry.getKey() + " : " +  entry.getValue());
			}
//map.get("TOKYO")の戻り値を表示させるのでもよい。以下はnullチェックをしている
		
			String fullname = map.get("MIFUNE");
			if(fullname != null){
				System.out.println("MIFUNE => " + fullname);
			}
		
		}catch(FileNotFoundException fnoe){
			fnoe.printStackTrace();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}
/*
Mapはインターフェース定義のため、実体を生成する際にはHashMapを使用する。
HashMapは、どの型のオブジェクトもキーおよび値として格納可能だが、型を明示する事で記述ミスを減らす。教科書p.298も同様の書き方をしている
*/
