package hw_AccessModChild_Sep25;

import hw_AccessMod_Sep25.TClassM;

public class TClassZ extends TClassM {
	
	public static void main(String[] args) {
	
		new TClassM().mPub();
		new TClassM().mPro();
		new TClassM().mPri();
		
		TClassX objX = new TClassX();
		//Printing the Variables Class X 
		System.out.println("INSIDE --> Package Access Modifier Child, TClassZ"+ "\n");
		System.out.println("Value of long number2 from ClassX = " + objX.number2);
		System.out.println("Value of protected float number3 from ClassX = " + objX.number3);
		System.out.println("Value of public char status from ClassX = " + objX.status);
				
		
	}
}