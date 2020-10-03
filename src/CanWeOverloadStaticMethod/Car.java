package CanWeOverloadStaticMethod;

public class Car {
	public static void start() {
		System.out.println("Car -- start");
		
	}
	public void stop() {
		System.out.println("Car --Stop");
	}
	public void Refuel() {
		System.out.println("Car --Refuel");
	}
}
