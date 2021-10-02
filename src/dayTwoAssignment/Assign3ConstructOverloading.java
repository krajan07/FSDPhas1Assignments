package dayTwoAssignment;
/*
Assignment 3: create the 4 student objects with name s1,s2,s3,s4
- declare the class member variables with String name, int age, section(char type), gender (char type), and three int subject marks (subject1, subject 2, subject 3).
Calcuate the total marks and percentage obtained by every student (total= subject 1 + subject 2+ subject 3) by passing the values from the parameterized constructor. and for s2 and s3 stduents we will not pass subject 1 marks so it is 0 so dont pass it in constructor.
*/

public class Assign3ConstructOverloading {

	String name;
	int age;
	char section, gender;
	float sub1, sub2, sub3;

	Assign3ConstructOverloading(String name, int age, char section, char gender, float sub1, float sub2, float sub3) {
		this.name = name;
		this.age = age;
		this.section = section;
		this.gender = gender;
		float total_marks = sub1 + sub2 + sub3;
		float percentage = total_marks / 3;
		display();
		System.out.println("Total marks scored is " + total_marks + "\nPercentage scored is " + percentage + "\n\n");
	}

	Assign3ConstructOverloading(String name, int age, char section, char gender, float sub2, float sub3) {
		this.name = name;
		this.age = age;
		this.section = section;
		this.gender = gender;
		sub1 = 0f;
		float total_marks = sub1 + sub2 + sub3;
		float percentage = total_marks / 3;
		display();
		System.out.println("Total Marks = " + total_marks + " \nPercentage = " + percentage + "\n\n");
	}

	void display() {
		System.out.println("Name of the student is " + name + "\nAge of the student is  " + age
				+ "\nSection of the Student is " + section + "\nGender of the Studen is " + gender);
	}

	void display1() {
		System.out.println("Total Marks & Percentage calculation for student " + name + " completed");
	}

	public static void main(String[] args) {

		Assign3ConstructOverloading s1 = new Assign3ConstructOverloading("Krishna", 5, 'A', 'F', 10f, 5.5f, 5.5f);
		Assign3ConstructOverloading s2 = new Assign3ConstructOverloading("Rishi", 5, 'A', 'M', 7f, 8f);
		Assign3ConstructOverloading s3 = new Assign3ConstructOverloading("Sid", 5, 'B', 'M', 6.5f, 10f, 8f);
		s1.display1();
		s2.display1();
		s3.display1();
	}

}
