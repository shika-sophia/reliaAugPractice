/**
 * @title chapter19 / List 19-12 / LinkedListAsStack
 * @content Collection / LinkedList, Stack
 * @author Oshika
 * @date 2020-09-09 / 1500-1600
 */
package chapter19;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedListAsStack {

    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<String>();

        //要素の追加 LinkedList.addFirst()
        stack.addFirst("Alice");
        System.out.println(stack);
        stack.addFirst("Bob");
        System.out.println(stack);
        stack.addFirst("Chris");
        System.out.println(stack);
        stack.addFirst("Diana");
        System.out.println(stack);
        stack.addFirst("Elmo");
        System.out.println(stack);

        try {
              while(true) {
                  //先頭要素の参照 LinkedList.getFirst()
                  String name = stack.getFirst();
                  System.out.println("LinkedList.getFirst())の戻り値: " + name);
                  System.out.println(stack);

                  //要素の取得と削除 LinkedList.removeFirst()
                  name = stack.removeFirst();
                  System.out.println("LinkedList.removeFirst()の戻り値: " + name);
                  System.out.println(stack);
              }//while

          } catch (NoSuchElementException e) {
              e.printStackTrace();
          }
    }//main()

}//class

/*
[Alice]
[Bob, Alice]
[Chris, Bob, Alice]
[Diana, Chris, Bob, Alice]
[Elmo, Diana, Chris, Bob, Alice]

LinkedList.getFirst())の戻り値: Elmo
[Elmo, Diana, Chris, Bob, Alice]
LinkedList.removeFirst()の戻り値: Elmo
[Diana, Chris, Bob, Alice]

LinkedList.getFirst())の戻り値: Diana
[Diana, Chris, Bob, Alice]
LinkedList.removeFirst()の戻り値: Diana
[Chris, Bob, Alice]

LinkedList.getFirst())の戻り値: Chris
[Chris, Bob, Alice]
LinkedList.removeFirst()の戻り値: Chris
[Bob, Alice]

LinkedList.getFirst())の戻り値: Bob
[Bob, Alice]
LinkedList.removeFirst()の戻り値: Bob
[Alice]

LinkedList.getFirst())の戻り値: Alice
[Alice]
LinkedList.removeFirst()の戻り値: Alice
[]
java.util.NoSuchElementException
    at java.base/java.util.LinkedList.getFirst(LinkedList.java:248)
    at chapter19.LinkedListAsStack.main(LinkedListAsStack.java:32)

*/