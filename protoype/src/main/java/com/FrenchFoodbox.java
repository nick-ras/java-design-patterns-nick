package com;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FrenchFoodbox extends FoodBox {

	private final String dressing;

	public FrenchFoodbox(FrenchFoodbox frenchFoodbox) {
		super(frenchFoodbox);
		this.dressing = frenchFoodbox.dressing;
	}

	public String toString() {
		return "FrenchFoodbox{" + "dressing='" + dressing + '\'' + '}';
	}
}
