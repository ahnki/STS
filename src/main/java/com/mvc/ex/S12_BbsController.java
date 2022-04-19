package com.mvc.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bbs")
public class S12_BbsController {

	@RequestMapping("/s12_list")
	public String list(Model model) {
		
		model.addAttribute("id", "ABCD");
		model.addAttribute("name", "홍길서");
		
		return "bbs/s12_list";
	}
	
	@RequestMapping("/s12_ModelAndView")
	public ModelAndView mv() {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("id", "ZXCVFDSA");
		mv.addObject("name", "홍길자");
		mv.setViewName("bbs/s12_ModelAndView");
		
		return mv;
	}
}
