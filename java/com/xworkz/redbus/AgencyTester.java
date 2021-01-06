package com.xworkz.redbus;

import com.xworkz.redbus.agency.TravelAgency;
import com.xworkz.redbus.contract.RedbusContract;
import com.xworkz.redbus.vrl.Implementor;

public class AgencyTester {

	public static void main(String[] args) {
		RedbusContract contract=new Implementor();
		TravelAgency agency=new TravelAgency(contract);
		agency.accepBooking();
	}

}
