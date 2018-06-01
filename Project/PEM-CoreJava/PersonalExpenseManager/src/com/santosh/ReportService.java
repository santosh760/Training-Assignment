package com.santosh;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

/**
 * This class will help to maintain report
 * @author Santosh Pandey
 *
 */
public class ReportService {

	private Repositoy repo=Repositoy.getRepository();
	
	public Map<String,Float> calculateMonthlyTotal(){
		Map<String,Float> map= new TreeMap<>();
		for(Expense exp: repo.expList){
			Date expDate=exp.getDate();
			String yearMonth=DateUtil.getYearAndMoth(expDate);
			if(map.containsKey(yearMonth)){
				Float total=map.get(yearMonth);
				total=total+exp.getAmount();
				map.put(yearMonth, total);
			}
			else {
				map.put(yearMonth, exp.getAmount());
			}
		}
		return map;
	}
}
