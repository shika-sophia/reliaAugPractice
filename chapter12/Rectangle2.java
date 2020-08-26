/**
 * @title chapter12 / List12-10 / Rectangle2
 * @content capsulize / カプセル化
 * @author Oshika
 * @date 2020-08-26 / 1030-1100
 */

package chapter12;

public class Rectangle2 {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

}//class Rectangle2


class NamedRectangle2 extends Rectangle2 {

    public void goodMethod () {
        setSize(456, 78);

        System.out.println(getWidth());
        System.out.println(getHeight());
    }

}//class NamedRectangle2
