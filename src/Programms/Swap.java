package Programms;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {

		System.out.println("Enter first number:");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("Enter second number:");
		int b = scanner.nextInt();
		scanner.close();

		System.out.println("Before swap first number is " + a + " & second number is " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swap first number is " + a + " & second number is " + b);
	}
}