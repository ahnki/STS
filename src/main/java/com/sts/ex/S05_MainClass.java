package com.sts.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class S05_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String configLocation = "classpath:s05_applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		S05_StudentInfo si = ctx.getBean("studentInfo", S05_StudentInfo.class);
		System.out.println("S05_MainClass");
		System.out.println("=======================");
		si.getStudentInfo();
		
		S05_Student sd = ctx.getBean("student2", S05_Student.class);
		si.setStudent(sd);
		si.getStudentInfo();
		
		ctx.close();
	}

}
