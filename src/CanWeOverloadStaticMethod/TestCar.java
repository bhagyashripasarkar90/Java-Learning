package CanWeOverloadStaticMethod;

public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW();
		BMW.start();
		b.stop();
		b.Refuel();

	}

}
