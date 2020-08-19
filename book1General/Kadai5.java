/**
 * @title book1General / 上巻総合問題 / Kadai5
 * @contents Random
 * @author Oshika
 * @date 2020-08-19 / 13:30
 */
/*
 *【上巻確認問題5】
 * 以下の条件を満たすプログラムを完成させてください。
 *
 * 以下のプログラムはアパートの各部屋の住人の数を出力するものです。
 * 配列apartmentHouseは、apartmentHouse[階][部屋番号]で
 * あるアパートの各部屋の住人の数を表しています。
 * このアパートの各部屋の住人の数を出力例のような形式
 * （0人のときは「空室」と表示することに注意）で
 * 表示するようにプログラムを完成させてください。
 * ※101号室ではなく、11号室のようにならないよう注意して下さい。
 *
 *【実行結果】
 * 101号室: 1人
 * 102号室: 1人
 * 103号室: 1人
 * （中略）
 * 312号室: 空室
 * 313号室: 2人
 * 314号室: 3人
*/
package book1General;

public class Kadai5 {
    public static void main(String[] args) {
        // あるアパートの各階の各部屋の住人の数
        int[][] apartmentHouse = new int[][] {
            { 1, 1, 1, 2, 1, 1, 2, 2, 0, 0, 3, 2, 2, 1 },
            { 2, 2, 2, 1, 1, 1, 0, 0, 0, 1, 3, 0, 3, 2 },
            { 1, 1, 1, 1, 2, 2, 2, 2, 3, 2, 1, 0, 2, 3 },
        };

        // ▽解答欄 ここから
        StringBuilder builder = new StringBuilder();

        //---- get 'person' from 'apartmentHouse[][]' ----
        for (int i = 0; i < apartmentHouse.length; i++) {

            for (int j = 0; j < apartmentHouse[i].length; j++) {

                int person = apartmentHouse[i][j];

                //---- make 'personStr' ----
                String personStr = "";
                if (person == 0) {
                    personStr = "空室";
                } else {
                    personStr = person + "人";
                }

                //---- make 'room' ----
                String room = "";
                if (j + 1 < 10) {
                    room = "0" + (j + 1);
                } else {
                    room = String.valueOf(j + 1);
                }

                //---- StringBuilder ----
                builder.append(i + 1).append(room).append("号室: ");
                builder.append(personStr).append("\n");
           }//for j

        }//for i

        String apartVeiw = builder.toString();
        System.out.println(apartVeiw);

        // △解答欄 ここまで

    }// main
}// class

/*
//====== Result ======
101号室: 1人
102号室: 1人
103号室: 1人
104号室: 2人
105号室: 1人
106号室: 1人
107号室: 2人
108号室: 2人
109号室: 空室
110号室: 空室
111号室: 3人
112号室: 2人
113号室: 2人
114号室: 1人
201号室: 2人
202号室: 2人
203号室: 2人
204号室: 1人
205号室: 1人
206号室: 1人
207号室: 空室
208号室: 空室
209号室: 空室
210号室: 1人
211号室: 3人
212号室: 空室
213号室: 3人
214号室: 2人
301号室: 1人
302号室: 1人
303号室: 1人
304号室: 1人
305号室: 2人
306号室: 2人
307号室: 2人
308号室: 2人
309号室: 3人
310号室: 2人
311号室: 1人
312号室: 空室
313号室: 2人
314号室: 3人

//できた！
最初 000号室とか100号室は、きっと誰でもやる間違い。
あわてて、i + 1, j + 1をしましたとさ
 * */
