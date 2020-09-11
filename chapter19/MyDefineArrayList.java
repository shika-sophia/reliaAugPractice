/**
 * @title chapter19 / Practice 19-1, 19-2, 19-3 / MyDefineArrayList
 * @content Collection / ArrayList as inner definition
 * @author Oshika
 * @date 2020-09-11 / 0930-1200, 1300-
 */
/*
//====== Practice 19-1 ======
 *(1)× lengthフィールド100は0以上100以下
 *        -> 0以上100未満。100は含まない。
 *(2)× ArrayList.length() -> ArrayList.size()
 *(3)× (1)に同じ
 *(4)〇 先頭への挿入・削除に適したのはLinkedList
 *        -> LinkedList.addFirst() / remove()を利用
 *        -> AttayList.set(0, element)でもできるが、
 *             入れた順番を重視し、indexを使いたいときはArrayList
 *〔答え合わせ〕
 *    LinkedList: 挿入と削除をリンクの付け替えだけでできる
 *    ArrayList : 挿入と削除で要素のコピーが発生することがある
 *
 *(5)× HashMap.getValue()で全ての値
 *        ->xxxx.keySet().getValue() / xxxx.values()を利用
 *
//====== Practice 19-2 ======
import java.util.ArrayList;

public class Question{
  public static void main(String[] args){
     ArrayList<String> list = new ArrayList<>();
     list.add("Alice");
     list.add("Bob");
     list.add("Chris");
     //※１

     System.out.println(list.get(2));//※２
     System.out.println(list.size());//※３
  }//main()
}//class

問 上記コードについて
(1)※１に list.add(1234);どうなる？
    (a)コンパイルエラー listは<String>と宣言しているので、intは代入できません
    -> list.add("1234")なら可;
(2)※２で表示されるのは？
    list.get(2) => Chris
(3)※３で表示されるのは？
    (1)は実行しないので、3
 */

//====== Practice 19-3 Advanced Quest ======
/*
問〔RDD:要件定義〕
「ArrayListの内部はどうなっているか」を参考にコード作成。
ただし、以下の要件を満たすこと。

・練習のため、java.utilパッケージは使わない。
・コンストラクタでINITIAL_CAPACITY個の要素を持つ配列をarフィールドに確保
・add()で要素を追加。
    配列arがいっぱいなら、長さを2倍にした新しい配列を確保して追加する。
・get()で参照。
    添字が範囲外なら、IndexOutOfBoundsExceptionをthrow。
・size()で格納されている要素数を返す。
 */
package chapter19;

public class MyDefineArrayList {
    private static final int INITAL_CAPACITY = 4 ;
    private String[] ar;
    private int sz;
    private int indexCount;

    public MyDefineArrayList() {
        this.ar = new String[INITAL_CAPACITY];
        this.sz = ar.length;
        this.indexCount = 0;
    }

    public MyDefineArrayList(int size) {
        this.ar = new String[size];
        this.sz = ar.length;
        this.indexCount = 0;
    }

    public void add(String s) {
        expandBounds(indexCount);

        ar[indexCount] = s;
        this.indexCount++;
    }//add()

    public void add(int n, String s) {
        expandBounds(n);

        ar[n] = s;
        this.indexCount++;
    }

    private void expandBounds(int n) {
        //もし、nが配列の範囲外なら2倍の配列に拡張
        if (n >= sz) {
            this.sz *= 2;

            //---- copy elements of 'ar[]'----
            //String[] copy = ar;は参照先のコピーになるので不可。
            //java.util.Arraysができるなら
            //String[] copy = Arrays.copyOf(ar, sz);とすべき
            //〔答え合わせ〕
            //System.arraycopy(
            //    oldArray, fromOldIndex, newArray, toNewIndex, length);

            String[]copy = new String[sz];
            for (int i = 0; i < ar.length; i++) {
                copy[i] = ar[i];
            }

            //---- set copy to new ar[] ----
            //拡張した ar[]に元の要素を再代入
            this.ar = new String[sz];
            for (int i = 0; i < ar.length; i++) {
                ar[i] = copy[i];
                this.indexCount = i;
            }
        }//if
    }//expandBounds()

    public void set(int n, String s) {
        overBounds(n);
        ar[n] = s;
    }//set()

    public String get(int n) {
        overBounds(n);
        return ar[n];
    }//get()

