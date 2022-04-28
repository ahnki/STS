package com.spring.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class S21_BController {

	S21_BCommand command;
	
	public JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		S21_Constant.template = this.template;
	}

	@RequestMapping("/s21_list")
	public String list(Model model) {

		System.out.println("S21_BController : list()");
		command = new S21_BListCommand();
		command.execute(model);
		
		return "s21_list";
	}
	
	@RequestMapping("/s21_writeView")
	public String writeView(Model model) {
		
		System.out.println("S21_BController : writeView()");
		
		return "s21_writeView";
	}
	
	@RequestMapping("/s21_write")
	public String write(HttpServletRequest request, Model model) {
		System.out.println("S21_BController : write()");
		
		model.addAttribute("request", request);
		command = new S21_BWriteCommand();
		command.execute(model);
		
		return "redirect:s21_list";
	}
	
	@RequestMapping("/s21_contentView")
	public String contentView(HttpServletRequest request, Model model) {
		System.out.println("S21_BController : contentView()");
		
		model.addAttribute("request", request);
		command = new S21_BContentCommand();
		command.execute(model);
		
		return "s21_contentView";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/s21_modify")
	public String modify(HttpServletRequest request, Model model) {
		System.out.println("S21_BController : modify()");
		
		model.addAttribute("request", request);
		command = new S21_BModifyCommand();
		command.execute(model);
		
		return "redirect:s21_list";
	}
	
	@RequestMapping("/s21_replyView")
	public String replyView(HttpServletRequest request, Model model) {
		System.out.println("S21_BController : replyView()");
		
		model.addAttribute("request", request);
		command = new S21_BReplyViewCommand();
		command.execute(model);
		
		return "s21_replyView";
	}
	
	@RequestMapping("/s21_reply")
	public String reply(HttpServletRequest request, Model model) {
		System.out.println("S21_BController : reply()");
		
		model.addAttribute("request", request);
		command = new S21_BReplyCommand();
		command.execute(model);
		
		return "redirect:s21_list";
	}
	
	@RequestMapping("/s21_delete")
	public String delete(HttpServletRequest request, Model model) {
		System.out.println("S21_BController : delete()");
		
		model.addAttribute("request", request);
		command = new S21_BDeleteCommand();
		command.execute(model);
		
		return "redirect:s21_list";
	}
}
