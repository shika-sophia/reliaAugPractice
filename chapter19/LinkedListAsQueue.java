/**
 * @title chapter19 / List 19-10, 19-11 / LinkedListAsQueue
 * @content Collection / LinkedList, Queue
 * @author Oshika
 * @date 2020-09-09 / 1400-1500
 */
package chapter19;
/*
//====== List 19-10 ======
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueue {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Alice");
        System.out.println(queue);
        queue.offer("Bob");
        System.out.println(queue);
        queue.offer("Chris");
        System.out.println(queue);
        queue.offer("Diana");
        System.out.println(queue);
        queue.offer("Elmo");
        System.out.println(queue);

        //先頭要素の参照 Queue.peek()
        while(queue.peek() != null) {
            //要素の取得と削除
            String name = queue.poll();
            System.out.println("Queue.poll()の戻り値: " + name);
            System.out.println(queue);
        }//while

    }//main()

}//class
*/
/*
[Alice]
[Alice, Bob]
[Alice, Bob, Chris]
[Alice, Bob, Chris, Diana]
[Alice, Bob, Chris, Diana, Elmo]

Queue.poll()の戻り値: Alice
[Bob, Chris, Diana, Elmo]
Queue.poll()の戻り値: Bob
[Chris, Diana, Elmo]
Queue.poll()の戻り値: Chris
[Diana, Elmo]
Queue.poll()の戻り値: Diana
[Elmo]
Queue.poll()の戻り値: Elmo
[]
*/
//====== List 19-11 ======
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class LinkedListAsQueue {

  public static void main(String[] args) {
      Queue<String> queue = new LinkedList<String>();

      queue.add("Alice");
      System.out.println(queue);
      queue.add("Bob");
      System.out.println(queue);
      queue.add("Chris");
      System.out.println(queue);
      queue.add("Diana");
      System.out.println(queue);
      queue.offer("Elmo");
      System.out.println(queue);

      try {
          while(true) {
              //先頭要素の参照 Queue.element()
              String name = queue.element();
              System.out.println("Queue.element()の戻り値: " + name);
              System.out.println(queue);

              //要素の取得と削除 List.remove()
              name = queue.remove();
              System.out.println("List.remove()の戻り値: " + name);
              System.out.println(queue);
          }//while

      } catch (NoSuchElementException e) {
          e.printStackTrace();
      }

  }//main()

}//class

/*
[Alice]
[Alice, Bob]
[Alice, Bob, Chris]
[Alice, Bob, Chris, Diana]
[Alice, Bob, Chris, Diana, Elmo]

Queue.element()の戻り値: Alice
[Alice, Bob, Chris, Diana, Elmo]
List.remove()の戻り値: Alice
[Bob, Chris, Diana, Elmo]

Queue.element()の戻り値: Bob
[Bob, Chris, Diana, Elmo]
List.remove()の戻り値: Bob
[Chris, Diana, Elmo]

Queue.element()の戻り値: Chris
[Chris, Diana, Elmo]
List.remove()の戻り値: Chris
[Diana, Elmo]

Queue.element()の戻り値: Diana
[Diana, Elmo]
List.remove()の戻り値: Diana
[Elmo]

Queue.element()の戻り値: Elmo
[Elmo]
List.remove()の戻り値: Elmo
[]
java.util.NoSuchElementException
    at java.base/java.util.LinkedList.getFirst(LinkedList.java:248)
    at java.base/java.util.LinkedList.element(LinkedList.java:667)
    at chapter19.LinkedListAsQueue.main(LinkedListAsQueue.java:83)

*/