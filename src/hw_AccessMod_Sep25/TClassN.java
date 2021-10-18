package hw_AccessMod_Sep25;

public class TClassN {

	public int classId = 104; //Private variable
	protected long leadCap = 10 ;  //Default variable
	double percentile = 5.75d; //Protected variable
	
	//Function for Public method
	public void nPub() {
		System.out.println("INSIDE --> Package Access Modifier, TClassN & Private Method"+ "\n");
		nPri();
	}
	
	//Function for Protected method
	public void nPro() {
		System.out.println("INSIDE --> Package Access Modifier, TClassN & Protected Method" + "\n");
		nPri();
	}
	
	//Function for Default method
	void nDef() {
		System.out.println("INSIDE --> Package Access Modifier, TClassN & Default Method"+ "\n");
		nPri();
	}
	
	//Function for Default method
	public void nPri() {
		System.out.println("INSIDE --> Package Access Modifier, TClassN & Default Method"+ "\n");
		System.out.println("Value of public integer variable classId = " + classId);
		System.out.println("Value of protected long leadCap = " + leadCap);
		System.out.println("Value of default double percentile = " + percentile);
	}
}
