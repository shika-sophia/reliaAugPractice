//�ȉ�Day�N���X
public class Day{
	private int year;
	private int month;
	private int date;

	public Day(){
	}
	public Day(int year){
		this.year = year;
	}
	public Day(int year,int month){
		this(year);
		this.month = month;
	}
	public Day(int year,int month,int date){
		this(year,month);
		this.date = date;
	}
	public Day(Day d){
		this(d.year,d.month,d.date);
	}

	public void setYear(int year){
		this.year = year;
	}
	public void setMonth(int month){
		this.month = month;
	}
	public void setDate(int date){
		this.date = date;
	}

	public int getYear( ){
		return year;
	}
	public int getMonth( ){
		return month;
	}
	public int getDate( ){
		return date;
	}
	
//���t���Ɠ����������ׂ郁�\�b�h
	public boolean equalTo(Day d){
		return year == d.year && month == d.month && date == d.date;
	}
//������\����ԋp
	@Override
	public String toString(){
		return "[ year = " + year + ", month = " + month + ", date = " + date + "]";
	}
	
}//class Day�I��