package ConstructorConcept;

public class B extends A {

	public B() {
		super(10, 20);
		System.out.println("Checking conflict for feature2");
		System.out.println("child class");
	}

	public static void main(String[] args) {
		B obj = new B();
		System.out.println("Checking conflict for feature2");
	}

}
