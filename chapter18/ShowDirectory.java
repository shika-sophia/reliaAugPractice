/**
 * @title chapter18 / List 18-6 / ShowDirectory
 * @content File.list()
 * @author Oshika
 * @date 2020-09-08 / 1330-1400
 */
package chapter18;

import java.io.File;

public class ShowDirectory {

    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("使用法: java ShowDirectory ディレクトリ名");
            System.out.println(
                    "例: java ShowDirectory chapter18_forCommandPrompt");
            System.exit(0);
        }//if

        String dirName = args[0];
        File dir = new File(dirName);
        String[] dirList = dir.list();

        for (int i = 0; i < dirList.length; i++) {
            System.out.println(dirList[i]);
        }//for i

    }//main()

}//class

/*
C:\Users\sophia\Desktop>javac ShowDirectory.java

C:\Users\sophia\Desktop>java ShowDirectory chapter18_forCommandPrompt

CreateDirectory.class
CreateDirectory.java
DeleteFile.class
DeleteFile.java
ExistFile.class
ExistFile.java
iroha.txt
newdFile.txt
newFile.txt
oldFile.txt
RenameFile.class
RenameFile.java
ShowFile.class
ShowFile.java
WriteFile.class
WriteFile.java
 */
