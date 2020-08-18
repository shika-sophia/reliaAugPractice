/**
 * @title chapter8 / Additional Quest / Profile
 * @class Method
 * @author Oshika
 * @date 2020-08-17 / 16:30-17:30
 */

/*
 * 以下のプログラムを完成させてください
 *
 * int型とString型の引数をもつ、戻り値のないメソッドを宣言してください。(記述欄②)
 * また、「"Yuki"、36」でメソッドを呼び出してください。(記述欄①)
 * なお、メソッドの命名は自由とします。
 */
package chapter8;

public class Profile {
    public static void main(String[] args) {

        // ▽記述欄① ここから

        printProfile("Yuki", 36);

        // △記述欄① ここまで

    }// main

    // 戻り値なしのメソッド
    // ▽記述欄② ここから

    private static void printProfile(String name, int age) {
        System.out.printf("名前は%s(%d歳)です。", name, age);
    }

    // △記述欄② ここまで

}// class

//====== Result ======
//名前はYuki(36歳)です。