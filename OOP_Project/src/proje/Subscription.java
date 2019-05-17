package proje;

import java.util.*;

public class Subscription {
	
	private Date begin;
	private Date end;
	private SubscribedVehicle vehicle;
	
	public Subscription(Date begin,Date end,String plate) {
		this.begin = begin;
		this.end = end;
		vehicle = new SubscribedVehicle(plate);	
	}
	
	public boolean isValid() {	
		if(end.isEqualsWith(end.getToday()))
			return true;
		return (begin.isBeforeThan(begin.getToday()) && end.isAfterThan(end.getToday()));		
	}
	
	

}
