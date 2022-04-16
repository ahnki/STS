package com.sts.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class S08_MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(S08_ApplicationCTX.class);
		S08_AdminConnection2 connection = ctx.getBean("adminConfig", S08_AdminConnection2.class);
		
		System.out.println("S08_MainClass3.java");
		System.out.println("=============================");
		System.out.println("admin ID : " + connection.getAdminId());
		System.out.println("admin PW : " + connection.getAdminPw());
		System.out.println("sub admin ID : " + connection.getSub_adminId());
		System.out.println("sub admin PW : " + connection.getSub_adminPw());
		System.out.println("=============================");
		
		ctx.close();		
	}

}
