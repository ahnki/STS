package com.mvc.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class S13_HomeController {

	@RequestMapping("/member/s13_memberView")
	public String viewMember(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		 
		return "member/s13_memberView";
	}
	
	@RequestMapping("/member/s13_confirm")
	public String memberConfirm(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) {
		model.addAttribute("identify", id);
		model.addAttribute("password", pw);
		
		return "member/s13_confirm";
	}
	
	@RequestMapping("/s13_form")
	public String form() {
		return "s13_form";
	}
	
	@RequestMapping("/member/s13_formOk")
	public String join(S13_Member s13_Member) {
		return "member/s13_formOk";
	}
}
