/* 4W:
- oveeride the two methods - run() and stop()
- create default constructor
- declare two variables - int speed and long distance with different values from the parent vechile
- decalre one more variable as int nos_of_tyre = 4
- create methods here also as display() --> this will print the three variables of 4W  + all the variable of the parent Vechile
*/

package hw_Vehicles_OOPS_Oct3;

public class fourWheeler extends VehicleP{

	int speed = 90;
	long distance = 400;
	int noOfTyres = 4;
	
	fourWheeler() {
		System.out.println("Default 4 wheeler constructor");
	}
	
	@Override
	void run() {
		System.out.println("Inside 4 wheeler's run method");
		
	}

	@Override
	void stop() {
		System.out.println("Inside 4 wheeler's stop method");
		
	}
	
	void display() {
		System.out.println("Printing variables of 4 Wheeler: Speed " +speed+ " ,distance " +distance+ " & No. of Tyres " + noOfTyres);
		System.out.println("Printing Parent variables from 4 wheeler : Speed " + super.speed + " ,distance " + super.distance);
	}

}
