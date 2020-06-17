package com.care.service;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.ui.Model;

import com.care.dao.TicketDAO;

public class TicketServiceImpl implements TicketService{
	private TicketDAO dao;
	@Override
	public void execute(Model model) {
		String config = "classpath:applicationJDBC.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config);
		dao = ctx.getBean("dao",TicketDAO.class);
		
		
	}

}
