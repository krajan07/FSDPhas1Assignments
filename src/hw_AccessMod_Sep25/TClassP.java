package hw_AccessMod_Sep25;

public class TClassP {

	public static void main(String[] args) {	
		
		TClassM objM = new TClassM();
		TClassN objN = new TClassN();
		
		//Printing the Variables of M & N from Class 
		System.out.println("INSIDE --> Package Access Modifier, TClassP");
		System.out.println("Value of default long limitCap from ClassM = " + objM.limitCap);
		System.out.println("Value of protected variable from ClassM = " + objM.percentage);
		System.out.println("Value of public integer variable classId from ClassN = " + objN.classId);
		System.out.println("Value of protected long leadCap from ClassN = " + objN.leadCap);
		System.out.println("Value of default double percentile from ClassN = " + objN.percentile);
	}
	
	//Function for Public method
	public void mPub() {
		System.out.println("INSIDE --> Package Access Modifier, TClassP & Private Method");
	}
	
	//Function for Protected method
	public void mPro() {
		System.out.println("INSIDE --> Package Access Modifier, TClassP & Protected Method");
	}
			
	//Function for Default method
	void mDef() {
		System.out.println("INSIDE --> Package Access Modifier, TClassP & Default Method");
	}
			
	//Function for Default method
	public void mPri() {
		System.out.println("INSIDE --> Package Access Modifier, TClassP & Default Method");
	}
}
