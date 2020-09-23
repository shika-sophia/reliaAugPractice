package book2General.logic;

import java.util.ArrayList;
import java.util.List;

import book2General.corps.AsakuraCorps;
import book2General.corps.AzaiCorps;
import book2General.corps.Division;
import book2General.corps.OdaCorps;
import book2General.corps.TokugawaCorps;

public class Scenario {
    private String sceneStr;
    private int sceneNum;

    public static void main(String[] args) {
        //---- instance of XxxxCorps and List<Division> ----
        AzaiCorps azai = new AzaiCorps();
        List<Division> azaiList = azai.corpsList();

        AsakuraCorps asakura = new AsakuraCorps();
        List<Division> asakuraList = asakura.corpsList();

        OdaCorps oda = new OdaCorps();
        List<Division> odaList = oda.corpsList();

        TokugawaCorps tokugawa = new TokugawaCorps();
        List<Division> tokugawaList = tokugawa.corpsList();

        Scenario scenario =new Scenario();

    }//main()

    public Scenario() {
        sceneStr = "";
        sceneNum = 1;
    }

    public List<String> takeScene(int sceneNum) {
        List<String> sceneList = new ArrayList<>();
        String selectGeneral = "";

        switch(sceneNum) {
        case 1:
            sceneStr = "開戦 / 浅井・朝倉勢の渡河攻勢";
            selectGeneral = "宮部継潤,阿閉貞秀,佐久間信盛";
            break;

        case 2:
            sceneStr = "織田勢先鋒の崩壊";
            selectGeneral = "宮部継潤,阿閉貞秀,池田恒興";
            break;

        case 3:
            sceneStr = "";
            selectGeneral = "";
            break;

        case 4:
            sceneStr = "";
            selectGeneral = "";
            break;

        case 5:
            sceneStr = "榊原康政の騎兵迂回による側面突撃";
            selectGeneral = "";
            break;

        case 6:
            sceneStr = "朝倉勢の敗走";
            selectGeneral = "";
            break;

        }

        setSceneStr(sceneStr);
        setSceneNum(sceneNum);

        return sceneList;
    }//takeScene()


    public String getSceneStr() {
        return sceneStr;
    }

    public void setSceneStr(String sceneStr) {
        this.sceneStr = sceneStr;
    }

    public int getSceneNum() {
        return sceneNum;
    }

    public void setSceneNum(int sceneNum) {
        this.sceneNum = sceneNum;
    }


}//class
