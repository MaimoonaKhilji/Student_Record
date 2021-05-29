import java.util.Scanner;
class Data {
	String Name;
	int Age;
	String Department;
	char Section;	
	}
class Student {
	Scanner input = new Scanner ( System.in );
	Student ( Data info ){				// Passing object to a method
		System.out.print( "Student Name:     ");
		info.Name = input.next( );
		System.out.print( "Student Age:     ");
		info.Age = input.nextInt( );
		System.out.print( "Department:     ");
		info.Department = input.next( );
		System.out.print( "Section:     ");
		info.Section = input.next( ).charAt(0);
	}
	public static void main(String args [ ] )
	{
		Data D1 = new Data ( );
		Student S1 = new Student ( D1 );	
	}	
}