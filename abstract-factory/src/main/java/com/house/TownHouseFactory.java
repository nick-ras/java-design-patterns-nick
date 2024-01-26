package com.house;

public class TownHouseFactory implements HouseFactory {

	@Override
	public Livingroom createLivingroom() {
		return new TownhouseLivingroom();
	}

	@Override
	public Kitchen createKitchen() {
		return new TownhouseKitchen();
	}

	@Override
	public Bedroom createBedroom() {
		return new TownhouseBedroom();
	}
}
