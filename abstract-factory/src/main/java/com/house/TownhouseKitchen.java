package com.house;

public class TownhouseKitchen implements Kitchen {
	static final String DESCRIPTION = "This is a townhouse kitchen.";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
