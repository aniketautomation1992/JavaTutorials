package PolymorphismConcept;

public class BMW extends Car {

//	A child class & parent class having methods with same name & same argument list is called as Method overriding. 
//	The purpose of overrring a method is that, a child class can give it's own implementation to a method without modifying the parent class code.
//	While overriding a method, the number of arguments, data type & sequence of data type should exactly match with overridden method.
//	private, static & final methods can't be overridden.
//	A child class object which is referred by parent class object reference variable can access only common methods of child class.
//	Method overriding is an example of Dynamic Polymorphism - Run Time Polymorphism - Late Binding.

	public void start() {
		System.out.println("BMW can start");
//		Using super keyword to access parent class method.
//		super.start();
	}

	public void safety() {
		System.out.println("BMW provides safety");
	}

	public static void main(String[] args) {

		System.out.println("Main method");

		BMW b = new BMW();
//		Here preference is given to child class
//		b.start();
//		b.safety();
//		Calling parent class method by using child class object reference variable
		b.stop();

		Car c = new Car();
//		Calling parent class method by using parent class object reference variable
		c.start();

		Car c1 = new BMW();
//		Calling child class method by using parent class object reference variable & child class object
		c1.start();
//		Calling parent class method by using parent class object reference variable & child class object
		c1.stop();
	}
}