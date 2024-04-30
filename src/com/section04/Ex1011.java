package com.section04;

import java.util.Calendar;
import java.util.Locale;
import static java.util.Calendar.*;
import java.util.Date;

public class Ex1011 {

	public static int getDiffYears(Date first, Date last) {
		Calendar a = getCalendar(first);
		Calendar b = getCalendar(last);
		int diff = b.get(YEAR) - a.get(YEAR);
	
		if (a.get(MONTH) > b.get(MONTH) || (a.get(MONTH) == b.get(MONTH) && a.get(DATE) > b.get(DATE))) {
			diff--;
		}
		
		return diff;
    }
	    public static Calendar getCalendar(Date date) {
		Calendar ca1 = Calendar.getInstance(Locale.KOREA);
		ca1.setTime(date);
		return ca1;
	}
	    public static void main(String[] args) {
	    	Calendar ca1 = Calendar.getInstance();
	    	System.out.print("현재 날짜: ");
	    	System.out.println(ca1.get(Calendar.YEAR) + "년");
	    	System.out.println(ca1.get(Calendar.MONTH) + "1");
	    	System.out.println(ca1.get(Calendar.DATE) + "년");
	    	
	    	Date my_bday = new Date(1981, 12, 24);
	    	Date today = new Date();
	    	
	    	System.out.println();
	    	System.out.println("너의 나이는:" + getDiffYears(today, my_bday));
	    	
	    }


}
