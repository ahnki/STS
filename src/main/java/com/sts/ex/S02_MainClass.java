package com.sts.ex;

public class S02_MainClass {

	public static void main(String[] args) {

		S02_Calculation cal = new S02_Calculation();
		cal.setFirstNum(10);
		cal.setSecondNum(2);
		
		cal.add();
		cal.sub();
		cal.multi();
		cal.divide();
	}

}
