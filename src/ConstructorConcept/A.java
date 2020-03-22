package ConstructorConcept;

public class A {

	String name="Selenium";
	public A() {
		System.out.println("Parent class constructor");
	}
	public A(int i) {
		System.out.println("Parent class constructor with value of i is: "+i);
	}
	public A(int a, int b) {
		System.out.println("Parent class constructor with value of a is: "+a);
		System.out.println("Parent class constructor with value of a is: "+b);
	}
}