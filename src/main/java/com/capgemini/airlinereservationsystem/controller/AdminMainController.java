package com.capgemini.airlinereservationsystem.controller;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class AdminMainController {

	static Logger log = new LogManager().getLogger("admin");

	public static void checkFlight() {

		Scanner sc = new Scanner(System.in);

		log.info("Please Enter 1 to add flight details");
		log.info("Please Enter 2 to add ticket details");
		log.info("Please Enter 3 to update ticket price");
		log.info("Please Enter 4 to show all flights info");

		int option = sc.nextInt();

		switch (option) {
		case 1:
			AddFlightController.checkFlight();
			break;
		case 2:
			AddTicketController.checkTicket();
			break;
		case 3:
			changeTicketPriceController.checkPrice();
			break;
		case 4:
			FlightInformationController.flightInfo();
			break;
		default:
			break;
		}
	}
}
