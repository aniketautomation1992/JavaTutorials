package JavaBasics;

public class BreakStatement {

	// When it encountered inside a loop it stops the execution of the loop from
	// current iteration till end.

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}
	}
}