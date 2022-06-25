package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.standalone.collections.Person;

public class App {
	
public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
		Student emp=context.getBean("student",Student.class);
		System.out.println(emp);
		
		
	}

}
