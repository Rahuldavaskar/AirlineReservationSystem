package com.capgemini.airlinereservationsystem;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.airlinereservationsystem.dao.impl.AddFlightDetails;
import com.capgemini.airlinereservationsystem.dao.impl.AddTicketDetails;
import com.capgemini.airlinereservationsystem.dao.impl.ChangeTicketPrice;
import com.capgemini.airlinereservationsystem.dao.impl.FlightInformation;
import com.capgemini.airlinereservationsystem.dto.AddTicketDetailsBean;

/**
 * Hello world!
 *
 */
public class App 
{
	static Logger log = new LogManager().getLogger("admin");
	
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	//FlightInformation.flightInfo();
    	ChangeTicketPrice.changeTicketPrice();
    	
//    	System.out.println("Enter the details");
//    	AddTicketDetailsBean add = new AddTicketDetailsBean();
//    	log.info("Ticket ID: ");
//    	add.setTicket_id(sc.nextInt());
//    	log.info("Flight ID: ");
//    	add.setFlight_id(sc.nextInt());
//    	log.info("Price: ");
//    	add.setPrice(sc.nextInt());
//    	log.info("Status: ");
//    	add.setStatus(sc.next());
//    	log.info("Total Tickets: ");
//    	add.setTotal_tickets(sc.nextInt());
//    	System.out.println(add.getStatus());
//        
//    	AddTicketDetails.addTicket();
    	
    }
}
