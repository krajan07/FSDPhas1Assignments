/*
Create an interface TVremote and use it to inherit another interface smart TVremote 
Create a class TV which implements TVremote interface from Q6
*/

package hw_OOPS_Oct3;

interface smartTVRemote {
	abstract void selectChannel();
}

interface TVremote extends smartTVRemote {
	abstract void changeVolume();
}

class TV implements TVremote {

	@Override
	public void selectChannel() {
		System.out.println("Change channels using remote");
		
	}

	@Override
	public void changeVolume() {
		System.out.println("Change voulne of tv");
		
	}
	
}
public class WatchTV {

	public static void main(String[] args) {
		TV Sony = new TV();
		Sony.changeVolume();
		Sony.selectChannel();

	}

}
