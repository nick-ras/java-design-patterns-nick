package com;

public enum Model {
	ToyateCorolla, VolkswagenGolf, PeugeotPartner, None;

	@Override
	public String toString() {
		return name().toLowerCase();
	}
}
