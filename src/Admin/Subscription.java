package Admin;

import java.util.Calendar;

public class Subscription {
	
	
	Integer year;
	Integer month; 
	Integer day;
	private boolean vip=false;
	
	public void setVip(){
		Calendar now = Calendar.getInstance();
		year = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH); // Note: zero based!
		day = now.get(Calendar.DAY_OF_MONTH);
		month=month+1;
		vip=true;
	}
	
	public void setRegular(){
		Calendar now = Calendar.getInstance();
		year = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH); // Note: zero based!
		day = now.get(Calendar.DAY_OF_MONTH);
		month=month+1;
		vip=false;
	}
	
	
	public boolean vip(){
		Calendar now = Calendar.getInstance();
		if(vip){
			if(year.equals(now.get(Calendar.YEAR))){
				if(month<=now.get(Calendar.MONTH)){
					if (day<= now.get(Calendar.DAY_OF_MONTH) && !(month>=now.get(Calendar.MONTH))){
						return true;
					}
				}
			}
		}
		return false;
		
		
	}
	
	
	public boolean regular(){
		Calendar now = Calendar.getInstance();
		if(year.equals(now.get(Calendar.YEAR))){
			if(month<=now.get(Calendar.MONTH)){
				if (day<= now.get(Calendar.DAY_OF_MONTH) && !(month>=now.get(Calendar.MONTH))){
					return true;
				}
			}
		}
		return false;
	}
}
