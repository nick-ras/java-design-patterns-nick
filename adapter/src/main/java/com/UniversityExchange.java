package com;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UniversityExchange implements University {

	private final OuterStateUniversity outerStateUniversity;

	public void startMath() {
		outerStateUniversity.startMath();
	}

}
