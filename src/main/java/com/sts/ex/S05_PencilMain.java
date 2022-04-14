package com.sts.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class S05_PencilMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cl = "classpath:S05_applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(cl);
		S05_Pencil pencil = ctx.getBean("pencil", S05_Pencil.class);
		
		System.out.println("S05_PencilMain.java");
		pencil.use();
		
		ctx.close();
	}

}
