/**
 * @title chapter18 / List 18-1 / ShowFile
 * @content FileReader
 * @author Oshika
 * @date 2020-09-08 / 0900-1000
 */

package chapter18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ShowFile {

    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("使用法: java ShowFile ファイル名");
            System.out.println("例: java ShowFile ShowFile.java");
            System.exit(0);
        }//if

        String fileName = args[0];
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }//while
            //reader.close();

        } catch (FileNotFoundException e) {
            System.out.println(fileName + "が見つかりません");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }//try-catch

    }//main

}//class

/*
//====== Command Prompt ======
C:\Users\sophia\Desktop>javac ShowFile.java -encoding UTF-8

C:\Users\sophia\Desktop>java ShowFile ShowFile.java

//package chapter18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ShowFile {

    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("菴ｿ逕ｨ豕?: java ShowFile 繝輔ぃ繧､繝ｫ蜷?");
            System.out.println("萓?: java ShowFile ShowFile.java");
            System.exit(0);
        }//if
      :
      : (中略)
      :
    }//main

}//class
*/