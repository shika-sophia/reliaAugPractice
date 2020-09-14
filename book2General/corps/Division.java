package book2General.corps;

//各備のインスタンス元。備の状態を保持。
public class Division implements Ratable {
    private String belong;    //所属軍団
    private final String name;//侍大将の名前
    private int power;        //戦闘力 0～100
    private int moral;        //moral: 士気 0～1000
    private int ratable;      //謀反係数 0～100

    public Division(String belong, String name, int power, int ratable) {
        this.belong = belong;
        this.name = name;
        this.power = power;
        this.moral = 1000;
        this.ratable = ratable;
    }

    //====== getter, setter ======
    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

    public String getName() {
        return name;
    }

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

    public int getRatable() {
        return ratable;
    }

    public void setRatable(int ratable) {
        this.ratable = ratable;
    }

}//class
