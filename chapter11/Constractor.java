/**
 * @title chapter10 / List10-3 (List11-3, 11-4)
 * @title chapter11 / List11-1, 11-2
 * @contents class, constractor, this, オブジェクト指向
 * @author Oshika
 * @date 2020-08-21 / 14:00-14:10, 1600-1730
 */

package chapter11;

public class Constractor {
    private String name;
    private int point;

    public Constractor(String name, int point) {
        this.name = name;
        this.point = point;
    }//Constractor()

    @Override
    public String toString() {
        return String.format("%sは %d点です。", name, point);
    }//ioString() @Override

}//class

/*
class Rectangle {
    private int width;
    private int height;

    Rectanglt(){
        setSize(width, height);
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;

    }//setSize()

    int getArea() {
        return width * height;
    }//getArea()

}//class
*/