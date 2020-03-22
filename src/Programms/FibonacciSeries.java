package Programms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int count = 7, num1 = 0, num2 = 1;
//		System.out.println("Fibonacci series of " + count + " numbers is");

//		By using user input
		int user;
		System.out.println("How many numbers you want in the sequence of Fibonacci series: ");
		Scanner scanner = new Scanner(System.in);
		user = scanner.nextInt();
		scanner.close();
		System.out.println("Fibonacci series of " + user + " numbers is");

		for (int i = 1; i <= user; i++) {
			System.out.println(num1 + " ");
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}

		// ----------------------------------------------------------------------------------

//		By using for loop
//		for (int i = 1; i <= count; i++) {
//			System.out.println(num1 + " ");
//			int sum = num1 + num2;
//			num1 = num2;
//			num2 = sum;
//		}

		// ----------------------------------------------------------------------------------

//		By using while loop
//		int i = 1;
//		while (i <= count) {
//			System.out.println(num1 + " ");
//			int sum = num1 + num2;
//			num1 = num2;
//			num2 = sum;
//			i++;
//		}
	}
}