package ConstructorConcept;

public class ConstructorWithThisKeyword {

//	The 'this' keyword is used to access the child class properties. 
//	In a constructor, 'this' can be used for so many times. 
//	The 'this' keyword is also used for calling another constructor but; it should be the first statement.

	String name = "Java";
	int age = 25;

	public void add() {
		System.out.println("Method");
	}

	public ConstructorWithThisKeyword(String name, int age) {
		System.out.println(this.name);
//		this.class_variable=local_variable
		this.name = name;
		this.age = age;
//		Calling the class method in constructor
		this.add();
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {

		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Peter", 27);
	}
}