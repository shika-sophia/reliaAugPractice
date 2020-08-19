/**
 * @title book1General / 上巻総合問題 / Kadai2
 * @contents Random
 * @author Oshika
 * @date 2020-08-19 / 10:30-11:00
 */
/*
 *【上巻確認問題2】
 * 以下の条件を満たすプログラムを完成させてください。
 *
 * 【条件】
 * ・プログラムに書かれている変数は必ず使用する
 * ・for文を二回使用する
 *
 *【出力結果】
 * 各学年の合計人数は、
 * 1年：78人
 * 2年：76人
 * 3年：93人
 * です。
 */
package book1General;

public class Kadai2 {
    public static void main(String[] args) {
        int sum = 0;

        int[][] intArray = {
            { 30, 24, 24 },	//1年：1組,2組,3組
            { 29, 21, 26 },	//2年：1組,2組,3組
            { 31, 31, 31 },	//3年：1組,2組,3組
        };

        String[] strArray = { "1年", "2年", "3年" };

        System.out.println("各学年の合計人数は、");

        // ▽解答欄 ここから(解答欄は1行という意味ではないことに注意)

        for(int i = 0; i < intArray.length; i++) {
            for(int j = 0; j < intArray[i].length; j++) {

                sum += intArray[i][j];

            }//for j

            System.out.printf("%s : %d人 \n", strArray[i], sum);
            sum = 0;
        }//for i

        // △解答欄 ここまで

        System.out.println("です。");
    }// main
}// class

/*
//====== Result ======
各学年の合計人数は、
1年 : 78人
2年 : 76人
3年 : 93人
です。
*/