package com.capgemini.airlinereservationsystem.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.capgemini.airlinereservationsystem.dto.AddFlightDetailsBean;

public class AddFlightDetails {

	public static int addFlight() {

		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			String dburl = "jdbc:mysql://localhost:3306/airline_reservation_system_db";
			con = DriverManager.getConnection(dburl, "root", "root");

			String query = "insert into flight_details values(?,?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, AddFlightDetailsBean.getFlightId());
			pstmt.setString(2, AddFlightDetailsBean.getFlightName());
			pstmt.setString(3, AddFlightDetailsBean.getSource());
			pstmt.setString(4, AddFlightDetailsBean.getDestination());
			pstmt.setString(5, AddFlightDetailsBean.getArrivalTime());
			pstmt.setString(6, AddFlightDetailsBean.getDepartureTime());

			int res = pstmt.executeUpdate();
			return res;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return 0;
	}
}
