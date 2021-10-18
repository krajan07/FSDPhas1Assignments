/*W:
- oveeride the two methods - run() and stop()
- create default constructor
- declare two variables - int speed and long distance with different values from the parent vechile
- decalre one more variable as int nos_of_tyre = 8
- create  methods here also as display() --> this will print the three variables of 8W  + all the variable of the parent Vechile
*/

package oops_Oct3_Vehicles;

public class eightWheeler extends VehicleP{

	int speed = 60;
	long distance = 1000;
	int noOfTyres = 8;
	
	eightWheeler() {
		System.out.println("Default 8 wheeler constructor");
	}
	
	@Override
	void run() {
		System.out.println("Inside 8 wheeler's run method");
		
	}

	@Override
	void stop() {
		System.out.println("Inside 8 wheeler's stop method");
		
	}
	
	void display() {
		System.out.println("Printing variables of 8 Wheeler: Speed " +speed+ " ,distance " +distance+ " & No. of Tyres " + noOfTyres);
		System.out.println("Printing Parent variables from 8 wheeler : Speed " + super.speed + " ,distance " + super.distance);
	}

}
