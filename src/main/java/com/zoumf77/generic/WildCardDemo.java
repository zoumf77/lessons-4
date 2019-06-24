package com.zoumf77.generic;

import java.util.List;

public class WildCardDemo {
	
	
	/**
	 * 无边界
	 * @param list
	 */
	public static void printNoBound(List<Number> list){
		for(Object o:list){
			System.out.println(o);
		}
	}
	
	/*上边界*/
	/*List<Number>与 List<? extends Number>更严格,只能List<Number>被处理*/
	/**
	 * 有上边界
	 * @param list
	 */
	public static void print(List<? extends Number> list){
		for(Number num1:list){
			System.out.println(num1);
		}
	}
	
	/**
	 * 无边界
	 * @param list
	 */
	public static void printNumber(List<Number> list){
		for(Number num1:list){
			System.out.println(num1);
		}
	}
	
	/**
	 * 下边界
	 * @param list
	 * @return
	 */
	public static Integer sum(List<? super Integer> list){
		Integer sum=0;
		for(Object int1:list){
			sum+=Integer.valueOf(int1.toString());
		}
		return sum;
	}

	public static void getTest2(List<? super Integer> list) {
		//Integer i = list.get(0); //编译报错
		//Number n=list.get(0);
		Object o = list.get(1);
	}
	
}
