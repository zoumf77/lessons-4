package com.zoumf77.polymorphism;



public class TestPoly {

	public static void main(String[] args){
		/*override*/
		SuperClass parent=new SuperClass("John",21);
		SuperClass child=new SubClass("Jenney",21,"Famale");
		
		System.out.println("parent--->"+parent.toString());
		System.out.println("child--->"+child.toString());
		
		/*implements*/
		SayHi sayHi=new Chinese();
		greeting(sayHi);
	}
	
	private static void greeting(SayHi sayHi){
		sayHi.greeting();
	}
}
