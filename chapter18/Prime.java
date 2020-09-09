/**
 * @title chapter18 / Practice 18-3 / Prime
 * @content File
 * @author Oshika
 * @date 2020-09-09 / 0900-1030
 */
package chapter18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Prime {
    private static final int MAX_PRIME = 1000;

    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("使用法: java PrimeFile 作成ファイル名");
            System.out.println("例: java PrimeFile prime.txt");
            System.exit(0);
        }//if

        String fileName = args[0];
        try (PrintWriter writer = new PrintWriter(
                new BufferedWriter(new FileWriter(fileName)));){
            writePrime(writer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }//main()

    private static void writePrime(PrintWriter writer) {
        boolean[] prime = new boolean[MAX_PRIME];

        //---- initialize 'prime[]' to set all true ----
        for (int n = 0; n < prime.length; n++) {
            prime[n] = true;
        }//for

        //---- set prime ----
        prime[0] = false;
        prime[1] = false;

        for (int n = 2; n < prime.length; n++) {

            //---- except multiple / 倍数を除外 ----
            //素数は「約数が 1とその数自身の数」
            for (int i = 2; i < prime.length; i++) {
                if ((i * n) < prime.length) {
                    prime[i * n] = false;
                }

            }//for i

        }//for n

        //---- print 'prime[]' ----
        int count = 0;
        for (int n = 0; n < prime.length; n++) {
            if (prime[n]) {
                System.out.printf("%d ", n);
                writer.printf("%d ", n);
                count++;

                //10個ごとに改行
                if (count % 10 == 0) {
                    System.out.println();
                    writer.println();
                }//if count
            }//if prime[n]

        }//for n

    }//writePrime()

}//class

/*
C:\Users\sophia\Desktop>javac Prime.java

C:\Users\sophia\Desktop>java Prime prime.txt
2 3 5 7 11 13 17 19 23 29
31 37 41 43 47 53 59 61 67 71
73 79 83 89 97 101 103 107 109 113
127 131 137 139 149 151 157 163 167 173
179 181 191 193 197 199 211 223 227 229
233 239 241 251 257 263 269 271 277 281
283 293 307 311 313 317 331 337 347 349
353 359 367 373 379 383 389 397 401 409
419 421 431 433 439 443 449 457 461 463
467 479 487 491 499 503 509 521 523 541
547 557 563 569 571 577 587 593 599 601
607 613 617 619 631 641 643 647 653 659
661 673 677 683 691 701 709 719 727 733
739 743 751 757 761 769 773 787 797 809
811 821 823 827 829 839 853 857 859 863
877 881 883 887 907 911 919 929 937 941
947 953 967 971 977 983 991 997


【考察】あいや、解答のこれだけだと例外出ます。
・prime[i * n]は 999 * 999をするから確実に 1000を超えて
ArrayIndexOutOfBoundsExceptionを喰らいます。
防止策に if((i * n) < prime.length) が必要。

・倍数除外する際
for (int n = 0; n < prime.length; n++) でやると、n=1のときを含むため、
素数まで除外されてしまいます。

コンパイルは通るけど、何も表示されない現象に悩まされると気づきます
for (int n = 2; n < prime.length; n++) で、倍数除外をしないといけない。

なので、prime[n]を作るfor文と
writer.print()するfor文を分けて別々にやる必要がある。


〔解答確認〕条件あった
for (int i = 0; i * n < prime.length; i++) ←真ん中の終了条件式

これなら if((i * n) < prime.length)は不要。
でも、やっぱ n=2からfor文まわさないと、素数も除外して何も表示されない・・
*/