package com;

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
