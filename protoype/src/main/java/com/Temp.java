package com;

@SuppressWarnings("unchecked")
public class Temp {
	public <T> String a(T input) {
		if (input instanceof String) {
			return "String";
		}
		if (input instanceof Integer) {
			return "Integer";
		}
		return "Unknown";
	}
}
