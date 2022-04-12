package com.sts.ex;

public class S03_Calculation {

	public S03_Calculator s03_Calculator;
	private int firstNum;
	private int secondNum;
	
	public S03_Calculator getS03_Calculator() {
		return s03_Calculator;
	}
	public void setS03_Calculator(S03_Calculator s03_Calculator) {
		this.s03_Calculator = s03_Calculator;
	}
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public void add() {
		s03_Calculator.addition(firstNum, secondNum);
	}
	
	public void sub() {
		s03_Calculator.subtraction(firstNum, secondNum);
	}

	public void mul() {
		s03_Calculator.multiplication(firstNum, secondNum);
	}
	
	public void div() {
		s03_Calculator.division(firstNum, secondNum);
	}
}
