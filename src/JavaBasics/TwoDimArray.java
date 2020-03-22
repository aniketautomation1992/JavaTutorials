package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {

		String s[][] = new String[3][5]; // Declaration of 2-D Array
		s[0][0] = "A"; // Initialization of 2-D Array
		s[0][1] = "Pune";
		s[0][2] = "Mumbai";
		s[0][3] = "Aniket";
		s[0][4] = "999";

		s[1][1] = "A1";
		s[1][3] = "XXX";
		s[2][4] = "December";

		System.out.println(s[0][2]);
		System.out.println(s[1][3]);
		System.out.println(s[2][4]);

		System.out.println(s.length); // Total number of rows will be given
		System.out.println(s[0].length); // Total number of columns will be given

		System.out.println("----------");

		// To print all the values of 2-D Array
		for (int row = 0; row < s.length; row++) {
			for (int col = 0; col < s[0].length; col++) {
				System.out.println(s[row][col]);
			}
		}
	}
}