package ConstructorConcept;

public class ConstructorConcept {

	String name;
	int age;

	public ConstructorConcept() {
		System.out.println("Default Constructor");
	}

	public ConstructorConcept(int i) {
		System.out.println("1 Parameter Constructor");
		System.out.println(i);
	}

	public ConstructorConcept(int i, int j) {
		System.out.println("2 Parameter Constructor");
		System.out.println(i + " " + j);
	}

	public ConstructorConcept(String name, int age) {
		this.age = age; // this.classvar = localvar
		this.name = name;

	}

	public static void main(String[] args) {

		ConstructorConcept c = new ConstructorConcept();
		ConstructorConcept c1 = new ConstructorConcept(10);
		ConstructorConcept c2 = new ConstructorConcept(10, 20);
		ConstructorConcept c3 = new ConstructorConcept("Tom", 20);
		System.out.println(c3.name);
		System.out.println(c3.age);
	}

}
