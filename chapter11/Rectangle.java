/**
 * @title chapter11 / List11-7, 11-8, 11-9, 11-10, 11-17
 * @contents 'class' and 'instance'
 * @author Oshika
 * @date 2020-08-24 / 0930-1030
 */

//【註】11章のリストは まとめて実行できるのがこれしかない。
//同クラス名で部分的に改変したものが、たくさんあってまとめられない。
//記述しなくても理解できそうなものは、文脈の理解に勉め、
//Listの書き出しはしませんでした。

package chapter11;

public class Rectangle {
    private static int count = 0;
    private int width;
    private int height;
    private int number;

    Rectangle(){
        setSize(10, 20);
        number = count;
        count++;
    }

    Rectangle(int width, int height){
        setSize(width, height);
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }//setSize()

    int getArea() {
        return width * height;
    }//getArea()


    @Override
    public String toString() {
        return "[width: " + width + ",height: " + height + "]";
    }//toString()

    static int getCounter() {
        return count;
    }//getCounter()


    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("r1.width: " + r1.width);
        System.out.println("r1.height: " + r1.height);
        System.out.println("r1.getArea(): " + r1.getArea());

        Rectangle r2 = new Rectangle(123, 45);
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
r2.width: 123
r2.height: 45
r2.getArea(): 5535

*/