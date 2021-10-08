/* Assignment 2:
(Parent) MNC ---> 2 abstract methods + 1 constructor + 1 normal method
Infosys (child of MNC) ----> make it abstract also  but give the implementation of single abstarct method
Hello (child of Infosys) ----> here implement all the abstarct methods + 1 create noraml method also
main class ---> call all the methods of all classes using the dynamic polymorphism
*///System.out.println();
 
package Oct3;

abstract class MNC {
	
	abstract void odc();
	abstract void pm();
	
	MNC() {
		System.out.println("MNC Constructor");
	}
	
	void department() {
		System.out.println("Normal Method that calls department");
	}
	
}

abstract class Infosys extends MNC {

	@Override
	void odc() {
		System.out.println("Infosys ODC is located at Bengaluru");
		
	}
	
}

class Hello extends Infosys {

	@Override
	void pm() {
		System.out.println("Product Management team also heads R&D Team");
		
	}
	
	void display() {
		System.out.println("PM team is also located at Bengaluru");
	}
	
}

public class Company {

	public static void main(String[] args) {
		Hello INFY = new Hello();
		INFY.department();
		INFY.odc();
		INFY.pm();
		INFY.display();
	}

}
