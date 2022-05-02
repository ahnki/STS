package com.spring.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class S22_HomeController {
	
	private S22_TicketDao dao;
	
	@Autowired
	public void setDao(S22_TicketDao dao) {
		this.dao = dao;
	}

	@RequestMapping("/s22_buyTicket")
	public String buyTicket() {
		System.out.println("buyTicket()");
		
		return "s22_buyTicket";
	}
	
	@RequestMapping("/s22_buyTicketCard")
	public String buyTicketCard(S22_TicketDto ticketDto, Model model) {
		
		System.out.println("S22_HomeController : buyTicketCard()");
		System.out.println("ticketDto : " + ticketDto.getConsumerId());
		System.out.println("ticketDto : " + ticketDto.getAmount());
		
		dao.buyTicket(ticketDto);
		
		model.addAttribute("ticketInfo", ticketDto);
		
		return "s22_buyTicketEnd";
	}
}
