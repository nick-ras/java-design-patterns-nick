package com.house;

public class TownhouseBedroom implements Bedroom {
	static final String DESCRIPTION = "This is a townhouse bedroom.";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
