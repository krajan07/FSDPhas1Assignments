/* 3W:
- oveeride the two methods - run() and stop()
- - create default constructor
- declare two variables - int speed and long distance with different values from the parent vechile
- decalre one more variable as int nos_of_tyre = 3
- create methods here also as display() --> this will print the three variables of 3W  + all the variable of the parent Vechile
*/

package hw_Vehicles_OOPS_Oct3;

public class threeWheeler extends VehicleP{

	int speed = 80;
	long distance = 300;
	int noOfTyres = 3;
	
	threeWheeler() {
		System.out.println("Default 3 wheeler constructor");
	}
	
	@Override
	void run() {
		System.out.println("Inside 3 wheeler's run method");
		
	}

	@Override
	void stop() {
		System.out.println("Inside 3 wheeler's stop method");
		
	}
	
	void display() {
		System.out.println("Printing variables of 3 Wheeler: Speed " +speed+ " ,distance " +distance+ " & No. of Tyres " + noOfTyres);
		System.out.println("Printing Parent variables from 3 Wheeler : Speed " + super.speed + " ,distance " + super.distance);
	}

}
