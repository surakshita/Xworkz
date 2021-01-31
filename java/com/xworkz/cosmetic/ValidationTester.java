package com.xworkz.cosmetic;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticShades;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dao.CosmeticDAOImp;
import com.xworkz.cosmetic.dto.CosmeticDTO;
import com.xworkz.cosmetic.service.CosmeticService;
import com.xworkz.cosmetic.service.CosmeticServiceImp;

public class ValidationTester {

	public static void main(String[] args) {

//CosmeticDAO dao=new CosmeticDAOImp();
		CosmeticDTO cosmeticDTO = new CosmeticDTO();
		cosmeticDTO.setBrand("bobby brown");
		cosmeticDTO.setCosmeticType(CosmeticType.EYESHADOW);
		cosmeticDTO.setPrice(5000);
		cosmeticDTO.setQuanity(1);
		cosmeticDTO.setShades(CosmeticShades.METALLIC);

		// dao.save(null);

		List<CosmeticDTO> list = new LinkedList<CosmeticDTO>();

		CosmeticDAO dao = new CosmeticDAOImp(list);

		CosmeticService service = new CosmeticServiceImp(dao);

		service.validateAndSave(cosmeticDTO);

		CosmeticDTO cosmeticDTO2 = new CosmeticDTO("lakme", CosmeticShades.RED, CosmeticType.EYESHADOW, 300, 8);
		service.validateAndSave(cosmeticDTO2);
		System.out.println(service.cosmeticsSize());
		service.deleteByBrand("lakme");
		System.out.println(service.cosmeticsSize());
		System.out.println("linked list");

	}
}
