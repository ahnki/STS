package com.sts.ex;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class S08_MainClass5 {

	private final static String DEV_SERVER = "dev";
	private final static String RUN_SERVER = "run";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String config = null;
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		
		if(str.equals(DEV_SERVER)){
			config = DEV_SERVER;
		} else if(str.equals(RUN_SERVER)) {
			config = RUN_SERVER;
		}
		
		scanner.close();
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.register(S08_ApplicationCTXDev.class, S08_ApplicationCTXRun.class);
		ctx.refresh();
		
		S08_ServerInfo info = ctx.getBean("serverInfo", S08_ServerInfo.class);
		
		System.out.println("S08_MainClass5.java");
		System.out.println("===========================");
		System.out.println("ip : " + info.getIpNum());
		System.out.println("port : " + info.getPortNum());
		System.out.println("===========================");
		
		ctx.close();
	}

}
