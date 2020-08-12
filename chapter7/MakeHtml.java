/**
 * @title chapter7 / Practice 7-3
 * @class while, String
 * @author Oshika
 * @date 2020-08-12 / 14:30
 */

package chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeHtml {

  public static void main(String[] args) {
    StringBuilder htmlBuilder = new StringBuilder();
      htmlBuilder.append("<!DOCTYPE html>\n");
      htmlBuilder.append("<html>\n");
      htmlBuilder.append("<head>\n");
      htmlBuilder.append("<meta charset=\"UTF-8\"> \n");
      htmlBuilder.append("<title> * My page * </title>\n");
      htmlBuilder.append("<body>\n");

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {
        String line = "";
        while ((line = reader.readLine()) != null) {
            //---- judge startWith and replace ----
            if (line.startsWith("■")) {
                line.replace('■', ' ');
                line.trim();

                htmlBuilder.append("<h1>").append(line).append("</h1>\n");
            } else if (line.startsWith("●")) {
                line.replace('●', ' ');
                line.trim();

                htmlBuilder.append("<h2>").append(line).append("</h2>\n");
            } else {
                htmlBuilder.append("<p>").append(line).append("</p>\n");
            }

            line = reader.readLine();
        }//while

        htmlBuilder.append("</body>\n");
        htmlBuilder.append("</html>\n");

        String html = htmlBuilder.toString();

        System.out.println(html);

    } catch (IOException e) {
        e.printStackTrace();
    }
  }//main()

}//class

/*
//====== Command Prompt ======
C:\Users\sophia\Desktop>javac MakeHtml.java -encoding UTF-8

C:\Users\sophia\Desktop>java MakeHtml < hello.txt > hello.html

C:\Users\sophia\Desktop>

//---- hello.html ----
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> * My page * </title>
<body>
<p>???私???ホ??????ペ???ジへようこそ</p>
<p>こんにちは???わたしのホ??????ペ???ジへようこそ???</p>
<p>私???シカと??????ます???よろし?????????</p>
<p></p>
</body>
</html>

//【考察】■→<h1>、●→<h2>が機能していないが、
 * 文字化けで認識できていないからと思われる。
 * UTF-8でencordingして文字化けするなら対処のしようがない。
 * ほぼ置換成功してるので良しとしよう。
 *
 * コマンドプロンプトから新規のファイルが ぽこっと生まれたのは
 * ちと面白かった。
 */

