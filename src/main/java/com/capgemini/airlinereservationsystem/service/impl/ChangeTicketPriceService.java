package com.capgemini.airlinereservationsystem.service.impl;

import com.capgemini.airlinereservationsystem.dao.impl.ChangeTicketPrice;
import com.capgemini.airlinereservationsystem.dto.ChangeTicketPriceBean;

public class ChangeTicketPriceService {

	public static int changePrice(double newPrice, int ticketId, int flightId) {
		
		ChangeTicketPriceBean change = new ChangeTicketPriceBean();
		change.setNewPrice(newPrice);
		change.setTicketId(ticketId);
		change.setFlight_id(flightId);
		
		int res = ChangeTicketPrice.changeTicketPrice();
		return res;
	}
}
