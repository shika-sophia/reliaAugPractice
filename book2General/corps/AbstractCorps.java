package book2General.corps;

import java.util.List;

public abstract class AbstractCorps {
    //各将データから各備をインスタンスし、そのインスタンス群をListで保持
    public abstract List<Division> corpsList();

    //各将のデータをListで登録
    public abstract List<List<String>> generalList();
}//class
