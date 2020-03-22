package ExceptionHandling;

public class TryCatchBlock {

//	Throwable class is parent class of Exception & Error class

//	int a=10;
//	static TryCatchBlock obj;
	public static void main(String[] args) {

//	Uncatched exception
//	int i=9/0;
//	System.out.println(i);

//	Catched exception
//	Thread.sleep(2000);

//	try - catch block
		try {
			int i = 9 / 0;
		} catch (Exception e) {
			e.printStackTrace();
//	we can print our own messege
		}
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
	}
}