/**
 * @title book1General / 上巻総合問題 / Kadai1
 * @contents Random
 * @author Oshika
 * @date 2020-08-19 / 10:30-
 */
/*
 *【上巻確認問題1】
 * 以下の条件を満たすプログラムを完成させてください。
 *
 *【条件】
 * ・乱数を取得し、1の場合は「いち」、2の場合は「に」、3の場合は「さん」
 *   と表示されるようにする
 * ・switch文を使用する
 *
 *【出力結果】
 * いち
 */
package book1General;

import java.util.Random;

public class Kadai1 {
  public static void main(String[] args) {

    // ▽解答欄 ここから(解答欄は1行という意味ではないことに注意)
    Random random = new Random();
    int num = random.nextInt(4);

    String str = "";
    switch (num) {
      case 1:
        str = "いち";
        break;

      case 2:
        str = "に";
        break;

      case 3:
        str = "さん";
        break;

      default:
        str = "その他";
        break;

    }//switch

    System.out.println("乱数: " + num);
    System.out.println(str);
    // △解答欄 ここまで

  }// main
}// class

/*
//====== Result ======

乱数: 3
さん

乱数: 1
いち

乱数: 2
に

※random.nextInt(4)は 0～3の乱数
※0も乱数生成されるので、その場合は「その他」
※0の可能性を排除するには int num = (random.nextInt(3) + 1);とする
*/

