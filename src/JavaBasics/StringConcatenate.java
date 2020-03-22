package JavaBasics;

public class StringConcatenate {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;

		String x = "Hello";
		String y = "Java";

		System.out.println(a + b + x + y); // First it will add the value of a & b and then the value of x & y - output:
											// 300HelloJava
		System.out.println(x + y + a + b); // But here it won't add the value of a & b - output: HelloJava100200
		System.out.println(x + a + b + y);
		System.out.println(a + x + y + b);
		System.out.println(x + y + (a + b));
	}
}