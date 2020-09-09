/**
 * @title chapter19 / List 19-13 / HashSetSample
 * @content Collection / HashSet
 * @author Oshika
 * @date 2020-09-09 / 1600-1630
 */
package chapter19;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetSample {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>(
            Arrays.asList("Alice","Bob","Chris","Diana","Elmo"));

        for(String name : set) {
            System.out.println(name);
        }//for name

        String search = "Alice";
        if (set.contains(search)) {
            System.out.println(search +"は含まれています");
        } else {
            System.out.println(search +"は含まれていません");
        }

    }//main()

}//class

/*
Diana
Bob
Alice
Chris
Elmo
Aliceは含まれています
*/