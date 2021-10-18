/*
 * Assignment 3:
1) Create an abstract class pen with methods write () and refill () as abstract methods 
2) Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()
3) Create a class monkey with jump ( ) and bite ( ) methods Create a class human which inherits this monkey class and implements basic animal interface with eat ( ) and sleep methods 
4) Demonstrate polymorphism using using monkey  class from Q3 
*/

package hw_OOPS_Oct3;

abstract class Pen {
	abstract void write();
	abstract void refill();
}

class FountainPen extends Pen {

	@Override
	void write() {
		System.out.println("Pen is used for writing");
		
	}

	@Override
	void refill() {
		System.out.println("When the ink is over, use the refill to continue writing");
		
	}
	
	void ChangeNib () {
		System.out.println("Fountain Pen also need to change Nib, if broken or bent");
	}
}

 class Monkey {
	 void jump() {
		 System.out.println("Jump from place to another");
	 }
	 
	 void bite() {
		 System.out.println("Teeth is useful to bite");
	 }
 }
 
 interface Animal {
	 abstract void eat();
	 abstract void sleep();
 }
 
 class Human extends Monkey implements Animal{
	 
	 void CommonSense() {
		 System.out.println("Human have Common Sense");
	 }

	@Override
	public void eat() {
		 System.out.println("Eat food when hungry");
		
	}

	@Override
	public void sleep() {
		System.out.println("Sleep when rest required");	
	}	 
 }


public class PenMonkey {

	public static void main(String[] args) {
		System.out.println("\nFOUNTAIN PEN");
		FountainPen Hero = new FountainPen();
		Hero.ChangeNib();
		Hero.refill();
		Hero.write();
		
		System.out.println("\nHUMAN CHILD");
		Human child = new Human();
		child.CommonSense();
		child.bite();
		child.eat();
		
		System.out.println("\nMONKEY");
		Monkey M1 = new Monkey();
		M1.bite();
		M1.jump();
	}
}