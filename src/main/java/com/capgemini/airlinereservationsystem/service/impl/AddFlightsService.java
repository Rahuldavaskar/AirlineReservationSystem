package com.capgemini.airlinereservationsystem.service.impl;

import java.sql.ResultSet;

import com.capgemini.airlinereservationsystem.dao.impl.AddFlightDetails;
import com.capgemini.airlinereservationsystem.dto.AddFlightDetailsBean;

public class AddFlightsService {

	public static int flightService(int flightId, String flightName, String source, String destination,
			String arrivalTime, String departureTime) {

		AddFlightDetailsBean add = new AddFlightDetailsBean();
		add.setFlightId(flightId);
		add.setFlightName(flightName);
		add.setSource(source);
		add.setDestination(destination);
		add.setArrivalTime(arrivalTime);
		add.setDepartureTime(departureTime);
		
		int res = AddFlightDetails.addFlight();
		return res;
	}
}
