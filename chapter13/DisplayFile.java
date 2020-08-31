/**
 * @title chapter13 / List 13-5 / DisplayFile
 * @content exception treat
 * @author Oshika
 * @date 2020-08-31 / 0930-1030
 */

package chapter13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DisplayFile {

    public static void main(String[] args) {
        for(String fileName : args) {
            System.out.println("ファイル名: " + fileName);

            try {

                BufferedReader reader = new BufferedReader(new FileReader(fileName));

                while(true) {
                    String line = reader.readLine();
                    if (line == null) {
                        break;
                    }//if
                    System.out.println(line);

                }//while
                reader.close();

            } catch (FileNotFoundException e) {
                System.out.println("ファイルが見つかりません");

            } catch (IOException e) {
                System.out.println("I/O Error");
            }

        }//for

    }//main()

}//class

/*
//====== Command Prompt ======
C:\Users\sophia\Desktop>javac DisplayFile.java -encoding UTF-8

C:\Users\sophia\Desktop>java DisplayFile DisplayFile.java NoFile
ファイル名: DisplayFile.java

//package chapter13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DisplayFile {
    public static void main(String[] args) {
        for(String fileName : args) {
          ・・・
        }//for
    }//main()
}//class

ファイル名: NoFile
ファイルが見つかりません

*/