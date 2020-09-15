package book2General.corps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AzaiCorps extends AbstractCorps {
    private final String belong = "Azai";  //所属軍団
    private final int soldierQuality = 60; //兵質
    private int powerTotal;     //総兵力
    private int victory;        //勝勢
    private int divisionNum;    //Division数

    public AzaiCorps() {
        this.powerTotal = 8000;
        this.victory = 0;
        this.divisionNum = 4;
        corpsList();
    }

    @Override
    public void corpsList() {
        //---- new corpsList ----
        //各Divisionをまとめて保持するための軍団リスト
        List<Division> AzaiCorpsList = new ArrayList<>();

        //---- call generalList in under method ----
        //下記メソッドを呼んで、各将のデータを読み込み
        List<List<String>> generalList = generalList();

        //---- instance of Division and set it to 'corpsList' ----
        //Divisionクラスのインスタンスを各将ごとに行い、軍団Listに格納
        for (List<String> list : generalList) {
            AzaiCorpsList.add(
                new Division(
                    list.get(0),
                    list.get(1),
                    Integer.parseInt(list.get(2)),
                    Integer.parseInt(list.get(3))
                )
            );
        }//for

    }

    @Override
    public List<List<String>> generalList() {
        //データ(belong, name, general, power)
        List<String> nagamasaList = new ArrayList<>(
            Arrays.asList(belong, "◎浅井長政","68","4000"));

        List<String> isonoList = new ArrayList<>(
            Arrays.asList(belong, "〇磯野員昌","75","2000"));

        List<String> atujiList = new ArrayList<>(
            Arrays.asList(belong, "阿閉貞秀","54","1000"));

        List<String> miyabeList = new ArrayList<>(
            Arrays.asList(belong, "宮部継潤","42","1000"));

        //---- generalList / 上記Listをまとめて１つのListにして return ----
        List<List<String>> generalList = new ArrayList<>(
            Arrays.asList(nagamasaList, isonoList, atujiList, miyabeList));

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
