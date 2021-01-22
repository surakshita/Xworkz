package com.xworkz.license.dao.imp;

import com.xworkz.license.dao.LicenseDAO;
import com.xworkz.license.dto.LicenseDTO;

public class LicenseDAOImp implements LicenseDAO {

	@Override
	public void save(LicenseDTO dto) {
		
		System.out.println("license dao save is invokes:");
		System.out.println("save dto:"+dto);
		
	}

	
	
	

}
