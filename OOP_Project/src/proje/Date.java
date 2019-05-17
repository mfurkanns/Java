package proje;

import java.util.Calendar;

public class Date{
	
	private int day;
	private int month;
	private int year;
	
	public Date(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public boolean isAfterThan(Date date) { // tarihin verilen tarihten sonra olup olmad��� kontrol edilir.
		if(date.getYear()>year)
			return false;
		else if (date.getYear()<year)
			return true;
		
		else {
			if(date.getMonth()>month)
				return false;
			else if(date.getMonth()<month)
				return true;
			else {
				if(date.getDay()>day)
					return false;
				else if(date.getDay()<day)
					return true;
				else
					return false;
			}
		}
	}
	
	public boolean isBeforeThan(Date date) { // tarihin verilen tarihten �nce olup olmad��� kontrol edilir.
		if(date.getYear()<year)
			return false;
		else if (date.getYear()>year)
			return true;
		
		else {
			if(date.getMonth()<month)
				return false;
			else if(date.getMonth()>month)
				return true;
			else {
				if(date.getDay()<day)
					return false;
				else if(date.getDay()>day)
					return true;
				else
					return false;
			}
		}
	}
	
	public boolean isEqualsWith(Date date) { // tarihin verilen tarihte e�it olup olmad��� kontrol edilir.
		return date.getDay()==day && date.getMonth()==month && date.getYear()==year;
	}
	
	public Date getToday() { // bug�n�n tarihi hesaplan�r.
		Calendar time = Calendar.getInstance();
		int gun=time.get(Calendar.DAY_OF_MONTH);
		int ay=time.get(Calendar.MONTH)+1;
		int yil=time.get(Calendar.YEAR);
		
		return new Date(gun,ay,yil);
	}
	
	

}
