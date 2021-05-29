import java.util.Scanner;

class Student {
		String Name;
		int Age;
		String Department;
		char Section;
	Scanner input = new Scanner ( System.in );

	Student ( String name, int age, String dept, char section){				
		
		Name = name;
		Age = age;
		Department =dept;
		Section =section;
	}

	Student getStudentInfo ( )
	{
		Student S = new Student ("Usman",14,"BS-CS",'C');
		return S;						// Returning object from a method
	}	
	
	public static void main(String args [ ] )
	{
		Student S1 = new Student ("Ahmad",13,"BS-DS",'A');
		Student S2;

		S2 =S1.getStudentInfo ( );

		System.out.println("S1.Name : " + S1.Name);
  		System.out.println("S1.Age: " + S1.Age);
		System.out.println("S1.Department : " + S1.Department);
  		System.out.println("S1.Section : " + S1.Section);

		System.out.println("S2.Name : " + S2.Name);
  		System.out.println("S2.Age: " + S2.Age);
		System.out.println("S2.Department : " + S2.Department);
  		System.out.println("S2.Section : " + S2.Section);

	}
}	

