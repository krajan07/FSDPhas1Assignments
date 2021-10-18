package hw_Constructors_Methods_Sep26;

public class MarkPercentageAbstract 
{
	float m1,m2,m3,m4,sum,percentage;
	
	abstract class marks 
	{
		abstract public void getPercentage();
	}
	
	public class studA extends marks {
		@Override
		public void getPercentage() {
			System.out.println("\n Percentage of Student A is " + percentage);
		}
	}
	
	public class studB extends marks {
		@Override
		public void getPercentage() {
			System.out.println("\n Percentage of Student B is " + percentage);
		}
	}
	
	MarkPercentageAbstract(float m1, float m2, float m3) {
		sum = m1+m2+m3;
		percentage = sum/3;
		studA AA = new studA();
		AA.getPercentage();
	}
	
	MarkPercentageAbstract(float m1, float m2, float m3, float m4) {
		sum = m1+m2+m3+m4;
		percentage = sum/4;
		sum = m1+m2+m3;
		percentage = sum/3;
		studB BB = new studB();
		BB.getPercentage();
	}
	
	void display()
	{
		System.out.println("\n Mark percentage calculation done !!!");
	}
	
	public static void main(String[] args) {
		MarkPercentageAbstract A = new MarkPercentageAbstract(45f,47f,43f);
		A.display();
		
		MarkPercentageAbstract B = new MarkPercentageAbstract(50f,49f,56f,60f);
		B.display();
	}
}