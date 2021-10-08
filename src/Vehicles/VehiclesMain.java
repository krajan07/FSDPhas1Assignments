/*
 * Main()
  - call all the methods using dynamic/runtime polymorphism here
  - all the methods of all the child classes.
  - call all the methods of the fuel of Vechile class
*/

package Vehicles;

public class VehiclesMain {

	public static void main(String[] args) {
		VehicleP VP;
		
		System.out.println("\n");
		VP = new twoWheeler();
		VP.fuel(15);
		VP.fuel('P', 10);
		VP.fuel(50.55f, "Diesel");
		VP.run();
		VP.stop();
		VP.display();
		
		System.out.println("\n");
		VP = new threeWheeler();
		VP.run();
		VP.stop();
		VP.display();
		
		System.out.println("\n");
		VP = new fourWheeler();
		VP.run();
		VP.stop();
		VP.display();
		
		System.out.println("\n");
		VP = new eightWheeler();
		VP.run();
		VP.stop();
		VP.display();
	}

}
