package com.zoumf77.annotationdemo;

@Author(name="zmf",date="2019/01/30")
public class AuthorDemo {
	
	@Author(name="publisher",date="2019/01/30")
	public String publisher;
	
	
	@Author(name="origin",date="2019/02/30")
	public void print(){
		System.out.println("作者");
	}
	
}
