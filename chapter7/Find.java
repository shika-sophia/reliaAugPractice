/**
 * @title chapter7 / List 7-7, Practice 7-1,
 * @class while, String
 * @author Oshika
 * @date 2020-08-12 / 13:00-14:00
 */

package chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Find {

  public static void main(String[] args) {
    if (args.length != 1) {
        System.out.println("使用法: java Find 検索文字列 < 検索対象ファイル");
        System.out.println("例: java Find System < Find.java");
        System.exit(0);
    }//if

    String findWord = args[0];
    System.out.printf("検索文字列は[%s]です。\n", findWord);

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {
        String line;
        int lineNum = 1;

        while((line = reader.readLine()) != null) {
            int index = line.indexOf(findWord);
            if (index >= 0) {
                System.out.println(lineNum + ": " + line);
            }//if
            lineNum++;
        }//while

    } catch (IOException e) {
        e.printStackTrace();
    }

  }//main()

}//class

/*
//====== 7-7 Result======
//---- args なし ----
使用法: java Find 検索文字列 < 検索対象ファイル
例: java Find System < Find.java

//---- Command Prompt ----
C:\Users\sophia\Desktop>javac Find.java -encoding UTF-8

C:\Users\sophia\Desktop>java Find System < Find.java
検索文字列は[System]です。
18: System.out.println("菴ｿ逕ｨ豕?: java Find 讀懃ｴ｢譁?蟄怜?? <  讀懃ｴ｢蟇ｾ雎｡繝輔ぃ繧､繝ｫ");
19: System.out.println("萓?: java Find System < Find.java");
20: System.exit(0);
24: System.out.printf("讀懃ｴ｢譁?蟄怜?励?ｯ%s 縺ｧ縺吶??", findWord);
26: BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
35: System.out.println(lineNum + ": " + line);
52: 萓?: java Find System < Find.java


//====== Practice 7-1 ======
int n = 10;
while(n > 0){
  System.out.println(n);
  n = n - 1;
}

1. × 10～0まで11個表示 -> 10～1の10個
2. 〇 while文に入った直後は n > 0 true
3. 〇 条件式 n > 0 は 11回評価される
4. × n > 0 の型は int型 -> boolean 条件式だから
5. × n=n+1なら永遠に止まらない -> intの範囲を超えると止まるが60時間ループすると p292に。
 *
 * */
