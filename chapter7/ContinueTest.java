/**
 * @title chapter7 / Practice 7-4
 * @class while, String
 * @author Oshika
 * @date 2020-08-12 / 15:30-16:00
 */

package chapter7;
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContinueTest {

  public static void main(String[] args) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      try {
          String line;
          while((line = reader.readLine()) != null) {
              if (!line.endsWith("{") && !line.endsWith("}")) {
                  continue;
              }//if
              System.out.println(line);
          }//while

      } catch (IOException e) {
          e.printStackTrace();
      }
  }//main()

}//class
*/
/*
//====== Command Prompt ====== *
C:\Users\sophia\Desktop>javac ContinueTest.java -encoding UTF-8

C:\Users\sophia\Desktop>java ContinueTest < ContinueTest.java

public class ContinueTest {
  public static void main(String[] args) {
      try {
          while((line = reader.readLine()) != null) {
              if (!line.endsWith("{") && !line.endsWith("}")) {
      } catch (IOException e) {
      }

//【考察】末尾が「}」「{」で終わっている行の検索じゃないかな。
でも、これを見ると「！～」となっていて「終わってないものはcontinue;
(以下の処理せずwhile繰り返し)」とややこしい。

if (!line.endsWith("{") && !line.endsWith("}")) {
     continue;
}//if

〇題意「continueを使わない形式」なら、こうだろう。
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContinueTest {

  public static void main(String[] args) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      try {
          String line;
          while((line = reader.readLine()) != null) {
              if (line.endsWith("{") || line.endsWith("}")) {
                  System.out.println(line);
              }//if

          }//while

      } catch (IOException e) {
          e.printStackTrace();
      }
  }//main()

}//class

/*
//====== &&のままだった ======
if (line.endsWith("{") && line.endsWith("}")) {
    System.out.println(line);
}//if

C:\Users\sophia\Desktop>javac ContinueTest.java -encoding UTF-8

C:\Users\sophia\Desktop>java ContinueTest < ContinueTest.java

C:\Users\sophia\Desktop>


（EnptySet / 何もない）ってことだろう。
「｛」と「｝」が同時に末尾はありえない。

//====== ||に修正 ======
C:\Users\sophia\Desktop>javac ContinueTest.java -encoding UTF-8

C:\Users\sophia\Desktop>java ContinueTest < ContinueTest.java

public class ContinueTest {
  public static void main(String[] args) {
      try {
          while((line = reader.readLine()) != null) {
              if (line.endsWith("{") || line.endsWith("}")) {
      } catch (IOException e) {
      }

//さっきと同じ行を抜き出せましたとさ。
ド・モルガン則ですな。
 * */
