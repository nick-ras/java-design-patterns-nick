package com;

//mvn clean install && java -jar target/abstract-factory-1.0-SNAPSHOT.jar 

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		var car = new Car.Builder(Model.ToyateCorolla, 1999).price(1000).build();
		System.out.println(car);
	}

}
