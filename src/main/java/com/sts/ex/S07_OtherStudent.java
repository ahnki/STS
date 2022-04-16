package com.sts.ex;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class S07_OtherStudent {

	private String name;
	private int age;

	public S07_OtherStudent(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@PostConstruct
	public void initMethod() {
		System.out.println("initMethod()");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("destroyMethod()");
	}
}
