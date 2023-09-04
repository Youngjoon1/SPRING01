package com.care.di04;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.care.di03.DBClass;

public class MainClass {

	public static void main(String[] args) {

		String path="classpath:applicationCAR.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		Car car = ctx.getBean("car",Car.class);
		System.out.println("main ½ÇÇà");
		car.speed();
		System.out.println("---------------");
		
		SubClass sc = new SubClass();
		sc.print();
		
		
	}

}
