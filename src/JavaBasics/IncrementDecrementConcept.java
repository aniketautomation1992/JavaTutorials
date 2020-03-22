package JavaBasics;

public class IncrementDecrementConcept {

	public static void main(String[] args) {

		System.out.println("----------Increment----------");

//		post increment - means it will first assign the value of i to j and then increase the value of i by 1, so the current value of i is 2
		int i = 1;
		int j = i++; 
		System.out.println("The value of i is: " + i);
		System.out.println("The value of j is: " + j);

		
//		pre increment - means it will first increase the value of a by 1 and then assign it to b
		int a = 1;
		int b = ++a;
		System.out.println("The value of a is: " + a);
		System.out.println("The value of b is: " + b);

		
		System.out.println("----------Decrement----------");

//		post decrement - means it will first assign the value of m to n and then decrease the value of m by 1, so the current value of m is 1
		int m = 2;
		int n = m--;
		System.out.println("The value of m is: " + m);
		System.out.println("The value of n is: " + n);

//		pre decrement - means it will first decrease the value of x by 1 and then assign it to y
		int x = 2;
		int y = --x;
		System.out.println("The value of x is: " + x);
		System.out.println("The value of y is: " + y);
	}
}