/**
 * @title chapter18 / List 18-3 / DeleteFile
 * @content File.delete()
 * @author Oshika
 * @date 2020-09-08 / 1100-1130
 */
package chapter18;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("使用法: java DeleteFile 削除ファイル名");
            System.out.println("例: java DeleteFile garbage.txt");
            System.exit(0);
        }//if

        String fileName = args[0];
        File file = new File(fileName);

        if (file.delete()) {
            System.out.println(fileName + "を削除しました");
        } else {
            System.out.println(fileName + "は削除できませんでした");
        }//if-else

    }//main()

}//class

/*
//====== Command Prompt ======
C:\Users\sophia\Desktop>javac DeleteFile.java

C:\Users\sophia\Desktop>java DeleteFile output.txt
output.txtを削除しました

C:\Users\sophia\Desktop>java DeleteFile output.txt
output.txtは削除できませんでした

 * */
