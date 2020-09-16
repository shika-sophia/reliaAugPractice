package book2General.test;

import java.util.List;

import book2General.corps.AzaiCorps;
import book2General.corps.Division;
import book2General.corps.OdaCorps;

public class Print2CorpsTest {

    public static void main(String[] args) {
         //---- instance of XxxxCorps and List<Division> ----
        OdaCorps oda = new OdaCorps();
        List<Division> odaList = oda.corpsList();

        AzaiCorps azai = new AzaiCorps();
        List<Division> azaiList = azai.corpsList();

        //---- print 2 Corps at both side ----
        for (int i = 0; i < odaList.size(); i++) {
            StringBuilder bld = new StringBuilder();

            if (i < azaiList.size()) {
                bld.append(String.format("勢  力: %5s        勢  力: %5s\n",
                    azaiList.get(i).getBelong(), odaList.get(i).getBelong()));

                bld.append(String.format("侍大将: %5s        侍大将: %5s\n",
                        azaiList.get(i).getName(), odaList.get(i).getName()));

                bld.append(String.format("戦闘力: %10d        戦闘力: %10d\n",
                        azaiList.get(i).getGeneral(), odaList.get(i).getGeneral()));

                bld.append(String.format("兵  力: %10d        兵  力: %10d\n",
                        azaiList.get(i).getPower(), odaList.get(i).getPower()));

                bld.append(String.format("士  気: %10d        士  気: %10d\n",
                        azaiList.get(i).getMoral(), odaList.get(i).getMoral()));

                System.out.println(bld.toString());

            } else {
                bld.append(String.format("                   勢  力: %5s\n",
                    odaList.get(i).getBelong()));

                bld.append(String.format("                   侍大将: %5s\n",
                    odaList.get(i).getName()));

                bld.append(String.format("                   戦闘力: %9d\n",
                    odaList.get(i).getGeneral()));

                bld.append(String.format("                   兵  力: %9d\n",
                    odaList.get(i).getPower()));

                bld.append(String.format("                   士  気: %9d\n",
                    odaList.get(i).getMoral()));

                System.out.println(bld.toString());

            }//if-else
        }//for

    }//main()

}//class

/*
勢  力: 浅井勢            勢  力: 織田勢
侍大将: ◎浅井長政        侍大将: ◎織田信長
戦闘力:         68        戦闘力:         96
兵  力:       4000        兵  力:       7000
士  気:       1000        士  気:       1000

勢  力: 浅井勢            勢  力: 織田勢
侍大将: 〇磯野員昌        侍大将: 〇柴田勝家
戦闘力:         75        戦闘力:         88
兵  力:       2000        兵  力:       4000
士  気:       1000        士  気:       1000

勢  力: 浅井勢            勢  力: 織田勢
侍大将:  阿閉貞秀        侍大将:  明智光秀
戦闘力:         54        戦闘力:         82
兵  力:       1000        兵  力:       2000
士  気:       1000        士  気:       1000

勢  力: 浅井勢            勢  力: 織田勢
侍大将:  宮部継潤        侍大将:  木下秀吉
戦闘力:         42        戦闘力:         65
兵  力:       1000        兵  力:       2000
士  気:       1000        士  気:       1000

                   勢  力: 織田勢
                   侍大将:  池田恒興
                   戦闘力:        37
                   兵  力:      2000
                   士  気:      1000

                   勢  力: 織田勢
                   侍大将: 佐久間信盛
                   戦闘力:        28
                   兵  力:      2000
                   士  気:      1000


【考察】
全角と半角の違いで ちょっとずつズレているけど、
そこは Viewで調整するとして、数値だけ変えて同じ場所に表示するのは
jspファイルを使わないと無理なような・・

 */
