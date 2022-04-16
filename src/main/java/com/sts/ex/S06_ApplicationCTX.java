package com.sts.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class S06_ApplicationCTX {

	@Bean
	public S06_Student student1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("자전거");
		hobbys.add("등산");
		
		S06_Student student = new S06_Student("홍길동", 20, hobbys);
		student.setHeight(171);
		student.setWeight(69);
		
		return student;
	}
	
	@Bean
	public S06_Student student2() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("요리");
		hobbys.add("태권도");
		hobbys.add("수영");
		hobbys.add("컴퓨터");
		
		S06_Student student = new S06_Student("홍순자", 18, hobbys);
		student.setHeight(160);
		student.setWeight(48);
		
		return student;
	}
}
