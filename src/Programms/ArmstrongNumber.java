package Programms;

import java.util.Scanner;

public class ArmstrongNumber {

//	Examples of Armstrong numbers: 153

	public static void main(String[] args) {

		System.out.println("Enter Number:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();

		int r = 0;
		int cube = 0;
		int temp = num;

		while (num > 0) {
			r = num % 10;
			num = num / 10;
			cube = cube + (r * r * r);
		}

		if (temp == cube) {
			System.out.println(temp + " is a Armstrong number");
		} else {
			System.out.println(temp + " is not a Armstrong number");
		}
	}
}