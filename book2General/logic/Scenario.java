/**
 * @title logic / Scenario
 * @class シナリオ定義のためのクラス
 * @class シナリオ情報をフィールドに保持して、使う場所でインスタンスしフィールドをget
 *
 * @param static int sceneCount = 1; インスタンスされた個数をカウントし sceneNumに代入
 * @param int sceneNum: シーンの番号
 * @param String sceneStr: シーンに表示する文字列
 * @param List<String> sceneGeneral: シーンに登場する武将
 *          -> List<String> に入っているので、viewで取り出して各々 List<Division> にする
 *
 * @author Oshika
 * @date 2020-09-23, 2020-09-24
 */

package book2General.logic;

import java.util.ArrayList;
import java.util.List;

import book2General.corpsRevision.DataFileReader;
import book2General.corpsRevision.Division;

public class Scenario {
    private static int sceneCount = 1;
    private int sceneNum;
    private String sceneStr;
    private List<String> sceneGeneral;
    private List<Division> sceneDivList;

    public Scenario() {
        this.sceneNum = sceneCount;
        this.sceneStr = "";
        sceneCount++;
    }

//    public static void main(String[] args) {
//
//        //繰り返しインスタンス・表示テスト
//        for(int i = 1; i <= 7; i++) {
//            //コンストラクター呼び出し
//            Scenario scenario =new Scenario();
//            scenario.takeScene();
//
//            System.out.println("sceneNum: " + scenario.sceneNum);
//            System.out.println("sceneStr: " + scenario.sceneStr);
//            System.out.println("sceneGeneral: " + scenario.sceneGeneral);
//            System.out.println();
//        }//for scene
//
//    }//main()


    public void takeScene(DataFileReader data) {

        List<String> sceneGeneral = new ArrayList<>();

        switch(sceneNum) {
        case 1:
            sceneStr = "開戦 / 浅井・朝倉勢の渡河攻勢";
            sceneGeneral.add("宮部継潤");
            sceneGeneral.add("阿閉貞秀");
            sceneGeneral.add("佐久間信盛");
            sceneGeneral.add("朝倉景鏡");
            sceneGeneral.add("酒井忠次");
            break;

        case 2:
            sceneStr = "織田勢先鋒の崩壊";
            sceneGeneral.add("宮部継潤");
            sceneGeneral.add("阿閉貞秀");
            sceneGeneral.add("池田恒興");
            sceneGeneral.add("前波吉継");
            sceneGeneral.add("酒井忠次");
            sceneGeneral.add("本多忠勝");
            break;

        case 3:
            sceneStr = "";
            //sceneGeneral = "";
            break;

        case 4:
            sceneStr = "";
            //sceneGeneral = "";
            break;

        case 5:
            sceneStr = "榊原康政の騎兵迂回による側面突撃";
            sceneGeneral.add("浅井長政");
            sceneGeneral.add("柴田勝家");
            sceneGeneral.add("織田信長");
            sceneGeneral.add("朝倉景健");
            sceneGeneral.add("徳川家康");
            sceneGeneral.add("榊原康政");
            break;

        case 6:
            sceneStr = "朝倉勢の敗走";
            //sceneGeneral = "";
            break;

        default:
            sceneStr = "戦闘結果";
            //エンディング へ
            break;

        }//switch

        //setSceneNum(sceneNum);
        //setSceneStr(sceneStr);//直接フィールドに代入してるので不要
        setSceneGeneral(sceneGeneral);

        //登場武将のList<String> を検索して List<Division>にしてフィールドに保存
        this.sceneDivList = searchDivision(data, sceneGeneral);

    }//takeScene()


    //登場武将のList<String> を検索して List<Division>にしておく
    public List<Division> searchDivision(DataFileReader data, List<String> sceneGeneral) {
        //登場武将のList<Division> これから入れる器
        List<Division> sceneDivList = new ArrayList<>();

        //登場武将を１つずつ取り出して、全Divisionから検索
        List<Division> divisionList = data.getDivisionList();

        for (String generalBit : sceneGeneral) {
            for (Division div : divisionList) {
                //登場武将が Divisionの名前と一致したら、
                //sceneDivListに登録し検索終了して、次の検索へ
                if (generalBit.equals(div.getName())){
                    sceneDivList.add(div);
                    break;
                }//if
            }//div
        }//for generalBit

        return sceneDivList;
    }//searchDivision()


    //====== getter , setter ======
    public List<Division> getSceneDivList() {
        return sceneDivList;
    }

    public void setSceneDivList(List<Division> sceneDivList) {
        this.sceneDivList = sceneDivList;
    }

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

    public List<String> getSceneGeneral() {
        return sceneGeneral;
    }

    public void setSceneGeneral(List<String> sceneGeneral) {
        this.sceneGeneral = sceneGeneral;
    }

}//class

/*
sceneNum: 1
sceneStr: 開戦 / 浅井・朝倉勢の渡河攻勢
sceneGeneral: [宮部継潤, 阿閉貞秀, 佐久間信盛]

sceneNum: 2
sceneStr: 織田勢先鋒の崩壊
sceneGeneral: [宮部継潤, 阿閉貞秀, 池田恒興]

sceneNum: 3
sceneStr:
sceneGeneral: []

sceneNum: 4
sceneStr:
sceneGeneral: []

sceneNum: 5
sceneStr: 榊原康政の騎兵迂回による側面突撃
sceneGeneral: [浅井長政, 柴田勝家, 織田信長, 朝倉景健, 徳川家康, 榊原康政]

sceneNum: 6
sceneStr: 朝倉勢の敗走
sceneGeneral: []

sceneNum: 7
sceneStr: 戦闘結果
sceneGeneral: []
*/