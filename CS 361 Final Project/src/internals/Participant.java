package internals;


public class Participant {
	private int bibNum;
	private Time startTime; //hr min sec
	private Time endTime;   //hr min sec
	private int lane; // will not be used in IND event.
	
	public Participant(int bib)
	{
		bibNum = bib;
		//startTime = new Time(0, 0, 0, 0);
		//endTime = new Time(0, 0, 0, 0);
	}
	
	public void setBibNum(int bib) {bibNum = bib;}
	
	public int getBibNum() {return bibNum;}
	
	public void setStartTime(Time s) {startTime = s;}
	
	public Time getStartTime() {return startTime;}
	
	public void setEndTime(Time e) {endTime = e;}
	
	public Time getEndTime() {return endTime;}
	
	public void setLane(int l) {lane = l;}
	
	public int getLane() {return lane;}
}
