package com;

public enum Model {
	Corolla, Golf, Partner, None;

	@Override
	public String toString() {
		return name().toLowerCase();
	}
}
