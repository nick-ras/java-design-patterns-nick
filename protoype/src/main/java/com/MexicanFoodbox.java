package com;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class MexicanFoodbox extends Foodbox {

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
