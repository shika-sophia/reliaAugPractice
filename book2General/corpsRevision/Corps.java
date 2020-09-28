package book2General.corpsRevision;

public class Corps {
    private String belong;      //所属軍団
    private int soldierQuality; //兵質 0～100
    private int powerTotal;     //総兵力
    private int victory;        //勝勢 -100 ～ +100
    private int divisionNum;    //Division数

    public Corps(
        String belong,
        int soldierQuality,
        int powerTotal,
        int divisionNum
    ) {
        this.belong = belong;
        this.soldierQuality = soldierQuality;
        this.powerTotal = powerTotal;
        this.victory = 0;
        this.divisionNum = divisionNum;
    }

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

	public String getBelong() {
		return belong;
	}

	public int getSoldierQuality() {
		return soldierQuality;
	}

}//class
