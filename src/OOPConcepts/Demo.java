package OOPConcepts;

public class Demo {

	int a;

	public static void main(String[] args) {

		Demo d = new Demo();
//		call by value
		d.sum(10, 60);
//		call by reference
		d.mul(d);
	}

//	call by value
	public void sum(int c, int d) {
		int x = c + d;
		System.out.println("Call by value is: " + x);
	}

//	call by reference
	public void mul(Demo d1) {
		System.out.println("Call by reference is: " + (d1.a = 100));
	}
}