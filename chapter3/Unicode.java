/**
 * @title chapter3 / Practice 3-3 Advanst
 * @RDD 文字列を入力して１文字ずつのUnicodeを表示。
 * @author Oshika
 * @date 2020-08-06 / 9:00-10:30
 */
package chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Unicode {

  public static void main(String[] args) {
      //---- user input String 'line' ----
      Scanner scn = new Scanner(System.in);
      System.out.print("文字列を入力してください。");
      String line = scn.nextLine();
      System.out.println();

      //---- paramter definition ----
      int lineLength = line.length();
      List<Integer> lineUni = new ArrayList<>();

     for(int i = 0; i < lineLength; i++) {
          //---- set Unicode of each 1 char to List 'lineUni'----
          lineUni.add(line.codePointAt(i));

          //---- console out ----
          System.out.printf("\'%s\'の10進数Unicodeは%dです。16進数Unicodeは%sです。\n",
                  line.charAt(i),lineUni.get(i), Integer.toHexString(lineUni.get(i)));

      }//for
      scn.close();

      //---- 《おまけ》Appendix ----
      char c = '結';
      int uni = (int) c;
      System.out.println(c + ":" + uni);
  }//main()

}//class

/*
//====== Result ======
文字列を入力してください。結城浩『Java言語』

'結'の10進数Unicodeは32080です。16進数Unicodeは7d50です。
'城'の10進数Unicodeは22478です。16進数Unicodeは57ceです。
'浩'の10進数Unicodeは28009です。16進数Unicodeは6d69です。
'『'の10進数Unicodeは12302です。16進数Unicodeは300eです。
'J'の10進数Unicodeは74です。16進数Unicodeは4aです。
'a'の10進数Unicodeは97です。16進数Unicodeは61です。
'v'の10進数Unicodeは118です。16進数Unicodeは76です。
'a'の10進数Unicodeは97です。16進数Unicodeは61です。
'言'の10進数Unicodeは35328です。16進数Unicodeは8a00です。
'語'の10進数Unicodeは35486です。16進数Unicodeは8a9eです。
'』'の10進数Unicodeは12303です。16進数Unicodeは300fです。

結:32080

//【考察】List 'lineUni'を使わず、printfの引数に直接codePointAt()を入れても良かったが
          外に持ち出すことを考えると、こちらのほうが好み。

//《おまけ》型キャストでも10進数Unicodeが出る
      char c = '結';
      int uni = (int) c;

 */
