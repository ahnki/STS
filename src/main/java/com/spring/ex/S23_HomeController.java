package com.spring.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class S23_HomeController {
	
	private S23_TicketDao dao2;
	
	@Autowired
	public void setDao(S23_TicketDao dao2) {
		this.dao2 = dao2;
	}

	@RequestMapping("/s23_buyTicket")
	public String buyTicket() {
		System.out.println("S23_HomeController : buyTicket()");
		
		return "s23_buyTicket";
	}
	
	@RequestMapping("/s23_buyTicketCard")
	public String buyTicketCard(S22_TicketDto ticketDto, Model model) {
		
		System.out.println("S23_HomeController : buyTicketCard()");
		System.out.println("ticketDto : " + ticketDto.getConsumerId());
		System.out.println("ticketDto : " + ticketDto.getAmount());
		
		dao2.buyTicket(ticketDto);
		
		model.addAttribute("ticketInfo", ticketDto);
		
		return "s23_buyTicketEnd";
	}
}
