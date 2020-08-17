
/**
 * @title chapter7 / Additional Quest / GridShow2
 * @class while
 * @author Oshika
 * @date 2020-08-17 / 9:30-13:30
 * @RDD 以下の実行結果から類推してソースコードを作成せよ
C:\Users\sophia>cd Desktop

C:\Users\sophia\Desktop>java GridShow2

↑8　↓2　←4　→6
方向を数字で入力してください
入力無しENTERで終了

■■■■■■■■
■■■○■■■■
■■■■■■■■
■■■■■■■■
8

↑8　↓2　←4　→6
方向を数字で入力してください
入力無しENTERで終了

■■■○■■■■
■■■■■■■■
■■■■■■■■
■■■■■■■■
4

↑8　↓2　←4　→6
方向を数字で入力してください
入力無しENTERで終了

■■〇■■■■■
■■■■■■■■
■■■■■■■■
■■■■■■■■

------
■■■■■■■■
■■■○■■■■
■■■■■■■■
■■■■■■■■
まる
入力が正しくありません。
------
↑8　↓2　←4　→6
方向を数字で入力してください
入力無しENTERで終了

■■○■■■■■
■■■■■■■■
■■■■■■■■
■■■■■■■■

お疲れ様でした。

------

↑8　↓2　←4　→6
方向を数字で入力してください
入力無しENTERで終了

■■■○■■■■
■■■■■■■■
■■■■■■■■
■■■■■■■■
8

↑8　↓2　←4　→6
方向を数字で入力してください
入力無しENTERで終了

■■■■■■■■
■■■■■■■■
■■■■■■■■
■■■○■■■■

*/

package chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GridShow2 {

  public static void main(String[] args) {
    //====== parameter definition ======
    //---- BufferdReader Instance ----
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int star = 11; //〇の位置

    //====== input loop ======
    loop:
    while(true) {
        //---- make head announce ----
        StringBuilder headBuilder = new StringBuilder();
          headBuilder.append("↑８  ↓２  ←４  ↓６\n");
          headBuilder.append("方向を数字で入力してください\n");
          headBuilder.append("入力無しENTERで終了\n\n");

        //---- make star and grid ----
        String[] gridArray = new String[32];

        for(int i = 0; i < gridArray.length; i++) {
            if (i == star) {
                gridArray[i] = "☆";
            } else {
                gridArray[i] = "■";
            }

            headBuilder.append(gridArray[i]);

            if ((i + 1) % 8 == 0) {
                headBuilder.append("\n");
            }
          }//for

        String head = headBuilder.toString();

        //---- print 'head'----
        System.out.println(head);

        try {
            //====== input ======
            //---- null enter case ----
            String line;
            if((line = reader.readLine()) == null) {
                break loop;
            }//if

            int input = Integer.parseInt(line);

            //---- judge canMove----
            switch (input) {
              case 8://↑
                  if ((star - 8) < 0) {
                      star += 24;
                  } else {
                      star -= 8;
                  }
                  break;

              case 2://↓
                  if ((star + 8) > 32) {
                      star -= 24;
                  } else {
                      star += 8;
                  }
                  break;

              case 4://←
                  if (star % 8 == 0 || (star - 1) < 0) {
                      star += 7;
                  } else {
                      star -= 1;
                  }
                  break;

              case 6://→
                  if ((star + 1) % 8 == 0) {
                      star -= 7;
                  } else {
                      star += 1;
                  }
                  break;

            }//switch

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("入力が正しくありません。");
        }

    }//while loop

    System.out.println("おつかれさまでした。");
  }//main()

}//class

/*
//====== Result ======
↑８  ↓２  ←４  ↓６
方向を数字で入力してください
入力無しENTERで終了

■■■■■■■■
■■■☆■■■■
■■■■■■■■
■■■■■■■■

8
↑８  ↓２  ←４  ↓６
方向を数字で入力してください
入力無しENTERで終了

■■■☆■■■■
■■■■■■■■
■■■■■■■■
■■■■■■■■

8
↑８  ↓２  ←４  ↓６
方向を数字で入力してください
入力無しENTERで終了

■■■■■■■■
■■■■■■■■
■■■■■■■■
■■■☆■■■■

4
↑８  ↓２  ←４  ↓６
方向を数字で入力してください
入力無しENTERで終了

■■■■■■■■
■■■■■■■■
■■■■■■■■
■■☆■■■■■

4
↑８  ↓２  ←４  ↓６
方向を数字で入力してください
入力無しENTERで終了

■■■■■■■■
■■■■■■■■
■■■■■■■■
■☆■■■■■■

4
↑８  ↓２  ←４  ↓６
方向を数字で入力してください
入力無しENTERで終了

■■■■■■■■
■■■■■■■■
■■■■■■■■
☆■■■■■■■

4
↑８  ↓２  ←４  ↓６
方向を数字で入力してください
入力無しENTERで終了

■■■■■■■■
■■■■■■■■
■■■■■■■■
■■■■■■■☆

ほし
入力が正しくありません。
↑８  ↓２  ←４  ↓６
方向を数字で入力してください
入力無しENTERで終了

■■■■■■■■
■■■■■■■■
■■■■■■■■
■■■■■■■☆
(enter)

入力が正しくありません。
↑８  ↓２  ←４  ↓６
方向を数字で入力してください
入力無しENTERで終了

■■■■■■■■
■■■■■■■■
■■■■■■■■
■■■■■■■☆


//【考察】移動関係は ちゃんと作動。端っこもＯＫ
     ループもできたけど
     終了「入力なしenter」がcatchに入って終わってくれない。
     if文の判定前にcatchに入ってるのだろうか。解りませぬ(答えで確認します)

     if((line = reader.readLine()) == null) {
         break loop;
     }//if

     星が動いたから、まあいっか。

*/
/*
【解答】
import java.io.*;

public class GridShow2 {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        // グリッド表示範囲
        int width = 8;
        int height = 4;
        // ○の初期座標
        int x = 3;
        int y = 1;

        try{
            // 入力なしでENTERを押すまでループする
            do{
                System.out.println("\n↑8　↓2　←4　→6");
                System.out.println("方向を数字で入力してください");
                System.out.println("入力無しENTERで終了\n");
                // 4行分の表示をするforループ
                for (int i = 0; i < height; i++) {
                    // 8列分の表示をするforループ
                    for (int j = 0; j < width; j++) {
                        // ○と■を表示するためのif文
                        if (i == y && j == x) {
                            System.out.print("○");
                        } else {
                            System.out.print("■");
                        }// if
                    }// for2
                    System.out.println("");
                }// for1
                line = reader.readLine();
                // 移動を管理するswitch文(if文は回り込み処理)
                switch (line) {
                case "↓":
                case "2":
                    y++;
                    if (y >= height) {
                        y = 0;
                    }
                    break;

                case "←":
                case "4":
                    x--;
                    if (x < 0) {
                        x = (width - 1);
                    }
                    break;

                case "→":
                case "6":
                    x++;
                    if (x >= width) {
                        x = 0;
                    }
                    break;

                case "↑":
                case "8":
                    y--;
                    if (y < 0) {
                        y = (height - 1);
                    }
                    break;

                case "":// 空文字の場合は何もしない
                    break;

                default:// 入力が間違っている場合に表示
                    System.out.println("入力が正しくありません。");
                    break;
                }// switch
            // do-while文の条件式
            } while (!line.equals(""));// 空文字でない限り回る

            System.out.println("お疲れ様でした。");
        } catch (IOException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println("終了します。");
        }// try～catch

    }// main

}// class
 * */
