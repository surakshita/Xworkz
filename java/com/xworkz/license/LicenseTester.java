package com.xworkz.license;

import java.util.Date;

import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;
import com.xworkz.license.constants.IdProof;
import com.xworkz.license.constants.VehicleType;
import com.xworkz.license.dao.LicenseDAO;
import com.xworkz.license.dao.imp.LicenseDAOImp;
import com.xworkz.license.dto.AddressDTO;
import com.xworkz.license.dto.LicenseDTO;

public class LicenseTester {

	public static void main(String[] args) {
		
		AddressDTO addressDto=new AddressDTO(11,"Karuneshwar nagar",585102,"gulbarga","karnataka","near sanjana hospital");
		Date dob=new Date();


		LicenseDTO dto=new LicenseDTO("surakshita", 23, 9876543218L, dob, addressDto, Gender.FEMALE, BloodGroup.AB_NEGATIVE);
		dto.setDisability(false);
		dto.setIdProof(IdProof.ADDHAR);
		dto.setIdProofNo("6765 7676 7543");
		dto.setStartdate(new Date());
		dto.setVehicleType(VehicleType.TWO_WHEELER);
		
		LicenseDAO dao=new LicenseDAOImp();
		dao.save(dto);

	}

}
