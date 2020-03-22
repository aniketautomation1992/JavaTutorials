package Programms;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		int i;
		System.out.println("Enter number:");
		Scanner scanner = new Scanner(System.in);
		i = scanner.nextInt();
		scanner.close();

		if (i % 2 == 0) {
			System.out.println(i + " is even number.");
		} else {
			System.out.println(i + " is odd number.");
		}
	}
}