package com.mvc.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class S12_HomeController {

	@RequestMapping("/s12_view")
	public String view(Model model) {
		
		model.addAttribute("id", "abcdef");
		model.addAttribute("name", "홍길동");
		
		return "s12_view";
	}
	
	@RequestMapping("/s12_modelView")
	public ModelAndView modelView() {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("id", "zxcvbn123456!!");
		mv.addObject("name", "홍길순");
		mv.setViewName("s12_modelView");
		
		return mv;
	}
}
