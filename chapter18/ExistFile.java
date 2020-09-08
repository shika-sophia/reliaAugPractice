/**
 * @title chapter18 / List 18-5 / ExistFile
 * @content File.renameTo() with File.exists()
 * @author Oshika
 * @date 2020-09-08 / 1330-1400
 */
package chapter18;

import java.io.File;

public class ExistFile {

    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println(
                "使用法: java ExistFile 現在のファイル名 新しいファイル名");
            System.out.println("例: java ExistFile old.txt new.txt");
            System.exit(0);
        }//if

        String oldFileName = args[0];
        String newFileName = args[1];
        File oldFile = new File(oldFileName);
        File newFile = new File(newFileName);

        if (!oldFile.exists()) {
            System.out.printf("%sが見つかりません",oldFileName);
        } else if (newFile.exists()){
            System.out.printf("%sは すでに存在しています",newFileName);
        } else if (oldFile.renameTo(newFile)) {
            System.out.printf("%sは %sに名前変更しました",oldFileName, newFileName);
        } else {
            System.out.printf("%sは %sに名前変更できませんでした",oldFileName, newFileName);
        }//if-else

    }//main()

}//class

/*
//====== Command Prompt ======
C:\Users\sophia\Desktop>javac ExistFile.java

C:\Users\sophia\Desktop>java ExistFile oldFile.txt newFile.txt
oldFile.txtが見つかりません
C:\Users\sophia\Desktop>echo test > oldFile.txt

C:\Users\sophia\Desktop>echo test > newdFile.txt

C:\Users\sophia\Desktop>java ExistFile oldFile.txt newFile.txt
newFile.txtは すでに存在しています

C:\Users\sophia\Desktop>java ExistFile oldFile.txt newFile.txt
oldFile.txtは newFile.txtに名前変更しました

 */
