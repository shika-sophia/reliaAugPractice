/**
 * @title chapter12 / List12-1 ～ 12-9 / Rectangle
 * @content NamedRectangle extends Rectangle / 継承
 * @author Oshika
 * @date 2020-08-26 / 0930-1030
 */

package chapter12;

public class Rectangle {
    int width;
    int height;
    //private int width;
    //private int height;

    public Rectangle() {
        width = 0;
        height = 0;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setSize(int width, int height) {

    }

    //private internalMethod (int width, int height){}
}//class Rectangle


class NamedRectangle extends Rectangle {
    String name;

    public NamedRectangle (){
        //super();
        this("NO NAME");

        //name = "NO NAME";
    }

    public NamedRectangle (String name) {
        super(200, 32);
        this.name = name;
    }

    @Override
    public void setSize(int width, int height) {

    }

    /* List 12-9
    //private 付いたフィールドやメソッドは継承されない。
    //privateは そのクラス内だけ参照可。他クラスから呼び出すとコンパイルエラー。
    void badMethod (){
        width = 123;
        height = 45;

        internalMethod(10, 20)
    }
    */
}//class NamedRectangle
