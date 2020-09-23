/*
【織田軍団の特徴】
尾張・美濃・伊勢・近江半国を領し兵数は豊富。国の制度は当時に珍しく官僚制を敷き、
軍団も城下町に駐留する常備軍制、必要な兵数は信長直轄の兵を借りて進退する近代的な軍団制。
そんな新進気鋭の織田家には人材も集まり、将質は高め、兵質は美濃兵で多少上がったものの未だ低め。
明智光秀の名前がないのは当時、侍大将の一階層下の大隊長クラスだったため。
光秀もこの戦場には居た。先鋒が崩れたのちの中軍でよく支えたらしい。
 */

package book2General.corps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OdaCorps extends AbstractCorps {
    private final String belong = "織田勢";  //所属軍団
    private final int soldierQuality = 40; //兵質 0～100
    private int powerTotal;     //総兵力
    private int victory;        //勝勢 -100 ～ +100
    private int divisionNum;    //Division数

    public OdaCorps() {
        this.powerTotal = 23000;
        this.victory = 0;
        this.divisionNum = 6;    // + 援軍 3
    }

    @Override
    public List<Division> corpsList() {
        //---- new corpsList ----
        //各Divisionをまとめて保持するための軍団リスト
        List<Division> odaCorpsList = new ArrayList<>();

        //---- call generalList in under method ----
        //下記メソッドを呼んで、各将のデータを読み込み
        List<List<String>> generalList = generalList();

        //---- instance of Division and set it to 'corpsList' ----
        //Divisionクラスのインスタンスを各将ごとに行い、軍団Listに格納
        for (List<String> list : generalList) {
            odaCorpsList.add(
                new Division(
                    list.get(0),
                    list.get(1),
                    Integer.parseInt(list.get(2)),
                    Integer.parseInt(list.get(3))
                )
            );
        }//for

        return odaCorpsList;

    }//corpsList()

    @Override
    public List<List<String>> generalList() {
        //データ(belong, name, general, power)
        List<String> nobunagaList = new ArrayList<>(
            Arrays.asList(belong, "◎織田信長","96","7000"));

        List<String> shibataList = new ArrayList<>(
            Arrays.asList(belong, "〇柴田勝家","88","4000"));

        List<String> akechiList = new ArrayList<>(
            Arrays.asList(belong, "明智光秀","82","2000"));

        List<String> hideyoshiList = new ArrayList<>(
            Arrays.asList(belong, "木下秀吉","65","2000"));

        List<String> ikedaList = new ArrayList<>(
                Arrays.asList(belong, "池田恒興","37","2000"));

        List<String> sakumaList = new ArrayList<>(
                Arrays.asList(belong, "佐久間信盛","28","2000"));

        //---- generalList / 上記Listをまとめて１つのListにして return ----
        List<List<String>> generalList = new ArrayList<>(
            Arrays.asList(
                nobunagaList,
                shibataList,
                akechiList,
                hideyoshiList,
                ikedaList,
                sakumaList
            )
        );

        return generalList;

    }//generalList()


    //---- 丹羽支隊 [援軍イベント用] ----
    public List<List<String>> subGeneralList() {
        //データ(belong, name, general, power)
        List<String> niwaList = new ArrayList<>(
            Arrays.asList(belong, "〇丹羽長秀","56","2000"));

        List<String> andoList = new ArrayList<>(
            Arrays.asList(belong, "安藤守就","42","1000"));

        List<String> bokuzenList = new ArrayList<>(
            Arrays.asList(belong, "氏家直元","66","1000"));

      //---- generalList / 上記Listをまとめて１つのListにして return ----
        List<List<String>> subGeneralList = new ArrayList<>(
            Arrays.asList(niwaList, andoList, bokuzenList));

        return subGeneralList;

    }//subGeneralList()


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
