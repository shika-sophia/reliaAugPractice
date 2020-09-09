/**
 * @title chapter19 / List 19-14 / HashMapSample
 * @content Collection / HashMap
 * @author Oshika
 * @date 2020-09-09 / 1630-1730
 */
package chapter19;

import java.util.HashMap;
import java.util.Map;

public class HushMapSample {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>(
            //<K, V>初期値設定 Map.of(K key, V value)
            Map.of("Alice", 100,
                    "Bob", 57,
                    "Chris", 85)
        );

        //<K, V>要素の追加 Map.put(K key, V value)
        map.put("Diana", 85);
        map.put("Elmo", 92);

        //全要素<K, V>の取得 Map.entrySet()
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.printf("<key, value>: <%s, %d> \n",
                entry.getKey(), entry.getValue());
        }
        System.out.println();

        //keyの取得 Map.keySet()
        for (String key : map.keySet()) {
            System.out.println("key: " + key);
        }
        System.out.println();

        //valueの取得 Map.keySet() / Map.get(K key)
        for (String key : map.keySet()) {
            System.out.println("value: " + map.get(key));
        }
        System.out.println();

        //valueの取得 Map.values()
        for (int value : map.values()) {
            System.out.println("value: " + value);
        }
        System.out.println();

        //key 'Bob'の値を取得
        System.out.println("Bobの値: " + map.get("Bob"));

        //存在しないkey -> null
        System.out.println("Fredの値: " + map.get("Fred"));

    }//main()

}//class

/*
<key, value>: <Diana, 85>
<key, value>: <Elmo, 92>
<key, value>: <Bob, 57>
<key, value>: <Chris, 85>
<key, value>: <Alice, 100>

key: Diana
key: Elmo
key: Bob
key: Chris
key: Alice

value: 85
value: 92
value: 57
value: 85
value: 100

value: 85
value: 92
value: 57
value: 85
value: 100

Bobの値: 57
Fredの値: null

*/