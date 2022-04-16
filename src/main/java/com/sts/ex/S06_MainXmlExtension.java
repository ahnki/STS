package com.sts.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class S06_MainXmlExtension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cl = "classpath:s06_applicationCTX2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(cl);
		
		System.out.println("S06_MainXmlExtension.java");
		System.out.println("========================");
		
		S06_Student student1 = ctx.getBean("student1", S06_Student.class);
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		System.out.println(student1.getHobbys());
		System.out.println(student1.getHeight());
		System.out.println(student1.getWeight());
		System.out.println();
		
		S06_Student student2 = ctx.getBean("student2", S06_Student.class);
		System.out.println(student2.getName());
		System.out.println(student2.getAge());
		System.out.println(student2.getHobbys());
		System.out.println(student2.getHeight());
		System.out.println(student2.getWeight());
		System.out.println();
		
		S06_Student student3 = ctx.getBean("student3", S06_Student.class);
		System.out.println(student3.getName());
		System.out.println(student3.getAge());
		System.out.println(student3.getHobbys());
		System.out.println(student3.getHeight());
		System.out.println(student3.getWeight());
		
		
		System.out.println("========================");
		
		ctx.close();
	}

}
