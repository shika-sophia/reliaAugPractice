/**
 * @title book2General / view / Manipulus
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
 */

package book2General.view;

import java.util.List;

import book2General.corps.AzaiCorps;
import book2General.corps.Division;
import book2General.corps.OdaCorps;

public class Manipulus {

//    //テスト用 main()
    public static void main(String[] args) {
//        //==== Test only buildManipulus() ====
//        int power = 7000; // 兵力 Divisionクラスのフィールド
//        boolean west = false;
//
//        //==== Test buildDivName(), judgeWest(), buildManipulus() ====
//        //---- instance of XxxxCorps and List<Division> ----
        AzaiCorps azai = new AzaiCorps();
        List<Division> azaiList = azai.corpsList();

        OdaCorps oda = new OdaCorps();
        List<Division> odaList = oda.corpsList();

        Manipulus mp = new Manipulus();
        String miyabe = mp.buildDivName(azaiList, 3);
        String nobunaga = mp.buildDivName(odaList, 0);

        System.out.println(miyabe);
        System.out.println(nobunaga);

    }//main()

    //Divisionリストとindexから、名前,兵力,士気の付いたManipulusを生成
    public String buildDivName(List<Division> divList, int index) {
        Division div = divList.get(index);

        boolean west = judgeWest(div); //call method

        //---- build Manipulus with name, power, moral ----
        StringBuilder bld = new StringBuilder();
        bld.append(String.format("%5s \n",div.getName()));
        bld.append(String.format("%10d \n", div.getPower()));
        bld.append(String.format("%10d \n",div.getMoral()));
        bld.append(buildManipulus(div.getPower(), west)).append("\n"); //call method

        return bld.toString();
    }//buildDivName()


    //Division情報から、西軍か東軍かの判定
    private boolean judgeWest(Division div) {
        boolean west = false;

        switch(div.getBelong()) {
        case "浅井勢":
        case "朝倉勢":
            west = true;
            break;

        case "織田勢":
        case "徳川勢":
            west = false;
            break;

        default:
            throw new IllegalArgumentException();
        }

        return west;
    }//judgeWest()


    //Division.getPower()＝兵力から、Manipulusを生成
    private String buildManipulus(int power, boolean west) {
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
    }//buildManipulus()

}//class

/*
//====== Test Result by buildDivName(), judgeWest(), buildManipulus() ======
 宮部継潤
      1000
      1000
■
■◆
■


◎織田信長
      7000
      1000
  □□□□
◇□□□□
  □□□□
  □□□□


//====== Test Result by only buildManipulus() ======
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
