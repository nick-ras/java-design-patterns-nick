package com;

public class FoodFactoryImpl implements FoodFactory {

	private final Foodbox foodbox;
	private final Plate plate;

	public FoodFactoryImpl(Foodbox foodbox, Plate plate) {
		this.foodbox = foodbox;
		this.plate = plate;
	}

	@Override
	public Foodbox createFoodbox() {
		return foodbox.copy();
	}

	@Override
	public Plate createPlate() {
		return plate.copy();
	}
}
