/**
 * @title chapter18 / Practice 18-1, 18-2 / FindFile
 * @content File
 * @author Oshika
 * @date 2020-09-08 / 1530-1800
 */
/*
//====== Practice 18-1 ======
(1)× FileReaderクラスの最初はopen()で開く
        -> open()見たことない。FileReader(ファイル名)で、すでに開いているのでは？
〔答え合わせ〕
FileReaderのコンストラクターによって、ファイルを開く処理をする

(2)〇 java.ioは入出力に関連したパッケージ
(3)〇 Bufferedをすると読み書きの速度が向上
(4)× FileNotFoundException は RuntimeExceptionのサブクラス
        -> try-catchは必ず必要だから Exceptionのほうでしょ
(5)× 継承しているメソッドを探すときクラス階層を遡って調べる
        -> Oracle/APIリファレンスとかね。クラス階層だけ見てもインターフェースのは分からないし
(6)× メソッドの内側でエラーは戻り値を見ればわかる
        -> 戻り値をSystem.out.println();で出すと解りやすいけど
        -> try-catchを使おう
(7)× 1クラスに 1コンストラクタのみ
(8)〇 どのクラスにもsuperがある。
        -> Objectクラスね。Objectにはないか
(9)〇 finalクラスのサブクラスは作れない
(10)× throws句のないメソッドは例外を投げない
        -> そんなことない

*/
//====== Practice 18-2 ======

package chapter18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FindFile {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("使用法: java.FindFile 検索文字列 ファイル名");
            System.out.println("使用例: java.FindFile System FileFind.java");
            System.exit(0);
        }

        String search = args[0]; //検索文字列
        String fileName = args[1]; //ファイル名
        System.out.println("検索文字列: " + search);
        System.out.println("検索ファイル: " + fileName);

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){

            String line;
            int lineNum = 1;
            while ((line = reader.readLine()) != null) {

                if (line.contains(search)){
                    System.out.printf("[%d] %s \n", lineNum, line.trim());
                }//if

                lineNum++;

            }//while

        } catch (FileNotFoundException e) {
            System.out.println(fileName + "は見つかりませんでした");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }//main()

}//class

/*
C:\Users\sophia\Desktop\chapter18_forCommandPrompt>javac FindFile.java

C:\Users\sophia\Desktop\chapter18_forCommandPrompt>java FindFile System FindFile.java
検索文字列: System
検索ファイル: FindFile.java
[21] -> 戻り値をSystem.out.println();で出すと解 りやすいけど
[44] System.out.println("使用法: java.FindFile  検索文字列 ファイル名");
[45] System.out.println("使用例: java.FindFile System FileFind.java");
[46] System.exit(0);
[51] System.out.println("検索文字列: " + search);
[52] System.out.println("検索ファイル: " + fileName);
[61] System.out.printf("[%d] %s \n", lineNum, line.trim());
[69] System.out.println(fileName + "は見つかりませんでした");


【メモ】
while(line != null)だと 検索してくれなかった
while ((line = reader.readLine()) != null)だとＯＫ
*/