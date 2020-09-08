/**
 * @title chapter18 / List 18-7 / CreateDirectory
 * @content File.mkdirs(), File.getAbsolutePath()
 * @author Oshika
 * @date 2020-09-08 / 1330-1400
 */
package chapter18;

import java.io.File;

public class CreateDirectory {

    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("使用法: java CreateDirectory ディレクトリ名");
            System.out.println(
                    "例: java CreateDirectory chapter18_forCommandPrompt");
            System.exit(0);
        }//if

        String dirName = args[0];
        File dir = new File(dirName);

        if (dir.mkdirs()) {
            System.out.printf("ディレクトリ %s を作成しました\n", dirName);
            System.out.printf("%s の 絶対パスは\n[%s]です\n",
                    dirName, dir.getAbsolutePath());
        } else {
            System.out.printf("ディレクトリ %s は作成できませんでした\n", dirName);
        }//if-else

    }//main()

}//class

/*
C:\Users\sophia\Desktop>javac CreateDirectory.java

C:\Users\sophia\Desktop>java CreateDirectory chapter18_forCommandPrompt
ディレクトリ chapter18_forCommandPrompt を作成しました
chapter18_forCommandPrompt の
絶対パスは[C:\Users\sophia\Desktop\chapter18_forCommandPrompt]です
 * */
