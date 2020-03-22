package JavaBasics;

public class SwitchCaseConcept {

//	It is used when we have number of options or choices and we need to perform different task for each options.
//	case doesn't need to have any sequential format; it can be any integer or character.
//	break statement is optional; but it is useful to break the execution of remaining cases.
//	If there are no any case matches with the switch expression then; default statement get executed.

	public static void main(String[] args) {

		int a = 10;
//		char c='c';
		switch (24) {
		case 8:
			System.out.println("Case 1: value is: ");
			break;
		case 10:
			System.out.println("Case 2: value is: ");
			break;
		case 'c':
			System.out.println("Case 3: value is: ");
			break;
		case 24:
			System.out.println("Case 4: value is: ");
			break;
		default:
			System.out.println("Default Case: value is: ");
		}
	}
}