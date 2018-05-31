package com.santosh.fdpe;

public class Factory {
	
	public Details getDetail(String type){
		
		if(type==null){
			return null;
		}
		if(type.equalsIgnoreCase("employee")){
			return new Employee();
		}
		if(type.equalsIgnoreCase("manager")){
			return new Manager();
		}
		return null;
	}

}
