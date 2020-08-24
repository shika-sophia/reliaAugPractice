/**
 * @title chapter11 / Practice11-6 ～11-8
 * @contents 'class' and 'instance'
 * @author Oshika
 * @date 2020-08-24 / 1300-1400
 */
package chapter11;
/*
//====== Practice 11-6 ======
引数をひとつに
インスタンス配列をフィールドに作って、このメソッドに渡せばいいのでは

class Rectangle {
    private int width;
    private int height;
    private final int SQUARE_NUM = 2

    Rectangle[] squae = new Rectangle[SQUARE_NUM];
    square[0] = new Rectangle(a, b);
    square[1] = new Rectangle(c, d);

    boolean areSame (Rectngle[] square){
        if(square[0].length <= 1 ){
            return false;
        } else if (square[0].width == square[1].width && ...

        }
    }

//====== 11-6 Answer (解答参照) ======
@Override boolean equals(Rectangle a){
    if (a == null) {
        return false;
    } else if (width == a.width && height == a.height) {
        reutrn true;
    } else {
        return false;
    }
 */
/*
//====== Practice 11-7 ======

public class RectanglePractice {
    private final int INITIAL_WIDTH = 123;
    private final int INITIAL_HEIGHT = 45;

    @Override
    public String toString() {
        return String.format("Rectangle(%d, %d)", INITIAL_WIDTH, INITIAL_HEIGHT);
    }

    public static void main(String[] args) {
        RectanglePractice square = new RectanglePractice();
        System.out.println(square.toString());

    }//main()

}//class
*/
//====== Result ======
//Rectangle(123, 45)

//んー、これしか思いつかんけど、なんか違う気もする
//(答え)合ってたわ。これでいいんかーい。

//====== Practice 11-8 ======
public class RectanglePractice {
    private int width;
    private int height;

    RectanglePractice(){
        setSize(10, 20);
    }

    RectanglePractice(int width, int height){
        if(width < 0) {
            width = 0;

        } else if (height < 0) {
            height = 0;
        }
        setSize(width, height);

    }//RectanglePractice()

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }//setSize()

    int getArea() {
        return width * height;
    }//getArea()


    public static void main(String[] args) {
        RectanglePractice r1 = new RectanglePractice();
        System.out.println("r1.width: " + r1.width);
        System.out.println("r1.height: " + r1.height);
        System.out.println("r1.getArea(): " + r1.getArea());

        RectanglePractice r2 = new RectanglePractice(-123, 45);
        System.out.println("r2.width: " + r2.width);
        System.out.println("r2.height: " + r2.height);
        System.out.println("r2.getArea(): " + r2.getArea());

    }//main()

}//class

/*
//====== Result ======
r1.width: 10
r1.height: 20
r1.getArea(): 200
r2.width: 0
r2.height: 45
r2.getArea(): 0
*/