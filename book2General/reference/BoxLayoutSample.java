/*
◇Let's プログラミング
＊コンポーネントを配置する方向を指定する
https://www.javadrive.jp/tutorial/boxlayout/index2.html
 */

package book2General.reference;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxLayoutSample extends JFrame {

    public static void main(String[] args) {
        BoxLayoutSample frame = new BoxLayoutSample();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10, 10, 300, 200);
        frame.setTitle("タイトル");
        frame.setVisible(true);
    }//main()

    BoxLayoutSample(){
        JButton button1 = new JButton("Google");
        JButton button2 = new JButton("Yahoo!");
        button2.setFont(new Font("Arial", Font.PLAIN, 30));
        JButton button3 = new JButton("MSN");

        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.LINE_AXIS));

        p.add(button1);
        p.add(button2);
        p.add(button3);

        getContentPane().add(p, BorderLayout.CENTER);
    }//BoxLayoutSample()

}//class

/*
■記事 全文
◇Let's プログラミング
＊コンポーネントを配置する方向を指定する
https://www.javadrive.jp/tutorial/boxlayout/index2.html

BoxLayoutは縦方向又は横方向にコンポーネントを並べて配置していくレイアウトマネージャーです。ここではコンポーネントを配置していく方向の設定方法について確認します。

コンストラクタをもう一度見てみます。

BoxLayout
public BoxLayout(Container target, int axis)

コンポーネントを指定された方向に配置するレイアウトマネージャーを生成し
ます。

パラメータ:
  target - 配置する必要があるコンテナ
  axis - 配置する必要があるコンテナコンポーネントの配置方向。
    BoxLayout.X_AXIS、 BoxLayout.Y_AXIS。 BoxLayout.LINE_AXIS または
    BoxLayout.PAGE_AXIS
例外:
  AWTError - axis の値が無効な場合

2番目の引数にコンポーネントを配置する方向を表す数値を指定します。
指定できる値は次の通りです。

値	配置する方向
BoxLayout.X_AXIS	左から右にコンポーネントを配置します
BoxLayout.Y_AXIS	上から下にコンポーネントを配置します
BoxLayout.LINE_AXIS	テキスト行の方向にコンポーネントを配置します
BoxLayout.PAGE_AXIS	複数のページにまたがって行が進んでいく方向にコンポーネントを配置します
BoxLayout.LINE_AXIS及びBoxLayout.PAGE_AXISについてはコンテナの ComponentOrientation プロパティーに基づいて方向が決まりますが、
    日本語環境で利用している場合は
    BoxLayout.LINE_AXISの場合が「左から右」で
    BoxLayout.PAGE_AXISの場合が「上から下」に配置します。

実際の使い方は次のようになります。

JPanel p = new JPanel();
p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));
サンプルプログラム
では簡単なサンプルを作成して試してみます。前頁では縦方向にコンポーネントを配置しましたので今度は横方向へ配置してみます。

BoxLayoutTest2.java

import javax.swing.*;
import java.awt.Font;
import java.awt.BorderLayout;

public class BoxLayoutTest2 extends JFrame{

  public static void main(String[] args){
    BoxLayoutTest2 frame = new BoxLayoutTest2();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  BoxLayoutTest2(){
    JButton button1 = new JButton("Google");
    JButton button2 = new JButton("Yahoo!");
    button2.setFont(new Font("Arial", Font.PLAIN, 30));
    JButton button3 = new JButton("MSN");

    JPanel p = new JPanel();
    p.setLayout(new BoxLayout(p, BoxLayout.LINE_AXIS));

    p.add(button1);
    p.add(button2);
    p.add(button3);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}
上記をコンパイルした後で実行すると次のように表示されます。

BoxLayoutでコンポーネントを配置する方向を設定する

( Written by Tatsuo Ikura )
*/