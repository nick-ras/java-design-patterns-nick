package com.house;

public class TownhouseLivingroom implements Livingroom {
	static final String DESCRIPTION = "This is a townhouse livingroom.";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
