package Programms;

import java.util.Scanner;

public class PalindromeNumber {

//	Examples of Palindrome numbers: 34543, 151, 78787

	public static void main(String[] args) {

		System.out.println("Enter Number:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();

		int r = 0;
		int sum = 0;
		int temp = num;

		while (num > 0) {
			r = num % 10;
			num = num / 10;
			sum = (sum * 10) + r;
		}

		if (temp == sum) {
			System.out.println(temp + " is a Palindrome number");
		} else {
			System.out.println(temp + " is not a Palindrome number");
		}

	}
}