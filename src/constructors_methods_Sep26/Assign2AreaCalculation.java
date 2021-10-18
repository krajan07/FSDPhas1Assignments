package constructors_methods_Sep26;

/*
 Assignment 2:(method + constructors)
i want to calculate the area of the different shapes - square, rectangle, circle
1. create 4 constructors - default + three consutrctors for the shapes (using constructor overloading)
2. create 3 methods for (square, rectangle, circle) display which will display the value of the area calculated
3. calcuate the area of the rhombus and triangle using the method overaloding concept
 * */

public class Assign2AreaCalculation {
	// Variables declaration
	float recarea;
	float sqarea;
	double cirarea;

	public static void main(StringsAssign[] args) {
		new Assign2AreaCalculation();
		Assign2AreaCalculation Square = new Assign2AreaCalculation(4f);
		Assign2AreaCalculation Rectangle = new Assign2AreaCalculation(4.5f, 7.6f);
		Assign2AreaCalculation Circle = new Assign2AreaCalculation(4.5d);

		// Calling methods to print area calculated
		Square.square();
		Rectangle.rectangle();
		Circle.circle();

		// Calculate area of Rhombus, Triangle using Method Overloading and printing the
		// values
		System.out.println("Area of Rhombus is " + areacheck(4.0f, 2.0f));
		System.out.println("Area of Triangle is " + areacheck(4.0f, 2.0f));

	}

	// Methods Overloading
	public static float areacheck(float f1, float f2) {
		float arearesult = (f1 * f2) / 2;
		return (arearesult);
	}

	public static double areacheck(double d1, double d2) {
		double arearesult = (d1 * d2) / 2;
		return (arearesult);
	}

	// Default constructor
	Assign2AreaCalculation() {
		System.out.println("This is the default constructor");
	}

	// Square constructor
	Assign2AreaCalculation(float side) {
		sqarea = side * side;
	}

	// Rectangle constructor
	Assign2AreaCalculation(float width, float length) {
		recarea = width * length;
	}

	// Circle constructor
	Assign2AreaCalculation(double radius) {
		cirarea = 3.14 * radius * radius;
	}

	// Method to print square area calculated
	private void square() {
		System.out.println("Area of Square = " + sqarea);

	}

	// Method to print rectangle area calculated
	private void rectangle() {
		System.out.println("Area of rectangle = " + recarea);

	}

	// Method to print circle area calculated
	private void circle() {
		System.out.println("Area of circle = " + cirarea);

	}

}
