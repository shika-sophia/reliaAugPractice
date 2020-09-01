/**
 * @title chapter14 / List 14-1 ～ 14-10 / DebugPrintable
 * @content Interface
 *
 * @interface DebugPrintable
 * @interface MyReadable extends Readable
 * @interface MyWritable
 * @class MyNumber implements DebugPrintable
 * @class MyFileReader extends FileReader implements DebugPrintable
 * @class MyReadWrite extends MyNumber implements MyReadable, MyWritable
 *
 * @author Oshika
 * @date 2020-09-01 / 1100-1200
 */

package chapter14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;

public interface DebugPrintable {
    //public static final int NO_ERROR = 0;
    //public static final int FILE_ERROR = 1;
    //public static final int MEMORY_ERROR = 2;
    public enum ErrorType{
        NO_ERROR,
        FILE_ERROR,
        MEMORY_ERROR,
    };

    public static final String PREFIX = "ERROR: ";

    public abstract void debugPrint();

}//interface DebugPrintable

interface MyReadable extends Readable{
    public abstract void read(byte[] data);
}

interface MyWritable {
    public abstract void write(byte[] data);
}

class MyNumber implements DebugPrintable{
    int myNum;

    public MyNumber(int myNum) {
        this.myNum = myNum;
    }

    @Override
    public void debugPrint() {
        System.out.println("MyNumberのフィールド(インスタンス): myNum = " + myNum);
    }

}//class MyNumber


class MyFileReader extends FileReader implements DebugPrintable{
    String fileName = null;

    public MyFileReader(String fileName) throws FileNotFoundException{
        super(fileName);
        this.fileName = fileName;
    }

    @Override
    public void debugPrint() {
        System.out.println("MyFileReaderのフィールド(インスタンス): fileName = " + fileName);
    }

}//class MyFileReader


class MyReadWrite extends MyNumber implements MyReadable, MyWritable{

    public MyReadWrite(int myNum) {
        super(myNum);

    }

    @Override
    public void write(byte[] data) {


    }

    @Override
    public void read(byte[] data) {


    }

    @Override //Readable由来のメソッド
    public int read(CharBuffer cb) throws IOException {

        return 0;
    }

}//class MyReadWrite

