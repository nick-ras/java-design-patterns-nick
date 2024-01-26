package com.house;

import lombok.Getter;
import lombok.Setter;
import com.house.TownHouseFactory;

@Getter
@Setter
public class House {
	private String livingroom;
	private String kitchen;
	private String bedroom;

	public static class FactoryMaker {
		public enum HouseType {
			Townhouse, Apartment
		}

		public static HouseFactory makeFactory(HouseType type) {
			return switch (type) {
				case Townhouse -> new TownHouseFactory();
				case Apartment -> new ApartmentFactory();
				default -> throw new IllegalArgumentException("HouseType not supported.");
			};
		}
	}
}