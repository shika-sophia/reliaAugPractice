package book2General.corpsRevision;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ExecuteCorps {
    //Corps インスタンスをフィールドで保持
    private Corps azaiCorps;
    private Corps asakuraCorps;
    private Corps odaCorps;
    private Corps tokugawaCorps;

    //Division インスタンスをリスト化してフィールドで保持
    private List<Division> azaiDivList;
    private List<Division> asakuraDivList;
    private List<Division> odaDivList;
    private List<Division> tokugawaDivList;


    //単体テスト用 main()
    public static void main(String[] args) {
        ExecuteCorps exeCorps = new ExecuteCorps();

        //List<Divison>のインスタンス化
        exeCorps.azaiDivList = new ArrayList<>();
        exeCorps.asakuraDivList = new ArrayList<>();
        exeCorps.odaDivList = new ArrayList<>();
        exeCorps.tokugawaDivList = new ArrayList<>();

        //データーベースファイルの読み込み
        String path =
            "C:\\Program Files\\pleiades\\workspace-web\\reliaAugPractice\\src\\book2General\\corpsRevision\\GeneralDatabase.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            //1行ずつ読み込み
            String line;
            while((line = reader.readLine()) != null) {
                //データを段落ごとに分割 / divFlagには"浅井勢"などが入る
                String divFlag = exeCorps.separater(line);

                while (divFlag != null) {
                    //Division情報の読み込み
                    line = reader.readLine();

                    if(line.contains("[END]")) {
                        break;
                    }

                    //Division情報を分割してリスト化
                    exeCorps.buildDivision(line, divFlag);

                }//while divFlag
            }//while line

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        exeCorps.printTest();

    }//main()

    //フィールド表示テスト
    private void printTest() {
        //---- Test of print xxxxDivList ----
        System.out.printf("%s: 兵質%d \n", azaiCorps.getBelong(),azaiCorps.getSoldierQuality());
        System.out.printf("%s: 兵質%d \n", asakuraCorps.getBelong(), asakuraCorps.getSoldierQuality());
        System.out.printf("%s: 兵質%d \n", odaCorps.getBelong(), odaCorps.getSoldierQuality());
        System.out.printf("%s: 兵質%d \n", tokugawaCorps.getBelong(), tokugawaCorps.getSoldierQuality());
        System.out.println();

        System.out.println(azaiDivList.get(0).getName());
        System.out.println(asakuraDivList.get(0).getName());
        System.out.println(odaDivList.get(0).getName());
        System.out.println(tokugawaDivList.get(0).getName());
    }


    //データを段落ごとに分割 / divFlagには"浅井勢"などが入る
    private String separater(String line) {
        String divFlag = null;

        //separate by Corps
        if(line.startsWith("【浅井勢")) {
            String[] lineBit = line.substring(1, line.length() - 1).split(",");
            azaiCorps = buildCorps(lineBit);

            divFlag = lineBit[0];

        } else if(line.startsWith("【朝倉勢")) {
            String[] lineBit = line.substring(1, line.length() - 1).split(",");
            asakuraCorps = buildCorps(lineBit);

            divFlag = lineBit[0];

        } else if(line.startsWith("【織田勢")) {
            String[] lineBit = line.substring(1, line.length() - 1).split(",");
            odaCorps = buildCorps(lineBit);

            divFlag = lineBit[0];

//        } else if(line.startsWith("〔丹羽支隊")) {
//            String[] lineBit = line.substring(1, line.length() - 1).split(",");
//            niwaCorps = buildCorps(lineBit);
//
//            divFlag = "織田勢";

        } else if(line.startsWith("【徳川勢")) {
            String[] lineBit = line.substring(1, line.length() - 1).split(",");
            tokugawaCorps = buildCorps(lineBit);

            divFlag = lineBit[0];
        }

        return divFlag;
    }//separater()


    //Corps インスタンス
    private Corps buildCorps(String[] lineBit) {
        //Corps(String belong, int soldierQuality, int powerTotal, int divisionNum)
        Corps corps = new Corps(
            lineBit[0],
            Integer.parseInt(lineBit[1].trim()),
            Integer.parseInt(lineBit[2].trim()),
            Integer.parseInt(lineBit[3].trim())
        );

        return corps;

    }//buildCorps()


    //Division インスタンスして、各リストに振り分け
    private void buildDivision(String line, String divFlag) {
        String[] lineBit = line.split(",");

        //Division(String belong, String name, int general, int power)
        Division division = new Division(
            divFlag, lineBit[0], Integer.parseInt(lineBit[1].trim()), Integer.parseInt(lineBit[2].trim()));

        switch (divFlag) {
        case "浅井勢":
            azaiDivList.add(division);
            break;

        case "朝倉勢":
            asakuraDivList.add(division);
            break;

        case "織田勢":
            odaDivList.add(division);
            break;

        case "徳川勢":
            tokugawaDivList.add(division);
            break;
        }//switch
    }//buildDivision()

}//class

/*
//====== Test Result by main() ======
浅井勢: 兵質50
朝倉勢: 兵質60
織田勢: 兵質40
徳川勢: 兵質90

◎浅井長政
〇朝倉景健
◎織田信長
◎徳川家康

【考察】
[corpsRevision.GeneralDatabase.txt]は同パッケージ内に置いているのだが、ファイル名だけでは読み込んでくれず、
相対path: /reliaAugPractice/src/book2General/corpsRevision/GeneralDatabase.txt でも あかんくて、
絶対path: C:\Program Files\pleiades\workspace-web\reliaAugPractice\src\book2General\corpsRevision\GeneralDatabase.txt
    を入れてやっと反応した。なんでだ。

１枚のＤＢテキストファイルから１行ずつ読み込んで、
split(",")で分割して、その値を[corpsRevison.Corps][corpsRevision.Division]に入れてインスタンス
上記のように各値が出たので、インスタンス化とリスト化はできていると思われる。

ここでは 単体テストするため main()用に作ったが、これのmain()を外して一般クラスにしておかなきゃ。
*/