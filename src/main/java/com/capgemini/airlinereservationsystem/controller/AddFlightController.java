package com.capgemini.airlinereservationsystem.controller;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.airlinereservationsystem.service.impl.AddFlightsService;

public class AddFlightController {

	static Logger log = new LogManager().getLogger("admin");

	public static void checkFlight() {

		Scanner scan = new Scanner(System.in);

		log.info("Please enter flight details\n");
		log.info("Flight ID: ");
		int flightId = scan.nextInt();
		log.info("Flight Name: ");
		String flightName = scan.next();
		log.info("Source: ");
		String source = scan.next();
		log.info("Destination: ");
		String destination = scan.next();
		log.info("Arrival Time");
		String arrivalTime = scan.next();
		log.info("Departure Time");
		String departureTime = scan.next();

		int res = AddFlightsService.flightService(flightId, flightName, source, destination, arrivalTime, departureTime);
		
		if(res != 0) {
			System.out.println("Flight successfully added");
		} else {
			System.out.println("oops.. check back with details");
		}
	}
}
