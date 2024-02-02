package com.house;

//mvn clean install && java -jar target/abstract-factory-1.0-SNAPSHOT.jar 

// package main;

public class App implements Runnable {

	// either villa og townhouse factory created here, of which townhouse kitche,
	// livingroom and bedroom are created
	private final House house = new House();

	public House getHouse() {
		return house;
	}

	public static void main(String[] args) {
		var app = new App();
		app.run();
		// app.say_hello();
	}

	@Override
	public void run() {
		System.out.println("running App class");
		createHouse(House.FactoryMaker.HouseType.Townhouse);
		createHouse(House.FactoryMaker.HouseType.Villa);
		// log.info(createHouse.getLivingroom().getDescription());
	}

	// Factorymaker is a subclass of house
	public void createHouse(final House.FactoryMaker.HouseType type) {

		final HouseFactory houseFactory = House.FactoryMaker.makeFactory(type);

		house.setLivingroom(houseFactory.createLivingroom());
		house.setKitchen(houseFactory.createKitchen());
		house.setBedroom(houseFactory.createBedroom());
		System.out.println(house.getLivingroom().getDescription());
		System.out.println(house.getKitchen().getDescription());
		System.out.println(house.getBedroom().getDescription());
	}

	public void say_hello() {
		System.out.println("hello");
	}
}
