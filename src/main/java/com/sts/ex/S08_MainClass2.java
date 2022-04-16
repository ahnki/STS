package com.sts.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class S08_MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String configLocation = "classpath:s08_applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		System.out.println("S08_MainClass2.java");
		S08_AdminConnection2 ad = ctx.getBean("ac", S08_AdminConnection2.class);
		System.out.println("admin ID : " + ad.getAdminId());
		System.out.println("admin PW : " + ad.getAdminPw());
		System.out.println("sub admin ID : " + ad.getSub_adminId());
		System.out.println("sub admin PW : " + ad.getSub_adminPw());
		
		ctx.close();
	}

}
