/**
 * @title chapter19 / List 19-9 / LinkedListSample
 * @content Collection / LinkedList
 * @author Oshika
 * @date 2020-09-09 / 1300-
 */
package chapter19;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListSample {

    public static void main(String[] args) {
         LinkedList<String> list = new LinkedList<>(
             Arrays.asList("Bob","Christfer"));

         list.add("Diana");
         list.add("Elmo");

         System.out.println(list);

         list.addFirst("Alice");

         System.out.println(list);
    }//main()

}//class

/*
[Bob, Christfer, Diana, Elmo]
[Alice, Bob, Christfer, Diana, Elmo]
*/