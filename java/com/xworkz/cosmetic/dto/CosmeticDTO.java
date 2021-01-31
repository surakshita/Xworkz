package com.xworkz.cosmetic.dto;

import com.xworkz.cosmetic.constants.CosmeticShades;
import com.xworkz.cosmetic.constants.CosmeticType;

public class CosmeticDTO implements Comparable<CosmeticDTO>{
	
	private String brand;
	private CosmeticShades shades;
	private CosmeticType cosmeticType;
	private double price;
	private int quanity;
	
	
	public CosmeticDTO(){
		
	}
	/**
	 * 
	 * @param brand
	 * @param shades
	 * @param cosmeticType
	 * @param price
	 * @param quanity
	 */

	public CosmeticDTO(String brand, CosmeticShades shades, CosmeticType cosmeticType, double price, int quanity) {
		super();
		this.brand = brand;
		this.shades = shades;
		this.cosmeticType = cosmeticType;
		this.price = price;
		this.quanity = quanity;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public CosmeticShades getShades() {
		return shades;
	}
	public void setShades(CosmeticShades shades) {
		this.shades = shades;
	}
	public CosmeticType getCosmeticType() {
		return cosmeticType;
	}
	public void setCosmeticType(CosmeticType cosmeticType) {
		this.cosmeticType = cosmeticType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuanity() {
		return quanity;
	}
	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}
	@Override
	public String toString() {
		return "CosmeticDTO [brand=" + brand + ", shades=" + shades + ", cosmeticType=" + cosmeticType + ", price="
				+ price + ", quanity=" + quanity + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(obj instanceof CosmeticDTO) {
			CosmeticDTO casted=(CosmeticDTO) obj;
			if(this.brand!=null && this.cosmeticType!=null ) {
				if(this.brand.equals(casted.getBrand()) && this.cosmeticType.equals(casted.cosmeticType)) {
					System.out.println("cosmetic dto is equal");
					return true;
				}
			}
		}
			System.out.println("cosmetic dto is not equal");
				return false;
	}
	@Override
	public int compareTo(CosmeticDTO arg) {
		
		if(this.quanity<arg.quanity) {
			return -1;
		}
		if(this.quanity==arg.quanity) {
			return 0;
		}
		if(this.quanity>arg.quanity) {
			return 1;
		}
		
		return 0;
	}
	
	
	
	
	
	
	
	

}
