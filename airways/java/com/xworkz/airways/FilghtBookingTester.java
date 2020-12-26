package com.xworkz.airways;

import com.xworkz.airways.airwaysInfo.FlightBokking1;
import com.xworkz.airways.airwaysInfo.FlightBooking;
import com.xworkz.airways.airwaysInfo.FlightBooking2;

public class FilghtBookingTester {

	public static void main(String[] args) {
		FlightBooking flightBooking = new FlightBooking();

		flightBooking.airplane();
		flightBooking.company();
		flightBooking.Startingpoint();
		flightBooking.setBussinessClassPrice(1000);
		flightBooking.setDomesticClassPrice(2000);
		flightBooking.setEconomyClassPrice(50000);
		flightBooking.priceOfClass(5000);
		flightBooking.setNoOfSeats(100);
		flightBooking.destination();
		System.out.println(flightBooking.getBussinessClassPrice());
		System.out.println(flightBooking.getDomesticClassPrice());
		System.out.println(flightBooking.getEconomyClassPrice());
		System.out.println(flightBooking.getNoOfSeats());
		FlightBokking1 flightBokking1 = new FlightBokking1();
		flightBokking1.airplane();
		flightBokking1.company();
		flightBokking1.Startingpoint();
		flightBokking1.setBussinessClassPrice(1000);
		flightBokking1.setDomesticClassPrice(2000);
		flightBokking1.setEconomyClassPrice(50000);
		flightBokking1.priceOfClass(1000);
		flightBokking1.setNoOfSeats(99);
		System.out.println(flightBokking1.getBussinessClassPrice());
		System.out.println(flightBokking1.getDomesticClassPrice());
		System.out.println(flightBokking1.getEconomyClassPrice());
		System.out.println(flightBokking1.getNoOfSeats());
		FlightBooking2 flightBokking2 = new FlightBooking2();
		flightBokking2.airplane();
		flightBokking2.company();
		flightBokking2.Startingpoint();
		flightBokking2.setBussinessClassPrice(1000);
		flightBokking2.setDomesticClassPrice(2000);
		flightBokking2.setEconomyClassPrice(50000);
		flightBokking2.priceOfClass(1000);
		flightBokking2.setNoOfSeats(99);
		System.out.println(flightBokking2.getBussinessClassPrice());
		System.out.println(flightBokking2.getDomesticClassPrice());
		System.out.println(flightBokking2.getEconomyClassPrice());
		System.out.println(flightBokking2.getNoOfSeats());

	}
}
