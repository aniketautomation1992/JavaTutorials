package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		if (a > b) {
			System.out.println("a is greater than b ");
		} else {
			System.out.println("b is greater than a");
		}

//		Nested if
		int c = 500;
		int d = 400;
		int e = 300;

		if ((c > d) & (c > e)) {
			System.out.println("c is greater than d & e");
		} else if (d > e) {
			System.out.println("d is greater than c & e");
		} else {
			System.out.println("e is greater than c & d");
		}
	}
}