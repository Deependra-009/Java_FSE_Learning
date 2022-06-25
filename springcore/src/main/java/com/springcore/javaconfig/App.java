package com.springcore.javaconfig;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Javaconfig.class);
		Student emp=context.getBean("getStudent",Student.class);
		System.out.println(emp);
		emp.study();
	}
}
