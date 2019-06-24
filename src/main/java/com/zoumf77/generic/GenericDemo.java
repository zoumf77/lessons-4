package com.zoumf77.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
	
	public static void main(String[] args){
		//作用1：编译时类型检查，类型安全，
		List list=new ArrayList();
		list.add("zmf");
		list.add(1234);
		
		List<Integer> list1=new ArrayList<>();
		//list1.add("zmf");
		list1.add(1234);
		
		Integer int1=list1.get(0);
		
		//作用2：减少cast数据类型转换
		List list2=new ArrayList<>();
		list2.add("zmf");
		String name=(String)list2.get(0);
		
	
		
		//作用3：便于我们写通用算法
		Print<Integer> p=new Print<>(5);
		p.print();
		
		/*泛型类型*/
		Print<String> p1 =new Print<>("zmf");
		p1.print();
		
		/*接口方法*/
		//Print.outprint(p1);
		//Print.outprint("origin");
		Print.outprint(new Integer(1));
		Print.outprint(new Double(0.2d));
		
		//边界例子
		GenericNumber<Integer> gNumber=new GenericNumber(2);
		//GenericNumber<String> gNumber1=new GenericNumber("2");
		
		
		//WildCardDemo.printNumber(dlist);//提示类型错,注意List<Number>和List<?>不是一样的。
		
		//放松对List<Number>或者list<Integer>或者List<Double>
		List<Double> dlist=new ArrayList<>();
		dlist.add(2.00d);
		dlist.add(2.12d);
		WildCardDemo.print(dlist);
		
		
		
		List<String> slist=new ArrayList<>();
		slist.add("zmf");
		slist.add("may");
		//WildCardDemo.print(list);
		
		
		List<Number> nlist=new ArrayList<>();
		nlist.add(1);
		nlist.add(9);
		System.out.println(WildCardDemo.sum(nlist));
		
		
		List<EvenNumber> le = new ArrayList<>();
		List<? extends NaturalNumber> ln = le;
	
		
		
	}
	
	

}
