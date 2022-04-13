package com.sts.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class S04_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String configLocation = "classpath:s04_applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		S04_MyInfo myInfo = ctx.getBean("s04_myInfo", S04_MyInfo.class);
		
		System.out.println("S04_MainClass");
		
		myInfo.getInfo();
		ctx.close();
	}
}
