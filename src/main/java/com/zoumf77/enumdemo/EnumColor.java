package com.zoumf77.enumdemo;

public enum EnumColor {
	RED,BALCK,WHITE,PINK,ORANGE;

	public static void main(String[] agrs){
		
		EnumColor color=EnumColor.RED;
		
		System.out.println(color);
		System.out.println(color.name());
		System.out.println(color.ordinal());
		
	}
}
