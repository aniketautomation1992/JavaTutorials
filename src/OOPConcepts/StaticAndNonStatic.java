package OOPConcepts;

public class StaticAndNonStatic {

//	The 'static' keyword can be used with class, variable, method & block.
//	A static block always executes first even before the main method. 
//	If we have 2 static blocks then, 1st block executes before 2nd block; so that, the values initialized by the 1st block are overwrittn by 2nd block.
//	Static members can be accessed without the object.
//	A static variable is a class level variable so, it is common to all the objects of a class.
//	A static method & variable can be called directly or by using class_name.method_name.
//	Static method & variable can also be called by using object of a class but; it will give a warning that it should be accessed in a static way.

//	Non-Static Global Variable
	String name;
//	Static Global Variable
	static int age;

//	Static block 1
	static {
		System.out.println("static block 1");
		age = 10;
	}
//	Static block 2
	static {
		System.out.println("static block 2");
		age = 20;
	}

	public static void main(String[] args) {

		System.out.println("Main method");
		System.out.println("The age is: " + age);
//		Initializing static variable without using the object.
		age = 27;
//		Printing static variable without using the object.
		System.out.println("Current age is: " + age);
//		Calling static method without using the object.
		sum();

//		Calling static method by using class_name.method_name
		StaticAndNonStatic.sum();
//		Printing static variable by using class_name.variable_name
		System.out.println(StaticAndNonStatic.age);

		StaticAndNonStatic san = new StaticAndNonStatic();
		san.sendMail();
//		Printing static variable by using object of a class.
		System.out.println(san.age);
//		Calling static method by using object of a class.
		san.sum();
	}

//	Non-Static Method
	public void sendMail() {
		System.out.println("non-static sendMail() Method");
	}

//	Static Method
	public static void sum() {
		System.out.println("static sum() Method");
	}
}