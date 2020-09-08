/**
 * @title chapter18 / List 18-4 / RenameFile
 * @content File.renameTo()
 * @author Oshika
 * @date 2020-09-08 / 1300-1330
 */
package chapter18;

import java.io.File;

public class RenameFile {

    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println(
                "使用法: java RenameFile 現在のファイル名 新しいファイル名");
            System.out.println("例: java RenameFile old.txt new.txt");
            System.exit(0);
        }//if

        String oldFileName = args[0];
        String newFileName = args[1];
        File oldFile = new File(oldFileName);
        File newFile = new File(newFileName);

        if (oldFile.renameTo(newFile)) {
            System.out.printf("%sは %sに名前変更しました",oldFileName, newFileName);
        } else {
            System.out.printf("%sは %sに名前変更できませんでした",oldFileName, newFileName);
        }//if-else

    }//main()

}//class

/*
C:\Users\sophia\Desktop>javac RenameFile.java

C:\Users\sophia\Desktop>java RenameFile input.txt iroha.txt
input.txtは iroha.txtに名前変更しました
*/