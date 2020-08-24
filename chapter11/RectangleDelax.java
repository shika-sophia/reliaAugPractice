/**
 * @title chapter11 / Practice11-9
 * @contents 'class' and 'instance'
 * @author Oshika
 * @date 2020-08-24 / 1400-1730
 */

package chapter11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleDelax {
    private final int INITIAL_WIDTH = 100;
    private final int INITIAL_HEIGHT = 100;
    private int width;
    private int height;
    private int x = 0;
    private int y = 0;

    RectangleDelax(){
        this.width = INITIAL_WIDTH;
        this.height = INITIAL_HEIGHT;
    }

    RectangleDelax(int width, int height){
        this.width = width;
        this.height = height;
    }

    RectangleDelax(int width, int height, int x, int y){
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public String toString() {
        return String.format("[ %d, %d, %d, %d ]", width, height, x, y);
    }


    public static void main(String[] args) {
        int width;
        int height;
        int x;
        int y;

        //---- input 準備 ----
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //---- RectangleDelaxのインスタンスを保持する配列----
        RectangleDelax[] square = new RectangleDelax[2];

        //---- 各変数をinput ----
        for (int i = 0; i < square.length; i++ ) {

            try {
                System.out.println((i + 1) + "個目の長方形:");
                System.out.println("横の長さ: ");
                String line = reader.readLine();
                width = Integer.parseInt(line);

                System.out.println("縦の長さ: ");
                line = reader.readLine();
                height = Integer.parseInt(line);

                System.out.println("横の開始位置 x: ");
                line = reader.readLine();
                x = Integer.parseInt(line);

                System.out.println("縦の開始位置 y: ");
                line = reader.readLine();
                y = Integer.parseInt(line);

                //---- ４変数でインスタンスして配列に格納 ついでに表示----
                System.out.print((i + 1) + "個目の長方形:");
                square[i] = new RectangleDelax(width, height, x, y);
                System.out.println(square[i].toString());

            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("数字で入力してください。");
            }
        }//for i

        //---- ２つの長方形を重なり判定メソッドに ----
        intersect(square);

    }//main()


    private static void intersect(RectangleDelax[] square) {
        int stackWidth;
        int stackHeight;
        int stackX;
        int stackY;


        if (square[0].width + square[0].x < square[1].width + square[1].x) {
            stackWidth = square[1].width + square[1].x - (square[0].width + square[0].x);

        } else if (square[0].width + square[0].x > square[1].width + square[1].x) {
            stackWidth = square[0].width + square[0].x - (square[1].width + square[1].x);
        }




    }//intersect()

}//class

/*
//====== Result ======
1個目の長方形:
横の長さ:
120
縦の長さ:
40
横の開始位置 x:
10
縦の開始位置 y:
10
[ 10, 10, 120, 40 ] //[x, y, width, height]

2個目の長方形:
横の長さ:
75
縦の長さ:
55
横の開始位置 x:
0
縦の開始位置 y:
9
[ 0, 9, 75, 55 ]


//【アルゴリズム１】重なる長方形は２つの和集合。
//和集合の最小値が開始位置、和集合の最大値 - 最小値が長さ
// -> 集合にするのが難しい

//【アルゴリズム２】長さ+開始位置を比較し、大きいほうから小さいほうを引くと差分が出る
// で？

んー、随分と考えたけどギブアップや。ここから先は数学の話だから
intersect(square);で このメソッドに入れたから良しとしよう。

//====== Answer(解答参照) ======
Rectangle intersect(Rectangle r){
  int sx = Math.max(this.x, r.x);
  int sy = Math.max(this.y, r.y);
  int ex = Math.min(this.x + this.width, r.x + r.width);
  int ey = Math.min(this.y + this.height, r.y + r.height);
  int newWidth = ex - sx;
  int newHeight = ey - sy;

  if (newWidth > 0 && newHeight > 0 ){
      return new Rectangle (sx, sy, newWidth, newHeight);
  } else {
      return null;
  }
}

なんじゃこりゃ、こんなん思いつかん。thisと rを使って計算すると覚えとこ
*/
