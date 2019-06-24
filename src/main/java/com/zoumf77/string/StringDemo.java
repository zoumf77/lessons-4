package com.zoumf77.string;

public class StringDemo {
	public static void main(String[] args){
		
		String name="zoumf77";
		String name1="zoumf77";
		
		String s=new String("abc");
		
		String s_new=s.concat("edf");//s没有发生变化,仍然指向串"abc";但是s_new指向了一个新串"abcedf"
		
		System.out.println("s="+s);
		System.out.println("s_new"+s_new);
		
		StringBuilder sb=new StringBuilder("abc");
		/*
		sb.append("edf"); //sb的值发生变化
		
		System.out.println("sb="+sb);
		*/
		StringBuilder sb1=new StringBuilder("abc");
		System.out.println("sb.equals(sb1)"+sb.equals(sb1));
		
		
		//字符串比较
		String s1="abc";
		String s2="abc";
		System.out.println("s1==s2"+(s1==s2));
		System.out.println("s1.equals(s2)"+(s1.equals(s2)));
		
		
		String s3=new String("abc");
		String s4=new String("abc");
		System.out.println("s3==s4:"+(s3==s4));
		
		System.out.println("s3.equals(s4):"+s3.equals(s4));
		
		//看看Object的源代码
		Object o;
		
		//==一般比较两个引用类型，比较他们引用的对象是否指向同一个内存地址。
		//每一个类的实现equals的方法是不一样的
		//在object中==和equals就是一样的，基本数据类型与他们的包装及String都重写了equals()方法，是值相等，
		//例如StringBuilder的equals方法自己继承自 Object.
		
		  String str1="abc";   
		  String str2="def";   
		  //String str3=str1+str2;
		  String str3="abc"+"def";
		  System.out.println("===========test5============");
		  System.out.println(str3=="abcdef"); //false
		
		  StringBuffer sb10=new StringBuffer("123");
		  sb10.append("456");
		  
		 
	}
}
