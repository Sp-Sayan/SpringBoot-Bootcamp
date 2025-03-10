package com.sayan;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//location of XML file
		String loc ="com/sayan/springconfig.XML";
		
		//we create a context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(loc);
		
		//we create an object of Student
		Student obj = (Student) context.getBean("sayan");
		
		obj.display();
		
	}

}
