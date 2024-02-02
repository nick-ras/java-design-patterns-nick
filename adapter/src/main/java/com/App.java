package com;

//mvn clean package && java -jar target/adapter-1.0-SNAPSHOT.jar
//univesrity student going to another school, 

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		var innerstate = new UniversityCourse();
		innerstate.startMath();

		var outerstate = new UniversityExchange(new OuterStateUniversity());
		outerstate.startMath();

	}

}