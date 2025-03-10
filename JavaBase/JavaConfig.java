package com.sayan.JavaBase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Student myobj() {
		Student st = new Student();
		
		st.setName("sayan");
		st.setRoll(120);
		st.setResult(1.0f);
		
		return st;
	}
}
