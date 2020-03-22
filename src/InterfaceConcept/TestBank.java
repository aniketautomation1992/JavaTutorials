package InterfaceConcept;

public class TestBank {

//	In Java, the interface is used to achieve the concept of multiple inheritance. 
//	The 'interface' keyword is used to declare an Interface.
//	Interface can have only abstract methods & we don't need to write 'abstract' keyword.
//	100% abstraction is achieved in Interfaces.
//	Interface variables are by default static & final in nature.
//	Interface don't have constructors.
//	We can't create the object of interfaces but; the object of child class can be referred by the reference variable of interface.

	public static void main(String[] args) {

		HDFCBank obj = new HDFCBank();
		obj.carLoan();
		obj.homeLoan();
		System.out.println();
		obj.debit();
		obj.credit();
		System.out.println();
		obj.mutualFund();
		System.out.println();
		RBIBank r = new HDFCBank();
		r.carLoan();
		r.homeLoan();
		r.ee();
	}
}