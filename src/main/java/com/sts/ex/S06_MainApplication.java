package com.sts.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class S06_MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(S06_ApplicationCTX.class);
		
		System.out.println("S06_MainApplication.java");
		System.out.println("========================");
		S06_Student student1 = ctx.getBean("student1", S06_Student.class);
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		System.out.println(student1.getHobbys());
		System.out.println(student1.getHeight());
		System.out.println(student1.getWeight());
		
		S06_Student student2 = ctx.getBean("student2", S06_Student.class);
		System.out.println(student2.getName());
		System.out.println(student2.getAge());
		System.out.println(student2.getHobbys());
		System.out.println(student2.getHeight());
		System.out.println(student2.getWeight());
		System.out.println("========================");
		
		ctx.close();
	}

}
