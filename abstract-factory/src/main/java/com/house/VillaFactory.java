package com.house;

public class VillaFactory implements HouseFactory {

	@Override
	public Livingroom createLivingroom() {
		return new VillaLivingroom();
	}

	@Override
	public Kitchen createKitchen() {
		return new VillaKitchen();
	}

	@Override
	public Bedroom createBedroom() {
		return new VillaBedroom();
	}
}
