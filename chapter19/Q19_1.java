/**
 * @title chapter19 / Additional Quest / Q19_1
 * @content Collection / ArrayList / Lamda, Stream
 * @author Oshika
 * @date 2020-09-11 / 1630-1730
 */
/*
    ArrayList型のコレクションを作ってみてください。
    ・要素の型と要素数は自由です。
    ・最後に追加した要素を表示させてください。
    ・作ったコレクションのサイズを表示させてください。
*/
package chapter19;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Q19_1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Random rdm = new Random();

        for (int i = 0; i < 10; i++) {
            int element = rdm.nextInt(100);
            list.add(element);
        }

        System.out.println("list: " + list);
        System.out.println("size: " + list.size());
    }//main()
}//class

//list: [42, 71, 83, 87, 53, 6, 73, 18, 38, 32]
//size: 10

/*
//###### Appendix / Lamda, Stream Version ######
import java.util.Random;
import java.util.stream.Stream;

public class Q19_1 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.generate(()->{
            Random rdm = new Random();
            return rdm.nextInt(100);
        });

        int size = 10;
        stream.limit(size).forEach(System.out::println);
        System.out.println("size: " + size);

    }//main()
}//class
*/
/*
52
62
63
49
85
19
82
91
13
8
size: 10

System.out.println(stream.limit(size));
    ↓
Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
    at java.base/java.util.stream.AbstractPipeline.<init>(AbstractPipeline.java:203)
    at java.base/java.util.stream.ReferencePipeline.<init>(ReferencePipeline.java:94)
    at java.base/java.util.stream.ReferencePipeline$StatefulOp.<init>(ReferencePipeline.java:725)
    at java.base/java.util.stream.SliceOps$1.<init>(SliceOps.java:115)
    at java.base/java.util.stream.SliceOps.makeRef(SliceOps.java:115)
    at java.base/java.util.stream.ReferencePipeline.limit(ReferencePipeline.java:470)
    at chapter19.Q19_1.main(Q19_1.java:52)

*/