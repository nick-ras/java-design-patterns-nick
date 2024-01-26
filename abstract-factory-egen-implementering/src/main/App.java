package main;

public class App implements Runnable {

	public void run(){
		System.out.println("running App class");
	}
	public static void main(String[] args) {
		var app = new App();
		app.run();
		// app.say_hello();
	}

	public void say_hello(){
		System.out.println("hello");
	}
}