package ExceptionHandling;

public class ThrowsKeyword {

	public static void main(String[] args) {

		ThrowsKeyword obj = new ThrowsKeyword();

		obj.sum();
		System.out.println("Java");
	}

	public void sum() {
		try {
			div();
		} catch (Exception e) {

		}

	}

	public void div() throws Exception {
		int i = 9 / 0;
		System.out.println("Selenium");
	}
}