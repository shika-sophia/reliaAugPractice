/**
 * @title chapter19 / List 19-8 / ArrayListSample
 * @content Collection / ArrayList
 * @author Oshika
 * @date 2020-09-09 / 1300-
 */
package chapter19;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListSample {

public static void main(String[] args) {
    List<String> list = new ArrayList<>(
        Arrays.asList("Alice","Bob","Christfer"));
    //add()追加
    list.add("Diana");
    list.add("Elmo");

    //set()更新
    list.set(4, "Eriko");

    //最初のインデックス
    System.out.println("最初の要素: " + list.get(0));
    //最後のインデックス
    System.out.println("最後の要素: " + list.get(list.size() - 1));

    //Bobのインデックス
    System.out.printf("Bobは最初から%d番目\n", list.indexOf("Bob"));
    //Bobのインデックス
    System.out.printf("Bobは最後に出てくるBobのインデックス\n",
        list.lastIndexOf("Bob"));

    }//main()

}//class

/*
最初の要素: Alice
最後の要素: Eriko
Bobは最初から1番目
Bobは最後に出てくるBobのインデックス
*/