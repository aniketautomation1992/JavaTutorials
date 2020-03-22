package ConstructorConcept;

public class ConstructorOverloading {

//	When we create a class that time a default constructor which is always hidden, gets created.
//	When we create a new object of a class that time this default constructor gets called.
//	The purpose of the constructor is to initialize the object & class properties.
//	Constructor has the same name as class name
//	Constructor looks like a method but; it's not a method because, it won't return any value.
//	Constructor can be public, private & proteted but; can't be static, final, abstract & synchronized.
//	The 'this' keyword is used to access the child class properties.
//	The 'super' keyword is used to access the parent class properties.
//	super should be the first statement and it should be used within child class only.
//	In constructor, 'super' can be used only once but; 'this' can be used for so many times.
//	One constructor can call another constructor by using 'this' keyword but; it should be the first statement.
//	We can use 'super' & 'this' together in one constructor but there are two conditions:
//	1) super should be the first statement
//	2) this should be used only for accesing the class properties but not for calling another constructor.
//	Constructors can be overloaded.
//	Interfaces do not have constructors.
//	Always parent class constructor gets called before child class constructor.
//	Types of constructors: 1) Default	2) Parameterized 

	public ConstructorOverloading() {
		System.out.println("Default Constructor");
	}

	public ConstructorOverloading(int i) {
		System.out.println("One param Constructor");
		System.out.println("The value of i is:"+i);
	}

	public ConstructorOverloading(int a, int b) {
		System.out.println("Two param Constructor");
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+b);
	}

	public static void main(String[] args) {

		System.out.println("Inside main method.");
		ConstructorOverloading c1=new ConstructorOverloading();
		ConstructorOverloading c2=new ConstructorOverloading(10);
		ConstructorOverloading c3=new ConstructorOverloading(20, 30);
	}
}