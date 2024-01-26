package com.house;

public class VillaLivingroom implements Livingroom {
	static final String DESCRIPTION = "This is a villa livingroom.";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
