/**
 * @title Book2General / view / BattleGameView
 * @class アプリのメイン画面
 * @class //Swingを利用したViewの表示テストのようなクラス
 * @class [BattleGame.main()]からシナリオ引数を受け取って表示するクラスに改変
 * @import java.awt, java.swing
 * @see reference.Swing資料
 * @see especially「SpringLayout」
 *      -> https://www.javadrive.jp/tutorial/springlayout/index3.html
 *
 * @author Oshika
 * @date 旧版 2020-09-19 ～ 2020-09-22
 * @date 2020-09-29
 */

package book2General.view;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import book2General.corpsRevision.Division;

public class BattleGameView extends JFrame {
    private int sceneNum;
    private String sceneStr;
    private List<String> sceneGeneral;
    private List<Division> sceneDivList;
    private int phaseNum;
    private String phaseStr;

    public BattleGameView(){

    }

    public BattleGameView(int sceneNum, String sceneStr, List<String> sceneGeneral){
        this.sceneNum = sceneNum;
        this.sceneStr = sceneStr;
        this.sceneGeneral = sceneGeneral;
    }

    public static void standFrame() {
        //新ウィンドウの作成
        BattleGameView window = new BattleGameView();
        window.setBounds(10, 10, 1200, 700);//(開始x,開始y,横幅width,縦高height)
        window.setTitle("BattleGameView");  //ウィンドウのタイトル
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }//standFrame()

    public void standPanel() {
        //ウインド枠の内側の表示範囲 panelを定義
        //SpringLayout 相対配置の全指定レイアウト -> 上記 URLを参照
        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();
        panel.setLayout(layout);
        panel.setPreferredSize(new Dimension(1000, 600));

        //==== textareaの生成 ====
        //---- textarea1 / NORTH枠: シーン・フェイズ表示 ----
        phaseNum = 1;//仮置き -> 本来は戦闘計算回数に応じて増加
        phaseStr = "浅井・朝倉勢の攻勢";//仮置き
        JTextArea textarea1 = new JTextArea(
                String.format("\nSCENE %d: %s\nFHASE %d :%s %3$d回目\n",
                sceneNum, sceneStr, phaseNum, phaseStr));
        textarea1.setFont(new Font("ＭＳ 明朝", Font.ITALIC, 22));

        layout.putConstraint(SpringLayout.NORTH, textarea1, 10, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, textarea1, 490, SpringLayout.WEST, panel);

        panel.add(textarea1);

        //---- textarea2～n ----
        //textDivList: Division情報の表示用
        //manipulusList: Munipulus情報の表示用
        List<JTextArea> textDivList = new ArrayList<>();
        List<JTextArea> manipulusList = new ArrayList<>();

        //登場武将ごとに JTextAreaを作成
        for(Division div : sceneDivList) {
            String text = textDivision(div);
            textDivList.add(new JTextArea(text));

            String manipulus = figueDivision(div);
        }//for



        //panelの実装
        Container contentPane = getContentPane();
        contentPane.add(panel);

    }//standPanel


    private String textDivision(Division div) {
        return String.format(
            "勢  力: %s\n侍大将: %s\n戦闘力: %4d\n兵  力: %4d\n士  気: %4d\n",
            div.getBelong(),
            div.getName(),
            div.getGeneral(),
            div.getPower(),
            div.getMoral()
        );
    }//textDivision()


    private String figueDivision(Division div) {
        Manipulus mp = new Manipulus();
        String manipulus = mp.buildNamedManipulus(div);
        return manipulus;
    }//figueDivision()


    //====== getter, setter ======
    public int getSceneNum() {
        return sceneNum;
    }

    public void setSceneNum(int sceneNum) {
        this.sceneNum = sceneNum;
    }

    public String getSceneStr() {
        return sceneStr;
    }

    public void setSceneStr(String sceneStr) {
        this.sceneStr = sceneStr;
    }

    public List<String> getSceneGeneral() {
        return sceneGeneral;
    }

    public void setSceneGeneral(List<String> sceneGeneral) {
        this.sceneGeneral = sceneGeneral;
    }

    public List<Division> getSceneDivList() {
        return sceneDivList;
    }

