package com.sts.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class S10_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:s10_applicationCTX.xml");
		
		System.out.println("S10_MainClass.java");
		System.out.println("================================");
		
		S09_Student student = ctx.getBean("student", S09_Student.class);
		student.getStudentInfo();
		
		S09_Worker worker = ctx.getBean("worker", S09_Worker.class);
		worker.getWorkerInfo();
		System.out.println("================================");
		
		ctx.close();
	}

}
