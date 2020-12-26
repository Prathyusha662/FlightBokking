package com.xworkz.airways.airwaysInfo;

import com.xworkz.airways.constants.AirplaneCode;
import com.xworkz.airways.constants.Company;
import com.xworkz.airways.constants.StartingArea;

public class FlightBooking2 extends FlightBooking {
	private AirplaneCode airplane = AirplaneCode.KVC001;
	private Company company = Company.SPICEJET;
	private StartingArea area = StartingArea.KOLKATTA;

	public void airplane() {
		System.out.println("thestarting point is" + this.airplane);
	}

	public void company() {
		System.out.println("the company name is" + this.company);
	}

	public void Startingpoint() {
		System.out.println(" the startring ponit is" + this.area);
	}
}