    private void overBounds(int n) throws IndexOutOfBoundsException{
        if (n < 0 && n >= sz) { // n < 0 は〔解答参照〕。解答のszはここのindexCountと同じ(「=」の有無)
            System.out.println("ＳＳ将校「任務失敗」");
            throw new IndexOutOfBoundsException();
        }
    }//overBounds()

    public int size() {
        return sz = ar.length;
    }//size()

    public void remove(int n) {
        ar[n] = null;
    }//remove(int n)

    public void remove(String s) {
        for (int i = 0; i < ar.length; i++) {
            if (s.equals(ar[i])) {
                ar[i] = null;
            }//if
        }//for
    }//remove(String s)


    public static void main(String[] args) {
        MyDefineArrayList list = new MyDefineArrayList();

        //---- add() test ----
        list.add("グーデリアン");
        list.add("マンシュタイン");
        list.add("リスト");
        list.add("ロンメル");

        //---- size() / get() test ----
        System.out.println("list.size(): " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("list(%d)==%s \n", i, list.get(i));
        }

        String message = "\n作戦名ヴァイス/Ａ軍集団: [";
        printList(list, message);

        //---- set() test ----
        list.set(2, "ポック");
        message = "リストを転属、後任ポック:[ ";
        printList(list, message);

        //---- remove() test----
        list.remove(1);
        message = "マンシュタインを総司令部へ:[ ";
        printList(list, message);

        list.remove("ロンメル");
        message = "ロンメルはアフリカ戦線ＤＡＫを編成:[ ";
        printList(list, message);

        //---- expandBounds() test ----
        list.add(4, "ルントシュテット");
        System.out.println("list.size(): " + list.size());
        message = "Ａ軍集団とＢ軍集団を統合(２倍に拡張):\n[";
        printList(list, message);

        //---- overBounds test ----
        System.out.println("総統令「ロンメルを逮捕せよっ！」");
        list.set(8, "ロンメル");
        list.get(8);
        message = "ＳＳ「ロンメル将軍の逮捕」";
        printList(list, message);

    }//main()

    private static void printList(MyDefineArrayList list, String message) {
        System.out.print(message);
        for (String name : list.ar) {
            if (name == null) {
                name = "(要配属)";
            }
            System.out.print(name + ", ");

        }//for name
        System.out.print("] \n\n");

    }//printList()

}//class

/*
list.size(): 4
list(0)==グーデリアン
list(1)==マンシュタイン
list(2)==リスト
list(3)==ロンメル

作戦名ヴァイス/Ａ軍集団: [グーデリアン, マンシュタイン, リスト, ロンメル, ]

リストを転属、後任ポック:[ グーデリアン, マンシュタイン, ポック, ロンメル, ]

マンシュタインを総司令部へ:[ グーデリアン, (要配属), ポック, ロンメル, ]

ロンメルはアフリカ戦線ＤＡＫを編成:[ グーデリアン, (要配属), ポック, (要配属), ]

list.size(): 8
Ａ軍集団とＢ軍集団を統合(２倍に拡張):
[グーデリアン, (要配属), ポック, (要配属), ルントシュテット, (要配属), (要配属), (要配属), ]

総統令「ロンメルを逮捕せよっ！」
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    at chapter19.MyDefineArrayList.set(MyDefineArrayList.java:128)
    at chapter19.MyDefineArrayList.main(MyDefineArrayList.java:201)


【考察】
MyDefineArrayListと言いながら実は普通のクラスで
疑似的にArrayList風のメソッドの動きを再現している。

本物のArrayListならジェネリクス型引数<String>を付けなければいけない。
クラス定義も
public ArrayList<E> implements AbstractList<E>...{ }だそうな。

でも、Listの内部的な処理は配列でやっているとのことだから、
ここでやった処理と似たようなことをしているのかも。
フィールドの ar[], szは実際にあるそうだ。

苦労したのは、やっぱり２倍拡張のところ。
もとのデータを１回コピーして、拡張した新配列に移し替えなきゃならん。
実際のArrayListも defaultは size = 16で、
それを超えると(人知れず)データの移し替えをしてくれていたんだ。
「Listは、いくらでも詰め込めるから」とか気楽に言ってて ごめんJava。いつも、ありがとうJava。
 */
