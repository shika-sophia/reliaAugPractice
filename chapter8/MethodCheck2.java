/**
 * @title chapter8 / Additional Quest / MethodCheck2
 * @class Method
 * @author Oshika
 * @date 2020-08-17 / 16:30-17:30
 */
/*
 * 以下のプログラムを読んで出力結果を予想してください。
 */
package chapter8;

class MethodCheck2 {
    public static void main(String[] args) {
        System.out.println(method1());
    }

    public static int method1() {
        return method2() + 10;
    }

    public static int method2() {
        return method3() + 10;
    }

    public static int method3() {
        return 10;
    }
}

//====== My Answer ======
//method3 = 10 -> method2 = method3 + 10 -> ... -> method1 = 30

//====== Result ======
//30