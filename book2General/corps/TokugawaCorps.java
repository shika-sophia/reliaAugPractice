/*
【徳川軍団の特徴】
兵質・将質ともに高く、とてもバランスの取れた軍団だが
兵力は国許の三河の守りに置いてきたために少なく、
約２倍にもなる正面の朝倉勢を支え切れるかが勝敗の鍵を握る。
本多忠勝は三河に居てこの戦場には居なかったと思われるが
三河兵の強さを再現するために友情出演。
 */

package book2General.corps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TokugawaCorps extends AbstractCorps {
    private final String belong = "徳川勢";  //所属軍団
    private final int soldierQuality = 90; //兵質 0～100
    private int powerTotal;     //総兵力
    private int victory;        //勝勢 -100 ～ +100
    private int divisionNum;    //Division数

    public TokugawaCorps() {
        this.powerTotal = 6000;
        this.victory = 0;
        this.divisionNum = 4;
    }

    @Override
    public List<Division> corpsList() {
        //---- new corpsList ----
        //各Divisionをまとめて保持するための軍団リスト
        List<Division> tokugawaCorpsList = new ArrayList<>();

        //---- call generalList in under method ----
        //下記メソッドを呼んで、各将のデータを読み込み
        List<List<String>> generalList = generalList();

        //---- instance of Division and set it to 'corpsList' ----
        //Divisionクラスのインスタンスを各将ごとに行い、軍団Listに格納
        for (List<String> list : generalList) {
            tokugawaCorpsList.add(
                new Division(
                    list.get(0),
                    list.get(1),
                    Integer.parseInt(list.get(2)),
                    Integer.parseInt(list.get(3))
                )
            );
        }//for

        return tokugawaCorpsList;

    }//corpsList()


    @Override
    public List<List<String>> generalList() {
        //データ(belong, name, general, power)
        List<String> ieyasuList = new ArrayList<>(
            Arrays.asList(belong, "◎徳川家康","76","2000"));

        List<String> hondaList = new ArrayList<>(
            Arrays.asList(belong, "〇本多忠勝","99","2000"));

        List<String> sakakibaraList = new ArrayList<>(
            Arrays.asList(belong, "榊原康政","91","1000"));

        List<String> sakaiList = new ArrayList<>(
            Arrays.asList(belong, "酒井忠次","67","1000"));


        //---- generalList / 上記Listをまとめて１つのListにして return ----
        List<List<String>> generalList = new ArrayList<>(
            Arrays.asList(
                ieyasuList,
                hondaList,
                sakakibaraList,
                sakaiList
            )
        );

        return generalList;
    }//generalList()


    //====== getter, setter =======
    public int getPowerTotal() {
        return powerTotal;
    }

    public void setPowerTotal(int powerTotal) {
        this.powerTotal = powerTotal;
    }

    public int getVictory() {
        return victory;
    }

    public void setVictory(int victory) {
        this.victory = victory;
    }

    public int getDivisionNum() {
        return divisionNum;
    }

    public void setDivisionNum(int divisionNum) {
        this.divisionNum = divisionNum;
    }

    //---- getter only of final ----
    public String getBelong() {
        return belong;
    }

    public int getSoldierQuality() {
        return soldierQuality;
    }

}//class
