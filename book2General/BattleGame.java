/**
 * @title book2General / Free Product / BattleGame
 * @title 浅井長政の野望 ～姉川の戦い～
 * @content super, extends, interface, implements, Collection, Multi-Thread etc
 * @author Oshika
 * @date since: 2020-09-14-1400 / last update: 2020-09-29
 *
 * (要件定義, クラス設計などは「package book2General.ReadMe.txt」を参照してください)
 */

package book2General;

import java.util.List;

import book2General.corps.AzaiCorps;
import book2General.corps.Division;
import book2General.corps.OdaCorps;

public class BattleGame {

    public static void main(String[] args) {
        //---- instance of XxxxCorps and List<Division> ----
        OdaCorps oda = new OdaCorps();
        List<Division> odaList = oda.corpsList();

        AzaiCorps azai = new AzaiCorps();
        List<Division> azaiList = azai.corpsList();

    }//main()

}//class