package com.capgemini.airlinereservationsystem.service.impl;

import com.capgemini.airlinereservationsystem.dao.impl.AddTicketDetails;
import com.capgemini.airlinereservationsystem.dto.AddTicketDetailsBean;

public class AddTicketService {

	public static int checkTicket(int ticketId, int flightId, double price, int totalTickets, String status) {

		AddTicketDetailsBean addTicket = new AddTicketDetailsBean();
		
		addTicket.setTicketId(ticketId);
		addTicket.setFlightId(flightId);
		addTicket.setPrice(price);
		addTicket.setTotalTickets(totalTickets);
		addTicket.setStatus(status);
		
		int res = AddTicketDetails.addTicket();
		return res;
	}
}
