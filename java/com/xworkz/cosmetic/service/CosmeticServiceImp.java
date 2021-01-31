package com.xworkz.cosmetic.service;

import com.xworkz.cosmetic.constants.CosmeticShades;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticServiceImp implements CosmeticService {

	private CosmeticDAO cosmeticDAO;// private string company

	public CosmeticServiceImp(CosmeticDAO cosmeticDAO) {
		System.out.println("created cosmetic service imp");
		this.cosmeticDAO = cosmeticDAO;// this.company=company;
	}

	@Override
	public boolean validateAndSave(CosmeticDTO cosmeticDTO) {
		boolean validData = false;
		if (cosmeticDTO != null) {
			System.out.println("add to dto");
			String brand = cosmeticDTO.getBrand();
			if (brand != null && brand.length() >= 3 && !brand.isEmpty() && !brand.contains(" ")) {
				System.out.println("brand is valid");
				validData = true;
			} else {
				System.out.println("brand is invalid");
				validData = false;
			}

			if (validData) {
				CosmeticType type = cosmeticDTO.getCosmeticType();
				if (type != null) {
					System.out.println("type is valid");
					validData = true;
				} else {
					System.out.println("type is invalid, null");
					validData = false;
				}
			}
			if (validData) {
				CosmeticShades shade = cosmeticDTO.getShades();
				if (shade != null) {
					System.out.println("shade is valid");
					validData = true;
				} else {
					System.out.println("shade is invalid");
					validData = false;
				}
			}
			if (validData) {
				double price = cosmeticDTO.getPrice();
				if (price > 0) {
					System.out.println("price is valid");
					validData = true;
				} else {
					System.out.println("price is invalid");
					validData = false;
				}

			}
			if (validData) {
				int quantity = cosmeticDTO.getQuanity();
				if (quantity > 0 && quantity <= 100) {
					System.out.println("quantity is valid");
					validData = true;
				} else {
					System.out.println("quantity is invalid");
					validData = false;
				}
			}
			if (validData) {
				System.out.println("data is valid , can invoke dao");
				// CosmeticDAO cosmeticDAO=new CosmeticDAOImpl();
				cosmeticDAO.save(cosmeticDTO);
			}
		} else {
			System.out.println("dto is null, invalid data");

		}
		return false;
	}

	@Override
	public void deleteByBrand(String brand) {
		System.out.println("invoked delete By Brand");
		if (brand != null && !brand.isEmpty() && !brand.contains(" ") && brand.length() >= 3) {
			System.out.println("brand is valid can delete:" + brand);
			this.cosmeticDAO.deleteByBrand(brand);
		} else {
			System.out.println("brand not valid");
		}
	}

	@Override
	public int cosmeticsSize() {
		return this.cosmeticDAO.totalSize();
	}

}
