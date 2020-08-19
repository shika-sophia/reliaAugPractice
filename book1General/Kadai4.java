/**
 * @title book1General / 上巻総合問題 / Kadai4
 * @contents Random
 * @author Oshika
 * @date 2020-08-19 / 13:00-13:30
 */

/*
 *【上巻確認問題4】
 * 3マスの中から動物が潜んでいる穴の場所を当てるゲームです。
 *
 *  ＜イメージ図＞(表示させる必要はありませんができる方はチャレンジしてください)
 *     1    2    3
 *  |----+----+----|
 *  |    |    | ○ |
 *  |----+----+----|
 *
 * この場合「3」に潜んでいることになります。
 * ゲームを開始すると、動物はマスのいずれかに逃げこみます。
 * 動物が潜んでいる場所を予想して場所を入力すると、
 * 動物がいた場合、「発見！」
 * いなかった場合、「いませんでした。」
 * と表示するようなプログラムを作成してください。
 *
 *【実行結果】
 * ゲームを開始します。
 *
 * ・・・・・動物がどこかに逃げ込みました。
 *
 * 動物がいる場所を入力してください。
 * ※1～3のいずれかを入力してください。
 *
 * 4
 *
 * 入力内容に誤りがあります。
 * 1～3のいずれかを入力してください。
 *
 * 2
 *
 * いませんでした。
 * 動物がいる場所を入力してください。
 *
 * 1
 *
 * いませんでした。
 * 動物がいる場所を入力してください。
 *
 * 3
 *
 * 発見！
 * おめでとうございます。
 *
 * ゲームを終了します。
 *
 * 以下の解答欄①～⑦にソースコードを記述して、上記の要件を満たしてください。
 */
package book1General;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kadai4 {
    public static void main(String[] args) {
        String line = "";
        int check = 0;
        int location = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("ゲームを開始します。\n");
        System.out.println("・・・・・動物がどこかに逃げ込みました。\n");
        System.out.println("動物がいる場所を入力してください。");
        System.out.println("※1～3のいずれかを入力してください。\n");

        // 1～3のいずれかをランダムで取得

        location = (int)(Math.random() * 2) + 1;

        try {

            while((line = reader.readLine()) != null) {

                // 入力内容が正しいかチェックをする
                if(checkInput(line)) {
                    check = Integer.parseInt(line);

                    // 動物の場所と入力場所が等しいかチェック
                    if(check == location) {
                        System.out.println("\n発見！");
                        System.out.println("おめでとうございます。\n");
                        break;
                    } else {
                        System.out.println("\nそこにはいませんでした。");
                        System.out.println("動物がいる場所を入力してください。\n");
                    }// if(内側)

                } else {
                    System.out.println("\n入力内容に誤りがあります。");
                    System.out.println("1～3のいずれかを入力してください。\n");
                }// if(外側)

            }// while

        } catch (IOException e) {
            System.out.println(e);
        }// try～catch

        System.out.println("ゲームを終了します。");
    }// main

    // 入力内容をチェックするメソッド
    public static boolean checkInput(String line) {
        boolean check = true;

        // 入力が1文字の場合
        if(line.length() == 1) {
            // 数字以外が入力されている場合⇒文字列から文字を取得しています。
            char c = line.charAt(0);

            if(c != '1' && c != '2' && c != '3') {
                check = false;
            }// if(内側)

        } else {
            check = false;
        }// if(外側)

        return check;

    }// checkInput

}// class

/*
//====== Result ======
ゲームを開始します。

・・・・・動物がどこかに逃げ込みました。

動物がいる場所を入力してください。
※1～3のいずれかを入力してください。

4

入力内容に誤りがあります。
1～3のいずれかを入力してください。

3

そこにはいませんでした。
動物がいる場所を入力してください。

2

発見！
おめでとうございます。

ゲームを終了します。

 */
