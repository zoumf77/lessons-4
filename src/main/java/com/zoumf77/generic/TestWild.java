package com.zoumf77.generic;

import java.util.ArrayList;
import java.util.List;


public class TestWild {
	public static void main(String[] args){
		//编译会出错
		//WildCardDemo.printNoBound(new ArrayList<Double>());
		WildCardDemo.printNoBound(new ArrayList<Number>());
		
		WildCardDemo.print(new ArrayList<Integer>());
		//WildCardDemo.print(new ArrayList<String>());
		
		WildCardDemo.printNumber(new ArrayList<Number>());
		//WildCardDemo.printNumber(new ArrayList<Integer>());
		
		WildCardDemo.sum(new ArrayList<Number>());
		//WildCardDemo.sum(new ArrayList<Double>());
		
	
		
	}
}
