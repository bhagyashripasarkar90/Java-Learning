package OOPConceptsPart2;

public class HSBCBank implements USBank, BrazilBank {

	@Override
	public void credit() {
		System.out.println("HSBC ---Credit");
		
	}

	@Override
	public void debit() {
		System.out.println("HSBC ---Debit");
		
	}

	@Override
	public void transferMoney() {
		System.out.println("HSBC ---TransferMoney");
		
	}
	
	public void carloan() {
		System.out.println("HSBC ---carloan");
		
	}

	public void educationloan() {
		System.out.println("HSBC ---Edu Loan");
	}

	@Override
	public void mutualFund() {
		System.out.println("HSBC ---Mutual Fund");
	}
}
