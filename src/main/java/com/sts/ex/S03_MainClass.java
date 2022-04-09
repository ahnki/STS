package com.sts.ex;
import org.springframework.context.support.Ab

public class S03_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String configLocation = "classpath:s03_applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		S03_Calculation calculation = ctx.getBean("s03_Calculation", S03_Calculation.class);
		
		calculation.add();
		calculation.sub();
		calculation.mul();
		calculation.div();

	}

}
