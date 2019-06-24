package com.zoumf77.generic;

import java.util.ArrayList;
import java.util.List;

/*In Out 原则*/
/*In，能从里面取数据，而不能加，除非add(null)*/
/*Out,能往里面加数据，而不能取，除非Object o=list.get(0)*/
public class InOutDemo {

	/*In*/
	public static void addItem(List<? extends Number> list){
		//list.add(new Integer(1)); 因为编译器不知道要添加什么类型的值
		list.add(null);
	}
	
	/*In*/
	public static Number getItem(List<? extends Number> list){
		return list.get(0);
	}
	
	/*Out*/
	public static void addElement(List<? super Integer> list){
		list.add(new Integer(1));
	}
	
	/*Out*/
	public static Integer getElements(List<? super Integer> list){
		//Integer i=list.get(0);
		Object o=list.get(0);
		return (Integer)o;
	}
	
	/*不用泛型,get add*/
	public static Integer operatelist(List<Integer> list){
		list.add(new Integer(1));
		return list.get(0);
	}
	
	/*in,无边界，可以用Object的子类*/
	public static void print(List<?> list){
		for(Object o:list){
			
		}
	}
	
	public static void main(String...strings ){
		print(new ArrayList<String>());
	}
}
