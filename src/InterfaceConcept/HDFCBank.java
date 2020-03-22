package InterfaceConcept;

public class HDFCBank implements USBank, RBIBank {

	@Override
	public void homeLoan() {
		System.out.println("HDFC - homeLoan");
	}

	@Override
	public void carLoan() {
		System.out.println("HDFC - carLoan");
	}

	@Override
	public void debit() {
		System.out.println("HDFC - debit");
	}

	@Override
	public void credit() {
		System.out.println("HDFC - credit");
	}

	public void mutualFund() {
		System.out.println("HDFC - mutualFund");
		System.out.println(minBal);
	}

	@Override
	public void ee() {
		System.out.println("abstract method");
	}
}