package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {
	
public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collections/config.xml");
		Person emp=(Person)context.getBean("person1");
		System.out.println(emp);
		
		
	}

}
