package com.house;

//javac src/main/App.java && java -cp src main.App
//clean the Java language server workspace?
import lombok.extern.slf4j.Slf4j;
import lombok.Getter;
import lombok.Setter;
import com.house.House.HouseMaker;
// package main;

@Slf4j
public class App implements Runnable {

	public static void main(String[] args) {
		var app = new App();
		app.run();
		// app.say_hello();
	}

	@Override
	public void run() {
		System.out.println("running App class");
		log.info("making house");
		createHouse(House.Facto);
		log.info(createHouse.getLivingroom().getDescription());
	}

	public void createHouse(final House.HouseMaker.HouseType type) {
		final HouseFactory houseFactory = House.HouseMaker.makeFactory(type);
		house.setLivingroom(houseFactory.createLivingroom());
		house.setKitchen(houseFactory.createKitchen());
		house.setBedroom(houseFactory.createBedroom());
	}

	public void say_hello() {
		System.out.println("hello");
	}
}