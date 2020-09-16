package book2General.test;

//###### Template ######
//public class TestMain {
//
//	public static void main(String[] args) {
//
//
//	}//main()
//
//}//class


//###### Test print Corps, Division, and their reduced parameter ######
//2020-09-16-1000
import java.util.List;

import book2General.corps.AzaiCorps;
import book2General.corps.Division;

public class PrintDivisionTest {

    public static void main(String[] args) {
        //---- instance of XxxxCorps and List<Division> ----
        AzaiCorps azai = new AzaiCorps();
        List<Division> azaiList = azai.corpsList();

      //---- Test (宮部備の兵力 -24 士気 -158)×10回 ----
        Division miyabe = azaiList.get(3);
        for (int i = 0; i < 10; i++) {
            miyabe.setPower(miyabe.getPower() - 24);
            miyabe.setMoral(miyabe.getMoral() - 158);

            System.out.printf(
                "勢  力: %s\n侍大将: %s\n戦闘力: %4d\n兵  力: %4d\n士  気: %4d\n",
                miyabe.getBelong(),
                miyabe.getName(),
                miyabe.getGeneral(),
                miyabe.getPower(),
                miyabe.getMoral()
            );
            System.out.println();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //---- Test print division ----
        for(Division division : azaiList ) {
            System.out.printf(
                "勢  力: %s\n侍大将: %s\n戦闘力: %4d\n兵  力: %4d\n士  気: %4d\n",
                division.getBelong(),
                division.getName(),
                division.getGeneral(),
                division.getPower(),
                division.getMoral()
            );
            System.out.println();
        }

    }//main()

}//class

/*
//---- instance of XxxxCorps and List<Division> ----
AzaiCorps azai = new AzaiCorps();
List<Division> azaiList = azai.corpsList();

//---- Test print division ----
for(Division division : azaiList ) {
    System.out.printf(
        "勢  力: %s\n侍大将: %s\n戦闘力: %4d\n兵  力: %4d\n士  気: %4d\n",
        division.getBelong(),
        division.getName(),
        division.getGeneral(),
        division.getPower(),
        division.getMoral()
    );
    System.out.println();
}

勢  力: 浅井勢
侍大将: ◎浅井長政
戦闘力: 68
兵  力: 4000
士  気: 1000

勢  力: 浅井勢
侍大将: 〇磯野員昌
戦闘力: 75
兵  力: 2000
士  気: 1000

勢  力: 浅井勢
侍大将: 阿閉貞秀
戦闘力: 54
兵  力: 1000
士  気: 1000

勢  力: 浅井勢
侍大将: 宮部継潤
戦闘力: 42
兵  力: 1000
士  気: 1000
----------------
//---- Test 宮部備の兵力 -24 士気 -158 ----
勢  力: 浅井勢
侍大将: 宮部継潤
戦闘力:   42
兵  力:  976
士  気:  842
----------------
//---- instance of XxxxCorps and List<Division> ----
AzaiCorps azai = new AzaiCorps();
List<Division> azaiList = azai.corpsList();

//---- Test (宮部備の兵力 -24 士気 -124)×10回 ----
Division miyabe = azaiList.get(3);
for (int i = 0; i < 10; i++) {
    miyabe.setPower(miyabe.getPower() - 24);
    miyabe.setMoral(miyabe.getMoral() - 158);

    System.out.printf(
        "勢  力: %s\n侍大将: %s\n戦闘力: %4d\n兵  力: %4d\n士  気: %4d\n",
        miyabe.getBelong(),
        miyabe.getName(),
        miyabe.getGeneral(),
        miyabe.getPower(),
        miyabe.getMoral()
    );
    System.out.println();

    try {
        Thread.sleep(500);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}

勢  力: 浅井勢
侍大将: 宮部継潤
戦闘力:   42
兵  力:  976
士  気:  842

勢  力: 浅井勢
侍大将: 宮部継潤
戦闘力:   42
兵  力:  952
士  気:  684

勢  力: 浅井勢
侍大将: 宮部継潤
戦闘力:   42
兵  力:  928
士  気:  526

勢  力: 浅井勢
侍大将: 宮部継潤
戦闘力:   42
兵  力:  904
士  気:  368

勢  力: 浅井勢
侍大将: 宮部継潤
戦闘力:   42
兵  力:  880
士  気:  210

勢  力: 浅井勢
侍大将: 宮部継潤
戦闘力:   42
兵  力:  856
士  気:   52

勢  力: 浅井勢
侍大将: 宮部継潤
戦闘力:   42
兵  力:  832
士  気: -106

勢  力: 浅井勢
侍大将: 宮部継潤
戦闘力:   42
兵  力:  808
士  気: -264

勢  力: 浅井勢
侍大将: 宮部継潤
戦闘力:   42
兵  力:  784
士  気: -422

勢  力: 浅井勢
侍大将: 宮部継潤
戦闘力:   42
兵  力:  760
士  気: -580
 */
