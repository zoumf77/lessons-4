package com.zoumf77.string;

/*
 * https://blog.csdn.net/qauchangqingwei/article/details/80831797
 * 感谢大神qauchangqingwei
 */
public class StringDemo {
	public static void main(String[] args){
		
		String name="zoumf77";
		String name1="zoumf77";
		
		String s=new String("abc");
		
		String s_new=s.concat("edf");//s没有发生变化,仍然指向串"abc";但是s_new指向了一个新串"abcedf"
		
		System.out.println("s="+s);
		System.out.println("s_new"+s_new);
		
		StringBuilder sb=new StringBuilder("abc");
		
		sb.append("edf"); //sb的值发生变化
		
		System.out.println("sb="+sb);
		
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
		
		//intern()方法返回字符串"abc"的实例，字符串池中只要一个实例。
		//s3和s4是不同的引用对象，地址不一样.
		//这是享元模式设计方法，共享一个相同对象，而不用再创造一个。
		//可以参考一下Effective Java(3 edition) 第一条 
		System.out.println("s3.intern()==s4.intern():"+(s3.intern()==s4.intern()));
		
		
		//看看Object的源代码
		Object o;
		
		//==一般比较两个引用类型，比较他们引用的对象是否指向同一个内存地址。
		//每一个类的实现equals的方法是不一样的
		//在object中==和equals就是一样的，基本数据类型与他们的包装及String都重写了equals()方法，是值相等，
		//例如StringBuilder的equals方法自己继承自 Object.
		
		  String str1="abc";   
		  String str2="def";   
		  //String str3=str1+str2;可以关注下，这句和下句str3的不同之处;
		  String str3="abc"+"def";
		  System.out.println("===========test5============");
		  System.out.println("(str3==\"abcdef\")"+(str3=="abcdef")); //false
		
		  StringBuffer sb10=new StringBuffer("123");
		  sb10.append("456");
		  System.out.println("sb10="+sb10);
		 
	}
}
