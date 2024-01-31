package com;

/**
 * mvn package && java -jar target/builder-1.0-SNAPSHOT.jar
 * 
 */

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.currentTimeMillis();
		Temp temp = new Temp();
		System.out.println(temp.a());
		System.out.println(temp.a());
	}
}