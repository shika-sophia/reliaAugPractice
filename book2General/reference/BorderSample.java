/*
◇Let's プログラミング
＊座標指定で配置する
https://www.javadrive.jp/tutorial/nulllayout/index1.html
 */

package book2General.reference;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderSample extends JFrame{

    public static void main(String[] args){
        BorderSample frame = new BorderSample();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10, 10, 300, 200);
        frame.setTitle("タイトル");
        frame.setVisible(true);
    }//main()

    BorderSample(){
        JPanel p = new JPanel();
        p.setLayout(null);

        JButton button1 = new JButton("Google");
        button1.setBounds(10, 10, 80, 30);

        JButton button2 = new JButton("Yahoo!");
        button2.setBounds(30, 30, 80, 30);

        JButton button3 = new JButton("MSN");
        button3.setBounds(50, 50, 80, 30);

        p.add(button1);
        p.add(button2);
        p.add(button3);

        getContentPane().add(p, BorderLayout.CENTER);
    }//BorderSample()

}//class

/*
■記事 全文
◇Let's プログラミング
＊座標指定で配置する
https://www.javadrive.jp/tutorial/nulllayout/index1.html

まずレイアウトマネージャーを無効にする方法を確認します。無効にするにはコンテナに対し、JPanelクラスやJFrameクラスの親クラスであるContainerクラスで用意されている「setLayout」メソッドを実行する時に引数に「null」を設定します。

JPanel p = new JPanel();
p.setLayout(null);

これでコンテナにデフォルトで設定されているレイアウトマネージャーが無効となりました。

レイアウトマネージャーが無効となると、
コンポーネントを配置しても位置やサイズに関する調整をまったく行わなくなりますので
コンテナの中のどの位置に配置するのかやサイズをどうするのかを別途メソッドを使って指定します。

例えばほとんどのコンポーネントの親クラスであるComponentクラスで用意されている
「setBounds」メソッドを使って位置及びサイズを指定してみます。

setBounds
public void setBounds(int x,
                      int y,
                      int width,
                      int height)

このコンポーネントを移動し、サイズ変更します。左上隅の新しい位置は x および y によって指定され、
新しいサイズは width および height によって指定されます。

パラメータ:
  x - このコンポーネントの新しい x 座標
  y - このコンポーネントの新しい y 座標
  width - このコンポーネントの新しい width
  height - このコンポーネントの新しい height

1番目と2番目の引数で座標を指定し、3番目と4番目の引数でサイズを指定します。

実際の使い方は次のようになります。

JPanel p = new JPanel();
p.setLayout(null);

JButton button = new JButton("button");
button.setBounds(10, 10, 100, 50);

p.add(button);

サンプルプログラム
では簡単なサンプルを作成して試してみます。

NullLayoutTest1.java

import javax.swing.*;
import java.awt.BorderLayout;

public class NullLayoutTest1 extends JFrame{

  public static void main(String[] args){
    NullLayoutTest1 frame = new NullLayoutTest1();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  NullLayoutTest1(){
    JPanel p = new JPanel();
    p.setLayout(null);

    JButton button1 = new JButton("Google");
    button1.setBounds(10, 10, 80, 30);

    JButton button2 = new JButton("Yahoo!");
    button2.setBounds(30, 30, 80, 30);

    JButton button3 = new JButton("MSN");
    button3.setBounds(50, 50, 80, 30);

    p.add(button1);
    p.add(button2);
    p.add(button3);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}
上記をコンパイルした後で実行すると次のように表示されます。

レイアウトマネージャーを無効にする

( Written by Tatsuo Ikura )

*/