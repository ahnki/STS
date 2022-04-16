package com.sts.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class S06_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cl = "classpath:s06_applicationCTX.xml";
		String cl1 = "classpath:s06_applicationCTX1.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(cl, cl1);
		
		System.out.println("S06_MainClass.java");
		System.out.println("========================");
		
		S06_Student student1 = ctx.getBean("student1", S06_Student.class);
		System.out.println(student1.getName());
		System.out.println(student1.getHobbys());
		
		S06_StudentInfo studentInfo = ctx.getBean("studentInfo1", S06_StudentInfo.class);
		S06_Student student2 =  studentInfo.getStudent();
		System.out.println(student2.getName());
		System.out.println(student2.getHobbys());
		
		if(student1.equals(student2)) {
			System.out.println("student1 == student2");
		}
		
		S06_Student student3 = ctx.getBean("student3", S06_Student.class);
		System.out.println(student3.getName());
		System.out.println(student3.getHobbys());
		
		if(student1.equals(student3)) {
			System.out.println("student1 == student3");
		} else {
			System.out.println("student1 != student3");
		}
		
		S06_Family family = ctx.getBean("family", S06_Family.class);
		System.out.println(family.getPapaName());
		System.out.println(family.getMamiName());
		System.out.println(family.getSisterName());
		System.out.println(family.getBrotherName());
		
		System.out.println("========================");
		
		ctx.close();
	}

}
