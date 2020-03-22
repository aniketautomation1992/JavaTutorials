package Interview;

public class PrintNumberAfterDemical {
	public static void main(String[] args) {
		double d=5577.987;
		String number=String.valueOf(d);
		number = number.substring(number.indexOf(".")).substring(1);
		System.out.println(number);
	}
}