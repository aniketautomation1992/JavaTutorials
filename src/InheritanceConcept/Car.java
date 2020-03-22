package InheritanceConcept;

public class Car {

	int a = 100;
	final String s = "Java";

	public void start() {
		System.out.println("Parent class Car: start method");
	}

	synchronized void stop() {
		System.out.println("Parent class Car: stop method");
	}

	public void Car() {
		System.out.println("Parent class Car: Method name can also be same as class name but; it's not a good practice because, in Java we starts the class name with Capital letters and method name with small letters.");
	}

	Car() {
		System.out.println("Parent constructor");
	}
}