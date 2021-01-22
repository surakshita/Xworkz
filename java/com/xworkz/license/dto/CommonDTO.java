package com.xworkz.license.dto;

import java.util.Date;

import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;

public class CommonDTO {
	
	private String name;
	private int age;
	private long mobileNo;
	private Date dob;
	private AddressDTO addressDto;
	private Gender gender;
	private BloodGroup bloodGroup;
	
	public CommonDTO() {
		
	}

	public CommonDTO(String name, int age, long mobileNo, Date dob,AddressDTO addressDto,  Gender gender,
			BloodGroup bloodGroup) {
		super();
		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.addressDto = addressDto;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		
	}

	@Override
	public String toString() {
		return "CommonDTO [name=" + name + ", age=" + age + ", mobileNo=" + mobileNo + ", dob=" + dob + ", addressDto="
				+ addressDto + ", gender=" + gender + ", bloodGroup=" + bloodGroup + "]";
	}
	

	
}
