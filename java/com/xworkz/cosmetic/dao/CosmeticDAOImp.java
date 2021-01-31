package com.xworkz.cosmetic.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticDAOImp implements CosmeticDAO {

	private List<CosmeticDTO> cosmetic;

	public CosmeticDAOImp(List<CosmeticDTO> list) {
		this.cosmetic = new ArrayList<CosmeticDTO>();

	}

	@Override
	public boolean save(CosmeticDTO dto) {

		boolean added = false;
		// boolean contain = this.cosmetic.contains(dto);
		if (!this.cosmetic.contains(dto)) {
			added = this.cosmetic.add(dto);
		}
		if (added) {
			System.out.println("cosmetic added :" + dto);
			return true;
		} else {
			System.out.println("cosmetic not added");
		}

		return false;
	}

	@Override
	public boolean updatePriceAndQuantityByBrand(double price, int quanity, String brand) {
		System.out.println("invoked update price and quantity by brand");
		for (CosmeticDTO cosmeticDTO : this.cosmetic) {
			String brandFround = cosmeticDTO.getBrand();
			if (brandFround != null && brandFround.equals(brand)) {
				System.out.println("brand found,update");
				cosmeticDTO.setPrice(price);
				cosmeticDTO.setQuanity(quanity);
				System.out.println("updated:" + cosmeticDTO);
				return true;

			} else {
				System.out.println("brand not found");
				break;
			}

		}
		System.out.println("no element in list");
		return false;
	}

	@Override
	public boolean updatePriceByBrandAndType(double price, String brand, CosmeticType type) {
		System.out.println("invoked update price by brand and type");
		for (CosmeticDTO cosmeticDTO : this.cosmetic) {
			String brandFound = cosmeticDTO.getBrand();
			CosmeticType typeFound = cosmeticDTO.getCosmeticType();
			if (brandFound != null && typeFound != null && brandFound.equals(brand) && typeFound.equals(type)) {
				System.out.println("brand & type found update price");
				cosmeticDTO.setPrice(price);
				System.out.println("updated:" + cosmeticDTO);
				return true;
			}

			else {
				System.out.println("brand and type are not same");
				break;
			}
		}
		System.out.println("no element in list");
		return false;
	}

	/*@Override
	public boolean updateTypeByBrand(String brand, CosmeticType type) {
		System.out.println("invoked update type by brand");
		for (CosmeticDTO cosmeticDTO : this.cosmetic) {
			String brandFound = cosmeticDTO.getBrand();
			if (brandFound != null && brandFound.equals(brand)) {
				System.out.println("brand found,update type");
				cosmeticDTO.setCosmeticType(type);
				System.out.println("updated:" + cosmeticDTO);
				return true;

			} else {
				System.out.println("brand not found");
				break;
			}

		}
		System.out.println("no elements in list");
		return false;
	}*/

	@Override
	public boolean deleteByBrand(String brand) {
		System.out.println("delete by brand:");
		Iterator<CosmeticDTO> itr = this.cosmetic.iterator();
		while (itr.hasNext()) {
			CosmeticDTO dto = itr.next();
			if (dto.getBrand().equals(brand)) {
				System.out.println("brand found ,delete ");
				itr.remove();
				System.out.println("brand deleted");
				return true;
			} else {
				System.out.println("brand not found");
			}
		}
		return false;
	}

	@Override
	public void deleteAll() {

		this.cosmetic.clear();

	}

	@Override
	public List<CosmeticDTO> getAll() {
		for (CosmeticDTO cosmeticDTO : cosmetic) {
			System.out.println("list of cosmetic:" + cosmeticDTO);

		}
		return this.cosmetic;
	}

	@Override
	public int totalSize() {
		int size = this.cosmetic.size();
		System.out.println("size of list:" + size);
		return size;
	}

}
