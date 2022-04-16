package com.sts.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:s06_applicationCTX.xml")
public class S06_ApplicationCTX1 {

	@Bean
	public S06_Student student2() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("태권도");
		hobbys.add("요리");
		
		S06_Student student = new S06_Student("홍길순", 14, hobbys);
		student.setHeight(155);
		student.setWeight(45);
		
		return student;
	}
}
