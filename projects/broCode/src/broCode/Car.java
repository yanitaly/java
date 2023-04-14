package broCode;

public class Car {
	String make = "Fiat";
	String model = "Punto";
	String name = "Ning";
	int year = 2020;
	String color = "blue";
	double price = 50000.00;

	void drive() {
		System.out.println("You drive the car");
	}
	void brake() {
		System.out.println("You step on the brakes");
	}	
	
	public String toString() {
		return make+'\n'+model+'\n'+color+'\n'+year;
	}
}
