package OOPConceptsPart2;

public class TestBank {

	public static void main(String[] args) {
		System.out.println(USBank.min_Bal);
		HSBCBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		b.carloan();
		b.educationloan();
		b.mutualFund();
		
		
		//Dynamic polymorphism_
		//USBank u = new HSBCBank();

	}

}
