package com;

import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public abstract class Foodbox extends Prototype<Foodbox> {

	public Foodbox(Foodbox source) {
	}
}
