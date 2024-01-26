package com.house;

public class VillaBedroom implements Bedroom {
	static final String DESCRIPTION = "This is a villa bedroom.";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
