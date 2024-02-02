package com;

/**
 * mvn package && java -jar target/builder-1.0-SNAPSHOT.jar
 * 
 */

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		var mexFactory = new FoodFactoryImpl(
				new MexicanFoodbox("Salsa"),
				new MexicanPlate("Vinaigrette"));
		var mexfoodbox = mexFactory.createFoodbox();
		System.out.println(mexfoodbox.toString());

		var frenchFactory = new FoodFactoryImpl(
				new FrenchFoodbox("Vinaigrette"),
				new Frenchplate("Vinaigrette"));
		var frenchplate = frenchFactory.createPlate();
		System.out.println(frenchplate.toString());
	}
}
