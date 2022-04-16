package com.sts.ex;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class S08_MainClass4 {

	private final static String DEV_SERVER = "dev";
	private final static String RUN_SERVER = "run";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String config = null;
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		if(str.equals(DEV_SERVER)) {
			config = DEV_SERVER;
		} else if(str.equals(RUN_SERVER)) {
			config = RUN_SERVER;
		}
		
		scanner.close();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.load("s08_applicationCTX_dev.xml", "s08_applicationCTX_run.xml");
		S08_ServerInfo info = ctx.getBean("serverInfo", S08_ServerInfo.class);
		
		System.out.println("S08_MainClass4.java");
		System.out.println("===========================");
		System.out.println("ip : " + info.getIpNum());
		System.out.println("port : " + info.getPortNum());
		System.out.println("===========================");
		
		ctx.close();
	}

}
