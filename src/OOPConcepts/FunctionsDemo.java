package OOPConcepts;

public class FunctionsDemo {

//	The purpose of a method is to perform a task by executing a java code.
//	Methods can be public, private & protected.
//	Methods can also be static, final, abstract & synchronized.
//	Methods can be overloaded & overridden.
//	Methods can be of 2 types: 1) Static methods		2) Non-Static methods
//	Static methods can be called directly or by using class name.
//	Non-Static methods can be called by using object reference variable.
//	Methods having same name with different return type are not allowed.
//	Methods do have return type.
//	Interfaces do have methods.

	public static void main(String[] args) {

		System.out.println("Main Method");
		FunctionsDemo fd = new FunctionsDemo();

//		calling of non-static method with void return type
		fd.test();
//		calling of non-static method with void return type & argument list
		fd.test("XX");
//		calling of static method
		sum();
//		calling of static method by using class name
		FunctionsDemo.sum();
//		calling of non-static method with integer return type
		int p = fd.pune();
		System.out.println(p);
//		calling of non-static method with integer return type & argument list
		int a = fd.add(5, 3);
		System.out.println(a);
	}

	public void test() {
		System.out.println("Method with void return type - void means doesn't returns any value.");
	}

	public void test(String s) {
		System.out.println("Method with void return type & argument list.");
	}

	public int pune() {
		System.out.println("Method with return type.");
		int a = 100;
		return a;
	}

	public int add(int a, int b) {
		System.out.println("Method with return type & argument list.");
		int c = a + b;
		return c;
	}

	public static void sum() {
		System.out.println("static sum() Method");
	}
}