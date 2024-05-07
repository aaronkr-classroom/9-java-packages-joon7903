package com.section05;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Ex1014 {

	public static void main(String[] args) {
		Date today = new Date();
		
		System.out.println("현재 날짜" + today);
		
		String dateToStr = DateFormat.getInstance().format(today);
		System.out.println("DateFormat.getInstance():" + dateToStr);
		
		dateToStr = DateFormat.getDateInstance().format(today);
		System.out.println("DateFormat.getInstance():" + dateToStr);
		
		dateToStr = DateFormat.getDateInstance().format(today);
		System.out.println("DateFormat.getTimeInstance():" + dateToStr);
		
		dateToStr = DateFormat.getDateInstance().format(today);
		System.out.println("DateFormat.getDateTimeInstance():" + dateToStr);
		
		dateToStr = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(today);
		System.out.println("DateFormat.getInstance():" + dateToStr);
		
		dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(today);
		System.out.println("DateFormat.getDateTiemInstance(DateFormat.LONG, DateFormat.SHORT):" + dateToStr);
		
		//SimpleDateFormat
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		String strDate = formatter.format(date);
		System.out.println("yyyy/MM/dd :" + strDate);
	
		formatter = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		strDate = formatter.format(date);
		System.out.println("yyyy-mm-dd hh:mm:ss:" + strDate);
	
		formatter = new SimpleDateFormat("dd MMMM yy");
		strDate = formatter.format(date);
		System.out.println("dd MMMM yy :" + strDate);
	
		formatter = new SimpleDateFormat("dd M yy zzzz");
		strDate = formatter.format(date);
		System.out.println("dd M yy zzzz :" + strDate);
	}

}
