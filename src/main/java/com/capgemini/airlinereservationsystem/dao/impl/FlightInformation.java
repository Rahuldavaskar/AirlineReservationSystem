package com.capgemini.airlinereservationsystem.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class FlightInformation {

	static Logger log = LogManager.getLogger("admin");

	public static String flightInfo() {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			String dburl = "jdbc:mysql://localhost:3306/airline_reservation_system_db";
			con = DriverManager.getConnection(dburl, "root", "root");

			String query = "select * from flight_details";
			stmt = con.createStatement();

			rs = stmt.executeQuery(query);
			String result = "";
			if (rs != null) {
				while (rs.next()) {

					result = rs.getInt("flight_id") + "\t\t" + rs.getString("flight_name") + "\t\t"
							+ rs.getString("source") + "\t\t" + rs.getString("destination") + "\t\t"
							+ rs.getTime("arrival_time") + "\t\t" + rs.getTime("departure_time");
				}
				return result;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return null;
	}
}