package com.zoumf77.enumdemo;

public enum ColorEnumDemo2 {
	RED("red"),BALCK("black"),WHITE("white"),PINK("pink"),ORANGE("orange");
	
	private String name;
	ColorEnumDemo2(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public static void main(String[] args){
		ColorEnumDemo2 color=ColorEnumDemo2.RED;
	
		System.out.println(color);
		System.out.println(color.name());
		System.out.println(color.ordinal());
		
		for(ColorEnumDemo2 color1:ColorEnumDemo2.values()){
			System.out.println(color1.name);
		}
	}
}
