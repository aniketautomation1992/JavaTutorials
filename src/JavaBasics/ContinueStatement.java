package JavaBasics;

public class ContinueStatement {

//	When it encountered inside a loop it skips the execution of the current iteration and the control directly jumps to the beginning of the next iteration.
	public static void main(String[] args) {
		
		for (int i = 0; i <= 6; i++) {
			if (i == 4) {
				continue; // Here it will skip the 4 value.
			}
			System.out.println(i);
		}
	}
}