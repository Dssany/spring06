package com.care.transaction_ex01;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.dto.TicketDTO;
import com.care.service.TicketService;
import com.care.service.TicketServiceImpl;



@Controller
public class HomeController {
	private TicketService ts;
	
	@RequestMapping("/buy_ticket")
	public String buy_ticket() {
		return "buy_ticket";
	}
	
	@RequestMapping("buy_ticket_card")
	public String buy_ticket_card(TicketDTO dto, Model model) {
		ts = new TicketServiceImpl();
		model.addAttribute("dto",dto);
		ts.execute(model);
		return "buy_ticket_end";
	}
	
}
