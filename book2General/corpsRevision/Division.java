package book2General.corpsRevision;

//各備のインスタンス元。備の状態を保持。
public class Division {
    //---- General Parameter ----
    private String belong;    //所属軍団
    private String name;//侍大将の名前
    private int general;      //侍大将の戦闘力 0～100

    //---- Division Parameter ----
    private int power;        //兵力 0～10000
    private int moral;        //士気 0～1000
    //private String direction;//正面方向 (HEX移動機能のときに利用)
    private int energy;       //活性 -999 ～ +1000
    private String condition;
    //状態 excite(興奮), normal(通常), confuse(混乱), chaos(大混乱), escape(潰走)

    public Division(String belong, String name, int general, int power) {
        this.belong = belong;
        this.name = name;
        this.general = general;

        this.power = power;
        this.moral = 1000;
        //this.direction = "";
        this.energy = 500;
        this.condition = "normal";
    }

    //イベント武将など、すでにDivisionインスタンスが存在する場合のコンストラクタ
    public Division(Division division) {
        this.belong = division.getBelong();
        this.name = division.getName();
        this.general = division.getGeneral();
        this.power = division.getPower();
        this.moral = division.getMoral();
        //this.direction = "";
        this.energy = division.getEnergy();
        this.condition = division.getCondition();
    }

    //====== getter, setter ======
    //---- General Parameter ----
    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGeneral() {
        return general;
    }

    public void setGeneral(int general) {
        this.general = general;
    }

    //---- Division Parameter ----
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMoral() {
        return moral;
    }

    public void setMoral(int moral) {
        this.moral = moral;
    }

//    public String getDirection() {
//        return direction;
//    }
//
//    public void setDirection(String direction) {
//        this.direction = direction;
//    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}//class
