package Programms;

import java.util.Scanner;

public class PrimeSeries {

//	Prime series: 1,2,3,5,7,11,13,17,19

	public static void main(String[] args) {

		System.out.println("Enter number till which you want the prime numbers:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();

		for (int i = 1; i <= num; i++) {
			int temp = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					temp = temp + 1;

				}
			}
			if (temp == 0) {
				System.out.println(i);
			}
//			else {
//				temp=0;
//			}

		}
	}
}