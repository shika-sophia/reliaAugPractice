package book2General.corpsRevision;

import book2General.BattleGame;

public class SakakibaraDivision extends Division implements Eventable{

    public SakakibaraDivision(Division sakakibara) {
        super(sakakibara);
        super.setName("〇" + sakakibara.getName()); //〇副将化
        super.setPower(2000); //徳川家康から増援
        super.setMoral(1500); //士気 1500に増加
    }

    @Override
    public void addPower() {
        BattleGame bg = new BattleGame();
        //Division ieyasu = bg.getTokugawaList().get(0);
        //ieyasu.setPower(ieyasu.getPower() - 1000);
    }
}//class
