package com.sts.ex;

import java.util.ArrayList;

public class S04_MyInfo {

	private String name;
	private double height;
	private double weight;
	private ArrayList<String> hobbys;
	private S04_BMICalculator s04_bmiCalculator;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public ArrayList<String> getHobbys() {
		return hobbys;
	}
	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}
	public S04_BMICalculator getS04_bmiCalculator() {
		return s04_bmiCalculator;
	}
	public void setS04_bmiCalculator(S04_BMICalculator s04_bmiCalculator) {
		this.s04_bmiCalculator = s04_bmiCalculator;
	}
	
	public void bmiCalculation() {
		s04_bmiCalculator.bmicalculation(weight, height);
	}
	
	public void getInfo() {
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("취미 : " + hobbys);
		bmiCalculation();
	}
}
