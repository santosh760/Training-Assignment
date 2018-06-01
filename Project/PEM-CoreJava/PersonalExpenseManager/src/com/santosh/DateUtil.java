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
	
	/**
	 * This method will convert string Date format to Date format
	 * @param Date as String
	 * @return Formated Date
	 */
	public static Date stringToDate(String dateAsString){
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		try {
			return df.parse(dateAsString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * This method will convert date format to String date format
	 * @param date
	 * @return String Date format
	 */
	public static String dateToString(Date date){
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		return df.format(date);
		
	}
	
	/**
	 * This method will get only year and month from date
	 * @param date
	 * @return String date format only for year and month
	 */
	public static String getYearAndMoth(Date date){
		SimpleDateFormat df=new SimpleDateFormat("yyyy,MM");
		return df.format(date);
		
	}
	
	/**
	 * THis method will get only year from date
	 * @param date
	 * @return Integer date format only year
	 */
	public static Integer getYear(Date date){
		SimpleDateFormat df=new SimpleDateFormat("yyyy");
		return new Integer(df.format(date));
		
	}
	
	/**
	 * This method will get String month from Integer month
	 * @param month number
	 * @return month name
	 */
	public static String getMonthName(Integer monthno){
		return MONTHS[monthno-1];
		
	}
}
