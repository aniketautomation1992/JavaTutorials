package JavaBasics;

public class WrapperClassConcept {

	public static void main(String[] args) {

		String s = "100";
		System.out.println(s + 20); // Output: 10020

//		String to int by using Integer.parseInt
		int i = Integer.parseInt(s);
		System.out.println(i + 20); // Output: 120

//		String to double by using Double.parseDouble
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d + 0.67); // Output: 13.0

//		String to boolean by using Boolean.parseBoolean
		String x = "true";
		boolean b = Boolean.parseBoolean(x);
		System.out.println(b); // Output: true

//		int to String by using String.valueOf
		int a = 200;
		System.out.println(a + 20); // Output: 220
		String str = String.valueOf(a);
		System.out.println(str + 20); // Output: 20020

//		char to String by using String.valueOf
		char c = 'A';
		String str1 = String.valueOf(c);
		System.out.println(str1); // Output: A

		/*
		 * String v="100A"; int j=Integer.parseInt(v); // Exception:
		 * NumberFormatException System.out.println(j);
		 */
	}
}