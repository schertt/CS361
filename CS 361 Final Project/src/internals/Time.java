package internals;

import java.sql.*;
import java.util.Calendar;
import java.util.Date;
public class Time extends Timestamp
{
	private Timestamp currentTime;

	public Time(long time) {
		super(time);
	}
//	public Time(int hr , int min, int sec)
//	{
//		Calendar cal = Calendar.getInstance();
//		Date now = cal.set(year, month, date, hr, min, sec);
//	}
//	
//	
	//return instance of a time
//	public Time getTime() 
//	{
//		return new Time(hour, minute, second, hundreths);
//	}
//	
	
/*	//Accessors for hr, min, and sec
	public int getHour()
	{
		return hour;
	}
	
	public int getMin() 
	{
		return minute;
	}
	
	public int getSec() 
	{
		return second;
	}
	
	public int getHund()
	{
		return hundreths;
	}
	
	//set time
	public void setTime(int h, int m, int s, int hd) 
	{
		hour = h;
		minute = m;
		second = s;
		hundreths = hd;
	}
	
	//convert hr and min 
	public double convertToSec()
	{
		// 1 hour = 3600 sec
		// 1 min = 60 sec
		double totalSec;
		totalSec = (hour*3600) + (minute*60) + second + ((double)hundreths/100);
		return totalSec;
	}*/
	
	//return string output as <hour>:<min>:<sec>.<hundeths>
	
	
//	@Override
//	public String toString()
//	{
//		return hour + ":" + minute + ":" + second + "." + hundreths;
//	}
}
