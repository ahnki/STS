package com.bbs.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class S17_BController {

	S17_BCommand command;
	
	@RequestMapping("/s17_list")
	public String list(Model model) {

		System.out.println("S17_BController : list()");
		command = new S17_BListCommand();
		command.execute(model);
		
		return "s17_list";
	}
	
	@RequestMapping("/s17_writeView")
	public String writeView(Model model) {
		
		System.out.println("S17_BController : writeView()");
		
		return "s17_writeView";
	}
	
	@RequestMapping("/s17_write")
	public String write(HttpServletRequest request, Model model) {
		System.out.println("S17_BController : write()");
		
		model.addAttribute("request", request);
		command = new S17_BWriteCommand();
		command.execute(model);
		
		return "redirect:s17_list";
	}
	
	@RequestMapping("/s17_contentView")
	public String contentView(HttpServletRequest request, Model model) {
		System.out.println("S17_BController : contentView()");
		
		model.addAttribute("request", request);
		command = new S17_BContentCommand();
		command.execute(model);
		
		return "s17_contentView";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/s17_modify")
	public String modify(HttpServletRequest request, Model model) {
		System.out.println("S17_BController : modify()");
		
		model.addAttribute("request", request);
		command = new S17_BModifyCommand();
		command.execute(model);
		
		return "redirect:s17_list";
	}
	
	@RequestMapping("/s17_replyView")
	public String replyView(HttpServletRequest request, Model model) {
		System.out.println("S17_BController : replyView()");
		
		model.addAttribute("request", request);
		command = new S17_BReplyViewCommand();
		command.execute(model);
		
		return "s17_replyView";
	}
	
	@RequestMapping("/s17_reply")
	public String reply(HttpServletRequest request, Model model) {
		System.out.println("S17_BController : reply()");
		
		model.addAttribute("request", request);
		command = new S17_BReplyCommand();
		command.execute(model);
		
		return "redirect:s17_list";
	}
	
	@RequestMapping("/s17_delete")
	public String delete(HttpServletRequest request, Model model) {
		System.out.println("S17_BController : delete()");
		
		model.addAttribute("request", request);
		command = new S17_BDeleteCommand();
		command.execute(model);
		
		return "redirect:s17_list";
	}
}
