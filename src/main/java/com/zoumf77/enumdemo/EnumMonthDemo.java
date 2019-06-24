package com.zoumf77.enumdemo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public enum EnumMonthDemo {
	
	JAN (1,31),
	FEB (2,28),
	MAR (3,31),
	APR (4,30),
	MAY (5,31);
	
	private final int month;
	private final int days;
	
	

	EnumMonthDemo(int month,int days){
		this.month=month;
		this.days=days;
	}
	
	public int getMonth() {
		return month;
	}
	
	
	
	




	public int getDays() {
		return days;
	}


	private static Map<Integer,Integer> map;
	public static Map<Integer, Integer> getMap(){
		if (map!=null)
			return map;
		else{
			map = new LinkedHashMap<Integer,Integer>();
			
			for(EnumMonthDemo month:EnumMonthDemo.values()){
				map.put(new Integer(month.month), new Integer(month.days));
			}
			
			return map;
			
		}
	}
	


	public static void main(String[] args){
		
		int days=JAN.days;
		int month=JAN.month;
		//System.out.println("month="+month+" days="+days);
		
		for(EnumMonthDemo month1:EnumMonthDemo.values()){
			System.out.println(month1.month);
			
		}
		
		System.out.println(EnumMonthDemo.valueOf("FEB").days);
		
		EnumMonthDemo month1=EnumMonthDemo.MAY;
		System.out.println(month1.month);
		
		System.out.println(month1.name());
		
		Map<Integer,Integer> map=EnumMonthDemo.getMap();
		Set<Integer> set=map.keySet();
		for(Integer i:set){
			System.out.println(i+","+map.get(i));
		}
	
	}
	
}
