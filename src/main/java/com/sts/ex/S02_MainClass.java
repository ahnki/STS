package com.sts.ex;

public class S02_MainClass {

	public S02_MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		S02_Calculation cal = new S02_Calculation();
		cal.setFirstNum(10);
		cal.setSecondNum(2);
		
		cal.add();
		cal.sub();
		cal.multi();
		cal.divide();
	}

}
