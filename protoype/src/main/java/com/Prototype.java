package com;

import lombok.SneakyThrows;

@SuppressWarnings("unchecked")
public abstract class Prototype<T> implements Cloneable {

	@SneakyThrows
	public T copy() {
		return (T) super.clone();
	}
}
