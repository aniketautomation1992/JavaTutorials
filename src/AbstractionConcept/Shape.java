package AbstractionConcept;

public abstract class Shape {

	String color;

	Shape() {
		System.out.println("Shape constructor color is: " + (color = "Red"));
	}

	abstract void drawing();

	public final void fill() {
		System.out.println("Shape - fill");
	}
}