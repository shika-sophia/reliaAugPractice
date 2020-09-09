/**
 * @title chapter19 / List 19-1 ～ 19-7 / ArrayListTest
 * @content Collection / ArrayList
 * @author Oshika
 * @date 2020-09-09 / 1100-1200
 */
package chapter19;
/*
//====== List 19-1 'Array'======
public class ArrayListTest {

    public static void main(String[] args) {
        String[] array = new String[] {
            "Alice","Bob","Chris",
        };

        for(String str : array) {
            System.out.println(str);
        }
    }//main()

}//class
*/
/*
Alice
Bob
Chris
*/
/*
import java.util.ArrayList;
import java.util.Arrays;

//====== 19-2, 19-3 'ArrayList','add()'======
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(
            Arrays.asList("Alice","Bob","Christfer"));

        list.add("Diana");
        list.add("Elmo");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list);

    }//main()

}//class
*/
/*
Alice
Bob
Christfer
[Alice, Bob, Christfer]

Alice
Bob
Christfer
Diana
Elmo
[Alice, Bob, Christfer, Diana, Elmo]
*/
/*
//====== List 19-4 'Iterator'======
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(
            Arrays.asList("Alice","Bob","Christfer"));

        list.add("Diana");
        list.add("Elmo");

        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String name = it.next();
            System.out.println(name);
        }

    }//main()

}//class
*/
/*
Alice
Bob
Christfer
Diana
Elmo
*/
/*
//====== List 19-5 'Enhanced for' ======
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {

  public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<>(
          Arrays.asList("Alice","Bob","Christfer"));

      list.add("Diana");
      list.add("Elmo");

      for (String name : list) {
          System.out.println(name);
      }

  }//main()

}//class
*/
/*
Alice
Bob
Christfer
Diana
Elmo
*/
/*
//====== List 19-6 'wrapper class' ======
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {

public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(
        Arrays.asList(12, 34, 56, 78, 90));

    for (int n : list) {
        System.out.println(n);
    }

    System.out.println(list);

}//main()

}//class
*/
/*
12
34
56
78
90
[12, 34, 56, 78, 90]
*/

//====== List 19-7 remove(), contains() ======
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {

public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>(
        Arrays.asList("Alice","Bob","Christfer"));

    list.add("Diana");
    list.add("Elmo");

    for (String name : list) {
        System.out.println(name);
    }

    list.remove("Alice");
    list.remove("Bob");
    list.remove("Elmo");

    if (list.contains("Alice")) {
        System.out.println("listに\"Alice\"は含まれています");
    } else {
        System.out.println("listに\"Alice\"は含まれていません");
    }

    System.out.println(list);
}//main()

}//class

/*
Alice
Bob
Christfer
Diana
Elmo

listに"Alice"は含まれていません
[Christfer, Diana]

*/