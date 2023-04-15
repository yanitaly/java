package broCode;

public class Bike34 extends Vehicle34 {
	int wheels = 2;
	int pedals = 2;
	Bike34(){
		wheels = this.wheels;
		pedals = this.pedals;
	}
	
	void speed() {
		System.out.println("Bike goes slow.");
	}
	void go() {
		System.out.println("Bike is going.");
	}
}
