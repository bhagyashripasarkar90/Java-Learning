package ConstructorConcept;

public class Car {

	String name, engine;
	int price;

	public Car(String name, int price, String engine) {
		this.engine = engine;
		this.name = name;
		this.price = price;

	}

	public static void main(String[] args) {

		Car c = new Car("BMW", 10, "Auto");
		Car c1 = new Car("Audi", 20, "Auto");
		Car c2 = new Car("Hond", 5, "Auto");
		System.out.println(c.engine + " " + c.name + " " + c.price);
		System.out.println(c.engine + " " + c1.name + " " + c1.price);
		System.out.println(c.engine + " " + c2.name + " " + c2.price);
	}

}
