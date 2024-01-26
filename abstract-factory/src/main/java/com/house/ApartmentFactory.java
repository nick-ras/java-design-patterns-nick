package com.house;

public class ApartmentFactory implements HouseFactory {

	@Override
	public Livingroom createLivingroom() {
		return new ApartmentLivingroom();
	}

	@Override
	public Kitchen createKitchen() {
		return new ApartmentKitchen();
	}

	@Override
	public Bedroom createBedroom() {
		return new ApartmentBedroom();
	}
}
