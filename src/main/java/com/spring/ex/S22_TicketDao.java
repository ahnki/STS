package com.spring.ex;

import org.springframework.jdbc.core.JdbcTemplate;

public class S22_TicketDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public S22_TicketDao() {
		System.out.println(template);
	}
	
	public void buyTicket(S22_TicketDto dto) {
		
	}
	
}
