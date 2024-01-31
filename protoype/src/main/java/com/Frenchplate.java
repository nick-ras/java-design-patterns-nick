package com;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Frenchplate extends Plate {

	private final String dressing;

	public Frenchplate(Frenchplate frenchplate) {
		super(frenchplate);
		this.dressing = frenchplate.dressing;
	}

	public String toString() {
		return "Frenchplate{" + "dressing='" + dressing + '\'' + '}';
	}
}
