package com.zoumf77.annotationdemo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestAuthorAnnotation {
	public static void main(String[] args){
		
		Class<?> clz=AuthorDemo.class;
		if (AuthorDemo.class.isAnnotationPresent(Author.class)){
			Author author=(Author)clz.getAnnotation(Author.class);
		
			System.out.println(author.name());
		}
		
		Method[] methods=AuthorDemo.class.getMethods();
		
		for(Method method:methods){
		
			if(method.isAnnotationPresent(Author.class)){
				Author author=(Author)method.getAnnotation(Author.class);
				System.out.println(author.name());
			}
		}
		
		Field[] fields=AuthorDemo.class.getFields();
		for(Field field:fields){
			if(field.isAnnotationPresent(Author.class)){
				Author author=(Author)field.getAnnotation(Author.class);
				System.out.println(author.name());
			}
		}
	}
}
