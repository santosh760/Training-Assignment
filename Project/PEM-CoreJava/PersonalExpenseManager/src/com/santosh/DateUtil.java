package com.santosh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Date;

/**
 * This class will handle date related issue
 * @author Santosh Pandey
 *
 */
public class DateUtil {
	
	public static final String[] MONTHS={"January","February","March","April","May","June","July","August","September","October","November","December"};
	
	public static Date stringToDate(String dateAsString){
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		try {
			return df.parse(dateAsString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String dateToString(Date date){
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		return df.format(date);
		
	}
	
	public static String getYearAndMoth(Date date){
		SimpleDateFormat df=new SimpleDateFormat("yyyy,MM");
		return df.format(date);
		
	}
	
	public static Integer getYear(Date date){
		SimpleDateFormat df=new SimpleDateFormat("yyyy");
		return new Integer(df.format(date));
		
	}
	
	public static String getMonthName(Integer monthno){
		return MONTHS[monthno-1];
		
	}
}
