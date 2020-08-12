/**
 * @title chapter7 / Additional Quest / WhileCheck
 * @class while
 * @author Oshika
 * @date 2020-08-12 / 16:30-17:30
 */

/*
 * FizzBuzz問題 ※while文を使用してください
 *
 * 1から100までコマンドプロンプト上に表示します。
 * ただし3で割り切れる場合は、「Fizz」
 * 5で割り切れる場合は、「Buzz」
 * 3でも5でも割り切れる場合は、「FizzBuzz」
 * と表示するようにしてください。
 *
 *【出力結果】
 * 1
 * 2
 * Fizz
 * 4
 * Buzz
 * Fizz
 * 7
 * 8
 * Fizz
 * Buzz
 * 11
 * Fizz
 * 13
 * 14
 * Fizz Buzz
 * 16
 * 17
 * Fizz
 * 19
 * Buzz
 */
package chapter7;

class WhileCheck {
  public static void main(String[] args) {
    int i = 1;

    // ▽解答欄 ここから
    String message = "";

    while (i <= 100) {
        //---- judge 3n && 5n ----
        if (i % 3 == 0 && i % 5 == 0) {
            message = "FizzBuzz";

        //---- judge 3n ----
        } else if (i % 3 == 0) {
            message = "Fizz";

        //---- judge 5n ----
        } else if (i % 5 == 0) {
            message = "Buzz";

        //---- else ----
        } else {
            message = String.valueOf(i);
        }

        //---- console out ----
        System.out.println(message);

        //---- counter i++ ----
        i++;
    }//while


    // △解答欄 ここまで
    }//main()
}//class

/*
//====== Result ======
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
Fizz
22
23
Fizz
Buzz
26
Fizz
28
29
FizzBuzz
31
32
Fizz
34
Buzz
Fizz
37
38
Fizz
Buzz
41
Fizz
43
44
FizzBuzz
46
47
Fizz
49
Buzz
Fizz
52
53
Fizz
Buzz
56
Fizz
58
59
FizzBuzz
61
62
Fizz
64
Buzz
Fizz
67
68
Fizz
Buzz
71
Fizz
73
74
FizzBuzz
76
77
Fizz
79
Buzz
Fizz
82
83
Fizz
Buzz
86
Fizz
88
89
FizzBuzz
91
92
Fizz
94
Buzz
Fizz
97
98
Fizz
Buzz

 */
