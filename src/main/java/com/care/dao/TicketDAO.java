package com.care.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class TicketDAO {
	private JdbcTemplate template;
	
	public TicketDAO(JdbcTemplate template) {
		this.template = template;
	}
}
