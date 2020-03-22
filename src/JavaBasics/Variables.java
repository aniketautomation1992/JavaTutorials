package JavaBasics;

public class Variables {

	String name = "Aniket"; // Global or Class variables
	static int age, gen; // Static variable -- Declaration is global but Initialization is anywhere
							// within the class.
	int v;

	public static void main(String[] args) {

		System.out.println("Main Method");
		int i = 10; // Local variable
		System.out.println(i);
		age = 27;
		Variables vd = new Variables();
		System.out.println(vd.name);
		System.out.println(vd.age);
		vd.sum();
		System.out.println("main method: " + (vd.v = 100));

	}

	public void sum() {
		System.out.println("Sum Method");
		int i = 12; // Local variables
		int j = 8;
		int age = 30;
		age = 76;
		System.out.println(age);
		System.out.println("sum method: " + (v = 100));
		System.out.println(gen = 9);
	}
}