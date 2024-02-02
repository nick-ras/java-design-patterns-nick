package com;

/**
 * mvn package && java -jar target/builder-1.0-SNAPSHOT.jar
 * 
 */

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		var factory = new FoodFactoryImpl(
				new MexicanFoodbox("Salsa"),
				new MexicanPlate("Vinaigrette"));

		
}
