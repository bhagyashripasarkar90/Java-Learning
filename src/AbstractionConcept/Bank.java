package AbstractionConcept;

public abstract class Bank {
	//Partial Abstractions
	//Abstraction means: Hiding the implementation logic
	int amt = 100;
	final int rate = 10;
	static int loanrate = 5;
	
	
	public abstract void loan();
	//non abstract method
	public void credit() {
		System.out.println("Bank -- Credit Method");
	}
	
	public void debit() {
		System.out.println("Bank -- Debit Method");
	}
	

}
