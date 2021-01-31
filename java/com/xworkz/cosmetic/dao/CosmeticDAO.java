package com.xworkz.cosmetic.dao;

import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public interface CosmeticDAO {

	boolean save(CosmeticDTO dto);

	boolean updatePriceAndQuantityByBrand(double price, int quanity, String brand);

	boolean updatePriceByBrandAndType(double price, String brand, CosmeticType type);

	//type is an enum its can't be updated boolean updateTypeByBrand(String brand, CosmeticType type);

	boolean deleteByBrand(String brand);

	void deleteAll();

	List<CosmeticDTO> getAll();

	int totalSize();

}
