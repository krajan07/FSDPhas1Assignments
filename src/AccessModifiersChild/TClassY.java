package AccessModifiersChild;

import AccessModifiers.TClassN;

public class TClassY extends TClassN {
	
	public static void main(String[] args) {
	
		new TClassN().nPub();
		new TClassN().nPro();
		new TClassN().nPri();
		
		TClassX objX = new TClassX();
		//Printing the Variables Class X 
		System.out.println("INSIDE --> Package Access Modifier Child, TClassY" + "\n");
		System.out.println("Value of long number2 from ClassX = " + objX.number2);
		System.out.println("Value of protected float number3 from ClassX = " + objX.number3);
		System.out.println("Value of public char status from ClassX = " + objX.status);
				
		
	}
}
