package com.sayan.JavaBase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		//location of XML file
		String loc ="com/sayan/springconfig.XML";
		
		//we create a context
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		//we create an object of Student
		Student obj = (Student) context.getBean("myobj");
		
		obj.display();
		
	}

}
