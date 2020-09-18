/*
◇Let's プログラミング
＊座標の値を取得する, 実行Windowのフレームを作成, Mouseクリックの座標を表示
https://www.javadrive.jp/tutorial/point/index3.html
 */
//====== サンプルプログラム ======
package book2General.reference;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MousePointerSample extends JFrame implements MouseListener {

    JLabel label;

    public static void main(String[] args){
        MousePointerSample frame = new MousePointerSample();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10, 10, 300, 200);
        frame.setTitle("タイトル");
        frame.setVisible(true);
      }//main()

      MousePointerSample(){
        JPanel panel = new JPanel();
        panel.addMouseListener(this);
        panel.setBackground(Color.GRAY);

        label = new JLabel("座標を表示");

        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(label, BorderLayout.PAGE_END);
      }

      public void mouseClicked(MouseEvent e){
        Point point = e.getPoint();
        label.setText("x:" + point.x + ",y:" + point.y);
      }

      public void mouseEntered(MouseEvent e){}
      public void mouseExited(MouseEvent e){}
      public void mousePressed(MouseEvent e){}
      public void mouseReleased(MouseEvent e){}

}//class

/*
前掲サイトのサンプルコードを丸写しです。
まずは、こんなんできるのかっていうのを見てみたかったので。

おぉ、コンソールとは別のウィンドウが開いて、マウスでポチポチすると
下に [ x: 32, y: 124 ]みたいな座標がでるわ。

java.swingパッケージ
java.awtパッケージのこと私は何も解ってないから、
使うなら、ちゃんと理解した上でつかいたいなぁ。

ほいっ、こんなんあったわ。このかたのサイトで勉強せえ私。

◇Let's プログラミング
＊Swingを使ったアプリケーションとは
https://www.javadrive.jp/tutorial/ini/index1.html


でもその前に、ちと、他のも移植コピーしてみます。

あっ、モジュールをいじらんでもそのまま行けた。
てかモジュールの開き方もどうやればいいのか解らん。

あっ、見つけた。モジュールの開き方は [reference.Moduleメモ]のほうに記載。

*/
/*
■記事 全文
◇Let's プログラミング
＊座標の値を取得する
https://www.javadrive.jp/tutorial/point/index3.html

Pointクラスのオブジェクトに保持されているx座標及びy座標をそれぞれ取得する方法を確認します。

Pointクラスには2つのフィールドが用意されており、Pointクラスのオブジェクトが保持しているx座標及びy座標はこのフィールドを参照することで取得する事が可能です。

フィールド	説明
Point.x	x座標
Point.y	y座標
フィールドはそれぞれ次のように定義されています。

x
public int x
この Point の X 座標です。X 座標が設定されていない場合はデフォルトで 0 になります。
y
public int y
この Point の Y 座標です。Y 座標が設定されていない場合はデフォルトで 0になります。
このフィールドの値を参照することでPointクラスのオブジェクトが持っている2つの値をそれぞれint型の値として取得することが可能となります。

実際には次のように使用します。

Point point = new Point(10, 20);

int x = point.x;
int y = point.y;
サンプルプログラム
では簡単なサンプルを作成して試してみます。

JPointTest3.java

import javax.swing.*;
import java.awt.Point;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JPointTest3 extends JFrame implements MouseListener{

  JLabel label;

  public static void main(String[] args){
    JPointTest3 frame = new JPointTest3();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  JPointTest3(){
    JPanel panel = new JPanel();
    panel.addMouseListener(this);
    panel.setBackground(Color.BLUE);

    label = new JLabel("座標を表示");

    getContentPane().add(panel, BorderLayout.CENTER);
    getContentPane().add(label, BorderLayout.PAGE_END);
  }

  public void mouseClicked(MouseEvent e){
    Point point = e.getPoint();
    label.setText("x:" + point.x + ",y:" + point.y);
  }

  public void mouseEntered(MouseEvent e){}
  public void mouseExited(MouseEvent e){}
  public void mousePressed(MouseEvent e){}
  public void mouseReleased(MouseEvent e){}

}
上記をコンパイルした後で実行すると次のように表示されます。

JPointクラスのオブジェクトから座標を取得する

今回はパネルの上をマウスでクリックすると、クリックされた位置の座標を取得して画面下部のラベルに表示するようにしています。青い部分をクリックして下さい。

JPointクラスのオブジェクトから座標を取得する

JPointクラスのオブジェクトから座標を取得する

メソッドを使って取得する
フィールドを参照する以外にPointクラスで用意されている「getX」メソッドと「getY」メソッドで取得することが可能です。

getXメソッド：

getX
public double getX()
この Point2D の X 座標を double 精度で返します。

戻り値:
  この Point2D の X 座標
getYメソッド：

getY
public double getY()
この Point2D の Y 座標を double 精度で返します。

戻り値:
  この Point2D の Y 座標
それぞれのメソッドの戻り値としてPointクラスのオブジェクトが保持しているx座標及びy座標を取得することが出来ますが、取得できる値はint型ではなくdouble型の値として取得される点に注意して下さい。

実際には次のように使用します。

Point point = new Point(10, 20);

double x = point.getX();
double y = point.getY();

( Written by Tatsuo Ikura )
*/