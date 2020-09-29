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

import book2General.corpsRevision.DataFileReader;
import book2General.corpsRevision.Division;
import book2General.logic.Scenario;
import book2General.view.BattleGameView;

public class BattleGame {

    public static void main(String[] args) {
        //Databaseファイルの読み込み、Corps,Divisionの各インスタンス生成
        DataFileReader data = new DataFileReader();
        data.dataFileReader();

        //[view.BattleGameView]インスタンス生成、新ウィンドウの作成
        BattleGameView view = new BattleGameView();
        view.standFrame();

        //while() { //←シナリオ終了条件(あとで記述)
            //シナリオロード、登場武将決定
            //【註】Scenario()のインスタンスはカウントされているので、ここだけで行う。
            Scenario scenario = new Scenario();
            scenario.takeScene(data);

            //Scenarioクラスのフィールド読み込み
            int sceneNum = scenario.getSceneNum();
            String sceneStr = scenario.getSceneStr();
            List<Division> sceneDivList = scenario.getSceneDivList();

            //[view.BattleGameView]フィールドに代入
            view.setSceneNum(sceneNum);
            view.setSceneStr(sceneStr);
            view.setSceneDivList(sceneDivList);

            //パネルの生成
            view.standPanel();

        //}//while
    }//main()

}//class

/*
//---- Test print ----
System.out.println("sceneNum: " + sceneNum);
System.out.println("sceneStr: " + sceneStr);
System.out.println("sceneGeneral: " + sceneGeneral);

//---- Result Test ----
sceneNum: 1
sceneStr: 開戦 / 浅井・朝倉勢の渡河攻勢
sceneGeneral: [宮部継潤, 阿閉貞秀, 佐久間信盛]
 */

/*
//###### 旧版 main() when [corpsパッケージ] ######
import java.util.List;

import book2General.corps.AsakuraCorps;
import book2General.corps.AzaiCorps;
import book2General.corps.Division;
import book2General.corps.OdaCorps;
import book2General.corps.TokugawaCorps;

public class BattleGame {
    private List<Division> azaiList;
    private List<Division> asakuraList;
    private List<Division> odaList;
    private List<Division> tokugawaList;

    public static void main(String[] args) {
        //---- instance of XxxxCorps and List<Division> ----
        //各軍団のインスタンスと軍団リストの生成
        AzaiCorps azai = new AzaiCorps();
        List<Division> azaiList = azai.corpsList();

        AsakuraCorps asakura = new AsakuraCorps();
        List<Division> asakuraList = asakura.corpsList();

        OdaCorps oda = new OdaCorps();
        List<Division> odaList = oda.corpsList();

        TokugawaCorps tokugawa = new TokugawaCorps();
        List<Division> tokugawaList = tokugawa.corpsList();

        //コンストラクター経由で、このクラスのフィールドに各軍団リストを保持
        BattleGame bg = new BattleGame(
            azaiList,
            asakuraList,
            odaList,
            tokugawaList
        );


    }//main()

    public BattleGame() {

    }

    public BattleGame(
        List<Division> azaiList,
        List<Division> asakuraList,
        List<Division> odaList,
        List<Division> tokugawaList
    ) {
        this.azaiList = azaiList;
        this.asakuraList = asakuraList;
        this.odaList = odaList;
        this.tokugawaList = tokugawaList;
    }


    //====== getter, setter ======
    public List<Division> getAzaiList() {
        return azaiList;
    }


    public void setAzaiList(List<Division> azaiList) {
        this.azaiList = azaiList;
    }


    public List<Division> getAsakuraList() {
        return asakuraList;
    }


    public void setAsakuraList(List<Division> asakuraList) {
        this.asakuraList = asakuraList;
    }


    public List<Division> getOdaList() {
        return odaList;
    }


    public void setOdaList(List<Division> odaList) {
        this.odaList = odaList;
    }


    public List<Division> getTokugawaList() {
        return tokugawaList;
    }


    public void setTokugawaList(List<Division> tokugawaList) {
        this.tokugawaList = tokugawaList;
    }

 */
