package EncapsulationConcept;

public class EncapsulationDemo {

	private int ssn;
	private String name;
	private int age;

	public int getSSN() {
		return ssn;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setSSN(int newSSN) {
		ssn = newSSN;
	}
}