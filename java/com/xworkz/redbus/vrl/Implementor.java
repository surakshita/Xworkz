package com.xworkz.redbus.vrl;

import com.xworkz.redbus.contract.RedbusContract;

public class Implementor implements RedbusContract{

	@Override
	public int minBooking() {
		System.out.println("minbooking");
		return 20;
	}

	@Override
	public boolean busWarranty() {
		System.out.println("buswarranty");
		return true;
	}
	
	
	

}
