package com.zoumf77.generic;

public class Print<T> {
	T t;
	Print(T t){
		this.t=t;
	}
	
	public void print(){
		if(this.t instanceof Integer){
			System.out.println(this.t+" is a "+this.t.getClass().getName());
		}
		else if(this.t instanceof String){
			System.out.println(this.t+" is a "+this.t.getClass().getName());
		}
		
	}
	
	public static <T extends Number> void outprint(T message){
		System.out.println(message);
	}

}
