package com.capgemini.airlinereservationsystem.service.impl;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.airlinereservationsystem.dao.impl.FlightInformation;

public class FlightInformationService {

	static Logger log = new LogManager().getLogger("admin");
	
	public static String flightInfo() {
		String result = FlightInformation.flightInfo();
		return result;
	}
}
