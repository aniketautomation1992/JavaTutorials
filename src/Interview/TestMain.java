package Interview;

public class TestMain {

//	Q. Can we overload a main() methd ?
//	A. Yes, we can overload a main() method. 
//	JVM will try find out only the main method which is public static & void and having parameters (String[] args).
//	Also we can call a main() method from another class by using class_name.method_name.

	public static void main(String[] args) {

		System.out.println("Main Method 1");
		main("Aniket");
		main(10);
		main(3, 6);
	}

	public static void main(String args) {
		System.out.println("Main Method 2");
	}

	public static void main(int a) {
		System.out.println("Main Method 3");
	}

	public static void main(int a, int b) {
		System.out.println("Main Method 4");
	}
}