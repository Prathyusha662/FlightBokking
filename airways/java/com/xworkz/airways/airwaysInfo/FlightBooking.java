package com.xworkz.airways.airwaysInfo;

import com.xworkz.airways.constants.AirplaneCode;
import com.xworkz.airways.constants.Company;
import com.xworkz.airways.constants.StartingArea;

public class FlightBooking {

	private int noOfSeats;
	private int domesticClassPrice;
	private int bussinessClassPrice;
	private int economyClassPrice;
	private AirplaneCode airplane = AirplaneCode.HYD123;
	private Company company = Company.DECCAN;
	private StartingArea area = StartingArea.HYD;
	String destiny[] = { "HYD", "MUMBAI", "BANGLORE", "AMERICA", "RUSSIA", "KOLKATTA" };

	public void destination() {
		for (int i = 0; i < destiny.length; i++) {
			System.out.println(" the destination places are" + destiny[i]);
		}
	}

	public void airplane() {
		System.out.println("thestarting point is" + this.airplane);
	}

	public void company() {
		System.out.println("the company name is" + this.company);
	}

	public void Startingpoint() {
		System.out.println(this.area);
	}

	public void priceOfClass(int price) {

		if (price == 1000) {
			System.out.println("the class of plane is domestic flights");

		}
		if (price == 2000) {
			System.out.println("the class is business");
		}
		if (price >= 5000) {
			System.out.println("the class is economic");
		}
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public int getDomesticClassPrice() {
		return domesticClassPrice;
	}

	public void setDomesticClassPrice(int domesticClassPrice) {
		this.domesticClassPrice = domesticClassPrice;
	}

	public int getBussinessClassPrice() {
		return bussinessClassPrice;
	}

	public void setBussinessClassPrice(int bussinessClassPrice) {
		this.bussinessClassPrice = bussinessClassPrice;
	}

	public int getEconomyClassPrice() {
		return economyClassPrice;
	}

	public void setEconomyClassPrice(int economyClassPrice) {
		this.economyClassPrice = economyClassPrice;

	}
}