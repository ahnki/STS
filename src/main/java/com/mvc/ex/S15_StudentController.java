package com.mvc.ex;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class S15_StudentController {

	@RequestMapping("/studentForm")
	public String studentForm() {
		return "s15_createPage";
	}
	
	@RequestMapping("/s15_studentCreate")
	public String studentCreate(@ModelAttribute("student") S15_Student s15_Student, BindingResult result) {
		String page = "s15_createDonePage";
		
		S15_StudentValidator validator = new S15_StudentValidator();
		
		validator.validate(s15_Student, result);
		if(result.hasErrors()) {
			System.out.println("studentCreate[name] : " + result.getFieldValue("name"));
			System.out.println("studentCreate[id] : " + result.getFieldValue("id"));
			page = "s15_createPage";
		}
		
		return page;
	}
}
