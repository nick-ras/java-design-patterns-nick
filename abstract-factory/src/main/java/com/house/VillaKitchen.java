package com.house;

public class VillaKitchen implements Kitchen {
	static final String DESCRIPTION = "This is a villa kitchen.";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}