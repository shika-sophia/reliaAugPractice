/**
 * @title chapter13 / List 13-6 / DisplayURL
 * @content exception treat
 * @author Oshika
 * @date 2020-08-31 / 1030-1130
 */
package chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class DisplayURL {

    public static void main(String[] args) {
        for(String arg : args) {
            System.out.println("URL: " + arg);

            BufferedReader reader = null;
            try {
                URL url = new URL(arg);
                reader = new BufferedReader(new InputStreamReader(url.openStream()));

                while(true) {
                    String line = reader.readLine();

                    if (line == null) {
                        break;
                    }//if
                    System.out.println(line);
                }//while

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }//finally

        }//for

    }//main()

}//class

/*
//====== Command Prompt ======
C:\Users\sophia\Desktop>javac DisplayURL.java //SJIS = Shift-JISファイル

C:\Users\sophia\Desktop>java DisplayURL abcde
URL: abcde
java.net.MalformedURLException: no protocol: abcde
        at java.net.URL.<init>(Unknown Source)
        at java.net.URL.<init>(Unknown Source)
        at java.net.URL.<init>(Unknown Source)
        at DisplayURL.main(DisplayURL.java:23)

Exception in thread "main" java.lang.NullPointerException
        at DisplayURL.main(DisplayURL.java:41)

◆http://www.yahoo.com
C:\Users\sophia\Desktop>java DisplayURL http://www.yahoo.com

URL: http://www.yahoo.com
redirect

//なんか他に飛ばされたような・・

*/
