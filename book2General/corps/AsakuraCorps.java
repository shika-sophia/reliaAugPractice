/*
【朝倉軍団の特徴】
将質の高い武将がおりながら、血統信仰・門閥主義の古い室町体制のため、
良将の石高は低く、兵士数も少ないので彼らの力量を活かしきれないであろう。
 */
package book2General.corps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsakuraCorps extends AbstractCorps {
    private final String belong = "朝倉勢";  //所属軍団
    private final int soldierQuality = 60; //兵質 0～100
    private int powerTotal;     //総兵力
    private int victory;        //勝勢 -100 ～ +100
    private int divisionNum;    //Division数

    public AsakuraCorps() {
        this.powerTotal = 10000;
        this.victory = 0;
        this.divisionNum = 5;
    }

    @Override
    public List<Division> corpsList() {
        //---- new corpsList ----
        //各Divisionをまとめて保持するための軍団リスト
        List<Division> asakuraCorpsList = new ArrayList<>();

        //---- call generalList in under method ----
        //下記メソッドを呼んで、各将のデータを読み込み
        List<List<String>> generalList = generalList();

        //---- instance of Division and set it to 'corpsList' ----
        //Divisionクラスのインスタンスを各将ごとに行い、軍団Listに格納
        for (List<String> list : generalList) {
            asakuraCorpsList.add(
                new Division(
                    list.get(0),
                    list.get(1),
                    Integer.parseInt(list.get(2)),
                    Integer.parseInt(list.get(3))
                )
            );
        }//for

        return asakuraCorpsList;

    }//corpsList()


    @Override
    public List<List<String>> generalList() {
        //データ(belong, name, general, power)
        List<String> kagetakeList = new ArrayList<>(
            Arrays.asList(belong, "◎朝倉景建","23","4000"));

        List<String> kagenoriList = new ArrayList<>(
            Arrays.asList(belong, "〇朝倉景紀","31","2000"));

        List<String> magaraList = new ArrayList<>(
            Arrays.asList(belong, "真柄直隆","71","1000"));

        List<String> maenamiList = new ArrayList<>(
            Arrays.asList(belong, "前波吉継","64","1000"));

        List<String> kageakiraList = new ArrayList<>(
            Arrays.asList(belong, "朝倉景鏡","42","2000"));


        //---- generalList / 上記Listをまとめて１つのListにして return ----
        List<List<String>> generalList = new ArrayList<>(
            Arrays.asList(
                kagetakeList,
                kagenoriList,
                magaraList,
                maenamiList,
                kageakiraList
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
