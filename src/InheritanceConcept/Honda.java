package InheritanceConcept;

public class Honda extends Car {

//	Inheritance means one child class can inherits all the properties of one parent class or multiple parent interfaces.
//	If both the classes have common properties then, preference is always given to child class.
//	So, to access the common properties from parent class 'super' keyword is used.
//	One child class can have only one parent class but; one parent class can have multiple child classes.
//	The 'extends' keyword is used in child class to inherits the properties from parent class.
//	Inheritance is applicable for public & protected members only; private members can't be inherited.

	int a = 200;
	String s = "PHP";

	public static void main(String[] args) {

		System.out.println("In main method");
		int a = 11;
		Honda h = new Honda();
		System.out.println(a);
		System.out.println(h.a);
		System.out.println(h.s);
		h.start();
		h.stop();
		h.Car();
	}

	public void start() {
		System.out.println("Child class Honda: start method");
		System.out.println(super.a);
		super.start();
	}
}