package com.capgemini.airlinereservationsystem.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.airlinereservationsystem.service.impl.FlightInformationService;

public class FlightInformationController {

	static Logger log = new LogManager().getLogger("admin");

	public static void flightInfo() {

		log.info("Flight details\n");

		String result = FlightInformationService.flightInfo();
			log.info(result);
	}
}
