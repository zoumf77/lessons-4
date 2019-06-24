package com.zoumf77.polymorphism;

public class SuperClass {
	
	/*私有变量不能继承*/
	private String name;
	
	/*公有变量可以被继承*/
	public int age;
	
	/*可以被子类访问，但不能被继承*/
	protected String phone;
	
	/*公共的静态变量可以被继承*/
	public static String address;
	
	/*公共的实例方法可以被继承*/
	public String getName() {
		return name;
	}

	/*构造函数不能被继承*/
	public SuperClass(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	/*公共的方法可以被继承*/
	public void setName(String name) {
		this.name = name;
	}
	
	/*公共的方法可以被继承*/
	public String toString(){
		return "name="+name+",age="+age;
	}

	/*公共的静态方法可以被继承*/
	public static void print(){
		System.out.println(" print in superclass ");
	}
}
