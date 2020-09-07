/**
 * @title chapter17 / List 17-1 ～ 17-12
 * @content package
 * @author Oshika
 * @date 2020-09-07 / 1400-1500
 */
/*
//====== List 17-1 ======
//package mytool;

class TextParser{

}

//====== List 17-2 ======
//package mytool

public class TextParser{

}

//====== List 17-3 ======
//package mytool.security;

import mytool.TextParser;

public class PasswordChecker{

}

//====== List 17-4 ======
//package mytool;

public class PublicTool {
    public PublicTool(){

    }
}

class Tool {
    public Tool {

    }
}


//====== List 17-5 ======
//package yourtool;

import mytool.*;

public class YourTool {

    public static void main(String[] args){
        PublicTool a = new PublicTool();
        Tool b = new Tool(); //×非publicはアクセス不可
    }//main()

}

//====== List 17-6 ======
//package mytool;

public class PublicA {

}

class PackageB {

}

class PackageC {

}

//====== List 17-7 ======
public class MyPlayer{
    private int mediaId;

    public MyPlayer(){

    }

    public void player(){

    }

    public void stop(){

    }

    private void loadFile(String fileName){

    }

}//class
 *
//====== List 17-8 =======
//package java.lang;

public class Math{
    public static double PI = 3.141592653589793;

    private Math(){

    }

    public static double sin(double th){

    }

    public static int round(double th){

    }
}

//====== List 17-9 ======
public class MyClass {
    private MyClass(){

    }

    public MyClass(String s){

    }

    public MyClass(String s, boolean append){

    }
}//class


//====== List 17-10 ======
import static java.lang.System.out;

public class Hello{
    public static void main(String[] args){
        out.println("Hello!");
    }
}


//====== List 17-11 ======
import static java.lang.System.out;
import static java.lang.Math.max;

public class Max{
    public static void main(String[] args){
        int x = 45;
        int y = 100;
        int z = max(x, y);

        out.println ("z = " + z);
    }
}
 */
//====== List 17-12 ======

package chapter17;

import static java.lang.Math.*;
import static java.lang.System.*;

public class MyTool {
    public static void main(String[] args) {
        int x = 45;
        int y = 100;
        int z = max(x, y);

        out.println("z = " + z);
        out.println("π = " + PI); //←Math.PIじゃなくていいんだ
    }//main()
}//class

/*
z = 100
π = 3.141592653589793
 */
