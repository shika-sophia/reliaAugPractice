/**
 * @ view / Manipulus
 * @content division.powerの規模に応じて■■■マークの数を変えるクラス
 *      => divisionの規模を視覚的に表し、部隊らしさを出す。
 *      =>画像を使う方法もあるが、レトロな昭和ゲーム風にこれで行こう。
 *
 * @appendix (おまけ)コラム
 *   manipulus [羅]: 百人隊の集合、正方形の陣形のこと
 *
 *   centuria [羅]: 古代ローマ軍制の百人隊の意。「ケントォリア」と読む。
 *      兜に赤いトサカのある軍装は「百人隊長(ケントォリオ)」のみ許され、
 *      命を預ける百人隊の仲間からの互選で選ばれるため、とても栄誉ある役職とされた。
 *
 *      西洋の軍制はナポレオンの砲兵が登場するまで、ローマの軍制を踏襲した。
 *      中世ヨーロッパを描いた映画で、この正方形ごと移動するManipulus陣形を見ることができる。
 *      戦闘中も きれいな正方形を維持して進退し、攻勢や退却も この百人隊ごとに行った。
 *      century[英] 100年(１世紀), cent[英](セント 100分の１)の語源でもある。
 *
 *      (てか、クラス名や変数名をラテン語にするんじゃないっ。)
 */

package book2General.view;

public class Manipulus {

    //テスト用 main()
    //public static void main(String[] args) {
        //int power = 7000; // 兵力 Divisionクラスのフィールド
        //boolean west = false;

    public String buildManipulus(int power, boolean west) {
        int centuria = 0; // ■■■マークの数
        int width = 0;    //陣形の横幅
        int height = 0;   //陣形の縦幅

        //---- judge west ----
        //西軍(true)か 東軍(false)か
        String top = "";   //西軍"◆",東軍"◇"
        String squre = ""; //西軍"■",東軍"□"

        if (west) {
            top = "◆";
            squre = "■";
        } else {
            top = "◇";
            squre = "□";
        }

        //---- decide number of '■' ----
        //兵力の規模に応じて■の数を決定
        if (0 < power && power < 600) {
            centuria = 2;
            height = 2;
        } else if (600 <= power && power < 1600) {
            centuria = 3;
            height = 3;
        } else if (1600 <= power && power < 2600) {
            centuria = 6;
            height = 3;
        } else if (2600 <= power && power < 3600) {
            centuria = 9;
            height = 3;
        } else if (4600 <= power && power < 6600) {
            centuria = 12;
            height = 4;
        } else if (6600 <= power) {
            centuria = 16;
            height = 4;
        }

        //■の数で陣形を組み立て
        StringBuilder bld = new StringBuilder();
        width = centuria / height; //widthを算出

        for (int i = 1; i <= height; i++) {
            //東軍のtop
            if (west == false) {
                if (i == 2) {
                    bld.append(top);
                } else {
                    bld.append("  ");
                }
            }

            //■を並べる
            for (int j = 1; j <= width; j++) {
                bld.append(squre);
            }//for width

            //西軍のtop
            if (i == 2 && west == true) {
                    bld.append(top);
            }

            bld.append("\n");
        }//for height

        String manipulus = bld.toString();

        //---- for test by main() ----
        //System.out.println("power = " + power);
        //System.out.println("centuria = " + centuria);
        //System.out.println(manipulus);

        return manipulus;
    }//buildManipulus() or main()

}//class

/*
//====== Test Result by main() ======
power = 1000
centuria = 3
■
■◆
■

power = 2000
centuria = 6
■■
■■◆
■■

power = 5000
centuria = 12
■■■
■■■◆
■■■
■■■

power = 200
centuria = 2
  □
◇□

power = 7000
centuria = 16
  □□□□
◇□□□□
  □□□□
  □□□□
 */
