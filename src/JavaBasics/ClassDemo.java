package JavaBasics;

public class ClassDemo {

	int a;
	char c;
	private int g = 4;

	public static void main(String[] args) {

		ClassDemo cd1 = new ClassDemo(); // object creation of ClassDemo class -- cd1 is the object reference variable
		cd1.a = 200;
		cd1.c = 'X';

		ClassDemo cd2 = new ClassDemo();
		cd2.a = 300;
		cd2.c = 'A';

		ClassDemo cd3 = new ClassDemo();
		cd3.a = 400;
		cd3.c = 'Z';

		System.out.println("Before Referencing");
		System.out.println(cd1.a); // 200
		System.out.println(cd2.a); // 300
		System.out.println(cd3.a); // 400

		System.out.println("After Referencing");
		cd1 = cd2;
		cd2 = cd3;
		cd3 = cd1;

		System.out.println(cd1.a); // 300
		System.out.println(cd2.a); // 400
		System.out.println(cd3.a); // 300
		cd1.a = 111;
		System.out.println(cd1.a); // 111
		cd3.a = 222;
		System.out.println(cd1.a); // 222
	}
}