package com.house;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class House {
	private Livingroom livingroom;
	private Kitchen kitchen;
	private Bedroom bedroom;

	public static class FactoryMaker {
		public enum HouseType {
			Townhouse, Villa
		}

		/**
		 * makes a factory based on the house type
		 */
		public static HouseFactory makeFactory(HouseType type) {
			return switch (type) {
				case Townhouse -> new TownHouseFactory();
				case Villa -> new VillaFactory();
				default -> throw new IllegalArgumentException("HouseType not supported.");
			};
		}
	}
}
