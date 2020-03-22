package ExceptionHandling;

public class FinallyConcept {

	public static String sum() {
		try {
			System.out.println("Simple Pune");
		} finally {
			return "Finally: Pune";
		}
	}

	public static String sum2() {
		try {
			System.out.println("Simple Mumbai");
		} catch (Exception e) {
			return "Exception";
		} finally {
			return "Finally: Mumbai";
		}
	}

	public static void main(String[] args) {

		System.out.println(sum());
		System.out.println();
		System.out.println();
		System.out.println(sum2());
		System.out.println();

		System.out.println("----------Exception not coming-------------");
		try {
			int a = 10 / 2;
			System.out.println("Value of a: " + a);
		} catch (Exception e) {
			System.out.println("Inside catch block 1");
		} finally {
			System.out.println("Finally Block 1: Exception not coming");
		}

		System.out.println();
		System.out.println();

		System.out.println("----------Exception coming and handled-------------");
		try {
			int a = 10 / 0;
			System.out.println("Value of a: " + a);
		} catch (Exception e) {
			System.out.println("Inside catch block 2");
		} finally {
			System.out.println("Finally Block 2: Exception coming and handled");
		}

		System.out.println();
		System.out.println();

		System.out.println("----------Exception coming and not handled-------------");
		try {
			int a = 10 / 0;
			System.out.println("Value of a: " + a);
		} finally {
			System.out.println("Finally Block 3: Exception coming and not handled");
		}
	}
}