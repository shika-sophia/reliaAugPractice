/**
 * @title Book2General / view / BattleGameView
 * @class アプリのメイン画面
 * @see reference.Swing資料
 *
 * @author Oshika
 * @date 2020-09-19
 * @date 2020-09-20
 */

package book2General.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.List;

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
        String odaDiv = buildDivision(odaList, 5);

        BattleGameView frame = new BattleGameView(azaiDiv, odaDiv);
        frame.setVisible(true);
    }//main()


    BattleGameView(String azaiDivision, String odaDivision){
        //新ウィンドウの作成
        setBounds(10, 10, 1200, 700);//(開始x,開始y,横幅width,縦高height)
        setTitle("BattleGameView");  //ウィンドウのタイトル
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        //divisionの表示
        JTextArea textarea1 = new JTextArea(azaiDivision, 7, 16);
        JTextArea textarea2 = new JTextArea(odaDivision, 7, 16);

        JPanel p = new JPanel();
        p.add(textarea1);
        p.add(textarea2);

        Container contentPane = getContentPane();
        contentPane.add(p, BorderLayout.CENTER);
    }


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
