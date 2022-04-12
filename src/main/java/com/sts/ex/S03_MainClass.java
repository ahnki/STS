package com.sts.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class S03_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String configLocation = "classpath:s03_applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		S03_Calculation calculation = ctx.getBean("s03_Calculation", S03_Calculation.class);
		
		System.out.println("S03_MainClass");
		
		calculation.add();
		calculation.sub();
		calculation.mul();
		calculation.div();		
	}

}
