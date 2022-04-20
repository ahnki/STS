package com.mvc.ex;

import com.sts.ex.S14_StudentInfo;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class S14_HomeController {

	@RequestMapping("/s14_index")
	public String index() {
		return "s14_index";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/s14_student")
	public String goStudent(HttpServletRequest request, Model model) {
		System.out.println("S14_homeController.java");
		System.out.println("RequestMethod.GET");
		
		String id = request.getParameter("id");
		System.out.println("id : " + id);
		model.addAttribute("studentId", id);
		model.addAttribute("method", "GET");
		
		return "s14_student";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/s14_student")
	public ModelAndView goStudent(HttpServletRequest request) {
		System.out.println("S14_homeController.java");
		System.out.println("RequestMethod.POST");
		
		String id = request.getParameter("id");
		System.out.println("id : " + id);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("studentId", id);
		mv.addObject("method", "POST");
		mv.setViewName("s14_student");
		
		return mv;
	}
	
	@RequestMapping("/s14_home")
	public String home() {
		return "s14_home";
	}
	
	@RequestMapping("/s14_studentInfo")
	public String student(@ModelAttribute("si") S14_StudentInfo s05_StudentInfo) {
		System.out.println("student");
		return "s14_studentInfo";
	}
}
