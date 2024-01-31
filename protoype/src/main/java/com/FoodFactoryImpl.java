package com;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FoodFactoryImpl implements FoodFactory {

	private final FoodBox foodbox;
	private final Plate plate;

	// public FoodFactoryImpl(FoodBox foodbox, Plate plate) {
	// this.foodbox = foodFactoryImpl.foodbox;
	// this.plate = foodFactoryImpl.plate;
	// }

	@Override
	public FoodBox createFoodbox() {
		return foodbox.copy();
	}

	@Override
	public Plate createPlate() {
		return plate.copy();
	}
}
