package EncapsulationConcept;

public class TestEncapsulation {

//	Encapsulation means binding the data & functions into a single unit.
//	In encapsulation, the attributes are kept private & public getter and setter methods are provided to manipulate these attributes outside the class.
//	So the end user is just using the set method to set a field & the get method to get a field. They are not aware about what exactly these get & set methods are doing.

	public static void main(String[] args) {

		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setAge(28);
		obj.setName("Aniket");
		obj.setSSN(18002020);
		System.out.println("Employee Age is: " + obj.getAge());
		System.out.println("Employee Name is: " + obj.getName());
		System.out.println("Employee SSN is: " + obj.getSSN());
	}
}