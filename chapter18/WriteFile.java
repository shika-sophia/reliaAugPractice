/**
 * @title chapter18 / List 18-2 / WriteFile
 * @content FileWriter
 * @author Oshika
 * @date 2020-09-08 / 1000-1100
 */
package chapter18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class WriteFile {

    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("使用法: java WriteFile 作成ファイル名");
            System.out.println("例: java WriteFile output.txt < input.txt");
            System.exit(0);
        }//if

        String fileName = args[0];
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));){

            String line;
            while((line = reader.readLine()) != null) {
                writer.println(line);
            }//while

            //reader.close();
            //writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }//try-catch

    }//main()

}//class

/*
//javaファイルと同じ階層に input.txtを置き実行
    -> output.txtが生成される(内容をコピーしてある)

txtファイルの文字コード: SJIS (ShiftJIS)
packageをコメントアウトしてコンパイル

C:\Users\sophia\Desktop>javac WriteFile.java -encoding UTF-8

C:\Users\sophia\Desktop>java WriteFile output.txt < input.txt

C:\Users\sophia\Desktop>
*/

/* input.txt 例

いろはにほへとちりぬるを
わかよたれそつねならむ
うゐのおくやまけふこえて
あさきゆめみしゑひもせす


色は匂へど散りぬるを
我が世 誰ぞ 常ならむ
有為の奥山 今日 越えて
浅き夢見し 酔ひもせず


色や香りは まだ残っておりますが もう散ってしまいました
この世は だれであっても 常に留めておくことはできません
憂鬱な人生も意味あるものと言い聞かせ 今日も生きています
ほのかな夢を見たとしても それに酔いしれることなく

 */
