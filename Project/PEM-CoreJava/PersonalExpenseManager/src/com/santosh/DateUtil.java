package com.santosh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class will handle date related issue
 * @author Santosh Pandey
 *
 */
public class DateUtil {
	
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
}
