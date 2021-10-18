/*Assignment 4:
Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods 
create another class smart telephone and demonstrate polymorphism 
*/
package hw_OOPS_Oct3;

abstract class telephone{
	abstract void ring();
	abstract void lift();
	abstract void disconnected();	
}

 class smartphone extends telephone {
	@Override
	public void ring() {
		System.out.println("Phone rings during incoming call"+ "\n");	
	}

	@Override
	public void lift() {
		System.out.println("Phone lifted by the user as the phone rang"+ "\n");
	}

	@Override
	public void disconnected() {
		System.out.println("Phone call disconnected after user talks"+ "\n");
	}
	
}

public class telephoneClass {
	
	public static void main(String[] args) {
		telephone ph = new smartphone();
		ph.ring();
		ph.lift();
		ph.disconnected();
		}

}
