package com;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MexicanFoodbox extends FoodBox {

	private final String dressing;

	public MexicanFoodbox(MexicanFoodbox mexicanFoodbox) {
		super(mexicanFoodbox);
		this.dressing = mexicanFoodbox.dressing;
	}

	@Override
	public String toString() {
		return "MexicanFoodbox{" + "dressing='" + dressing + '\'' + '}';
	}
}
