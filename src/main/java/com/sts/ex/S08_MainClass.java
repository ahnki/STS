package com.sts.ex;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class S08_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		MutablePropertySources ps = env.getPropertySources();
		
		System.out.println("S08_MainClass.java");
		
		try {
			ps.addLast(new ResourcePropertySource("classpath:s08_admin.properties"));
			
			System.out.println(env.getProperty("admin.id"));
			System.out.println(env.getProperty("admin.pw"));
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("io exception!!");
			e.setStackTrace(null);
		}
		
		GenericXmlApplicationContext gCtx = (GenericXmlApplicationContext)ctx;
		gCtx.load("s08_applicationCTX.xml");
		gCtx.refresh();
		
		S08_AdminConnection ac = gCtx.getBean("adminConnection", S08_AdminConnection.class);
		System.out.println("admin ID : " + ac.getAdminId());
		System.out.println("admin PW : " + ac.getAdminPw());
		
		gCtx.close();
		ctx.close();
	}

}
