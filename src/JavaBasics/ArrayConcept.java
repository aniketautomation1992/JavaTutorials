package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {

//		To store similar data type values
//		Array index starts from 0
//		Multi Dimentional
/*
		 * Dis-Advantage: 1] Fixed size -- Static Array -- To overcome this problem, we
		 * use Collections -- ArrayList, HashTable -- i.e. is called Dynamic Array 2]
		 * Stores only similar data type values -- To overcome this problem, we use
		 * Object Array
*/

//		1. int Array
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[3]);
//		System.out.println(i[4]); // ArrayIndexOutOfBoundsException
		System.out.println(i.length); // size/length of array

//		To print all the values of array - means we have to use for loop concept
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}

		System.out.println("----------");

//		2. double Array
		double d[] = new double[2];
		d[0] = 12.33;
		d[1] = 33.55;

		System.out.println(d[1]);

		System.out.println("----------");

//		3. char Array
		char c[] = new char[3];
		c[0] = 'A';
		c[1] = 'K';
		c[2] = 'Z';

		System.out.println(c[0]);

		System.out.println("----------");

//		4. boolean Array
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;

		System.out.println(b[1]);

		System.out.println("----------");

//		5. String Array
		String s[] = new String[2];
		s[0] = "My name is Aniket";
		s[1] = "I am from Kokan";

		System.out.println(s[0]);

		System.out.println("----------");

//		6. Object Array
		Object ob[] = new Object[6];
		ob[0] = "Aniket";
		ob[1] = 25;
		ob[2] = 'X';
		ob[3] = true;
		ob[4] = 44.78;
		ob[5] = "Pune";

		System.out.println(ob[1]);
		for (int j = 0; j < ob.length; j++) {
			System.out.println(ob[j]);
		}
	}
}