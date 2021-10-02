package dayTwoAssignment;

/* assignment 1: (function overloading)
Note **: create function name as "calculate"
create three functions in a class
1) create method of return type int
   - add two numbers
2) one of return type float
  to calculate the area of the circle
3) one of return type int
   area of the rectangle*/

public class Assign1CalculatorMethodOverloading {

	public static void main(String[] args) {
		Assign1CalculatorMethodOverloading CMO = new Assign1CalculatorMethodOverloading();

		float CircleArea = CMO.calculate(6.78);
		int RectangleArea = CMO.calculate(9, 1.65);
		int SumResult = CMO.calculate(5, 8);

		System.out.println("Sum of 2 integers = " + SumResult);
		System.out.println("Area of the circle for value is " + CircleArea);
		System.out.println("Area of the rectangle is = " + RectangleArea);

	}

	public int calculate(int arg1, int arg2) {
		int sum = arg1 + arg2;
		return (sum);
	}

	public float calculate(double d) {
		float circleArea = (float) (3.14 * d * d);
		return (circleArea);
	}

	public int calculate(int length, double width) {
		int rectangleArea = (int) (length * width);
		return (rectangleArea);
	}

}
