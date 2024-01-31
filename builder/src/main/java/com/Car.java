package com;

public record Car(Model model, int year, float price) {

	private Car(Builder builder) {
		this(builder.model, builder.year, builder.price);
	}

	@Override
	public String toString() {
		var full_string = new StringBuilder();
		full_string.append("Model: " + model + "\n" + "\n" + "Year: "
				+ year + "\n" + "Price: " + price + "\n");

		return full_string.toString();
	}

	public static class Builder {
		private final Model model;
		private final int year;
		private float price;

		public Builder(Model model, int year) {
			if (model == null) {
				throw new IllegalArgumentException("Model");
			}
			this.model = model;
			this.year = year;
		}

		// optional
		public Builder price(float price) {
			this.price = price;
			return this;
		}

		// optional - if model is not in enum
		public Builder model_custom(String model_custom) {
			return this;
		}

		public Car build() {
			return new Car(this);
		}

	}
}