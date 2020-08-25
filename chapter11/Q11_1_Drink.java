/**
 * @title chapter11 / Additional Quest / Q11_1_Drink
 * @see Q11_1_Test
 * @author Oshika
 * @dete 2020-08-24 / 1630-1730
 * @date 2020-08-25 / 0930-1030
 */
/*
    11章の内容を使って、飲み物のクラスを作成してください。
    メンバには、商品名、会社名、内容量のフィールドを宣言してください。
    また、飲むと減るというメソッドも作成してください。

    ファイルはクラスごとに分けて作成してください。

    このクラス名はQ11_1_Drinkというクラス、実行するクラスはQ11_1_Testというクラスで作成してください


*/
package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q11_1_Drink {
    private String name;
    private String company;
    private int content;

    Q11_1_Drink(){}

    Q11_1_Drink(String name, String company, int content){
        this.name = name;
        this.company = company;
        this.content = content;
    }


    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public List<String> buildNameList() {
        List<String> nameList = new ArrayList<>();
            nameList.add(0, "コカコーラ");
            nameList.add(1, "カルピス");
            nameList.add(2, "午後の紅茶");
            nameList.add(3, "金の微糖");

        return nameList;
    }

    public List<String> buildCompanyList() {
        List<String> companyList = new ArrayList<>();
            companyList.add(0, "Ｃボトリング");
            companyList.add(1, "株カルピコ");
            companyList.add(2, "希林");
            companyList.add(3, "BOZUcompaby");

        return companyList;
    }

    public List<Integer> buildContentList() {
        List<Integer> contentList = new ArrayList<>(
            Arrays.asList(350, 600, 500, 180));

        return contentList;
    }

    public List<Integer> memoDrinkFlow(List<Integer> contentList, int drinkFlow){
        for(int i = 0; i < contentList.size(); i++) {
            contentList.set(i, contentList.get(i) - drinkFlow);
        }
        return contentList;
    }
}//class