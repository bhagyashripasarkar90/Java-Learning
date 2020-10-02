package OOPConceptsPart2;

public class TestCar {

	public static void main(String[] args) {
		//when method present in parent class as well as in child class with same number of argument is called as method overriding
		BMW b = new BMW();
		b.start();//Preference will be given to overridden methods
		b.stop();
		b.refill();
		b.theftSafety();
		b.engine();
		b.engine();
		System.out.println("************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refill();
		c.engine();
		
		System.out.println("************");
		
		Car c1 = new BMW(); //child class object can be refered by parent class refernce variable it is called as Dynamic polymorphism/or run time polymorphism
		c1.start();
		c1.stop();
		c1.refill();
		c1.engine();
		

	}

}
