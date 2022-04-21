package com.mvc.ex;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class S15_StudentValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub

		System.out.println("validate()");
		S15_Student student = (S15_Student)target;
		
		String studentName = student.getName();
		if(studentName == null || studentName.trim().isEmpty()) {
			System.out.println("studentName is null or empty");
			errors.rejectValue("name", "name is null or empty.");
		}
		
		int studentId = student.getId();
		if(studentId <= 0) {
			System.out.println("studentId is below 0");
			errors.rejectValue("id", "id is trouble.");
		}
	}

}
