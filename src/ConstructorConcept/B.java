package ConstructorConcept;

public class B extends A	 {

	/*
	 * The 'super' keyword is used to access the parent class properties. In
	 * constructor, 'super' can be used only once. 'super' should be the first
	 * statement and it should be used within child class only.
	 */

	String name;

	public B() {
		System.out.println("Child class default constructor");
	}

	public B(int a, int b) {
		System.out.println("two para constructor of child class");
	}

	public B(int a) {
		this(10, 20);
		System.out.println("single para constructor of child class");
	}

	public B(String name) {
		super(10, 20);
		// System.out.println((super.name)); // accessing parent class variable by using
		// super keyword because, the variable name is same in child and parent class.
		System.out.println("Child class constructor");
		System.out.println((this.name = name));
	}

	public static void main(String[] args) {
		// B b = new B("Java");
		B b1 = new B(10);
		// B b2=new B();
	}
}