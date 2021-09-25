package AccessModifiers;

public class TClassM {

	private int deptId = 1; //Private variable
	
	long limitCap = 5 ;  //Default variable
	protected float percentage = 2.5f; //Protected variable
	
	//Function for Public method
	public void mPub() {
		System.out.println("INSIDE --> Package Access Modifier, TClassM & Private Method"+ "\n");
		mPri();
	}
	
	//Function for Protected method
	public void mPro() {
		System.out.println("INSIDE --> Package Access Modifier, TClassM & Protected Method"+ "\n");
		mPri();
	}
	
	//Function for Default method
	void mDef() {
		System.out.println("INSIDE --> Package Access Modifier, TClassM & Default Method"+ "\n");
		mPri();
	}
	
	//Function for Default method
	public void mPri() {
		System.out.println("INSIDE --> Package Access Modifier, TClassM & Default Method"+ "\n");
		System.out.println("Value of private integer variable deptId = " + percentage);
		System.out.println("Value of default variable limitCap = " + limitCap);
		System.out.println("Value of protected variable = " + percentage);
	}
}