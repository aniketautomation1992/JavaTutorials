package Programms;

import java.util.Scanner;

public class PrimeNumber {

//	Prime number means the number can be divided by itself or 1 only.

	public static void main(String[] args) {

		System.out.println("Enter Number:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();

		int temp = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp > 0) {
			System.out.println("Not prime");
		} else {
			System.out.println("Prime");
		}
	}
}