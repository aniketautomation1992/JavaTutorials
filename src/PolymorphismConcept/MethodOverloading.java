package PolymorphismConcept;

public class MethodOverloading {

//	A class having multiple methods with same name but different argument list is called Method overloading. 
//	Method can be overloaded by 3 ways: 1) Number of parameters 2) Data type of parameters 3) Sequence of data type of parameters
//	'private', 'static' & 'final' methods can be overloaded.
//	Method overloading is an example of Static Polymorphism - Compile Time Polymorphism - Early Binding.

	public static void main(String[] args) {

		MethodOverloading mo = new MethodOverloading();
		mo.sum();
		mo.sum(99, 1);
		mo.sum(55, 'A');
		mo.sum('X', 20);
	}

	public void sum() {
		System.out.println("Method without parameters");
	}

	public void sum(int i, int j) {
		System.out.println("Method with number of parameters");
	}

	private static final void sum(int i, char j) {
		System.out.println("Method with different data type of parameters");
	}

	public void sum(char i, int j) {
		System.out.println("Method with sequence of different data type of parameters");
	}
}