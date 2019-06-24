package com.zoumf77.annotationdemo;

import java.lang.reflect.*;//这个包从来不会用，编译器会出警告
import java.util.Date;


public class AnnotationJavaDemo {
	
	public static void main(String[] args){
		
		@SuppressWarnings("unused")
		int i=0;
		
		@SuppressWarnings("unused")
		Date d=new Date();
		
		sayHello();
		
		GreetingService greetingService=message->System.out.println("Hi "+message);
		greetingService.sayHi("zmf");
	}
	
	@Deprecated
	public static void sayHello(){
		System.out.println("hi!");
	}

	public String toString(){
		return "override";
	}
	
	public <T> void print(T ...args){
		
	}
	
	//在泛型变长参数,静态
	public static <T> T useVarargs(T... args) {  
	    return args.length > 0 ? args[0] : null;  
	} 
}
