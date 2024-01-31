package com;

/**
 * mvn package && java -jar target/builder-1.0-SNAPSHOT.jar
 * 
 */

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Temp temp = new Temp();
		System.out.println(temp.a(1));

		var factory = new FoodFactoryImpl(new MexicanFoodbox("Salsa"), new FrenchFoodbox("Vinaigrette"));
	}
}
