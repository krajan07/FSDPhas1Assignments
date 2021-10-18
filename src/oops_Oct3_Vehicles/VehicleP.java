/*
 Vechile:(Parent)
- create two abstract methods  - run() and stop()
- create three methods of public void fuel - 1st method will take int / 2nd method will float and string  / 3rd method will take char and int
 (method overloading)
- declare two variables - int speed and long distance
- create two constructors also- default and parametrized
 * */
package oops_Oct3_Vehicles;

abstract class VehicleP {
	abstract void run();
	abstract void stop();
	abstract void display();
	int speed = 40;
	long distance = 100;
	
	public void fuel(int ltr) {
		System.out.println("Liters of fuel : " + ltr);
	}
	
	public void fuel(float price, String type) {
		System.out.println("Price of " +type+ " is " + price);
	}

	public void fuel(char fuelType, int density) {
		System.out.println("For fuel type " +fuelType+ " the density is " +density);
	}
	
	void VehcileP() {}
	
	void VehcileP(int speed) {
		System.out.println(speed);
	}
}
