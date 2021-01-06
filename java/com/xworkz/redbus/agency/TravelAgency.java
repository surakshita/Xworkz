package com.xworkz.redbus.agency;

import com.xworkz.redbus.contract.RedbusContract;

public class TravelAgency {

	private RedbusContract contract;

	private String agencyName = new String("vrl travel agency");

	public TravelAgency(RedbusContract contract) {
		System.out.println("created travel agency");
		this.contract = contract;
	}

	public void accepBooking() {
		System.out.println("invoked booking");
		System.out.println("checking bookings for" + this.agencyName);
		boolean warranty = contract.busWarranty();
		if (warranty) {
			System.out.println("bus is under warranty");
			int min =  contract.minBooking();
			if (min > 0 && min <= 20) {
				System.out.println("booking can be done");
			} else {
				System.out.println("booking cannot be done");
			}
		} else {
			System.out.println("bus has no warranty");
		}
	}

}
