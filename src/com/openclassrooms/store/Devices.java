package com.openclassrooms.store;

public class Devices {
	private String brand;
	private double price;
	
	public Devices (String mBrand, double mPrice) {
		this.brand = mBrand;
		this.price = mPrice;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public double getPrice() {
		return price;
	}
}