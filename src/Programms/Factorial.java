package Programms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int i = 5;
		int fact = 1;

//		By using user inputs
		int user;
		System.out.println("Enter number to find factorial: ");
		Scanner scanner = new Scanner(System.in);
		user = scanner.nextInt();
		scanner.close();

		for (int a = 1; a <= user; a++) {
			fact = fact * a;
		}
		System.out.println("The Factorial of " + user + " is " + fact);

		// ----------------------------------------------------------------------------------

//		By using for loop
//		for (int a = 1; a <= i; a++) {
//			fact = fact * a;
//		}
//		System.out.println("Factorial of " + i + " is: " + fact);

		// ----------------------------------------------------------------------------------

//		By using while loop
//		int a = 1;
//		while (a <= i) {
//			fact = fact * a;
//			a++;
//		}
//		System.out.println("Factorial of " + i + " is: " + fact);
	}
}