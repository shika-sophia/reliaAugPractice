/**
 * @title chapter7 / List 7-1, 7-2, 7-3, 7-4, 7-5
 * @class while
 * @author Oshika
 * @date 2020-08-12 / 11:00-12:00
 */

package chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Copy {

  public static void main(String[] args) {
    //====== List 7-1 ======
    int i = 0;
    while (i < 3) {
        System.out.println(i);
        i++;
    }
    System.out.println("end");

    //====== List 7-2, 7-4, 7-5 ======
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {
        System.out.print("文字列を入力してください。");
        //---- 7-2 ----
        //String line = reader.readLine();
        //while (line != null) {

        //---- 7-4 ----
        String line = "";
        while ((line = reader.readLine()) != null) {

            if (line.equals("0") || line.equals("０")) {
                 break;
            }//if
            String s = line.toLowerCase();
            System.out.println(s);
            line = reader.readLine();
        }//while
    } catch (IOException e) {
        e.printStackTrace();
    }
  }//main()

}//class

/*
//====== Result ======
//---- 7-1 ----
0
1
2
end

//---- 7-2 ----
文字列を入力してください。あｂｃ
あｂｃ
abc
abc
0

//---- 7-3 ----
C:\Users\sophia>cd Desktop
C:\Users\sophia\Desktop>javac Copy.java

C:\Users\sophia\Desktop>java Copy < input.txt  -encoding utf-8
abc
12345
this is Japan.
遘√?ｯ繧ｷ繧ｫ縺ｧ縺吶?? (私はシカです。)

//↑UTF-8で文字化けしとる。
//コマンドプロンプトでファイルの読み込みできるのは初めて知った♪


//---- 7-4, 7-5 ----
文字列を入力してください。ABC
abc
ＴＨＩＳ
(全角、機能せず)

０
(終了せず)
^Z
  */
