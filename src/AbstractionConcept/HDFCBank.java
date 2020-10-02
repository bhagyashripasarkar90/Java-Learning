package AbstractionConcept;

public class HDFCBank extends Bank {

	@Override
	public void loan() {
		System.out.println("HDFCBank -- Loan Method");
		
	}

	public void funds() {
		System.out.println("HDFCBank -- Fund");
	}
}
