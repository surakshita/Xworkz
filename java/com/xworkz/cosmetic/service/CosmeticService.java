package com.xworkz.cosmetic.service;

import com.xworkz.cosmetic.dto.CosmeticDTO;

public interface CosmeticService {
	
	boolean validateAndSave(CosmeticDTO cosmeticDTO);
	
	void deleteByBrand(String brand);
	
	int cosmeticsSize();

}
