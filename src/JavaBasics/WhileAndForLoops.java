package JavaBasics;

public class WhileAndForLoops {

	public static void main(String[] args) {

//		A java program to print 1 to 10 positive numbers by using while & for loop
		System.out.println("----------while----------");
//		Disadvantage: It will generate infinite loop if we don't provide incremental or decremental part
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		System.out.println("----------for----------");
		for (int j = 1; j <= 10; j++) {
			System.out.println(j);
		}

//		A java program to print 10 to 1 positive numbers by using while and for loops
		System.out.println("----------while----------");
		int l = 10;
		while (l >= 1) {
			System.out.println(l);
			l--;
		}

		System.out.println("----------for----------");
		for (int k = 10; k >= 1; k--) {
			System.out.println(k);
		}
	}
}