package ConstructorConcept;

public class B extends A {

	public B() {
		super(10, 20);
		System.out.println("child class");
		System.out.println("Checking Conflict");
	}

	public static void main(String[] args) {
		B obj = new B();

	}

}
