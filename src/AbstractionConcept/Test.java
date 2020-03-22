package AbstractionConcept;

public class Test extends Shape {

//	Abstraction means hiding the implementation logic and providing only necessary details.
//	The 'abstract' keyword is used to declare abstract class & methods.
//	Abstract class can have both abstract & non-abstract methods.
//	100 % abstraction is not achieved that means partial abstraction is achieved.
//	Abstract methods have only method declaration, no method body.
//	Abstract class can have constructors.
//	If a child class is extending any abstract class or implementing any interface then, that child class must have to implements all the abstract methods.
//	Abstract methods can't be private, static & final.
//	We can't create the object of abstract class but; the object of child class can be referred by the reference variable of that abstract class.

	Test() {
		System.out.println("Test - constructor");
	}

	public static void main(String[] args) {

//		Creating object of child class which is referred by parent abstract class
		Shape s = new Test();
		System.out.println("Test color is: " + (s.color = "Green"));
//		Calling abstract method
		s.drawing();
//		Calling non-abstract method
		s.fill();
	}

	@Override
	void drawing() {
		System.out.println("Test - drawing");
	}
}