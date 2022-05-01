package com.spring.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class S22_HomeController {

	@RequestMapping("/s22_buyTicket")
	public String buyTicket() {
		return "s22_buyTicket";
	}
	
	@RequestMapping("/s22_buyTicketCard")
	public String buyTicketCard(S22_TicketDto ticketDto, Model model) {
		
		System.out.println("S22_HomeController : buyTicketCard()");
		System.out.println("ticketDto : " + ticketDto.getConsumerId());
		System.out.println("ticketDto : " + ticketDto.getCountNum());
		
		return "s22_buyTicketEnd";
	}
}
