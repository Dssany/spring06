package com.care.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.care.dto.TicketDTO;

public class TicketDAO {
	private JdbcTemplate template;
	
	public TicketDAO(JdbcTemplate template) {
		this.template = template;
	}
	
	public int[] buyTicket(TicketDTO dto) {
		String sql_user = "insert into userticket(id,ticketnum) values(?,?)";
		String sql_system = "insert into systemticket(id,ticketnum) values(?,?)";
		int arr[] = new int[2];
		try {
			arr[0] = template.update(sql_user,ps->{
				ps.setString(1, dto.getId());
				ps.setInt(2, dto.getTicketnum());
			});
			arr[1] = template.update(sql_system,ps->{
				ps.setString(1, dto.getId());
				ps.setInt(2, dto.getTicketnum());
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arr;
		
	}
}
