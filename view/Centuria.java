/**
 * @ view / Centuria                       ◆
 * @content division.powerの規模に応じて■■■マークの数を変えるクラス
 *      => divisionの規模を視覚的に表し、部隊らしさを出す。
 *      =>画像を使う方法もあるが、レトロな昭和ゲーム風にこれで行こう。
 *
 * @appendix centuria [羅]: 古代ローマ軍制の百人隊の意。ケントォリア。
 *      兜に赤いトサカのある軍装は「百人隊長(ケントォリオ)」のみ許され、
 *      命を預ける百人隊の仲間からの互選で選ばれるため、とても栄誉ある役職とされた。
 *
 *      西洋の軍制はナポレオンの砲兵が登場するまで、
 *      この百人隊のまま きれいな正方形を維持して進退し、
 *      攻勢や退却もこの百人隊ごとに行った。
 *      century[英] 100年(１世紀), cent[英](セント 100分の１)の語源でもある。
 */

package book2General.view;

public class Centuria {

    public static void main(String[] args) {
        int power = 1000; // 兵力 Divisionクラスのフィールド
        int centuria = 0; // ■■■マークの数


        if (0 < power && power < 600) {
            centuria = 2;
        } else if (600 <= power && power < 1600) {
            centuria = 3;
        } else if (1600 <= power && power < 2600) {
            centuria = 6;
        } else if (2600 <= power && power < 3600) {
            centuria = 9;
        } else if (4600 <= power && power < 9600) {
            centuria = 12;
        }


    }//main()

}//class
