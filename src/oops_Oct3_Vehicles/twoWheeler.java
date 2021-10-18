/*
 * 2W:
- oveeride the two methods - run() and stop()
- create default constructor
- declare two variables - int speed and long distance with different values from the parent vechile
- decalre one more variable as int nos_of_tyre = 2
- create methods here also as display() --> this will print the three variables of 2W  + all the variable of the parent Vechile  (hint: super.variable_name)
*/

package oops_Oct3_Vehicles;

public class twoWheeler extends VehicleP{

	int speed = 60;
	long distance = 200;
	int noOfTyres = 2;
	
	twoWheeler() {
		System.out.println("Default 2 wheeler constructor");
	}
	@Override
	void run() {
		System.out.println("Inside 2 wheeler's run method");
		
	}

	@Override
	void stop() {
		System.out.println("Inside 2 wheeler's stop method");
		
	}
	
	void display() {
		System.out.println("Printing variables of 2 Wheeler: Speed " +speed+ " ,distance " +distance+ " & No. of Tyres " + noOfTyres);
		System.out.println("Printing Parent variables from 2 Wheeler : Speed " + super.speed + " , distance " + super.distance);
	}

}
