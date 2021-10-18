/*
Assignment 4:
We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and 
the marks in four subjects as its parameters for student B. Create an object for each of the two classes and 
print the percentage of marks for both the students.
*/
package hw_AccessMod_Sep25;

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

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
}