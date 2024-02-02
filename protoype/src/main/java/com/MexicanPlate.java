package com;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class MexicanPlate extends Plate {

	private final String dressing;

	public MexicanPlate(MexicanPlate mexicanPlate) {
		super(mexicanPlate);
		this.dressing = mexicanPlate.dressing;
	}

	public String toString() {
		return "MexicanPlate{" + "dressing='" + dressing + '\'' + '}';
	}
}
