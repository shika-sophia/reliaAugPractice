/**
 * @title chapter9 / List 9-7
 * @contents Array
 * @author Oshika
 * @date 2020-08-18 / 13:00-
 */

package chapter9;

public class ShowArgs {

  public static void main(String[] args) {
    System.out.println("args.length: " + args.length);

    for (int i = 0; i < args.length; i++) {
        System.out.printf("args[%d]: %s \n",i ,args[i] );
    }//for
  }//main()

}//class

/*
//====== Command Prompt ======
C:\Users\sophia\Desktop>javac ShowArgs.java -encoding UTF-8

C:\Users\sophia\Desktop>java ShowArgs This is a pen.

args.length: 4
args[0]: This
args[1]: is
args[2]: a
args[3]: pen.
 */
