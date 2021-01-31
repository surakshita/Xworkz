package com.xworkz.cosmetic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticShades;
import com.xworkz.cosmetic.constants.CosmeticType;
//import com.xworkz.cosmetic.dao.CosmeticDAO;
//import com.xworkz.cosmetic.dao.CosmeticDAOImp;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticTester {

	public static void main(String[] args) {

		CosmeticDTO cosmeticDTO = new CosmeticDTO();
		cosmeticDTO.setBrand("mac");
		cosmeticDTO.setPrice(2000);
		cosmeticDTO.setCosmeticType(CosmeticType.PRIMER);
		cosmeticDTO.setQuanity(2);
		cosmeticDTO.setShades(CosmeticShades.NUDE);

		//CosmeticDAO dao = new CosmeticDAOImp();
		//dao.save(cosmeticDTO);
		System.out.println("************************************************");

		CosmeticDTO cosmeticDTO2 = new CosmeticDTO("maybelline", CosmeticShades.PINK, CosmeticType.LIPGLOSS, 49, 2);
		//dao.save(cosmeticDTO2);
		
		System.out.println("************************************************");
		
		//dao.updatePriceAndQuantityByBrand(2499, 6, "mac");
		
		System.out.println("************************************************");
		
		//dao.updatePriceByBrandAndType(3000, "mac", CosmeticType.PRIMER);
		
		System.out.println("************************************************");
		
		//dao.updateTypeByBrand("maybelline", CosmeticType.EYEBROW);
		
		//System.out.println("************************************************");
		
		//List<CosmeticDTO> dto3 = dao.getAll(); 
		List<CosmeticDTO> cosmeticDTOs=new ArrayList<CosmeticDTO>();
		cosmeticDTOs.add(cosmeticDTO);
		cosmeticDTOs.add(cosmeticDTO2);
		
		for (CosmeticDTO cosmeticDTO3 : cosmeticDTOs) {
			System.out.println(cosmeticDTO3.getBrand());
			
		}
		
		Collections.sort(cosmeticDTOs);
		
		for (CosmeticDTO cosmeticDTO3 : cosmeticDTOs) {
			System.out.println(cosmeticDTO3.getBrand());
		}
		
		System.out.println("************************************************");

		//System.out.println("all cosmetic:" + dto3);
		
		System.out.println("************************************************");

		//dao.totalSize();
		
		//dao.deleteByBrand("mac");
		// dao.deleteAll();

	}

}
