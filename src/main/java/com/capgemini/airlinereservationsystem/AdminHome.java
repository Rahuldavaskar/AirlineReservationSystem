package com.capgemini.airlinereservationsystem;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.airlinereservationsystem.controller.AdminMainController;
import com.capgemini.airlinereservationsystem.dao.impl.AddFlightDetails;
import com.capgemini.airlinereservationsystem.exception.InvalidOptionException;

public class AdminHome {

	static Logger log = LogManager.getLogger("admin");

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		log.info("Welcome to Davaskar Airlines...");
		log.info("\nMenu");
		log.info("Please Enter 1 to Admin");

		int option = scan.nextInt();

		switch (option) {
		case 1:
			AdminMainController.checkFlight();
			break;
		default:
			try {
				throw new InvalidOptionException();
			} catch (InvalidOptionException e) {
				log.info(e.getMessage());
			}
		}
	}
}
