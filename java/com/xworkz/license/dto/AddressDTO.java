package com.xworkz.license.dto;

public class AddressDTO {
	
	private int houseNo;
	private String area;
	private int pinCode;
	private String city;
	private String state;
	private String landMark;
	
	public AddressDTO() {
		
		
	}
	
	
	public AddressDTO(int houseNo, String area, int pinCode, String city, String state, String landMark) {
		super();
		this.houseNo = houseNo;
		this.area = area;
		this.pinCode = pinCode;
		this.city = city;
		this.state = state;
		this.landMark = landMark;
	}


	@Override
	public String toString() {
		return "AddressDTO [houseNo=" + houseNo + ", area=" + area + ", pinCode=" + pinCode + ", city=" + city
				+ ", state=" + state + ", landMark=" + landMark + "]";
	}
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	
	
	
	
	

}