    public void setSceneDivList(List<Division> sceneDivList) {
        this.sceneDivList = sceneDivList;
    }


}//class

/*
//###### 旧版 main() version when [corps.Division] ######
package book2General.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import book2General.corps.AzaiCorps;
import book2General.corps.Division;
import book2General.corps.OdaCorps;

public class BattleGameView extends JFrame{

    public static void main(String[] args) {
        //---- instance of XxxxCorps and List<Division> ----
        AzaiCorps azai = new AzaiCorps();
        List<Division> azaiList = azai.corpsList();

        OdaCorps oda = new OdaCorps();
        List<Division> odaList = oda.corpsList();

        String azaiDiv = buildDivision(azaiList, 3);
        String azaiDiv2 = buildDivision(azaiList, 2);
        String odaDiv = buildDivision(odaList, 5);

        String centerFigue = buildCenterFigue(azaiList, odaList);

        BattleGameView frame = new BattleGameView(azaiDiv, azaiDiv2, odaDiv, centerFigue);
        frame.setVisible(true);
    }//main()


    BattleGameView(String azaiDiv, String azaiDiv2, String odaDiv, String centerFigue){
        //新ウィンドウの作成
        setBounds(10, 10, 1200, 700);//(開始x,開始y,横幅width,縦高height)
        setTitle("BattleGameView");  //ウィンドウのタイトル
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        //ウインド枠の内側の表示範囲 panelを定義
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(1000, 600));

        //レイアウト・タイプの定義とコンポーネント(部品)間の間隔
        BorderLayout layout = new BorderLayout();
        layout.setVgap(10);//垂直方向の間隔
        layout.setHgap(50);//水平方向の間隔
        panel.setLayout(layout);

        //textareaの内容を定義
        JTextArea textarea0 = new JTextArea(centerFigue);
            textarea0.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 16));

        JTextArea textarea1 = new JTextArea(
                "\nSCENE 1 : 開戦\n TURN 1 : 浅井・朝倉勢の渡河攻勢\nFHASE 1 :\n");
            textarea1.setFont(new Font("ＭＳ 明朝", Font.ITALIC, 22));

        String westJoint = azaiDiv +"\n"+ azaiDiv2;
        JTextArea textarea2 = new JTextArea(westJoint);
            textarea2.setFont(new Font("ＭＳ 明朝", Font.BOLD, 16));


        JTextArea textarea3 = new JTextArea(odaDiv);
            textarea3.setFont(new Font("ＭＳ 明朝", Font.BOLD, 16));

        //開始・一時停止ボタン
        JButton button1 = new JButton("開始");
        //JButton button2 = new JButton("一時停止");

        //textareaの配置と追加
        panel.add(textarea0, BorderLayout.CENTER);
        panel.add(textarea1, BorderLayout.NORTH);
        panel.add(textarea2, BorderLayout.WEST);
        panel.add(textarea3, BorderLayout.EAST);
        panel.add(button1, BorderLayout.SOUTH);

        //panelの実装
        Container contentPane = getContentPane();
        contentPane.add(panel);

    }

    //各Divisionリストから、Manipulusを生成し、ひとつのStringとして返す
    private static String buildCenterFigue(List<Division> azaiList, List<Division> odaList) {
        Manipulus mp = new Manipulus();
        String miyabe = mp.buildDivName(azaiList, 3);
        String atuji = mp.buildDivName(azaiList, 2);
        String sakuma =mp.buildDivName(odaList, 5);

        StringBuilder bld = new StringBuilder();
        bld.append(miyabe).append("\n");
        bld.append(String.format("%20s \n", "　")).append(sakuma);
        bld.append(atuji);

        return bld.toString();
    }//buildCenterFigue()


    //Divisionリストから、各Divisionの内容をStringで生成
    private static String buildDivision(List<Division> diviList, int index) {
        Division div = diviList.get(index);

        return String.format(
            "勢  力: %s\n侍大将: %s\n戦闘力: %4d\n兵  力: %4d\n士  気: %4d\n",
            div.getBelong(),
            div.getName(),
            div.getGeneral(),
            div.getPower(),
            div.getMoral()
        );
    }//buildDivision()

}//class
*/