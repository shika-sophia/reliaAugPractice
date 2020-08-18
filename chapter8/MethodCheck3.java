/**
 * @title chapter8 / Additional Quest / MethodCheck3
 * @class Method
 * @author Oshika
 * @date 2020-08-17 / 16:30-17:30
 */
/*
 * 以下のプログラムを完成させてください。
 * 戻り値①②と処理①②を記述してください
 *
 *【出力結果】
 * 1人目の名前を入力してください
 * test1
 * test1さん、こんばんは
 * 2人目の名前を入力してください
 * test2
 * Hello test2
 *
 */
package chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MethodCheck3 {
    public static void main(String[] argas) {

        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("1人目の名前を入力してください");
            String input = reader.readLine();
            System.out.println(aisatu1(input));

            System.out.println("2人目の名前を入力してください");
            input = reader.readLine();
            System.out.println(aisatu2(input));

        } catch (IOException e) {
            System.out.println(e);
        }// try～catch

    }// main

    //一人目用のメソッド
    public static String aisatu1(String name) {
        //問題①記述欄
        return name + "さん、こんばんは";
    }// aisatu1

    //二人目用のメソッド
    public static String aisatu2(String name) {
        //問題②記述欄
        return "Hello " + name;
    }// aisatu2

}// class

/*
//====== Result ======
1人目の名前を入力してください
shika
shikaさん、こんばんは
2人目の名前を入力してください
deka
Hello deka

*/
